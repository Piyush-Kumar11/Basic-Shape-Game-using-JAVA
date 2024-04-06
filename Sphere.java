package shape_game;

public class Sphere extends ThreeD_Shape{
	
	double r;		// Declare of variable
	
	Sphere()		// For parent Child Relation
	{
		
	}
	
	Sphere(double r)	// Initialization using Parameterized Constructor
	{
		this.r=r;
	}
	
	@Override
	public void getVolume()		//Method Overriding
	{
		System.out.println("The volume of a shpere: "+((4/3)*3.14*r*r*r)+"cubic unit");
	}
	
	@Override
	public void getLateralSurfaceArea()	//Method Overriding
	{
		System.out.println("The Lateral Surface Area of Sphere: "+(4*3.14*r*r)+"sq. unit");
	}
	
	@Override
	public void getTotalSurfaceArea()	//Method Overriding
	{
		System.out.println("The Total Surface Area of Sphere: "+(4*3.14*r*r)+"sq. unit");
	}

}
