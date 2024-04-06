package shape_game;

public class Cuboid extends ThreeD_Shape{
	
	double l;	//Taking different inputs
	double b;
	double h;
	
	Cuboid()	// For Parent-Child Relationship
	{
		
	}
	
	Cuboid(double l, double b, double h)	// Initialization using Parameterized Constructor
	{
		this.l=l;
		this.b=b;
		this.h=h;
	}
	
	@Override
	public void getVolume()				// Method Overriding
	{
		System.out.println("The volume of a Cuboid: "+(l*b*h)+"cubic unit");
	}
	
	@Override
	public void getLateralSurfaceArea()	// Method Overriding
	{
		System.out.println("The Lateral Surface Area of Cuboid: "+(2*h)*(l+b)+"sq. unit");
	}
	
	@Override
	public void getTotalSurfaceArea()	// Method Overriding
	{
		System.out.println("The Total Surface Area of Sphere: "+(2*(l*b + b*h + h*l))+"sq. unit");
	}

}
