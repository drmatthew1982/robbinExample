package exspringcloud.ribbon.controller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("ServiceOnEureka")
public interface SayHelloClient {
   @RequestMapping(method = RequestMethod.GET, value = "/greeting")
   String getGreeting();
}
