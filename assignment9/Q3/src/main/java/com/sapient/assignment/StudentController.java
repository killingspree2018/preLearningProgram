package com.sapient.assignment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.sapient.assignment.model.Student;
import com.sapient.assignment.model.StudentDao;

@Controller
public class StudentController {
	
	@Autowired
	StudentDao ob;
	
	@ModelAttribute
	public void modelData(Model m) 
	{
	m.addAttribute("name","Student");
	}
	
    @RequestMapping({"/"})
    public String Welcome() {
        return "Welcome";
    }
    
    @PostMapping({"find"})
    public String findStudent(@RequestParam("id") int id, ModelMap m) {
    	
    	Student foundStudent = ob.findStudentById(id);
    	m.addAttribute("student",foundStudent);
        return "Student";
    }
}