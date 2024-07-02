package Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class RedirectController {

	// Example of redirect prefix
//	@RequestMapping("/one")
//	public String one() {
//		
//		System.out.println("this is one handler");
//		return "redirect:/two";
//	}
	
	// Example of redirect View
		@RequestMapping("/one")
		public RedirectView one() {
			
			System.out.println("this is one handler");
			RedirectView r = new RedirectView();
			r.setUrl("two");
			return r;
		}
		
	@RequestMapping("/two")
	public String two() {
		
		System.out.println("this is 2nd handler");
		return "";
	}

	

}
