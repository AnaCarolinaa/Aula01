package eng2020_1_a01;

public class Trapezio extends Poligono
{

	public Trapezio(double base, double altura) 
	{
		super(base, altura);
	}

	@Override
	public double area() 
	{
		return ((getBase() + ((60*getBase())/100)) * getAltura())/2;
	}

	@Override
	public double perimetro() 
	{
		return ((getBase()-(2*(60*getBase())/100)/2)) * Math.cos(60) + getBase() + (60*getBase())/100;
	}

	@Override
	public String toString() 
	{
		return "Trapezio [getBase()=" + getBase() + ", getAltura()=" + getAltura() + "]";
	}
	
	

}
