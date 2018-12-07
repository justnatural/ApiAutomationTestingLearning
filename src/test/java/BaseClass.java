import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.io.IOException;

public class BaseClass {

    CloseableHttpClient client ;
    CloseableHttpResponse response;

    protected static final String BASE_ENDPOINT = "https://api.github.com";


    @BeforeMethod
    public void setUp() {
        client = HttpClientBuilder.create().build();
    }

    @AfterMethod
    public void closeResources() throws IOException {
        client = HttpClientBuilder.create().build();
        client.close();
        response.close();
    }
}
