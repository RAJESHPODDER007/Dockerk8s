package com.springboot.k8s.DockerK8S;


import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

@RestController
@RequestMapping(path = "/kube")
public class K8SApi {

    @GetMapping(path = "/world",produces = MediaType.TEXT_PLAIN_VALUE)
    public String getMessage(@RequestParam("input") String input)  {
        MessageDigest md =null;
        try {
            md= MessageDigest.getInstance("MD5");
        }catch (NoSuchAlgorithmException e){}
        md.update(input.getBytes());
        byte[] b =md.digest();
        StringBuffer sb= new StringBuffer();
        for(byte b1 : b){
            sb.append(Integer.toHexString(b1 & 0xff).toString());
        }
        return  sb.toString();

    }
    @GetMapping(path = "/hello")
    public String getHello(){
        return "Hello Youtube";
    }
}
