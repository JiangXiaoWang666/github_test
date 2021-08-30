package cn.baizhi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GithubTestApplication {

    public static void main(String[] args) {
        System.out.println("hello world!");
        SpringApplication.run(GithubTestApplication.class, args);
    }

}
