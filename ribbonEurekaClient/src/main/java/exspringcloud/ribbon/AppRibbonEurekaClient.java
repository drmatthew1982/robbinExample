package exspringcloud.ribbon;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.web.bind.annotation.RestController;

import exspringcloud.ribbon.controller.EurekaConfiguration;

/**
 * Hello world!
 *
 */
@RestController
@SpringBootApplication
//@RibbonClient(name = "ServiceOnEureka", configuration = EurekaConfiguration.class)
public class AppRibbonEurekaClient 
{
    public static void main( String[] args )
    {
    	 SpringApplication.run(AppRibbonEurekaClient.class, args);
    }
}
