package HypotenuseİnTriangle;

public class HypotenuseİnTriangle {
	double hypotenuse;
	double u;
	public double hypotenuse(double edge1,double edge2)
	{
		//double hypotenuse;
		hypotenuse=Math.sqrt(Math.pow(edge1,2)+Math.pow(edge2,2));
		
		return hypotenuse;
			
	}
	public double areaTriangle(double edge1,double edge2)
	{
	    u= (hypotenuse+edge1+edge2)/2;
		double area=u*(u-hypotenuse)*(u-edge1)*(u-edge2);
		
		return area;
	}
	public double perimeterTriangle()
	{
		double perimeter=2*u;
		return perimeter;
	}
}
