package exspringcloud.ribbon;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.RestController;

/**
 * Hello world!
 *
 */
@RestController
@SpringBootApplication
@EnableFeignClients
//@RibbonClient(name = "ServiceOnEureka", configuration = EurekaConfiguration.class)
public class AppRibbonEurekaFeignClient 
{
    public static void main( String[] args )
    {
    	 SpringApplication.run(AppRibbonEurekaFeignClient.class, args);
    }
}
