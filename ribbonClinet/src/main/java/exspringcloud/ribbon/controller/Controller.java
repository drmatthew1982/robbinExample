package exspringcloud.ribbon.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class Controller {
	@Bean
	@LoadBalanced //must
	RestTemplate restTemplate() {
		return new RestTemplate();
	}

	@Autowired
	RestTemplate restTemplate;

	private static Logger log = LoggerFactory.getLogger(Controller.class);

	@RequestMapping("/hi")
	  public String hi(@RequestParam(value="name", defaultValue="Artaban") String name) {
	    //String greeting = this.restTemplate.getForObject("http://localhost:8090/greeting", String.class);
		String greeting = this.restTemplate.getForObject("http://say-hello/greeting", String.class);
		return String.format("%s, %s!", greeting, name);
	  }
}
