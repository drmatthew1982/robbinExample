package exspringcloud.ribbon;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.web.bind.annotation.RestController;

import exspringcloud.ribbon.controller.SayHelloConfiguration;

/**
 * Hello world!
 *
 */
@RestController
@SpringBootApplication
@RibbonClient(name = "say-hello", configuration = SayHelloConfiguration.class)
public class AppRibbonClient 
{
    public static void main( String[] args )
    {
    	 SpringApplication.run(AppRibbonClient.class, args);
    }
}
