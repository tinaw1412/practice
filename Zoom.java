package zoom;
import java.util.Scanner;
public class Zoom {
	public static void main(String[] args) {
		Scanner keyboard= new Scanner(System.in);
		System.out.println("---welcome to zoo---");
		boolean nextoperation=true;		
		while (nextoperation)
		{

			System.out.print("what animal do you want to know ? b:Bird,e:Eagle,f:fish: ");
			String type = keyboard.next();
			
			while (!type.equals("b") && !type.equals("e") && !type.equals("f")) {
					
				System.out.println("This animal doesn't exist. Enter c to continue or e to exit.");
				String reply=keyboard.next();

				if (reply.equals("e")) {
					System.out.println("---bye bye---");
					System.exit(0);
				}else if (reply.equals("c")) {
					System.out.println("Please make the choice of animal again. b:Bird,e:Eagle,f:fish ");
					type=keyboard.next();
				}
				
			}
			
			if (type.equals("b")) {
				Bird b = new Bird(8);
				b.setDes("an animal can fly");
				System.out.println("Bird:");
				b.move();
				b.eat();
				b.describe();
			 	Bird.staticFunction("this is a Bird");

				System.out.println("");
			}else if (type.equals("e")) {
				Eagle e = new Eagle(12);
				e.setDes("an animal can fly, but it is very violent, and it eats meet.");
				System.out.println("Eagle:");
				e.move();
				e.eat();
				e.describe();
				Eagle.staticFunction("this is a Eagle");

				System.out.println("");
			}else if (type.equals("f")) {
				Fish f = new Fish(30);
				f.setDes("an animal lives in the water");
				System.out.println("Fish:");
				f.move();
				f.eat();
				f.describe();
				Fish.staticFunction("this is a Fish");
			}
			
			System.out.println("Do you want to continue? (y or n)");
			String answer=keyboard.next();
				
			if (answer.equals("n"))
			{					
				System.out.println("---bye bye---");
				nextoperation=false;
			}
		}
		
		keyboard.close();
	}
}


