package eng2020_1_a01;

public class Piramide extends Espacial
{

	public Piramide(double comprimento, double altura, double largura) 
	{
		super(comprimento, altura, largura);
	}

	@Override
	public double volume() 
	{
		return 1/3 * getComprimento() * getAltura() * getLargura();
	}
	

}
