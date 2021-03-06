package com.nikshcherbakov.serverapp.rest;

import com.nikshcherbakov.api.MyApi;
import com.nikshcherbakov.api.dto.ObjectDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ServerRestController implements MyApi {

    @GetMapping("/object")
    public ObjectDto getObject() {
        return new ObjectDto("Example name", "Example value");
    }

}
