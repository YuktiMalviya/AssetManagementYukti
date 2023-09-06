package com.asset.managment.demo.Repository;

import com.asset.managment.demo.Entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CategoryRepository extends JpaRepository<Category, Integer> {

}
