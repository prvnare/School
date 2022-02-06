package org.prvn.labs.school.portal.management;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SchoolManagementApplication {

  public static void main(String[] args) {
    SpringApplication.run(SchoolManagementApplication.class, args);
  }
}
