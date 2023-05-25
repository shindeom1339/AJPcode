import java.rmi.*;
import java.rmi.registry.*;

public class palindrome_client {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		palindrome_interface obj1 = (palindrome_interface)Naming.lookup("rmi://localhost:5000/XYZ");
		String ans1 = obj1.palindromeCheck("hello");
		String ans2 = obj1.palindromeCheck("racecar");
		
		System.out.println(ans1);
		System.out.println(ans2);
	}

}
