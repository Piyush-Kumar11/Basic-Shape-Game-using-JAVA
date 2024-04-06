package shape_game;

import java.util.Scanner;

public class Game {
	
	Game()		// For printing these statements at the time of Object Creation
	{
		System.out.println("Welcome To Game!");
		System.out.println("Game is now Started!!");
	}
	
	public int selectShape()		// Method for choice between 2-D and 3-D shapes
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("==Press 1 for 2-D Shape===");
		System.out.println("==Press 2 for 3-D Shape===");
		
		int x=sc.nextInt();
		if(x==1) {
			System.out.println("You have selected 2-D Shape");
			return x;				// Returning option to make choices
		}
		else if(x==2) {
			System.out.println("You have selected 3-D Shape");
			return x;				// Returning option to make choices
		}
		else {
			System.out.println("This is not a valid choice!");
			System.out.println("Please select from right Options!!");
			return selectShape();		// Recursion for invalid choices to re-ask the choices
		}
	}
	
	public TwoD_Shape selectTwoDShape()		// Method for choices of 2-D available Shapes with Non-prim. data type 'TwoD_Shape'
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("==Press 1 for Circle==");
		System.out.println("==Press 2 for Rectangle==");
		System.out.println("==Press 3 for Triangle==");
		System.out.println("==Press 4 for Rhombus==");
		System.out.println("==Press 5 for Square==");
		
		int choice=sc.nextInt();
		switch(choice)
		{
			case 1:
				System.out.println("You have selected Circle");
				System.out.println("Enter the Radius");
				double r=sc.nextDouble();
				
				Circle c1=new Circle(r);		// Initialization by constructor
				return c1;				// Returns Non-primitive data at method call
				
			case 2:
				System.out.println("You have selected Rectangle");
				System.out.println("Enter the length");
				double l=sc.nextDouble();
				System.out.println("Enter the width");
				double w=sc.nextDouble();
				
				Rectangle r1=new Rectangle(l,w);	// Initialization by constructor
				return r1;				// Returns Non-primitive data at method call
		
			case 3:
				System.out.println("You have selected Triangle");
				System.out.println("Enter the Side1");
				double s1=sc.nextDouble();
				System.out.println("Enter the side2");
				double s2=sc.nextDouble();
				System.out.println("Enter the side3");
				double s3=sc.nextDouble();
				System.out.println("Enter the base");
				double b=sc.nextDouble();
				System.out.println("Enter the height");
				double h=sc.nextDouble();
				
				Triangle t=new Triangle(s1,s2,s3,b,h);// Initialization by constructor
				return t;				// Returns Non-primitive data at method call
				
			case 4: 
				System.out.println("You have selected Rhombus");
				System.out.println("Enter the 1st Diagonal");
				double d1=sc.nextDouble();
				System.out.println("Enter the 2nd Diagonal");
				double d2=sc.nextDouble();
				System.out.println("Enter the side");
				double s=sc.nextDouble();
				
				Rhombus ro=new Rhombus(d1,d2,s);// Initialization by constructor
				return ro;				// Returns Non-primitive data at method call
				
			case 5:
				System.out.println("You have selected Square");
				System.out.println("Enter the Side");
				double si=sc.nextDouble();
				
				Square sq=new Square(si);		// Initialization by constructor
				return sq;				// Returns Non-primitive data at method call
				
			default:
				System.out.println("This is not the Right Choice");
				System.out.println("Please select from right options");
				return selectTwoDShape();		// Recursion for invalid choices to re-ask the options
		}
	}
	

	public ThreeD_Shape selectThreeDShape()// Method for choices of 2-D available Shapes with Non-prim. data type 'ThreeD_Shape'
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("===Press 1 for Cone====");
		System.out.println("===Press 2 for Cube====");
		System.out.println("===Press 3 for Cuboid====");
		System.out.println("===Press 4 for Cylinder====");
		System.out.println("===Press 5 for Sphere====");
		
		int choice=sc.nextInt();
		switch(choice)
		{
			case 1:
				System.out.println("You have selected Cone");
				System.out.println("Enter the Height");
				double he=sc.nextDouble();
				System.out.println("Enter the Slant Height");
				double sh=sc.nextDouble();
				System.out.println("Enter the Radius");
				double ra=sc.nextDouble();
				
				Cone co=new Cone(he,sh,ra);// Initialization by constructor
				return co;		// Returns Non-primitive data at method call
				
			case 2:
				System.out.println("You have selected Cube");
				System.out.println("Enter the Side");
				double sd=sc.nextDouble();
				
				Cube cb=new Cube(sd);		// Initialization by constructor
				return cb;		// Returns Non-primitive data at method call
				
			case 3:
				System.out.println("You have selected Cuboid");
				System.out.println("Enter the Length");
				double le=sc.nextDouble();
				System.out.println("Enter the Breadth");
				double br=sc.nextDouble();
				System.out.println("Enter the Height");
				double hg=sc.nextDouble();
				
				Cuboid cd=new Cuboid(le,br,hg);// Initialization by constructor
				return cd;		// Returns Non-primitive data at method call
				
			case 4:
				System.out.println("You have selected Cylinder");
				System.out.println("Enter the Radius");
				double r3=sc.nextDouble();
				System.out.println("Enter the Height");
				double h2=sc.nextDouble();
				
				Cylinder c4=new Cylinder(r3,h2);// Initialization by constructor
				return c4;		// Returns Non-primitive data at method call
				
			case 5:
				System.out.println("You have selected Sphere");
				System.out.println("Enter the Radius");
				double r4=sc.nextDouble();
				
				Sphere sp=new Sphere(r4);// Initialization by constructor
				return sp;		// Returns Non-primitive data at method call
				
			default:
				System.out.println("This is not the Right Choice");
				System.out.println("Please select from right options");
				return selectThreeDShape();		// Recursion for invalid choices to re-ask the options
				
		}
		
	
	}

}




