/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

import Model.Student;
import java.util.ArrayList;

/**
 *
 * @author QuaVi
 */
public interface Interfaces_StudentInformationRepository {

    void addStudent(ArrayList<Student> ls);

    void displayListStudent(ArrayList<Student> ls);

    void display(ArrayList<Student> ls);
}
