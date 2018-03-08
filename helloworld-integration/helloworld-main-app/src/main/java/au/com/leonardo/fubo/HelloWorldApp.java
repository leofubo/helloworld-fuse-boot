package au.com.leonardo.fubo;

import io.prometheus.client.spring.boot.EnablePrometheusEndpoint;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
//import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@EnablePrometheusEndpoint
@ComponentScan({"au.com.leonardo.fubo", "au.com.leonardo.fubo.*"})
public class HelloWorldApp {

    // must have a main method spring-boot can run
    public static void main(String[] args) {
        SpringApplication.run(HelloWorldApp.class, args);
    }

}
