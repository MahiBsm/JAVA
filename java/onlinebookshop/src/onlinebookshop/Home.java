/* 

Title: Online Book Shopping management 

Author: MAHITHA B 

Created on: December 28 2022 

Last modified Date: 

Reviewed by: 

Reviewed on: 

*/ 

  

  

  

package onlinebookshop; 

  

import java.io.IOException; 

import java.util.*; 

  

public class Home { 
	
	

static	Scanner mainobj=new Scanner(System.in); 

public static void main(String[] args) throws IOException { 

 

System.out.println("-----------------ONLINE SHOPPING SYSTEM---------------------"); 

System.out.println("Choose:"); 

System.out.println("1.Customer \n2.Admin \n3.Exit "); 

int choice = mainobj.nextInt(); 

  

switch (choice) { 

case 1: 

      Customer.CustomerLogin(); 

      break; 

case 2: 

       Admin.Adminlogin(); 

case 3: 

       System.out.println("Exiting ..."); 

       System.exit(0); 

default: 

       System.out.print("Invalid Choice\n"); 

} 

} 

  

} 

 