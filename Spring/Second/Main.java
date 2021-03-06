package com.one;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main{
   public static void main(String[] args) {
      ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("Bean.xml");

      Patient p = (Patient) context.getBean("patient");
      p.calculate();
      context.close();
   }
}