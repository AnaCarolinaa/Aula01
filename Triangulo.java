package eng2020_1_a01;

public class Triangulo extends Poligono
{
	public Triangulo(double base, double altura)
	{
		super(base, altura);
		
	}
	
	@Override
	public double area() 
	{
		return getAltura()*getBase() / 2;
	}
	
	@Override
	public double perimetro()
	{
		return 2*(Math.sqrt(Math.pow(getBase()/2, 2) + Math.pow(getAltura(), 2)) + getBase());
	}

	@Override
	public String toString() 
	{
		return "Triangulo [getBase()=" + getBase() + ", getAltura()=" + getAltura() + "]";
	}

}
