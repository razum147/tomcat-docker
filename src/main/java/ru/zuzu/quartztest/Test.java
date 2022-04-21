package ru.zuzu.quartztest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test {
    @GetMapping("/test")
    public ResponseEntity<String> test() {
        return ResponseEntity.ok("kek");
    }
    @GetMapping("/")
    public ResponseEntity<String> test2() {
        return ResponseEntity.ok("kek2");
    }
}
