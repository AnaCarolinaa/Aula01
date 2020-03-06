package eng2020_1_a01;

public abstract class Espacial 
{
	private double comprimento, altura;
	protected double largura;
	
	public Espacial(double comprimento, double altura, double largura) 
	{
		super();
		this.comprimento = comprimento;
		this.altura = altura;
		this.largura = largura;
	}
	
	public abstract double volume();

	public double getComprimento() 
	{
		return comprimento;
	}

	public void setComprimento(double comprimento)
	{
		this.comprimento = comprimento;
	}

	public double getAltura()
	{
		return altura;
	}

	public void setAltura(double altura)
	{
		this.altura = altura;
	}

	public double getLargura()
	{
		return largura;
	}

	public void setLargura(double largura)
	{
		this.largura = largura;
	}
}
