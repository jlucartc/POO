package Calculadora;

public class Subtracao extends Calculadora{
	
	private double valor1;
	private double valor2;
	
	public Subtracao(double v1,double v2){
		valor1 = v1;
		valor2 = v2;
	}
	
	public double calcular(){
		return valor1 - valor2;
	}

}
