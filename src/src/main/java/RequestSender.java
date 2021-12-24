import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.squareup.okhttp.HttpUrl;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;

import java.io.IOException;

public class RequestSender {
   private static OkHttpClient okHttpClient = new OkHttpClient();
   private static final ObjectMapper objectMapper = new ObjectMapper();
    private final static String API_KEY = "4HiqL4K2f1TPk4smhtpPPZdvKR1gKzFu";
    static public String sendTempRequest (String cityId) throws IOException {
        HttpUrl httpUrl = new HttpUrl.Builder()
                .scheme("http")
                .host("dataservice.accuweather.com")
                .addPathSegment("forecasts")
                .addPathSegment("v1")
                .addPathSegment("daily")
                .addPathSegment("5day")
                .addPathSegment("294021")

                .addQueryParameter("apikey", API_KEY)
//                .addQueryParameter("weather", weather)


                .build();
        Request request = new Request.Builder()
                .addHeader("accept", "application/json")
                .url(httpUrl)
                .build();

        Response response = okHttpClient.newCall(request).execute();
        String responseJson = response.body().string();


//

//        Response response = okHttpClient.newCall(request).execute();
//        String responseJson = response.body().string();
////        JsonNode date = objectMapper
////                .readTree(responseJson)
////                .at("/");
//
//        weather = weatherNode.asText();

//
        return responseJson;


    }
}
