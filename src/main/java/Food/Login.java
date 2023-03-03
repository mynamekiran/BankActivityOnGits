package Food;
import java.util.Scanner;
import Food.*;
public class Login 
{

	static void adminmainmenu()
	{
		System.out.printf("%50s\n\n\n\n\n\n","Food Ordering");
		System.out.printf("%40s\n\n","1: Customer List");
		System.out.printf("%40s\n\n","2: Order List");
		System.out.printf("%40s\n\n","3: Category List");
		System.out.printf("%40s\n\n","4: Item List  ");
	}
	
	static void customermainmenu()
	{
		System.out.printf("%50s\n\n\n\n\n\n"," Customer Food Ordering Panel");
		
	}
	
	public static void main(String...g)
	{
		String u,p;
		
		Scanner sc = new Scanner(System.in);
		System.out.printf("%50s\n\n\n\n\n","Login");
		System.out.println("\n UserName / Phone Number :");
		u= sc.next();
		System.out.printf("\n Password :");
		p = sc.next();
		
		
		if(Db.usr[0].getUsername().equals(u) && Db.usr[0].getPassword().equals(p))
		{
			adminmainmenu();
		}
		{
			adminmainmenu();
		}
		
		if(Db.cust[0].getPhno().equals(u)  && Db.cust[0].getPassword().equals(p) )
		{
			customermainmenu();
			
		}
	}
}
