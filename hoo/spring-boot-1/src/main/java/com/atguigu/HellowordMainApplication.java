package com.atguigu;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/**
 *@author lenovo
 * @SpringBootApplication 来标注一个主程序类，说明这是一个Spring Boot应用
 */
@SpringBootApplication
public class HellowordMainApplication {
    public static void main(String []args){
         //Spring 应用启动起来
        SpringApplication.run(HellowordMainApplication.class,args);
    }
}
