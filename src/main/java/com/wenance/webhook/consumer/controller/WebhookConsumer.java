package com.wenance.webhook.consumer.controller;

import com.wenance.webhook.consumer.model.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

@Controller
@RequestMapping(value = "/api/v1", produces = "application/json")
public class WebhookConsumer {

    @PostMapping(path = "/webhook")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<Response> health() {
        Response response = new Response("test auto deploy");
        return ResponseEntity.ok(response);
    }


    @GetMapping(path = "/webhook")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<Response> responseGet() {
        Response response = new Response("test auto deploy");
        return ResponseEntity.ok(response);
    }

}