package exspringcloud.ribbon;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/**
 * Hello world!
 *
 */
@RestController
@SpringBootApplication
public class AppRibbonServer
{
    public static void main( String[] args )
    {
    	 SpringApplication.run(AppRibbonServer.class, args);
    }
}
