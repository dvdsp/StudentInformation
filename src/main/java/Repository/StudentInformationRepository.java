/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

import DataAccess.StudentInformationDao;
import Model.Student;
import java.util.ArrayList;

/**
 *
 * @author QuaVi
 */
public class StudentInformationRepository implements Interfaces_StudentInformationRepository{

    @Override
	public void addStudent(ArrayList<Student> ls) {
		StudentInformationDao.Instance().addStudent(ls);
		
	}

	@Override
	public void displayListStudent(ArrayList<Student> ls) {
		StudentInformationDao.Instance().displayListStudent(ls);
		
	}

	@Override
	public void display(ArrayList<Student> ls) {
		StudentInformationDao.Instance().display(ls);
		
	}
   
}
