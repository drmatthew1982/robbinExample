package exspringcloud.ribbon.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class Controller {
	@Bean
	@LoadBalanced // must
	RestTemplate restTemplate() {
		return new RestTemplate();
	}

	@Autowired
	private LoadBalancerClient lba;

	@Autowired
	RestTemplate restTemplate;

	private static Logger log = LoggerFactory.getLogger(Controller.class);

	@RequestMapping("/hi")
	public String hi(@RequestParam(value = "name", defaultValue = "Artaban") String name) {
		//here is the key 
//		ServiceInstance servInstance = lba.choose("ServiceOnEureka");
//		String baseUrl= servInstance.getUri().toString();
//        baseUrl= baseUrl + "/greeting";
//        log.info(baseUrl);
		// String greeting =
		// this.restTemplate.getForObject("http://localhost:8090/greeting",
		// String.class);
		String greeting = this.restTemplate.getForObject("http://ServiceOnEureka/greeting", String.class);
		return String.format("%s, %s!", greeting, name);
	}
}
