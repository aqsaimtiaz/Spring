package Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import Model.User;

@Controller
public class ContactController {

	@RequestMapping("/contact")
	public String showForm() {
		return "contact";
	}
	
	// Old way of fetching using getParamter()
	
//	@RequestMapping(path="/processform", method = RequestMethod.POST)
//	public String processForm(HttpServletRequest request) {
//		
//		String email =  request.getParameter("userEmail");
//		System.out.println("Email " + email);
//		
//		
//		return "";
//	}
	
//	@RequestMapping(path="/processform", method = RequestMethod.POST)
//	public ModelAndView processForm(@RequestParam("userEmail") String email, 
//			@RequestParam(name = "userName") String userName,
//			@RequestParam(name = "userPassword") String userPassword) {
//		
//			System.out.println("userEmail " + email);
//			System.out.println("userid " + userName);
//			System.out.println("pass " + userPassword);
//			
//			ModelAndView m = new ModelAndView();
//			m.setViewName("success");
//			m.addObject("userEmail", email);
//			m.addObject("userName", userName);
//			m.addObject("userPassword", userPassword);
//			
//			
//		return m;
//	}

//	@RequestMapping(path="/processform", method = RequestMethod.POST)
//	public ModelAndView processForm(@RequestParam("userEmail") String email, 
//			@RequestParam(name = "userName") String userName,
//			@RequestParam(name = "userPassword") String userPassword) {
//		
//			User user = new User();
//			user.setUserEmail(email);
//			user.setUserName(userName);
//			user.setUserPassword(userPassword);
//			
//			
//		
//			ModelAndView m = new ModelAndView();
//			m.setViewName("success");
//			m.addObject("user", user);
//			
//			
//		return m;
//	}
	
	// Method # 1 : in method arguments
	@RequestMapping(path="/processform", method = RequestMethod.POST)
	public String processForm(@ModelAttribute User user, Model m) {
		
		return "success";
	}

	// Merthod # 2 : above mthod name
	@ModelAttribute
	public void commonData(Model m) {
		m.addAttribute("myHeader", "hello from Aqsa");
	}
}
