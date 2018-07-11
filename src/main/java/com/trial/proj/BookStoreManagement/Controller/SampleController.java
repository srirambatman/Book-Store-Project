package com.trial.proj.BookStoreManagement.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.trial.proj.BookStoreManagement.Dto.SampleDto;

@Controller
@RequestMapping("/sample")
public class SampleController {

	@RequestMapping(path="/modelAndView")
	public ModelAndView getSampleMessageForModelAndView(){
		return new ModelAndView("Welcome");
	}
	
	
	@RequestMapping(path="/json", method=RequestMethod.GET)
	@ResponseBody
	public SampleDto getSampleMessageForJsonResponse(){
		SampleDto sampleDto = new SampleDto();
		sampleDto.setId(10);
		sampleDto.setMessage("Just a sample message");
		return sampleDto;
	}
}
