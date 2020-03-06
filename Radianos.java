package eng2020_1_a01;

public abstract class Radianos extends Espacial
{
   private double raio;
   
	public Radianos(double comprimento, double altura, double largura) 
	{
		super(comprimento, altura, largura);
	}
   
	public double getRaio() 
	{
		return raio;
	}

	public void setRaio(double raio) 
	{
		this.raio = raio;
	}
	
	
	
	
}
