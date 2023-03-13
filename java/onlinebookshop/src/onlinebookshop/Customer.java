package onlinebookshop;
 

import java.io.*;
import java.sql.SQLException;
import java.util.*; 

  

public class Customer  { 

	static String Name, Address, emailid, Phoneno, Password; 
 static Scanner in= new Scanner(System.in); 
  

public static void Register() throws IOException { 


System.out.println("Enter Name: "); 

 Name = in.next(); 

System.out.println("Enter emaild: "); 

 emailid = in.next(); 

System.out.println("Enter Phoneno: "); 

 Phoneno = in.next(); 

System.out.println("Enter Address: "); 

 Address = in.next(); 

System.out.println("Enter password (numbers only): "); 

 Password = in.next(); 

  

System.out.println("User Successfully Registered"); 

Login(); 

} 

  

public static void Login() throws IOException { 

System.out.println("Enter UserName: "); 

String uname = in.next(); 

System.out.println("Enter password: "); 

String upassword = in.next(); 

  

if (uname.equals(Name) && upassword.equals(Password)){ 

try {
	afterlogin();
} catch (SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
} 

} 

else { 

System.out.println("User id and password does not match"); 
CustomerLogin();

} 

} 

public static void AddToCart(int opt) throws SQLException { 

System.out.println("DO YOU WANT TO BUY THIS BOOK(1.YES/2.NO):"); 
int opti=in.nextInt(); 

if(opti==1) 

{ 

System.out.println("Enter Name: "); 
String N = in.next(); 
System.out.println("Enter emaild: "); 
String eid = in.next(); 
System.out.println("Enter Phoneno: "); 
String PH = in.next(); 
System.out.println("Enter Address: "); 
String Add = in.next(); 



System.out.println("Mode of payment:\n 1.Cash on delivery\n 2.credit/debit card\n 3.gpay/UPI "); 

int mop=in.nextInt(); 

if(mop==1) 

{ 

System.out.println("Cash On delivery "); 

 

} 

else if(mop==2) 

{ 

System.out.println("enter card number: "); 

long cn=in.nextLong(); 

System.out.println("Name on Card: "); 

String nameoncard=in.next(); 

System.out.println("Valid through: "); 

String valid=in.next(); 

System.out.println("Cvv: "); 

int cvv=in.nextInt(); 

} 

else 

{ 

System.out.println("PIN: "); 

int pin=in.nextInt(); 

System.out.println("Rs: "); 

int pay=in.nextInt(); 

System.out.println("pay Rs."+pay); 

} 

System.out.println("... Order Placed ... "); 

System.out.println("your order has been confrimed: "); 

System.out.println("Name: "+N+"\nAddress: "+Add+"\nPhone no: "+PH+"\nEmail: "+eid); 

System.out.println("Books:"); 
Admin.order(opt);
 

System.out.println("\n\nDo you want to continue(1.Yes/2.No)? "); 

int choice=in.nextInt(); 

if(choice==1) 

{ 

ViewAll(); 

} 

else 

{ 

System.out.println("Thanks for buying\nLogging out ..."); 

} 

} 

else 

{ 

System.out.println("Do you want to cancel?(1.YES/2.NO:):"); 

int j=in.nextInt(); 

if(j==1) 

{ 

ViewAll(); 

} 

else { 

AddToCart(opt); 

} 

} 

} 

public static void ViewAll() throws SQLException { 


	Admin.ShowBook();
	System.out.println("choose your Book:"); 
	int opt=in.nextInt(); 
	AddToCart(opt); 

} 

  

public static void afterlogin() throws SQLException { 

System.out.println("\n\nHello " + Name + "\nChoose option"); 

System.out.println("\n1.view\n2.Logout"); 

int choose1 = in.nextInt(); 

  

switch (choose1) { 

case 1: 

ViewAll(); 

break; 

case 2: 

System.out.println("Logged out ..."); 

System.exit(0); 

default: 

System.out.print("Invalid Choice\n"); 

} 

} 


public static void CustomerLogin() throws IOException
{
	
	System.out.println("-----------------ONLINE SHOPPING SYSTEM---------------------"); 

	System.out.println("\n1.Register \n2.Login \n3.Exit "); 
	int choose = in.nextInt(); 

	switch (choose) { 

	case 1: 

	Register(); 

	break; 

	case 2: 

	Login(); 

	break; 

	case 3: 

	System.out.println("Exiting ..."); 

	System.exit(0); 

	default: 

	System.out.print("Invalid Choice\n"); 

	} 

	} 


}  

    
