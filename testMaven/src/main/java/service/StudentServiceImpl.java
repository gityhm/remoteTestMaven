package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mapper.StudentMapper;

@Service("studentService")
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentMapper studentMapper;
	
	@Override
	public int getAll() {
		// TODO Auto-generated method stub
		int total = studentMapper.getTotal();
		return total;
	}

}
