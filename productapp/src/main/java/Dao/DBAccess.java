package Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import Model.Product;

@Component("dbAccess")
@ComponentScan(basePackages = "Dao")
public class DBAccess {

	@Autowired
	private HibernateTemplate hibernateTemplate;

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	@Transactional
	public int addProduct(Product product) {

		System.out.println(product);

		this.hibernateTemplate.save(product);

		return 0;
	}
	
	@Transactional
	public int deleteProduct(String id) {

		Product p = this.hibernateTemplate.get(Product.class, id);
		System.out.println(p);
		this.hibernateTemplate.delete(p);

		return 0;
	}
	
	@Transactional
	public int updateProduct(Product product) {

		this.hibernateTemplate.update(product);
		return 0;
	}

	public List<Product> getProducts() {

		List<Product> products = this.hibernateTemplate.loadAll(Product.class);
		return products;
		
	}
	
	public Product getProduct(String id) {
		Product p = this.hibernateTemplate.get(Product.class, id);
		return p;
	}
}
