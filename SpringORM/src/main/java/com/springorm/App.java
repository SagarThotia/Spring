package com.springorm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springorm.dao.StudentDao;
import com.springorm.entities.Student;
//import com.springorm.entities.Student;

public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext context = new  ClassPathXmlApplicationContext("SpringORMConfig.xml");
       StudentDao studentDao  =  context.getBean("studentDao", StudentDao.class);
		/*
		 * Student student = new Student(50, "Albina Peposhi", "Tirana");
		 *  int r = studentDao.insert(student); 
		 *  System.out.println("Done " + r);
		 */
       
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       boolean go = true;
       while(go)
       {
    	   System.out.println("PRESS 1 for add new Student");
    	   System.out.println("PRESS 2 for get detail of single student");
           System.out.println("PRESS 3 for display all students"); 
           System.out.println("PRESS 4 for update student");
           System.out.println("PRESS 5 for delete student");
           System.out.println("PRESS 6 for exit");
           System.out.println();
           
           
           try 
           {
        	   System.out.print("Enter your choice: ");
        	   int choice = Integer.parseInt(br.readLine());
        	   
        	   switch(choice)
        	   {
        	   
        	       case 1: 
        	    	 //add a new student
        	    	 // taking inputs from users  
        	    	   System.out.print("Enter user id: ");
        	    	   int uid = Integer.parseInt(br.readLine());
        	    	   
        	    	   System.out.print("Enter user name: ");
        	    	   String uname = br.readLine();
        	    	   
        	    	   System.out.print("Enter user city: ");
        	    	   String ucity = br.readLine();
        	    	   
        	    	   //creating student object and setting values
        	    	   Student s = new Student();
        	    	   s.setId(uid);
        	    	   s.setName(uname);
        	    	   s.setCity(ucity);
        	    	   
        	    	  //saving student object to database by calling insert of  studentDao
        	    	  int r = studentDao.insert(s);
        	    	  System.out.println(r + " id Student is added ");
        	    	  System.out.println("**************************************************************");
        	    	  System.out.println();	
        	    	 break;
        	    
        	    	 
        	    	 
        	       case 2:
        	    	 // get single student data
        	    	   
        	    	   System.out.print("Enter user id: ");
        	    	   int userId = Integer.parseInt(br.readLine());
        	    	   
        	    	   Student student = studentDao.getStudent(userId);
        	    	   
        	    	   System.out.println("Id : " + student.getId());
      	    		   System.out.println("Name: " + student.getName());
      	    		   System.out.println("City: " + student.getCity());	
      	    		   System.out.println("___________________________________________________________________________________");	
      	    		   System.out.println();
        	    	break; 
        	    	 
        	    	
        	    	 
        	       case 3:
        	    	 //display all students  
        	    	  
        	    	   System.out.println();	 
        	    	  
        	    	  List<Student> allStudents =  studentDao.getAllStudents();
        	    	 
        	    	  for(Student st:allStudents)
        	    	 {
        	    		 System.out.println("Id : " + st.getId());
        	    		 System.out.println("Name: " + st.getName());
        	    		 System.out.println("City: " + st.getCity());	
        	    		 System.out.println("___________________________________________________________________________________");	
        	    		 System.out.println();
        	    	 }
        	    	 System.out.println();
        	    	 break;
        	    	
        	    	 
        	    	 
        	       case 4:
        	    	  //update student
        	    	   
        	    	   System.out.print("Enter user id: ");
        	    	   int uuid = Integer.parseInt(br.readLine());
        	    	   
        	    	   
        	    	   System.out.print("Enter user name: ");
        	    	   String uuname = br.readLine();
        	    	   
        	    	   System.out.print("Enter user city: ");
        	    	   String uucity = br.readLine();
        	    	
        	    	   Student s1 = new Student();
        	    	   s1.setId(uuid);
        	    	   s1.setName(uuname);
        	    	   s1.setCity(uucity);
        	    	   
        	    	  studentDao.UpdateStudent(s1);
         	    	  System.out.println("Student data is updated");
         	    	  System.out.println("**************************************************************");
         	    	  System.out.println();	
        	    	   
        	    	break;

        	    	
        	    	
        	       case 5:
        	    	  // delete student
        	    	  System.out.print("Enter user id: ");
        	    	  int id = Integer.parseInt(br.readLine());
        	    	  studentDao.deleteStudent(id);
        	    	  System.out.println("Student Deleted...");	
        	    	  System.out.println("___________________________________________________________________________________");	
     	    		  System.out.println();
        	    	
        	    	break;
        	    	
        	    
        	    	
        	       case 6:
        	    	  //exit 
        	    	 go=false;  
        	    	break;
        	    
        	    	
        	    	
        	    	default:
        	    	System.out.println("Invalid choice");	
        	   }
        	   
        	   
        	   
           }catch(Exception e)
           {
        	  System.out.println("Invalid Input try with another one");   
        	  System.out.println(e.getMessage());
           }
       }
      System.out.println("Thankyou for using my application");
      System.out.println("See you soon !!"); 
    }
}
