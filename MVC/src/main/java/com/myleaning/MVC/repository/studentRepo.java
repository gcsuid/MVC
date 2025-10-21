package com.myleaning.MVC.repository;

import com.myleaning.MVC.entity.student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface studentRepo extends JpaRepository<student,Long> {

}
