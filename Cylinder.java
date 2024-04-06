package shape_game;

public class Cylinder extends ThreeD_Shape{
	
	double radius;		// Declaration of different variables
	double height;
	
	Cylinder()	// For Parent-Child Relationship
	{
		
	}
	
	Cylinder(double radius, double height)		// Initialization using Parameterized Constructor
	{
		this.radius=radius;
		this.height=height;
	}
	
	@Override
	public void getVolume()					// Method Overriding
	{
		System.out.println("The volume of a Cylinder: "+(3.14*radius*radius*height)+"cubic unit");
	}
	
	@Override
	public void getLateralSurfaceArea()		// Method Overriding
	{
		System.out.println("The Lateral Surface Area of Cylinder: "+(2*3.14*radius*height)+"sq. unit");
	}
	
	@Override
	public void getTotalSurfaceArea()		// Method Overriding
	{
		System.out.println("The Total Surface Area of Cylinder: "+(2*3.14*radius)*(radius+height)+"sq. unit");
	}

}
