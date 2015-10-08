package br.senac.pi.poo;

public class Ferrari {

	public static void main(String[] args) {
		Carro c1 = new Carro();
	
		c1.marca = "Ferrari"; //Atrbuição de valores
		c1.modelo = "488 Sport";
		c1.chassi = "FW82736287SS";
		c1.ano = 2015;
		System.out.println("Marca: "+ c1.marca);
		System.out.println("Modelo: "+ c1.modelo);
		System.out.println("Chassi: "+ c1.chassi);
		System.out.println("Ano: "+ c1.ano);
		
		c1.start(); //Chamada ao método
		c1.acelerar();
		c1.freiar();
		
	
				
	}

}
