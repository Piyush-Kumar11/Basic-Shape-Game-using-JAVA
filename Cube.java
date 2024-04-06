package shape_game;

public class Cube extends ThreeD_Shape{
	
	double side;		//Taking Side as Input
	
	Cube()	// For Parent-Child Relationship
	{
		
	}
	
	Cube(double side)	// Initialization using Parameterized Constructor
	{
		this.side=side;
	}

	@Override
	public void getVolume()				// Method Overriding
	{
		System.out.println("The volume of a Cube: "+(side*side*side)+"cubic unit");
	}
	
	@Override
	public void getLateralSurfaceArea()	// Method Overriding
	{
		System.out.println("The Lateral Surface Area of Cube: "+(4*side)+"sq. unit");
	}
	
	@Override
	public void getTotalSurfaceArea()	// Method Overriding
	{
		System.out.println("The Total Surface Area of Cube: "+(6*side)+"sq. unit");
	}
}
