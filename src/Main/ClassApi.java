/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.io.IOException;
import java.util.*;
import okhttp3.*;
import okio.Buffer;
import org.json.*;

import Login.AuthApi;

/**
 *
 * @author user
 */
public class ClassApi {
    
    public static final MediaType JSON = MediaType.parse("application/json; charset=utf-8");
    OkHttpClient client = new OkHttpClient();

    AuthApi authapi = new AuthApi();
    
    
    public static List<String> responseList(int code, String status, String response) 
    {
        String statusCode = String.valueOf(code) + " " + status;
        return Arrays.asList(statusCode, response); 
    } 

    
    private Request buildRequestWithHeader (String url, Boolean auth, String token, Boolean addHeader, JSONObject header, String method, RequestBody body) throws JSONException{
        Request.Builder request = new Request.Builder();
        
        if(addHeader && header.length() > 0){
            for(int i = 0; i<header.names().length(); i++){
                request.addHeader(header.names().getString(i), (String) header.get(header.names().getString(i)));                    
            }
        }
        
        if(auth){
            request.addHeader("Authorization", "Bearer " + token);
        }
        
        return request
                .url(url)
                .method(method, body)
                .build();
    }
    
    
    public List<String> sendData(String url, Boolean auth, String token, Boolean addHeader, JSONObject header, String method, String payload) throws JSONException{
        try{
            RequestBody body;
            
            if("GET".equals(method) || "DELETE".equals(method)){
                body = null;
            }else{
                body = RequestBody.create(JSON, payload);
            }
        
            Request request = buildRequestWithHeader(url, auth, token, addHeader, header, method, body);
            
            Response response = client.newCall(request).execute();
//            response.close();
            
            List<String> res = responseList(response.code(), response.message(), response.body().string());
            return res;
        }catch (IOException ex){
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
