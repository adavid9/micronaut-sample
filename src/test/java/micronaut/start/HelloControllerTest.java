package micronaut.start;

import io.micronaut.http.HttpRequest;
import io.micronaut.http.client.RxHttpClient;
import io.micronaut.http.client.annotation.Client;
import io.micronaut.test.annotation.MicronautTest;
import org.junit.jupiter.api.Test;

import javax.inject.Inject;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author: Dawid Antecki
 * @created: 09/23/2020 17:47
 * @version: 1.0
 */
@MicronautTest
class HelloControllerTest {

    @Inject
    @Client("/")
    RxHttpClient client;

    @Test
    void testHello() {
        HttpRequest<String> request = HttpRequest.GET("/hello");
        String body = client.toBlocking().retrieve(request);

        assertNotNull(body);
        assertEquals("Hello World", body);
    }
}
