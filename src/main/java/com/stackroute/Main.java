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

        Movie movie = context.getBean("MovieA", Movie.class);
        Movie newMovie = context.getBean("MovieB", Movie.class);

        System.out.println(movie.getActor());

        Movie movie1 = context.getBean("movie1", Movie.class);
        System.out.println(movie1.getActor());

        Movie movie2 = context.getBean("movie2", Movie.class);
        System.out.println(movie2.getActor());

        System.out.println(movie==newMovie);
    }

}