package codestate.todoapplication.domain;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class View {
    @GetMapping("/")
    public String todo() {
        return "To-do-Application ! Complete";
    }
}
