package life.guolinxiang.community.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class indexController {
    @GetMapping("/")//任何东西不输入的时候默认访问路径 访问index
    public String index() { return "index"; }
}
