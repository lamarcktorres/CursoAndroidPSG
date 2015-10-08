
package br.senac.pi.poo;
//A estrutura mínima para programar com orientação objeto quando há uma classe.

public class Carro {
	
	String marca;
	String modelo;
	int ano;
	String placa;
	String chassi;
	
	//Comportamento da classe (objeto) Carro
	public void start() {
		System.out.println("Carro ligado...");
	}
	public void acelerar() {
		System.out.println("Carro acelerado...");
	}
	public void freiar() {
		System.out.println("Carro parado...");
	}
	

}
