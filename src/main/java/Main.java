import org.apache.hc.client5.http.classic.methods.HttpPost;
import org.apache.hc.client5.http.impl.classic.CloseableHttpClient;
import org.apache.hc.client5.http.impl.classic.HttpClients;
public class Main {
    public static void main(String[] args) throws Exception{
        CloseableHttpClient client = HttpClients.createDefault();
        HttpPost httpPost = new HttpPost("https://beta3.api.climatiq.io/estimate");
        var httpResponse = client.execute(httpPost);

        System.out.println(httpResponse);
    }
}
