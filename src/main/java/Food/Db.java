package Food;

public class Db {
	
	public static User usr[];
	public static Customer cust[];

	static
	{
		usr = new User[1];
		usr[0] = new User();
		usr[0].setUsername("kiran");
		usr[0].setPassword("1234");
		cust[0].setCustid(101);
		cust[0].setEmail("kitan@gamil.com");
		cust[0].setPassword("1234");
		cust[0].setAddress("xxxxxxxx");
		cust[0].setPincode(12345);
		cust[0].setOrderid(0);
		cust[0].setPhno("254216");
	}
}
