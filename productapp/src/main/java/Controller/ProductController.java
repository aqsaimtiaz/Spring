package Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import Dao.DBAccess;
import Model.Product;

@Controller
public class ProductController {

	@Autowired
	private DBAccess dbAccess;

	@RequestMapping(path = "/addProduct", method = RequestMethod.GET)
	public String getAddProduct() {
		
		return "addproduct";
	}
	
	@RequestMapping(path = "/addProductData" , method = RequestMethod.POST)
	public String addProduct(@RequestParam("productName") String productName, 
			@RequestParam("productDescripton") String productDescripton,
			@RequestParam("productPrice") String productPrice,
			Model m) {
		
		System.out.println(productName + " " + productDescripton + " " + productPrice);
		
		String id = "TRN" + (int) Math.round(Math.random() * 100);
		System.out.println(id);
		Product p = new Product(id, productName, productDescripton, productPrice);
		int r = (int) this.dbAccess.addProduct(p);
		
		
		return "addproductsuccess";
	
	}
	
	@RequestMapping("/viewProductData")
	public ModelAndView viewProduct() {
		
		List<Product> r =  this.dbAccess.getProducts();
		
		ModelAndView m = new ModelAndView();
		m.addObject("products", r);
		m.setViewName("viewproducts");
		
		return m;
	}
	
	@RequestMapping(path = "/deleteProduct/{productId}"  )
	public String deleteProduct(@PathVariable("productId") String productId, Model m) {
			
		
		System.out.println("delete id " + productId);
		this.dbAccess.deleteProduct(productId);
		return "addproductsuccess";
	}
	
	@RequestMapping(path = "/updateProduct/{productId}" , method = RequestMethod.GET )
	public String update(@PathVariable("productId") String productId, Model m) {
			
		System.out.println("update handler");
		
		Product product = this.dbAccess.getProduct(productId);
		m.addAttribute("product", product);
		
		
		return "updateproduct";
	}
	
	@RequestMapping("/save" )
	public String updateProduct(@ModelAttribute("product") Product product,
			Model m) {
		
		System.out.println("update dta handler");
		System.out.println("id " + product);
		Product p = new Product(product.getProductId(), product.getProductName(), product.getProductDescripton(), product.getProductPrice());
		System.out.println("p " + p);
		int r = (int) this.dbAccess.updateProduct(p);
		
		return "addproductsuccess";
		
	}
}
