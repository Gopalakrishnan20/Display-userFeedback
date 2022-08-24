package com.sb.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sb.model.Feedback;
@Repository
public interface FeedbackDAO extends CrudRepository<Feedback, Integer> {

}
