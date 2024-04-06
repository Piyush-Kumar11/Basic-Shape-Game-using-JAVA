package shape_game;
import java.util.Scanner;

//Driver Class for the Game Project

public class User {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		Game g=new Game();		// Game object Creation
		
		char c;					// Declaration of char to visible in this block
		do {			// Do-While st. for re-ask the user to start the game or exit from it...
			int choice=g.selectShape();
			System.out.println("Choice is: "+choice);
			switch(choice)
			{
				case 1: 
					TwoD_Shape t1=g.selectTwoDShape();		// Upcasting - Giving parents object ref to Child class
					t1.getArea();				// Non-static method call using object ref
					t1.getPerimeter();			// Non-static method call using object ref
					break;
					
				case 2: 
					ThreeD_Shape t2=g.selectThreeDShape();	// Upcasting - Giving parents object ref to Child class
					t2.getVolume();				// Non-static method call using object ref
					t2.getLateralSurfaceArea(); // Non-static method call using object ref
					t2.getTotalSurfaceArea();	// Non-static method call using object ref
					break;
			}
			System.out.println("Press Y/y to continue or other character to EXIT!!");
			c=sc.next().charAt(0);				// Store the Character Y/y to while statement condition
			
			
			}while(c=='Y' || c=='y');
			System.out.println("Thank You for Playing the Game!!!");		// Message after EXITing the Game
			System.out.println("Have a Good Day!!!");
			
	sc.close();
	}

}
