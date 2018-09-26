package com.example.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppResetController {

    @RequestMapping("/show")
    public ResponseEntity<AppResponse> show(@RequestParam(name="a") String a)
    {
        AppResponse response = prepareResonse(a);
        return ResponseEntity.ok(response);
    }

    private AppResponse prepareResonse(String a) {
        if (StringUtils.isEmpty(a))
        {
            return new AppResponse("" , new AppErrors("0001", "input can not be empty"));
        }
        else
        {
            return new AppResponse("1234566" , new AppErrors());

        }
    }
}
