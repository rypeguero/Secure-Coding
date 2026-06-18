package com.snhu.sslserver;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.security.MessageDigest;

@RestController
public class HashController {

    @GetMapping("/hash")
    public String getHash(@RequestParam(value = "data", defaultValue = "HelloWorld") String data) {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            byte[] hash = md.digest(data.getBytes());
            StringBuilder hexString = new StringBuilder();
            for (byte b : hash) {
                String hex = Integer.toHexString(0xff & b);
                if(hex.length() == 1) hexString.append('0');
                hexString.append(hex);
            }
            return "Data: " + data + "<br>SHA-256 Hash: " + hexString.toString();
        } catch (Exception e) {
            return "Error: " + e.getMessage();
        }
    }
}
