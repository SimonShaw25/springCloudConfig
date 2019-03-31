package com.xzc.configClient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author shan
 * @date 2019/3/31
 */
@RestController
public class HiController {

  @Value("${foo}")
  private String foo;

  @GetMapping(value = "/hi")
  public String hi(){
    return foo;
  }
}