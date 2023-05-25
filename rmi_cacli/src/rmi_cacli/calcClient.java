package rmi_cacli;
import java.rmi.*;
import java.util.*;

public class calcClient {

	public static void main(String[] args) throws Exception {
		calcInterface obj1 = (calcInterface)Naming.lookup("rmi://localhost:5001/Calculate");
		Scanner sc = new Scanner(System.in);
		int ch = 0;
		do {
			System.out.print("Enter the 1st number: ");
			double a = sc.nextDouble();
			
			System.out.print("Enter the 2nd number: ");
			double b = sc.nextDouble();
			
			System.out.println("Select operation to be performed");
			System.out.print("1. Addition\n2. Substraction\n3. Multiplication\n4. Division\n:");
			
			int op = sc.nextInt();
			
			switch(op) {
			case 1:
				System.out.println("Addition: " + obj1.add(a, b));
				break;
			case 2:
				System.out.println("Substration: " + obj1.sub(a, b));
				break;
			case 3:
				System.out.println("Multiplication: " + obj1.mul(a, b));
				break;
			case 4:
				System.out.println("Division: " + obj1.div(a, b));
				break;
			default: 
				System.out.println("Select corrct operation.");
			}
			
			System.out.println("Do you want to continue? \nPress 1 to continue and 0 to exit.");
			ch=sc.nextInt();
			
		}while (ch!=0);{
			System.out.println("Closed successfully");
		}
		
	}

}
