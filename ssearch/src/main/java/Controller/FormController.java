package Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import model.User;

@Controller
public class FormController {

	@RequestMapping("/complex")
	public String complex() {
		return "complex";
	}
	
	
	
	@RequestMapping("/processComplexform") 
	public ModelAndView process(@ModelAttribute User data) {
	
		System.out.println("input " + data);
		System.out.println(data);
		
		ModelAndView m = new ModelAndView();
		m.setViewName("user_show");
		m.addObject("user", data);
		
		return m;
		
	}
}
