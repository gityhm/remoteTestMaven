package mapper;

import org.apache.ibatis.annotations.Select;

public interface StudentMapper {

	@Select("select count(1) from student")
	int getTotal();
}
