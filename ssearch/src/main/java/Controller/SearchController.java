package Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class SearchController {

	@RequestMapping(path = "/home")
	public String home() {
		
		System.out.println("processing");
		
	
		return "home";
		
	}
	
	@RequestMapping("/processform") 
	public RedirectView process(@RequestParam("userText") String data) {
	
		System.out.println("input " + data);
		
		RedirectView r = new RedirectView();
		r.setUrl("https://www.google.com/search?q=" + data);
		
		return r;
		
	}
}
