package introducaoclasses.exercicios.Parte2;

import introducaoclasses.exercicios.Carro;

public class CarrosTestes {
	public static void main(String []args) {
		
	Carro carro01 = new Carro();
	
	carro01.nome = "Chevrolet Camaro";
	carro01.modelo = "Camaro Yenko/SC";
	carro01.ano = 2021;
	
	Carro carro02 = new Carro();
	carro02.nome = "bMW";
	carro02.modelo = "BM4 X4 M4Oi";
	carro02.ano = 2021;
	
	System.out.println("Dados do Carro 01 :");
	System.out.println(carro01.nome);
	System.out.println(carro01.modelo);
	System.out.println(carro01.ano);
	
	System.out.println("--------------------------------------------------");
	
	System.out.println("Dados do Carro 02: ");
	System.out.println(carro02.nome);
	System.out.println(carro02.modelo);
	System.out.println(carro02.ano);
}
}