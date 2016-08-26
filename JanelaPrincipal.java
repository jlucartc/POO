package CalculadoraGUI;

import Calculadora.*;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class JanelaPrincipal extends JFrame implements ActionListener{
	
	private boolean isNegativo;
	private boolean opSisset;
	private boolean hasPonto;
	private boolean isv1neg;
	private boolean isv2neg;
	private boolean stoptiping;
	private double valor1;
	private double valor2;
	
	
	
	private JPanel display;
	private JPanel teclado;
	
	private JLabel l1;
	private JLabel l2;
	private JLabel l3;
	private JLabel l4;
	
	
	private JLabel op1;
	private JLabel op2;
	private JLabel opS;
	private JLabel resultado;
	private JButton soma;
	private JButton subtracao;
	private JButton divisao;
	private JButton multiplicacao;
	private JButton pot2;
	private JButton potX;
	private JButton seno;
	private JButton cosseno;
	private JButton um;
	private JButton dois;
	private JButton tres;
	private JButton quatro;
	private JButton cinco;
	private JButton seis;
	private JButton sete;
	private JButton oito;
	private JButton nove;
	private JButton zero;
	private JButton negativo;
	private JButton igual;
	private JButton ponto;
	private JButton reset;
	
	public JanelaPrincipal(){
		
		this.setLayout(new GridLayout(2,1));
		
		stoptiping = false;
		isv1neg = false;
		isv2neg = false;
		hasPonto = false;
		isNegativo = false;
		opSisset = false;
		valor1 = 0;
		valor2 = 0;
		
		l1 = new JLabel("Operando 1");
		l2 = new JLabel("Operando 2");
		l3 = new JLabel("Operação");
		l4 = new JLabel("Resultado");
		
		display = new JPanel();
		teclado = new JPanel();
		
		op1 = new JLabel();
		op2 = new JLabel();
		opS = new JLabel();
		resultado = new JLabel();
		soma = new JButton("+");
		subtracao = new JButton("-");
		divisao = new JButton("/");
		multiplicacao = new JButton("*");
		pot2 = new JButton("x^2");
		potX = new JButton("x^y");
		seno = new JButton("sen(x)");
		cosseno = new JButton("cos(x)");
		um = new JButton("1");
		dois = new JButton("2");
		tres = new JButton("3");
		quatro = new JButton("4");
		cinco = new JButton("5");
		seis = new JButton("6");
		sete = new JButton("7");
		oito = new JButton("8");
		nove = new JButton("9");
		zero = new JButton("0");
		negativo = new JButton("+-");
		igual = new JButton("=");
		ponto = new JButton(".");
		reset = new JButton("C");
		
		soma.addActionListener(this);
		subtracao.addActionListener(this);
		divisao.addActionListener(this);
		multiplicacao.addActionListener(this);
		pot2.addActionListener(this);
		potX.addActionListener(this);
		seno.addActionListener(this);
		cosseno.addActionListener(this);
		um.addActionListener(this);
		dois.addActionListener(this);
		tres.addActionListener(this);
		quatro.addActionListener(this);
		cinco.addActionListener(this);
		seis.addActionListener(this);
		sete.addActionListener(this);
		oito.addActionListener(this);
		nove.addActionListener(this);
		zero.addActionListener(this);
		negativo.addActionListener(this);
		igual.addActionListener(this);
		ponto.addActionListener(this);
		reset.addActionListener(this);
	
		op1.setMinimumSize(new Dimension(500,50));
		op2.setMinimumSize(new Dimension(500,50));
		opS.setMinimumSize(new Dimension(500,50));
		resultado.setMinimumSize(new Dimension(500,50));
		
		display.setLayout(new GridLayout(2,4));
		teclado.setLayout(new GridLayout(4,6));
		
		display.add(l1);
		display.add(l2);
		display.add(l3);
		display.add(l4);
		display.add(op1);
		display.add(op2);
		display.add(opS);
		display.add(resultado);
		teclado.add(soma);
		teclado.add(subtracao);
		teclado.add(divisao);
		teclado.add(multiplicacao);
		teclado.add(pot2);
		teclado.add(potX);
		teclado.add(seno);
		teclado.add(cosseno);
		teclado.add(um);
		teclado.add(dois);
		teclado.add(tres);
		teclado.add(quatro);
		teclado.add(cinco);
		teclado.add(seis);
		teclado.add(sete);
		teclado.add(oito);
		teclado.add(nove);
		teclado.add(zero);
		teclado.add(negativo);
		teclado.add(igual);
		teclado.add(ponto);
		teclado.add(reset);
		
		display.setMinimumSize(new Dimension(500,100));
		teclado.setMinimumSize(new Dimension(500,200));
		
		display.setVisible(true);
		teclado.setVisible(true);
		
		this.add(display);
		this.add(teclado);
		
		this.setMinimumSize(new Dimension(500,300));
		
		this.setVisible(true);
		
		
	}
	
	public void actionPerformed(ActionEvent e){
		if(e.getSource() == um){
			if(!stoptiping){	
				if(opSisset){
					op2.setText(op2.getText()+"1");
				}else{
					op1.setText(op1.getText()+"1");
				}
			}
		}
		else if(e.getSource() == dois){
			if(!stoptiping){
				if(opSisset){
					op2.setText(op2.getText()+"2");
				}else{
					op1.setText(op1.getText()+"2");
				}
			}
		}
		else if(e.getSource() == tres){
			if(!stoptiping){
				if(opSisset){
					op2.setText(op2.getText()+"3");
				}else{
					op1.setText(op1.getText()+"3");
				}
			}
		}
		else if(e.getSource() == quatro){
			if(!stoptiping){	
				if(opSisset){
					op2.setText(op2.getText()+"4");
				}else{
					op1.setText(op1.getText()+"4");
				}
			}
		}
		else if(e.getSource() == cinco){
			if(!stoptiping){	
				if(opSisset){
					op2.setText(op2.getText()+"5");
				}else{
					op1.setText(op1.getText()+"5");
				}
			}
		}
		else if(e.getSource() == seis){
			if(!stoptiping){	
				if(opSisset){
					op2.setText(op2.getText()+"6");
				}else{
					op1.setText(op1.getText()+"6");
				}
			}
		}
		else if(e.getSource() == sete){
			if(!stoptiping){
				if(opSisset){
					op2.setText(op2.getText()+"7");
				}else{
					op1.setText(op1.getText()+"7");
				}
			}
		}
		else if(e.getSource() == oito){
			if(!stoptiping){	
				if(opSisset){
					op2.setText(op2.getText()+"8");
				}else{
					op1.setText(op1.getText()+"8");
				}
			}
		}
		else if(e.getSource() == nove){
			if(!stoptiping){	
				if(opSisset){
					op2.setText(op2.getText()+"9");
				}else{
					op1.setText(op1.getText()+"9");
				}
			}
		}
		else if(e.getSource() == zero){
			if(!stoptiping){	
				if(opSisset){
					op2.setText(op2.getText()+"0");
				}else{
					op1.setText(op1.getText()+"0");
				}
			}
		}
		else if(e.getSource() == ponto){
			if(!stoptiping){	
				if(!hasPonto){
					if(opSisset){
						op2.setText(op2.getText()+".");
					}else{
						op1.setText(op1.getText()+".");
					}
					hasPonto = true;
				}else{
				}
			}
		}
		else if(e.getSource() == soma){
			if(!opSisset){
				opSisset = true;
				hasPonto = false;
				opS.setText("+");
			}
		}
		else if(e.getSource() == subtracao){
			if(!opSisset){
				opSisset = true;
				hasPonto = false;
				opS.setText("-");
			}
			
		}
		else if(e.getSource() == multiplicacao){
			if(!opSisset){
				opSisset = true;
				hasPonto = false;
				opS.setText("*");
			}
		}
		else if(e.getSource() == divisao){
			if(!opSisset){	
				opSisset = true;
				hasPonto = false;
				opS.setText("/");
			}
		}
		else if(e.getSource() == pot2){
			if(!opSisset){	
				opSisset = true;
				hasPonto = false;
				op2.setText("2");
				stoptiping = true;
				opS.setText("x^2");
			}
		}
		else if(e.getSource() == potX){
			if(!opSisset){
				opSisset = true;
				hasPonto = false;
				opS.setText("x^y");
			}
		}
		else if(e.getSource() == seno){
			if(!opSisset){	
				opSisset = true;
				hasPonto = false;
				op2.setText("");
				stoptiping = true;
				opS.setText("sen");
			}
		}
		else if(e.getSource() == cosseno){
			if(!opSisset){
				opSisset = true;
				hasPonto = false;
				op2.setText("");
				stoptiping = true;
				opS.setText("cos");
			}
		}
		else if(e.getSource() == negativo){
			if(!stoptiping){
				if(opSisset){
					l2.setText(l2.getText()+"(neg)");
					isv2neg = true;
				}
				else{
					l1.setText(l1.getText()+"(neg)");
					isv1neg = true;
				}
			}
		}
		else if(e.getSource() == igual){
			if(isv1neg){
				valor1 = Double.parseDouble(op1.getText()) * -1;
			}else{
				valor1 = Double.parseDouble(op1.getText());
			}
			
			if(isv2neg){
				if(op2.getText() != ""){
					valor2 = Double.parseDouble(op2.getText()) * -1;
				}
				else{
					valor2 = 0;
				}
			}else{
				if(op2.getText() != ""){
					valor2 = Double.parseDouble(op2.getText());
				}
				else{
					valor2 = 0;
				}
			}
			
			if(opS.getText() == "+"){
				Soma som = new Soma(valor1,valor2);
				resultado.setText(String.valueOf(som.calcular()));
			}
			else if(opS.getText() == "-"){
				Subtracao sub = new Subtracao(valor1,valor2);
				resultado.setText(String.valueOf(sub.calcular()));
			}
			else if(opS.getText() == "/"){
				Divisao div = new Divisao(valor1,valor2);
				resultado.setText(String.valueOf(div.calcular()));
			}
			else if(opS.getText() == "*"){
				Multiplicacao mul = new Multiplicacao(valor1,valor2);
				resultado.setText(String.valueOf(mul.calcular()));
			}
			else if(opS.getText() == "x^2"){
				ElevarAoQuadrado pot2 = new ElevarAoQuadrado(valor1);
				resultado.setText(String.valueOf(pot2.calcular()));
			}
			else if(opS.getText() == "x^y"){
				ElevarAX potX = new ElevarAX(valor1,valor2);
				resultado.setText(String.valueOf(potX.calcular()));
			}
			else if(opS.getText() == "cos"){
				Cosseno cos = new Cosseno(valor1);
				resultado.setText(String.valueOf(cos.calcular()));
			}
			else if(opS.getText() == "sen"){
				Seno sen = new Seno(valor1);
				resultado.setText(String.valueOf(sen.calcular()));
			}
		}
		else if(e.getSource() == reset){
			stoptiping = false;
			isv1neg = false;
			isv2neg = false;
			hasPonto = false;
			isNegativo = false;
			opSisset = false;
			valor1 = 0;
			valor2 = 0;
			op1.setText("");
			op2.setText("");
			opS.setText("");
			resultado.setText("");
			
			l1.setText("Operando 1");
			l2.setText("Operando 2");
		}
	}

}
