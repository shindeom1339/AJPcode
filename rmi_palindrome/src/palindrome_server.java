import java.rmi.*;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;


public class palindrome_server {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Registry reg = LocateRegistry.createRegistry(5000);
		palindrome_interface obj = new palindrome_class();
		reg.bind("XYZ", obj);
	}

}
