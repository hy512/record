package person.record.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Hello {
	@RequestMapping("index.do")
	public String hello() {
		System.out.println("你好");
		return "index.jsp";
	}
}
