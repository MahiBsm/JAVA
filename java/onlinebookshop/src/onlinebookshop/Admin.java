package onlinebookshop;

import java.util.Scanner;
import java.io.IOException;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.Statement;

public class Admin { 
	
	


public static void order(int opt) throws SQLException {
	
	Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/onlineshopping","root","Aspire@123");
	Statement statement=connection.createStatement(); 
	ResultSet resultset=statement.executeQuery("select * from books where idbooks=%d".formatted(opt));
	while(resultset.next()) {
		System.out.println(resultset.getInt(1)+"  "+resultset.getString(2)+" ----- "+resultset.getString(3));
	}
}

static void ShowBook() throws SQLException 

{
	
Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/onlineshopping","root","Aspire@123");
Statement statement=connection.createStatement(); 
ResultSet resultset=statement.executeQuery("select * from books");
while(resultset.next()) {
	System.out.println(resultset.getInt(1)+"  "+resultset.getString(2)+" ----- "+resultset.getString(3));
}

 

} 

static void BooksModify() throws SQLException 
{ 
	
	
try (Scanner scanner = new Scanner(System.in)) { 

System.out.println("\n1.Add book \n2.Remove book"); 

int choice=scanner.nextInt(); 

scanner.nextLine(); 

if(choice==1) 

{   System.out.println("book :");
	System.out.println("Enter the book id:");
	int idbooks= scanner.nextInt();
	scanner.nextLine();
	System.out.println("Enter the book name:");
	String Addchoice=scanner.nextLine();
	System.out.println("Enter the book price:");
	int bookprice= scanner.nextInt();
	String query="INSERT INTO books (idbooks, bookname, bookprice) VALUES (%d,'%s',%d);".formatted(idbooks,Addchoice,bookprice);
	
	Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/onlineshopping","root","Aspire@123");
	Statement statement=connection.createStatement(); 
	statement.executeUpdate(query);
	
	System.out.println("Book added successfully"); 

	

	try {
		ShowBook();
	} catch (SQLException e) {
		e.printStackTrace();
	} 
	System.out.println("do want to continue?"); 
	int choice1=scanner.nextInt(); 

 if(choice1==1) 

{ 

	BooksModify(); 

} 

else 

	System.out.println("loging out"); 

} 

else {

	System.out.println("enter the index of book to remove"); 

    int removechoice=scanner.nextInt(); 
    String removebook="DELETE FROM books WHERE idbooks=%d".formatted(removechoice);
    Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/onlineshopping","root","Aspire@123");
	Statement statement=connection.createStatement(); 
	statement.execute(removebook);
	
    System.out.println("Book removed successfully"); 

    System.out.println("do want to continue?"); 

    int choice2=scanner.nextInt(); 

if(choice2==1) 

{ 

	BooksModify(); 

} 

else
	System.out.println("loging out"); 


} 

}  }


public static void Adminlogin() throws IOException { 
	
	

try (Scanner scan = new Scanner(System.in)) { 

String name,psd; 

 

System.out.println("Enter UserName: "); 

name = scan.nextLine(); 

System.out.println("Enter password: "); 

psd = scan.nextLine(); 

  

 

if (name.equals("admin") && psd.equals("0000")) { 

System.out.println("1.Show books\n2.Modify\n3.logout"); 

int choice=scan.nextInt(); 

if(choice==1)
	try {
		ShowBook();
	} catch (SQLException e) {
		
		e.printStackTrace();
	}
else if(choice==2)
	try {
		Admin.BooksModify();
	} catch (SQLException e) {
		
		e.printStackTrace();
	}
else 

Home.main(null); 

  

} else { 

System.out.println("User id and password does not match"); 

Home.main(null); 

} 

} 

 

} 

  

} 

 