package ClassWork.CW_27_01_2025;

import okhttp3.*;

import java.io.IOException;

public class ApiCalling {
    public static void main(String[] args) throws IOException {
        /*
        OkHttpClient client = new OkHttpClient().newBuilder()
                .build();
        MediaType mediaType = MediaType.parse("text/plain");
        RequestBody body = RequestBody.create(mediaType, "");
        Request request = new Request.Builder()
                .url("https://www.uuidtools.com/api/generate/v4/count/10")
                .method("GET", null)
                .build();
        Response response = client.newCall(request).execute();

        System.out.println(response);
        */

        OkHttpClient client = new OkHttpClient().newBuilder()
                .build();
        Request request = new Request.Builder()
                .url("https://www.uuidtools.com/api/generate/v4/count/10")
                .get()
                .build();
        try (Response response = client.newCall(request).execute()) {
            if (response.isSuccessful()) {
                //System.out.println("Response: " + response.body().string());
                //System.out.println(response.body().string());
                String allData = response.body().string();
                String[] dataArray = allData.split(",");
                for (String data : dataArray) {
                    System.out.println(data);
                }
            } else {
                System.out.println("Request failed: " + response.message());
            }
        }

    }
}
