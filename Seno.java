package Calculadora;

public class Seno extends Calculadora{
	
	private double valor1;
	
	public Seno(double v1){
		valor1 = v1;
	}
	
	public double calcular(){
		return Math.sin(Math.toRadians(valor1));
	}

}
