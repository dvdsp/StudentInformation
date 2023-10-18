/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Student;
import Repository.StudentInformationRepository;
import java.util.ArrayList;

/**
 *
 * @author DELL
 */

public class Manager {
	
	public void run() {
		ArrayList<Student> ls = new ArrayList<>();
		new StudentInformationRepository().display(ls);
	}
}
