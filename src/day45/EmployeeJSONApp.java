package day45;

import java.io.File;
import java.util.List;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import day44.Player;

public class EmployeeJSONApp {

	public static void main(String[] args) {
		ObjectMapper mapper = new ObjectMapper();
		List<Employee> employees=null;
        try {
        	employees = mapper.readValue(
            	//new File("D:\\EclipseJavaprogs2\\Test\\json\\employee.json"),	      //absolute path
                new File("myfolder/employee2.json"),									  //relative path
                new TypeReference< List<Employee>>() {}
            );
       
        } catch (Exception e) {
            e.printStackTrace();
        }

        //System.out.println(employees);
        for(Employee employee:employees)
        	System.out.println(employee);
        
        System.out.println("*** Employees working in IT Dept****");
        for(Employee employee:employees)
        {
        	if(employee.getDepartment().equalsIgnoreCase("it"))
        	{
        		System.out.println(employee.getName());
        	}
        }
        	
        
        
	}

}
