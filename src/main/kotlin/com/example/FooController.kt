package com.example

import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.validation.Validated

@Validated
@Controller("/")
class FooController {

    @Get
    fun foo(): String {
        return ""
    }
}