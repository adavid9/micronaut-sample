package micronaut.start;

import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Produces;

/**
 * @author: Dawid Antecki
 * @created: 09/23/2020 17:45
 * @version: 1.0
 */
@Controller(value = "/hello")
public class HelloController {

    @Get
    @Produces(MediaType.TEXT_PLAIN) // TEXT_PLAIN as we are not returning JSON (as default)
    public String index() {
        return "Hello World";
    }
}
