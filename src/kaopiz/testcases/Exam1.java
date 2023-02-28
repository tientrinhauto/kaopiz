package kaopiz.testcases;

import java.text.ParseException;

import kaopiz.actions.commons.Constants;
import kaopiz.actions.commons.DateHandler;

public class Exam1 {
	

	public static void main(String[] args) throws ParseException {
		
		  DateHandler dateHandler = new DateHandler();  
		  
		  System.out.println(dateHandler.getDaysBetween(Constants.START_DATE ,Constants.CLOSE_DATE));        
		  System.out.println(dateHandler.getCloseDate(Constants.START_DATE,2));    

	}

}
