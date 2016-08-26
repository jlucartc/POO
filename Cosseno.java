package Calculadora;

public class Cosseno extends Calculadora{
	
	private double valor1;
	
	public Cosseno(double v1){
		valor1 = v1;
	}
	
	public double calcular(){
		return Math.cos(Math.toRadians(valor1));
	}

}
