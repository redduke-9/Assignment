package com.one;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
 
public class Internship {
 
    public static void main(String[] args) {
   
 
        ConfigurableApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        DXC d = (DXC) ac.getBean("dxc");

        d.printDXC();
        ac.close();
       
}
}