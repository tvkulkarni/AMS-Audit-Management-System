package com.cognizant.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cognizant.model.QuestionsEntity;


public interface QuestionsRepository extends JpaRepository<QuestionsEntity, Integer> {
	List<QuestionsEntity> findByAuditType(String i);
}
