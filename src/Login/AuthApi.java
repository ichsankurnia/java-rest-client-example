/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Login;

import java.io.IOException;
import okhttp3.*;
import okio.Buffer;
//import Main.MainForm;

/**
 *
 * @author user
 */
public class AuthApi {
    
    public static final MediaType JSON = MediaType.parse("application/json; charset=utf-8");
    public static String BASE_URL = "";
    
    OkHttpClient client = new OkHttpClient();
    
    public String authentication(String user, String pass){
        try{
                       System.out.println("BASE_URL :" + BASE_URL);
           String payload = String.format("{\"user_mail_phone\":\"%s\",\"password\":\"%s\"}", user, pass);

           RequestBody body = RequestBody.create(JSON, payload);  
           Request request = new Request.Builder()
                   .url(BASE_URL + "/api/v1/user/sign-in")
                   .method("POST", body)
                   .build();

           System.out.println("Request Body : " + bodyToString(request));

           Response response = client.newCall(request).execute();
           
           System.out.println(response.code() + " " + response.message());
           System.out.println("Headers : " + response.headers());
           System.out.println("Request : " + response.request());
//           MainForm.writeLog(response.request().url() + "|" + response.request().headers().toString() + "|" + response.request().method() + "|" + bodyToString(request));
//           MainForm.writeLog(response.code() + " " + response.message() + "|" + response.body().string());
           return response.body().string();
        }catch (IOException ex){
            return ex.getMessage();
        }
    }
    
    
    public static String bodyToString(final Request request){
        try {
            Request copy = request.newBuilder().build();
            Buffer buffer = new Buffer();
            copy.body().writeTo(buffer);
            return buffer.readUtf8();
        } catch (final IOException e) {
            return "did not work";
        }
    }
}
