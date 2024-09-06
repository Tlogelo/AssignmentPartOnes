/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.assignmentpartones;

import java.util.*;

public class AssignmentPartOnes{

    public  ArrayList<Student> students = new ArrayList<>(); // ArrayList of students

    
    public static void main(String[] args) {
        // Displaying the launch menu
        Scanner g = new Scanner(System.in);
        System.out.println("************************************************** ");
        System.out.println("Student Management Application: ");
        System.out.println("************************************************** ");
 AssignmentPartOnes instance = new AssignmentPartOnes();
        // Prompting the user to choose what they want
        while (true) {
            System.out.println("Enter (1) to launch menu or any other key to exit >>>> ");
            String choice = g.next();

            if (choice.equals("1")) {
                System.out.println("Please select one of the following items:");
                System.out.println("(1) Capture a new student ");
                System.out.println("(2) Search for a new student ");
                System.out.println("(3) Delete a student ");
                System.out.println("(4) Print student report ");
                System.out.println("(5) Exit Application ");

                String choices = g.next();

                switch (choices) {
                    case "1":
                        // Calling the student method
                        saveStudent(g);
                        break;
                    case "2":
                        // Code for searching for a student
                          System.out.println("Enter the Student ID to search: ");
        String studentId = g.next();
         
                       instance. searchStudent(studentId);
                        
                        break;
                    case "3":
                        // Code for deleting a student (implement if needed)
                        instance.deleteStudent(g);
                        break;
                    case "4":
                        // Code for printing student report (implement if needed)
                       instance.printStudentReport();
                        break;
                    case "5":
                        System.out.println("Exiting application...");
                        g.close();
                        return; // Exit the program
                    default:
                        System.out.println("Invalid option. Please try again.");
                        break;
                }
            } else {
                System.out.println("Bye");
                g.close();
                return; // Exit the program
            }
        }
    }

    // Method for capturing a new student
    public static void saveStudent(Scanner input) {
           AssignmentPartOnes instance = new AssignmentPartOnes();
         for (int i = 0; i < 3; i++) {
              Student newStudent = new Student(); // Create a new Student object

        System.out.println("Capture a new student:");
        System.out.println("***********************************************");
        System.out.println("Student ID:");
        newStudent.setId(input.next());

        System.out.println("Enter the student name: ");
        newStudent.setName(input.next());

        System.out.println("Enter the student age: ");
        int age = input.nextInt();
        while (age < 16) {
            System.out.println("You have entered an incorrect student age");
            System.out.println("Please re-enter the student age >> ");
            age = input.nextInt();
        }
        newStudent.setAge(Integer.toString(age)); // Assuming age is stored as a string

        System.out.println("Enter the student email: ");
        newStudent.setEmail(input.next());

        System.out.println("Enter the student course: ");
        newStudent.setCourse(input.next());

        // Add the new student to the list
        instance.students.add(newStudent);

        System.out.println("*******************************************************************************");
        System.out.println(" Student details have been successfully saved ");
        System.out.println("*******************************************************************************");
    }
         }
       

    // Method for searching for a student
    public  void searchStudent(String studentId) {
      

        boolean studentFound = false;

        for (Student student : students) {
            if (student.getId().equals(studentId)) {
                studentFound = true;
                System.out.println("Student found!");
                student.displayStudentDetails(); // Display student details using the Student class method
                break;
            }
        }

        if (!studentFound) {
            System.out.println("Student with ID " + studentId + " cannot be located.");
            
        }
    }
     // Method for deleting a student
    public  void deleteStudent(Scanner input) {
        System.out.println("Enter the Student ID to delete: ");
        String studentId = input.next();
 
        // Find the student to delete
        Iterator<Student> iterator = students.iterator();
        boolean studentFound = false;

        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getId().equals(studentId)) {
                studentFound = true;
                System.out.println("Student found: ");
                student.displayStudentDetails(); // Display student details for confirmation

                // Ask for confirmation
                System.out.println("Are you sure you want to delete this student? (yes/no)");
                String confirmation = input.next();

                if (confirmation.equalsIgnoreCase("yes")) {
                    iterator.remove(); // Remove the student from the list
                    System.out.println("Student has been successfully deleted.");
                } else {
                    System.out.println("Deletion cancelled.");
                }
                break;
            }
        }

        if (!studentFound) {
            System.out.println("Student with ID " + studentId + " cannot be located.");
        }
    }
    // Method for printing the student report
    public  void printStudentReport() {
        AssignmentPartOnes instance = new AssignmentPartOnes();
        if (instance.students.isEmpty()) {
            System.out.println("No students in the system.");
            return;
        }
        System.out.println("**************************************************");
        System.out.println("Student Report:");
        System.out.println("**************************************************");
        for (Student student : students) {
            student.displayStudentDetails();
            System.out.println("--------------------------------------------------");
        }
        System.out.println("**************************************************");
    }
}


