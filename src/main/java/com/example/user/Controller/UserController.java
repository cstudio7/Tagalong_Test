package com.example.user.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@Controller //help us marked as a controller
@ResponseBody
public class UserController {

    @GetMapping("/getData/")
    public Map<String, String> getData(@RequestParam(value="username", required=true) String username, @RequestParam(value="password", required=true) String password) {
        Map<String, String> response = new HashMap<>();
        try {
             return ResponseEntity.ok().body(response).getBody();
        } catch (Exception e) {
            return ResponseEntity.ok().body(response).getBody();
        }
    }

    @PostMapping("/postData/")
    public Map<String, String> postData(@RequestParam(value="username", required=true) String username, @RequestParam(value="password", required=true) String password) {
        Map<String, String> response = new HashMap<>();
        try {
            return ResponseEntity.ok().body(response).getBody();
        } catch (Exception e) {
            return ResponseEntity.ok().body(response).getBody();
        }
    }
}
