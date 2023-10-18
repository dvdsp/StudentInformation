/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataAccess;

import Common.Library;
import Common.Validate;
import Model.Student;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author DELL
 */
public class StudentInformationDao {

	private final Library library = new Library();
	private final Validate validate = new Validate();
	private static StudentInformationDao instance = null;

	public static StudentInformationDao Instance() {
		if (instance == null) {
			synchronized (StudentInformationDao.class) {
				if (instance == null) {
					instance = new StudentInformationDao();
				}
			}
		}
		return instance;
	}

	boolean check = false;

	public void addStudent(ArrayList<Student> ls) {

		if (!check) {
			System.out.println("====== Collection Sort Program =====");
			check = true;
		}
		System.out.println("Please input student information ");
		System.out.print("Name: ");
		String name = validate.checkInputString();
		System.out.print("Classes: ");
		String classes = validate.checkInputString();
		System.out.print("Mark: ");
		float mark = validate.checkInputFloat();
		ls.add(new Student(name, mark, classes));
	}

	public List<Student> sortStudent(ArrayList<Student> ls) {
		Collections.sort(ls);
		return ls;
	}

	public void displayListStudent(ArrayList<Student> ls) {

		if (ls.isEmpty()) {
			System.err.println("List empty.");
			return;
		}

		List<Student> l = sortStudent(ls);

		int i = 0;
		for (Student student : l) {
			System.out.println("--------Student " + ++i + "--------");
			System.out.println("Name: " + student.getName());
			System.out.println("Classes: " + student.getClasses());
			System.out.println("Mark: " + student.getMark());
		}
	}

	public void display(ArrayList<Student> ls) {
		addStudent(ls);
		while (true) {
			System.out.print("Do you want to enter more student information?(Y/N): ");
			if (library.checkInputYN()) {
				addStudent(ls);

			} else {
				break;
			}
		}
		displayListStudent(ls);
	}

}
