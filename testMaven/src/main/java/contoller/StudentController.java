package contoller;

import javax.xml.ws.RequestWrapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import domain.Student;
import service.StudentService;

@Controller
@RequestMapping("student")
public class StudentController {

	@Autowired
	private StudentService studentService;
	
	@RequestMapping(value="getAll",method=RequestMethod.GET)
	public String getAllStudent() {
		int all = studentService.getAll();
		
		
		return all+"";
	}
	@RequestMapping(value="save",method=RequestMethod.POST)
	@ResponseBody
	public void saveStudent(@RequestBody Student student) {
//		int all = studentService.getAll();
		
		
//		return all+"";
	}
	
}
