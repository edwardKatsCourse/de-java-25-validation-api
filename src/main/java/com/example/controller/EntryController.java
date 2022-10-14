package com.example.controller;

import com.example.controller.dto.LoginRequestDTO;
import com.example.controller.dto.RegistrationRequestDTO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class EntryController {

    @PostMapping("/registration")
    public void register(@RequestBody @Valid RegistrationRequestDTO request) {}

    @PostMapping("/login")
    public void login(@RequestBody @Valid LoginRequestDTO request) {

    }
}
