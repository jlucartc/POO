package Calculadora;

public class ElevarAoQuadrado extends Calculadora{
	
	private double valor1;
	
	public ElevarAoQuadrado(double v1){
		valor1 = v1;
	}
	
	public double calcular(){
		return Math.pow(valor1,2);
	}

}
