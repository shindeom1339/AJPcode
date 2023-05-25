import java.rmi.Remote;
import java.rmi.RemoteException;


public interface palindrome_interface extends Remote{
		public String palindromeCheck(String s) throws RemoteException;
}
