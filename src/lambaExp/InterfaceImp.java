package lambaExp;

interface demoExp1 {

	void printMessage(String msg);
	
}

public class InterfaceImp {

	public static void main(String[] args) {
		
		demoExp1 exp1=(msg)->System.out.println("Message is : "+msg);
		exp1.printMessage("Hello World");
	}
}
