package Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/first")
public class HomeController {

	@RequestMapping(path="/home", method=RequestMethod.GET)
	public String home(Model model) {


		model.addAttribute("name", "Aqsa");
		return "home";
	}
	
	@RequestMapping("/help")
	public ModelAndView help() {
		
		ModelAndView m = new ModelAndView();
		m.addObject("name", "Umair");
		m.setViewName("help");
		
		List<Integer> list = new ArrayList<Integer>();		
		list.add(1);
		list.add(2);
		
		m.addObject("number", list);
		
		return m;
	}
}
