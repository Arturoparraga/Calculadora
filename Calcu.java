public class Calcu
{
	float resultado;
	
	public Calcu() 
	{
		// TODO Auto-generated constructor stub
	}
	public void pedirOperandos()
	{
		System.out.println("Por favor introduzca el primer operando");
	}
	
	public float suma(float operando1, float operando2)
	{
		resultado = operando1 + operando2;
		return resultado;
	}

	public float resta(float operando1, float operando2)
	{
		resultado = operando1 - operando2;
		return resultado;
	}
	public float multiplicacion(float operando1, float operando2)
	{
		resultado = operando1 * operando2;
		return resultado;
	}
	
	public float division(float operando1, float operando2)
	{
		if(operando2!=0)
		{
			resultado = operando1 / operando2;
			return resultado;
		}
		else 
		{
			System.out.println("El segundo operando no puede ser 0");
			return -1;
		}
	}
	public float raiz_cuadrada(float operando1)
	{
		if(operando1>=1)
		{
			return (float) Math.sqrt(operando1);
		}
		return -1;
	}
}