package com.bilgeadam.boost.maraton.create;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.bilgeadam.boost.maraton.entity.Employee;
import com.bilgeadam.boost.maraton.entity.Gender;
import com.bilgeadam.boost.maraton.entity.Janitor;
import com.bilgeadam.boost.maraton.entity.MarriageStatus;
import com.bilgeadam.boost.maraton.entity.Name;
import com.bilgeadam.boost.maraton.entity.Occupation;
import com.bilgeadam.boost.maraton.entity.Officer;
import com.bilgeadam.boost.maraton.entity.PhoneNumber;
import com.bilgeadam.boost.maraton.entity.Teacher;
import com.bilgeadam.boost.maraton.exception.JanitorException;
import com.bilgeadam.boost.maraton.exception.OfficerException;
import com.bilgeadam.boost.maraton.exception.TeacherException;

public class EmployeeManager {

	List<Employee> employeeList = new ArrayList<>();
	
	public  List<Employee> createAEmployee() throws TeacherException, OfficerException, JanitorException  {
		
		
		
		
		Employee t1 = new Teacher(new Name("Babur","Somer"), Gender.MAN, 50,
				Occupation.TEACHER, LocalDate.of(1972, 3, 14), LocalDate.of(2020, 1, 1),
				new PhoneNumber(123412312, 123412312), 50000, 60000, MarriageStatus.MARRIED);
		
		Employee t2 = new Teacher(new Name("Cagri","Turkmen"), Gender.MAN, 30,
				Occupation.TEACHER, LocalDate.of(1992, 3, 14), LocalDate.of(2020, 1, 1), 
				new PhoneNumber(123412312, 123412312), 1000, 2000, MarriageStatus.SINGLE);
		
		Employee t3 = new Teacher(new Name("Mustafa","Ozturk"), Gender.MAN, 32,
				Occupation.TEACHER, LocalDate.of(1990, 3, 14), LocalDate.of(2020, 1, 1),
				new PhoneNumber(123412312, 123412312), 50000, 60000, MarriageStatus.MARRIED);
		
		Employee o1 = new Officer(new Name("Bahadır","Ozturk"), Gender.MAN, 32,
				Occupation.OFFICER, LocalDate.of(1990, 3, 14),LocalDate.of(2000, 1, 1), LocalDate.of(2020, 3, 1), 
				new PhoneNumber(123412312, 123412312), 50000, 60000, MarriageStatus.MARRIED);
		
		Employee j1 = new Janitor(new Name("Heidi","Klum"), Gender.WOMAN, 32,
				Occupation.JANITOR, LocalDate.of(1990, 3, 14),LocalDate.of(2010, 1, 1), LocalDate.of(2021, 8, 5), 
				new PhoneNumber(123412312, 123412312), 50000, 60000, MarriageStatus.MARRIED);
		
		employeeList.add(j1);
		employeeList.add(o1);
		employeeList.add(t3);
		employeeList.add(t2);
		employeeList.add(t1);
		
		return employeeList;
	}
	
	public void listEmployee() throws TeacherException, OfficerException, JanitorException {
		
		List<Employee> employeeList = createAEmployee().stream().collect(Collectors.toList());
		for (Employee employee : employeeList) {
			System.out.println(employee);
		}
		
	}
	
	public void findFormerEmployees() throws TeacherException, OfficerException, JanitorException {
		List<Employee> formerEmployeeList = createAEmployee();
		for (Employee employee : formerEmployeeList) {
			if(!(employee.leavingDate==null)) {
			System.out.println(employee.getStartingDate()+"/"+employee.leavingDate+" "+"\n" 
		+ "Calisilan yil ve ay :" + employee.leavingDate.until(employee.getStartingDate()));
			}
		}
	}
}
