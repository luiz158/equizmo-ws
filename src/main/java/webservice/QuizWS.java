package webservice;

import javax.inject.Inject;
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.servlet.annotation.WebServlet;

import business.QuizBC;
import entity.Quiz;
@WebService
@WebServlet("/quiz")
public class QuizWS {
	@Inject QuizBC bc;
	
	@WebMethod
	public boolean add(Quiz quiz) {
		return bc.add(quiz);
	}

	@WebMethod
	public Quiz quiz(String category) {
		return bc.quiz(category);
	}	
}

