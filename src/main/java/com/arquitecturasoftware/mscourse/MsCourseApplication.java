package com.arquitecturasoftware.mscourse;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MsCourseApplication {


	public static void main(String[] args) { SpringApplication.run(MsCourseApplication.class, args); }

}
