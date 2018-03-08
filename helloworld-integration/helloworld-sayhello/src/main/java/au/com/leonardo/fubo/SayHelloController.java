package au.com.leonardo.fubo;


import org.apache.camel.CamelContext;
import org.apache.camel.ProducerTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class SayHelloController {

    @Autowired
    ProducerTemplate producerTemplate;

    @GetMapping(value = {"/hello/{name}", "/hello"})
    public String sayHello(@PathVariable(name = "name", required = false) String name) {

        if (name == null) {
            name = "friend";
        }

        return (String)producerTemplate.requestBody("direct:sayHelloRoute", name);

    }

}
