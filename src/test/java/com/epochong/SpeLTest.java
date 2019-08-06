package com.epochong;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author epochong
 * @date 2019/8/3 9:08
 * @email epochong@163.com
 * @blog epochong.github.io
 * @describe
 */
public class SpeLTest {
    private ApplicationContext context = null;

    @Before
    public void testInit(){
        context = new ClassPathXmlApplicationContext("applicationContext.xml");
    }

    @Test
    public void testAddress(){
        //getBean获得对象
        Address address = (Address) context.getBean("address");
        System.out.println(address);
        System.out.println(address.getCity());
        System.out.println(address.getStreet());
    }
    @Test
    public void testCar(){
        Car car = (Car) context.getBean("car");
        System.out.println(car);
        System.out.println(car.getBrand());
        System.out.println(car.getPrice());
        System.out.println(car.getTyreMeter());
    }

    @Test
    public void testPerson(){
        Person person = (Person) context.getBean("person");
        System.out.println(person);
    }
}