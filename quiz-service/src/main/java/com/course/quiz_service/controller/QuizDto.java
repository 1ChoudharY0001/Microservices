package com.course.quiz_service.controller;

import lombok.Data;

@Data
public class QuizDto {

	String categoryName;
	Integer numQuestions;
	String title;
}
