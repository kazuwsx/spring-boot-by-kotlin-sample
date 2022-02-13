package com.example.demo

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping

@Controller
@RequestMapping("hello")
class HelloController {
    @GetMapping("/world")
    fun index(model: Model): String {
        model.addAttribute("message", "HelloWorld!")
        return "index"
    }
}
