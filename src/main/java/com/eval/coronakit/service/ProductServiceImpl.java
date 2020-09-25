package com.eval.coronakit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.eval.coronakit.dao.ProductMasterRepository;
import com.eval.coronakit.entity.ProductMaster;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	ProductMasterRepository repository;

	@Override
	public ProductMaster addNewProduct(ProductMaster product) {
		return repository.save(product);
	}

	@Override
	public List<ProductMaster> getAllProducts() {
		return repository.findAll();
	}

	@Override
	public ProductMaster deleteProduct(int productId) {
		repository.deleteById(productId);
		return null;
	}

	@Override
	public ProductMaster getProductById(int productId) {
		return repository.findBy(productId);
	}

	@Override
	public Page<ProductMaster> findAllProductsPageable(Pageable pageable) {
		return repository.findAll(pageable);
	}

}
