package rmi_cacli;
import java.rmi.*;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class calcServer {

	public static void main(String[] args) throws RemoteException, Exception{
		// TODO Auto-generated method stub
		Registry registry = LocateRegistry.createRegistry(5001);
		calcClass obj = new calcClass();
		registry.bind("Calculate", obj);
		System.out.println("Server Started");

	}

}
