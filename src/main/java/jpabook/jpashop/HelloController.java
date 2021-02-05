package jpabook.jpashop;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
	

	@GetMapping("hello")
    public String hello(Model model) {
        //model : date를 담아서 view로 옮길 수 있음.
        model.addAttribute("data","hello!!!");
        return "hello"; // return "hello"는 화면 이름.
    }
}
