package com.mywebservice.project.repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import com.mywebservice.project.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

	

}
