package shape_game;

public class Cone extends ThreeD_Shape{
	
	double height;			// Taking height as input
	double slant_height;	// Taking Slant Height as input
	double radius;			// Taking Radius as input
	
	Cone()		// For Parent-Child Relationship
	{
		
	}
	
	Cone(double height, double slant_height, double radius)	// Initialization using Parameterized Constructor
	{
		this.height=height;
		this.slant_height=slant_height;
		this.radius=radius;
	}
	
	@Override
	public void getVolume()				// Method Overriding
	{
		System.out.println("The volume of a Cone: "+((1/3)*3.14*radius*radius*height)+"cubic unit");
	}
	
	@Override
	public void getLateralSurfaceArea()	// Method Overriding
	{
		System.out.println("The Lateral Surface Area of Cone: "+(4*3.14*radius*slant_height)+"sq. unit");
	}
	
	@Override
	public void getTotalSurfaceArea()	// Method Overriding
	{
		System.out.println("The Total Surface Area of Cone: "+((radius*3.14)*(radius+slant_height))+"sq. unit");
	}

}
