package controllers;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import beans.Student;

@Controller
public class FormController {
	@RequestMapping("/form")
	public String form()
	{
		int i=2/0;
		return "complexForm";
	}
	
	@RequestMapping("/formHandler")
	public String formHandler(@ModelAttribute("stdnt") Student student,BindingResult result,Model model)
	{
		if(result.hasErrors())
		{
			model.addAttribute("errorResult",result);
			return "complexForm";
		}
		model.addAttribute("student",student);
		return "success";
	}
	
	@RequestMapping("/upload")
	public String upload()
	{
		String s=null;
		s.charAt(0);
		return "upload";
	}
	
	@RequestMapping(value="/uploadHandler", method=RequestMethod.POST )
	public String uploadHandler(@RequestParam("file") CommonsMultipartFile part,HttpSession session,Model model)
	{
		String path=session.getServletContext().getRealPath("")+File.separator+"resources"+File.separator+"images"+File.separator+part.getOriginalFilename();
		File f=new File(path);
		try {
			FileOutputStream os=new FileOutputStream(f);
			os.write(part.getBytes());
		} catch (Exception e) {
			e.printStackTrace();
		}
		model.addAttribute("filename", part.getOriginalFilename());
		return "upload";
	}
	
	@ExceptionHandler(ArithmeticException.class)
	public String divideByZero(Model model,Exception e)
	{
		System.out.println(e.getMessage()+"....");
		model.addAttribute("errorMsg","division by zero");
		return "errorPage";
	}
	
	@ExceptionHandler(NullPointerException.class)
	public String nullPointer(Model model,Exception e)
	{
		model.addAttribute("errorMsg",e.getMessage());
		return "errorPage";
	}

}
