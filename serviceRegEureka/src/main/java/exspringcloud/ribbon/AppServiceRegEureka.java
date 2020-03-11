package exspringcloud.ribbon;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableEurekaClient
public class AppServiceRegEureka
{
    public static void main( String[] args )
    {
    	 SpringApplication.run(AppServiceRegEureka.class, args);
    }
}
