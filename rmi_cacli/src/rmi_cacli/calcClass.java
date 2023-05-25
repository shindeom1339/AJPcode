package rmi_cacli;
import java.rmi.*;
import java.rmi.server.*;


public class calcClass extends UnicastRemoteObject implements Remote, calcInterface{

	protected calcClass() throws RemoteException {
		super();
	}

	@Override
	public double add(double a, double b) throws RemoteException {
		// TODO Auto-generated method stub
		return a+b;
	}

	@Override
	public double sub(double a, double b) throws RemoteException {
		// TODO Auto-generated method stub
		return a-b;
	}

	@Override
	public double mul(double a, double b) throws RemoteException {
		// TODO Auto-generated method stub
		return a*b;
	}

	@Override
	public double div(double a, double b) throws RemoteException {
		// TODO Auto-generated method stub
		return a/b;
	}
	
}
