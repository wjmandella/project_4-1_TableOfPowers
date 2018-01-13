import java.util.Scanner;
public class TableOfPowersApp {

	public static void main(String[] args) {
		System.out.println("Welcome to a \"POWERS OF X!\" table");
		
		Scanner sc = new Scanner(System.in);
		
		int integer = 0;
		
		String choice = "y";
		
		while (choice.equalsIgnoreCase("y")) {
			System.out.println();
			System.out.print("Enter an integer:  ");
			integer = sc.nextInt();
					
			System.out.println();
			System.out.print("Enter largest power of \"X\" for the table:  ");
			int power = sc.nextInt();
			System.out.println();
			
//			System.out.println("Number\tSquared\tCubed");
//			System.out.println("======\t=======\t=====");
			String labels = "";
			String equalSigns = "";
			
			for (int a = 1; a <= power; a++) {
				labels += "x^" + a + "\t";			
			}
			System.out.println(labels);
			
			for (int b = 1; b <= power; b++) {
				equalSigns += "====" + "\t";
			}
			System.out.println(equalSigns);
			
			String row = "";
			String table = "";
			
	
			for (int i = 1; i <= integer; i++) {
				row = i + "\t";
				
				for (int j = 2; j <= power; j++) {
					int num = (int) Math.pow(i,j);
					row += num + "\t";					
				}
				
				table += row + "\n";
			}
			System.out.println(table);
			//System.out.println();
			System.out.print("Continue? (y/n): ");
			choice = sc.next();
		}
		sc.close();
		System.out.println("Bye!");

	}

}
