
package com.mkyong.mapper;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.mkyong.model.Employee;

public class EmployeeRowMapper implements RowMapper<Employee> {

	@Override
	public Employee mapRow(ResultSet arg0, int arg1) throws SQLException {
		// TODO Auto-greturn null;
		Employee emp=new Employee();
		emp.setName(arg0.getString("firstName"));
		return emp;
	}

}
