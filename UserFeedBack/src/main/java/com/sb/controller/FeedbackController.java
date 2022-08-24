package com.sb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sb.dao.FeedbackDAO;
import com.sb.model.Feedback;

@RestController
public class FeedbackController {
	@Autowired
	FeedbackDAO dao;
	@PostMapping("/submitFeedback")
	public String submitFeedback(Feedback fb)
	{
		System.out.println("hi");
		dao.save(fb);
		return "Feedback submitted Successfully";
		
	}

}
