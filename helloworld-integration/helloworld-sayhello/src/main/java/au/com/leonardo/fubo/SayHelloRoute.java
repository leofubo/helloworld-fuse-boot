package au.com.leonardo.fubo;

import org.springframework.stereotype.Component;
import org.apache.camel.builder.RouteBuilder;

@Component
public class SayHelloRoute extends RouteBuilder {

    @Override
    public void configure() throws Exception {

        from("direct:sayHelloRoute").id("sayHelloRoute")
            .transform().simple("Hello ${body} !");

    }
}
