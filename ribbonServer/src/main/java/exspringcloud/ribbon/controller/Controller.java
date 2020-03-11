package exspringcloud.ribbon.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	private static Logger log = LoggerFactory.getLogger(Controller.class);
	@Autowired
    private HttpServletRequest request;
	
	@RequestMapping(value = "/greeting")
	public String greet() {
		log.info("Access /greeting");

		String serverName = request.getServerName();
		int serverPort = request.getServerPort();
		String declaimation = "From:"+serverName+":"+serverPort+": ";
		List<String> greetings = Arrays.asList(declaimation+"Hi there", declaimation+"Greetings", declaimation+"Salutations");
		Random rand = new Random();

		int randomNum = rand.nextInt(greetings.size());
		return greetings.get(randomNum);
	}

	@RequestMapping(value = "/")
	public String home() {
		log.info("Access /");
		return "Hi!";
	}
}
