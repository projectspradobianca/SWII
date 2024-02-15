package etec.com.rh;

import javax.swing.JOptionPane;

public class Principal {
	
	public static void main(String[] args) {
		
		Carro car = new Carro();
		
		JOptionPane.showMessageDialog(null, car.Compra());
		
		car.Compra();
		
		
		
		/* 
		System.out.println("Olá Java");
		
		JOptionPane.showMessageDialog(null, "Bem vindo ao java!");
		
		String nome = JOptionPane.showInputDialog("Qual é seu nome?");

		JOptionPane.showMessageDialog(null, "Bem vindo " + nome);
		
		//Meu primeiro ola no Java
		
		String carro;//character
		
		int ano;//inteiro
		
		float peso;//decimal
		
		double peso2;//decimal
		
		long producao;//longo
		
		boolean comprar;//0 ou 1 / Sim ou Não
		
		//Conversão
		carro = JOptionPane.showInputDialog("Qual carro deseja?");
		
		ano = Integer.parseInt(JOptionPane.showInputDialog("Qual ano deseja?"));
		
		peso = Float.parseFloat(JOptionPane.showInputDialog("Qual peso do carro?"));
		
		producao = Long.parseLong(JOptionPane.showInputDialog("Quantidade fabicada?"));
		
		comprar = Boolean.parseBoolean(JOptionPane.showInputDialog("Deseja comprar escolha: 0- não e 1- sim"));
		
		//Imprimir
		JOptionPane.showMessageDialog(null, 
				"O carro escolhido é: " + carro +
				"\n O ano do carro é: " + ano + 
				"\n O peso do carro é: " + peso + 
				"\n Quantidade fabricada: " + producao + 
				"\n A compra foi efetuada - status: " + comprar
				);
		
		*/
		
		
		
			
	}

}
