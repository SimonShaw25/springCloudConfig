package com.xzc.configClient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@SpringBootApplication
@EnableDiscoveryClient
public class ConfigClientApplication
{

//  @Bean
//  public static PropertySourcesPlaceholderConfigurer placeholderConfigurer()
//  {
//    PropertySourcesPlaceholderConfigurer c = new PropertySourcesPlaceholderConfigurer();
//    c.setIgnoreUnresolvablePlaceholders(true);
//    return c;
//  }

  public static void main(String[] args)
  {
    SpringApplication.run(ConfigClientApplication.class, args);
  }

}
