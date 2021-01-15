/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.io.IOException;
import java.util.*;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.RequestBody;
import Login.AuthApi;
import okio.Buffer;

/**
 *
 * @author user
 */
public class ClassApi {
    
    public static final MediaType JSON = MediaType.parse("application/json; charset=utf-8");
    OkHttpClient client = new OkHttpClient();

    AuthApi auth = new AuthApi();
    
    public static List<String> responseList(int code, String status, String response) 
    {
        String statusCode = String.valueOf(code) + " " + status;
        return Arrays.asList(statusCode, response); 
    } 

    public List<String> sendData(String url, String method, String payload){
        try{
            RequestBody body;
            
            if(method == "GET" || method == "DELETE"){
                body = null;
            }else{
                body = RequestBody.create(JSON, payload);
            }
        
            Request request = new Request.Builder()
                    .url(url)
                    .method(method, body)
                    .build();
            
            Response response = client.newCall(request).execute();
            
//            AddToStringArray(res, bodyToString(request));
//            AddToStringArray(res, String.valueOf(response.code())  + response.message());
//            AddToStringArray(res, response.body().string());

//            System.out.println(bodyToString(request));
//            System.out.println(String.valueOf(response.code()) + " " + response.message());
//            System.out.println(response.body().string());
            
//            return res;
            List<String> res = responseList(response.code(), response.message(), response.body().string());
            return res;
//            return response.body().string();
        }catch (IOException ex){
//            AddToStringArray(res, ex.getMessage());
//            return res;
//            return ex.getMessage();
            return responseList(1, "Error", ex.getMessage());
        }
    }

    
    private String[] AddToStringArray(String[] oldArray, String newString)
    {
        String[] newArray = Arrays.copyOf(oldArray, oldArray.length+1);
        newArray[oldArray.length] = newString;
        return newArray;
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
    
    
//    public String[] newData(String url, String payload){
//        try{
//
//            RequestBody body = RequestBody.create(JSON, payload);
//        
//            Request request = new Request.Builder()
//                    .url(url)
//                    .method("POST", body)
//                    .build();
//            
//            Response response = client.newCall(request).execute();
//            
//            AddToStringArray(res, AuthApi.bodyToString(request));
//            AddToStringArray(res, String.valueOf(response.code())  + response.message());
//            AddToStringArray(res, response.body().string());
//            
//            return res;
//        }catch (IOException ex){
//            AddToStringArray(res, ex.getMessage());
//            return res;
//        }
//    }
//    
//    public String[] getData(String url){
//        try{
//            Request request = new Request.Builder()
//                    .url(url)
//                    .method("GET", null)
//                    .build();
//            
//            Response response = client.newCall(request).execute();
//            
//            AddToStringArray(res, AuthApi.bodyToString(request));
//            AddToStringArray(res, String.valueOf(response.code())  + response.message());
//            AddToStringArray(res, response.body().string());
//            
//            return res;
//        }catch (IOException ex){
//            AddToStringArray(res, ex.getMessage());
//            return res;
//        }
//    }
//    
//    public String[] updateData(String url, String payload){
//        try{
//            RequestBody body = RequestBody.create(JSON, payload);
//        
//            Request request = new Request.Builder()
//                    .url(url)
//                    .patch(body)
//                    .build();
//            
//            Response response = client.newCall(request).execute();
//            
//            AddToStringArray(res, AuthApi.bodyToString(request));
//            AddToStringArray(res, String.valueOf(response.code()) + response.message());
//            AddToStringArray(res, response.body().string());
//            
//            return res;
//        }catch (IOException ex){
//            AddToStringArray(res, ex.getMessage());
//            return res;
//        }
//    }
//    
//    
//    public String[] deleteData(String url){
//        try{
//            Request request = new Request.Builder()
//                    .url(url)
//                    .delete()
//                    .build();
//            
//            Response response = client.newCall(request).execute();
//            
//            AddToStringArray(res, AuthApi.bodyToString(request));
//            AddToStringArray(res, String.valueOf(response.code())  + response.message());
//            AddToStringArray(res, response.body().string());
//            
//            return res;
//        }catch (IOException ex){
//            AddToStringArray(res, ex.getMessage());
//            return res;
//        }
//    }
}
