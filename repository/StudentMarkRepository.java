package com.studentmarksheet.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.studentmarksheet.entity.MarkSheet;

public interface StudentMarkRepository extends JpaRepository<MarkSheet, Integer>{

}
