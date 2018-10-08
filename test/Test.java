package com.romain.spring.springorm.product.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.romain.spring.springorm.product.dao.ProductDao;
import com.romain.spring.springorm.product.entity.Product;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/romain/spring/springorm/product/test/config.xml");
		ProductDao productDao = (ProductDao) context.getBean("productDao");
//		Product product = new Product();
//		product.setId(2);
//		product.setName("IphoneX");
//		product.setDesc("Its way too expensive!!");
//		product.setPrice(1620);
//		productDao.create(product);
//		productDao.update(product);
//		productDao.delete(product);
		
//		Product product = productDao.find(1);
//		System.out.println(product);
		
		List<Product> products = productDao.findAll();
		System.out.println(products);
	}

}
