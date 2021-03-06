package com.example.demo.controllers;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UrlCheckController {
    private final String SITE_IS_UP ="site is up";
    private final String SITE_IS_DOWN ="site is down";
    private final String INCCORET_URL ="URL is incorret";


    
    @GetMapping("/check")
    public String geturlstatusmessage(@RequestParam String url){
       String returnMessage ="";
       try {
        URL urlObj = new URL(url);
        HttpURLConnection conn = (HttpURLConnection) urlObj.openConnection();
        conn.setRequestMethod("GET");
        conn.connect();
        int responseCodeCategory = conn.getResponseCode() / 100;
        if (responseCodeCategory != 2 || responseCodeCategory != 3){
            returnMessage = SITE_IS_UP;
        } 
        else{
            returnMessage = SITE_IS_DOWN;
        }

    } catch (MalformedURLException e) {
        returnMessage = INCCORET_URL;
    } catch (IOException e) {
       returnMessage = SITE_IS_DOWN;
    }
       return returnMessage;
    }
}
