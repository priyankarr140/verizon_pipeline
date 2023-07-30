package com.example.orders;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
	@GetMapping(value="/employees", produces = MediaType.TEXT_HTML_VALUE)
	@ResponseBody
	 public String getData()
	 {
		//String name="Rajat";
		
		return "<html>\n" + "<header><title>Welcome </title></header>\n" +
		          "<body>\n" + "<h1>Hello</h1> world\n" + "</body>\n" + "</html>";
		          
	 }

}
