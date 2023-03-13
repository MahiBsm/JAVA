package dailypractice;


import java.util.Scanner;

public class ExceptionDemo {
	
	public static void main(String[] args) throws ManualException  {
		ExceptionDemo obj = new ExceptionDemo();
			obj.divide();
	}

	private void divide() throws ManualException  {
		

		Scanner sc= new Scanner(System.in);
		System.out.println("enter: ");
//		
//		int a=sc.nextInt();
//		int b=sc.nextInt();
//		sc.nextLine();
//		try {
//		System.out.println(a/b);
//		
//		}
//		catch(Exception e) {
//	       throw new ManualException();
//		}
		try {
			if(sc.nextLine().equals("mahi"))
			{
				throw new ManualException("Exception");
			}
		}
		catch(Exception e) {
			try {
				if(sc.nextLine().equals("mahi"))
				{
					throw new ManualException("Exception");
				}
			}
			catch(Exception er) {
				throw new ManualException("illegal vhgdtrfcgv"+e);
			}
			throw new ManualException("illegal"+e);
			
		}
		
	}
	
}

