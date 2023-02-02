package CircleCalculations;


public class CircleCalculations {

    final float PI=3.14f;
	public float circleArea(float r)
	{
		return PI*r*r;
	}
	
	public float circlePerimeter(float r)
	{
		return 2*PI*r;
	}

	public float circlePieceArea(float r,float angle)
	{
		return (PI*(r*r)*angle)/360;
	}
}
