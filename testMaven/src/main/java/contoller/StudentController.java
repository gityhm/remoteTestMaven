package contoller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import service.StudentService;

@Controller
@RequestMapping("student")
public class StudentController {

	@Autowired
	private StudentService studentService;
	
	@RequestMapping(value="getAll",method=RequestMethod.GET)
	public String getAllStudent() {
		int all = studentService.getAll();
		//工程未完成
		
		return all+"";
	}
	
}
