/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.assignmentpartones;


import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author RC_Student_lab
 */
public class AssignmentPartOnesTest {
    


    /**
     * Test of main method, of class AssignmentPartOnes.
     */
    @Test
    public  void testMain() {
        System.out.println("main");
        String[] args = null;
        AssignmentPartOnes.main(args);
    
    }

    
    
    
       @Test
    public  void testSaveStudent() {
       
        
        
           AssignmentPartOnes instances = new AssignmentPartOnes();
Student instance = new Student();

        instance.setId("St12345");

        
        instance.setName("emails");

 
        instance.setAge(Integer.toString(19)); // Assuming age is stored as a string

      
        instance.setEmail("Emails");

        
        instance.setCourse("DIS1");

        // Add the new student to the list
        instances.students.add(instance);

    
    }
    
    
    
         @Test
    public  void testSearch() {
       
        
        
           AssignmentPartOnes instances = new AssignmentPartOnes();
Student instance = new Student();

        instance.setId("St12345");

        
        instance.setName("emails");

 
        instance.setAge(Integer.toString(19)); // Assuming age is stored as a string

      
        instance.setEmail("Emails");

        
        instance.setCourse("DIS1");

        // Add the new student to the list
        instances.students.add(instance);

        
        instances.searchStudent("st12343");
    
    }
    

    
}
