package exceptionHandling;

import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class ExceptionHandler1 {
	
	@ResponseStatus(value=HttpStatus.BAD_REQUEST)
	@ExceptionHandler
	public String nullPointer(Model model,Exception e)
	{
		model.addAttribute("errorMsg",e.getMessage()+"(Centralised)");
		return "errorPage";
	}

}
