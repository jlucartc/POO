package Calculadora;

public class ElevarAX extends Calculadora{
	
	private double valor1;
	private double valor2;
	
	public ElevarAX(double v1, double v2){
		valor1 = v1;
		valor2 = v2;
	}
	
	public double calcular(){
		return Math.pow(valor1, valor2);
	}
	
}
