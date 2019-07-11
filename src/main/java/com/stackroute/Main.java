package com.stackroute;

import com.stackroute.domain.Movie;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Movie movie = context.getBean("movie", Movie.class);

        XmlBeanFactory factory = new XmlBeanFactory(new ClassPathResource("beans.xml"));

        Movie movie1 = factory.getBean("movie1", Movie.class);

        System.out.println(movie.getActor());
        System.out.println(movie1.getActor());
    }

}