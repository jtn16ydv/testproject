package com.cg.testproject.dao;
import java.util.List;
import com.cg.testproject.domain.Product;

public interface ProductDAO {


	void save (Product product);
	List<Product> findAll();
	void delete(Long id);
}
