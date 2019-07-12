package com.stackroute.demo;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BeanLifeCycleDemoBean implements InitializingBean, DisposableBean {


    @Override
    public void destroy() throws Exception {
        System.out.println("Destroying the bean");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Initialising the bean");
    }

    public void customInit() {
        System.out.println("Initialisation");
    }

    public void customDestroy() {
        System.out.println("Destroy");
    }
}
