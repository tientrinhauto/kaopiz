package kaopiz.actions.commons;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class DateHandler {
	
	  public long getDaysBetween(String startDateStr, String endDateStr) throws ParseException {
		  DateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");        
		  Date startDate = dateFormat.parse(startDateStr);        
		  Date endDate = dateFormat.parse(endDateStr);        
		  long millisecondNumber = Math.abs(endDate.getTime() - startDate.getTime());        
		  long result = TimeUnit.DAYS.convert(millisecondNumber, TimeUnit.MILLISECONDS);        
		  return result;    }    
	  
	  public String getCloseDate(String startDateStr, int monthsToAdd) throws ParseException {        
		  DateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");        
		  Date startDate = dateFormat.parse(startDateStr);        
		  Calendar calendar = Calendar.getInstance();        
		  calendar.setTime(startDate);        
		  calendar.add(Calendar.MONTH, monthsToAdd);        
		  String result = dateFormat.format(calendar.getTime());        
		  return result;    }    
	  }

