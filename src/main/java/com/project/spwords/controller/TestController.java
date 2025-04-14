package com.project.spwords.controller;

import com.project.spwords.service.TestService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("/test")
@Slf4j
public class TestController {

    private final TestService testService;

    @PostMapping("/test")
    @ResponseBody
    public String testAsk(@RequestParam String subject) {
        String prompt = subject + "하면 떠오르는 단어 3가지 말해줘.";
        return testService.testAsk(prompt);
    }
}
