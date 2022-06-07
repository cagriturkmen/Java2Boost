package com.bilgeadam.boost.maraton.create;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;
import java.util.stream.Collectors;

import com.bilgeadam.boost.maraton.entity.*;
import com.bilgeadam.boost.maraton.exception.*;

public class SchoolManager {
	private static Scanner scanner = new Scanner(System.in);


	private School school = new School(new ArrayList<Employee>(),new ArrayList<Student>(),new ArrayList<Course>());
	Locale                 locale;
	ResourceBundle         languageBundle;

	
	public SchoolManager(String country) throws TeacherException, OfficerException, JanitorException, MarriageStatusException, StudentException {
	locale = new Locale(country);
	languageBundle = ResourceBundle.getBundle("com.bilgeadam.boost.maraton.texts.texts",locale);
	
	menuLoop();

	}
	
	public void menuLoop() throws TeacherException, OfficerException, JanitorException, MarriageStatusException, StudentException {
		do {
			showMenuItems();
			makeChoice(getUserSelection(""));
		} while (true);
	}
	
	public int getUserSelection(String message) {
		System.out.println(message + " ");
		try {
			int userInput = scanner.nextInt();
			if (userInput >= 1 && userInput <= 10) {
				return userInput;
			}
		}
		catch (Exception e) {
			System.out.println("# " + languageBundle.getString("LocalGlobal.14"));
			return -1;
		}
		System.out.println("# " + languageBundle.getString("LocalGlobal.14"));
		return -1;
	}

	public void showMenuItems() {
		System.out.println("\n#########################################################");
		System.out.println("################## School Management System #################");
		System.out.println("#########################################################");

		System.out.println("# 1-  " + languageBundle.getString("LocalGlobal.1") + "\t\t\t\t\t#");
		System.out.println("# 2-  " + languageBundle.getString("LocalGlobal.2") + "\t\t\t\t\t#");
		System.out.println("# 3-  " + languageBundle.getString("LocalGlobal.3") + "\t\t\t\t\t#");
		System.out.println("# 4-  " + languageBundle.getString("LocalGlobal.4") + "\t\t\t\t\t#");
		System.out.println("# 5-  " + languageBundle.getString("LocalGlobal.5") + "\t\t\t\t\t#");
		System.out.println("# 6-  " + languageBundle.getString("LocalGlobal.6") + "\t\t\t\t\t#");
		System.out.println("# 7-  " + languageBundle.getString("LocalGlobal.7") + "\t\t\t\t#");
		System.out.println("# 8-  " + languageBundle.getString("LocalGlobal.8") + "\t\t\t\t\t#");
		System.out.println("# 9-  " + languageBundle.getString("LocalGlobal.9") + "\t\t\t\t\t#");
		System.out.println("# 10- " + languageBundle.getString("LocalGlobal.10") + "\t\t\t\t\t#");
		System.out.println("#########################################################");
	}

	public void makeChoice(int choice) throws TeacherException, OfficerException, JanitorException, MarriageStatusException, StudentException {
		switch (choice) {
		case 1:
			newEmployees();
			break;
		case 2:
			listEmployees(school.getEmployees());
			break;
		case 3:
			listOldEmployees(school.getEmployees());
			break;
		case 4:
			newLessons();
			break;
		case 5:
			newStudents();
			break;
		case 6:
			lessonsList(school.getLessons());
			break;
		case 7:
			studentsLessons();
			break;
		case 8:
			giftList();
			break;
		case 9:
			calculateSalary();
			break;
		case 10:
			System.exit(1);;
			break;
		default:
			System.out.println("Hatalı giriş yaptınız, yeniden deneyin.");
		}
	}
	private void newEmployees() throws TeacherException, OfficerException, JanitorException {
		Employee t1 = new Teacher(new Name("Babur","Somer"), Gender.MAN, 50,
				Occupation.TEACHER, LocalDate.of(1972, 3, 14), LocalDate.of(2020, 1, 1),
				new PhoneNumber(123412312, 123412312), 50000,  MarriageStatus.MARRIED);
		
		Employee t2 = new Teacher(new Name("Cagri","Turkmen"), Gender.MAN, 30,
				Occupation.TEACHER, LocalDate.of(1992, 3, 14), LocalDate.of(2020, 1, 1), 
				new PhoneNumber(123412312, 123412312), 1000,  MarriageStatus.SINGLE);
		
		Employee t3 = new Teacher(new Name("Mustafa","Ozturk"), Gender.MAN, 32,
				Occupation.TEACHER, LocalDate.of(1990, 3, 14), LocalDate.of(2020, 1, 1),
				new PhoneNumber(123412312, 123412312), 50000,  MarriageStatus.MARRIED);
		
		Employee o1 = new Officer(new Name("Bahadır","Ozturk"), Gender.MAN, 32,
				Occupation.OFFICER, LocalDate.of(1990, 3, 14),LocalDate.of(2000, 1, 1), LocalDate.of(2020, 3, 1), 
				new PhoneNumber(123412312, 123412312), 50000,  MarriageStatus.MARRIED);
		
		Employee j1 = new Janitor(new Name("Heidi","Klum"), Gender.WOMAN, 32,
				Occupation.JANITOR, LocalDate.of(1990, 3, 14),LocalDate.of(2010, 1, 1), LocalDate.of(2021, 8, 5), 
				new PhoneNumber(123412312, 123412312), 50000,  MarriageStatus.MARRIED);
		
		school.addEmployee(j1);
		school.addEmployee(o1);
		school.addEmployee(t3);
		school.addEmployee(t2);
		school.addEmployee(t1);
		
	}
	private void listEmployees(List<Employee> employees) {
		employees.stream().forEach(employee -> System.out.println(employee));
	}
	private void listOldEmployees(List<Employee> employees) {
		employees.stream()
		.filter(employee -> employee.getLeavingDate() != null)
		.forEach(employee -> System.out.println(employee));
	}
	private void newLessons() throws TeacherException {
		
		Course java = new Course("Java",2020,4,DayOfWeek.MONDAY,LocalTime.of(13, 0));
		Course dotnet = new Course(".Net",2015,4,DayOfWeek.MONDAY,LocalTime.of(13, 0));
		Teacher t1 =(Teacher) school.getEmployees().get(3);
		Teacher t2 = (Teacher) school.getEmployees().get(4);
		java.setAssistantTeacher(t1);
		java.setMainTeacher(t2);
		dotnet.setAssistantTeacher(t2);
		dotnet.setMainTeacher(t1);
		school.addLesson(dotnet);
		school.addLesson(java);
		
	}
	
	private void newStudents() throws MarriageStatusException, StudentException {
		Student stu1 = new Student(new Name("First", "Mid", "Last"),
				Gender.MAN,18,Occupation.STUDENT,LocalDate.of(1998, 7, 13),
				LocalDate.of(2010, 7, 13),LocalDate.of(2015, 7, 13),
				new PhoneNumber(123412312, 123412312),MarriageStatus.SINGLE);
		Student stu2 = new Student(new Name("Cagri", "Turkmen"),
				Gender.MAN,18,Occupation.STUDENT,LocalDate.of(1998, 7, 13),
				LocalDate.of(2010, 7, 13),LocalDate.of(2015, 7, 13),
				new PhoneNumber(123412312, 123412312),MarriageStatus.SINGLE);
		school.addStudent(stu1);
		school.addStudent(stu2);
		school.getLessons().get(0).addStudent(stu1);
		school.getLessons().get(1).addStudent(stu2);
		school.getStudents().get(0).addLesson(school.getLessons().get(0));
		school.getStudents().get(1).addLesson(school.getLessons().get(1));
	}

	private void lessonsList(List<Course> lessons) {
		for (Course lesson : lessons) {
			System.out.println(lesson.getName()+"-"+lesson.getMainTeacher());
			lesson.getStudentList().stream().forEach(i -> System.out.println(i));
		}
	}
	
	private void studentsLessons() {
		school.getStudents().stream().forEach(i -> System.out.println(i));
		System.out.println("# " + languageBundle.getString("LocalGlobal.11") + " : ");
		String regNum = scanner.next();
		school.getStudent(regNum).getLessons().stream().forEach(i -> System.out.println(i));
	}
	
	private void giftList() {
		System.out.println("# " + languageBundle.getString("LocalGlobal.12"));
		int today = LocalDate.now().getMonthValue();
		school.getEmployees().stream().filter(i -> i.getStartingDate().getMonthValue() == today)
				.forEach(s -> System.out.println("# " + s.getName()));

		System.out.println("# " + languageBundle.getString("LocalGlobal.13"));
		List<Employee> females = school.getEmployees().stream().filter(i -> i.getGender() == Gender.WOMAN)
				.collect(Collectors.toList());
		females.stream().filter(i -> i.getBirthday().getMonthValue() == today)
				.forEach(s -> System.out.println("# " + s.getName()));
	}
	private void calculateSalary() {
		List<Employee> employees = school.getEmployees().stream().filter(i -> i.getLeavingDate() == null)
				.collect(Collectors.toList());

		System.out.println("# " + languageBundle.getString("LocalGlobal.17") + " : ");
		for (Employee employee : employees) {
			System.out.println(employee.getName() + " : " + employee.calculateLatestSalary());
		}
	}
	
}
