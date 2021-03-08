package com.qiusuo.gradledemo.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Mono

@RestController
@RequestMapping("/helloworld")
class HelloWorldController {
    @RequestMapping
    fun posts(): Mono<String> {
        return Mono.just("hello world");
    }
}