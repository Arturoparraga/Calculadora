/**
 * 
 * @author User
 * @version 1.0
 */

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
	/**
	 * 
	 * @param operando1 Valor que representa el primer operando
	 * @param operando2 Valor que representa el segundo operando
	 * @return devuelve un entero llamado resultado
	 */
	
	public float suma(float operando1, float operando2)
	{
		resultado = operando1 + operando2;
		return resultado;
	}
	/**
	 * 
	 * @param operando1 Valor que representa el primer operando
	 * @param operando2 Valor que representa el segundo operando
	 * @return devuelve un entero llamado resultado
	 */

	public float resta(float operando1, float operando2)
	{
		resultado = operando1 - operando2;
		return resultado;
	}
	/**
	 * 
	 * @param operando1 Valor que representa el primer operando
	 * @param operando2 Valor que representa el segundo operando
	 * @return devuelve un entero llamado resultado
	 */
	public float multiplicacion(float operando1, float operando2)
	{
		resultado = operando1 * operando2;
		return resultado;
	}
	/**
	 * 
	 * @param operando1 Valor que representa el primer operando
	 * @param operando2 Valor que representa el segundo operando
	 * @return devuelve un entero llamdo resultado
	 */
	
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
	/**
	 * 
	 * @param operando1 Valor que representa el primer operando
	 * @return Valor float 
	 */
	public float raiz_cuadrada(float operando1)
	{
		if(operando1>=1)
		{
			return (float) Math.sqrt(operando1);
		}
		return -1;
	}
	/**
	 * 
	 * @param args metodo main
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calcu c1 = new Calcu();
		System.out.println("M�todo suma: "+c1.suma(1, 2));
		System.out.println("M�todo resta: "+c1.resta(1, 2));
		System.out.println("M�todo multiplicacion: "+c1.multiplicacion(1, 2));
		System.out.println("M�todo division: "+c1.division(1, 0));
		System.out.println("M�todo ra�z cuadrada: "+c1.raiz_cuadrada(-4));
	}
}