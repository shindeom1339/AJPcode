import java.rmi.*;
import java.rmi.server.*;



public class palindrome_class extends UnicastRemoteObject implements Remote, palindrome_interface{

	palindrome_class() throws RemoteException{
		super();
	}
	
	public String palindromeCheck(String s) {
		String rev = "";
		for (int i=s.length()-1; i>=0; i--) {
			rev += s.charAt(i);
		}
		if (s.equals(rev)) {
			String k = "The word is Palindrome";
			return k;
		} else {
			String k = "The word is not Palindrome";
			return k;
		}
	}
}
