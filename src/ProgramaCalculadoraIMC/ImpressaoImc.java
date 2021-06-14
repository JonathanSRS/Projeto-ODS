package ProgramaCalculadoraIMC;
import java.util.ArrayList;

import java.util.Scanner;

public class ImpressaoImc {

	public static void main(String[] args) throws InterruptedException {
		
		Scanner scan = new Scanner(System.in);
		ClasseCadastro cad1 = new ClasseCadastro();
		calculadoraImc Imc = new calculadoraImc();
		int lista;
	    int endereco =  1;
		ArrayList<String> SL = new ArrayList<>();
		ArrayList<String> ZN = new ArrayList<>();
		ArrayList<String> ZO = new ArrayList<>();
		ArrayList<String> ZL = new ArrayList<>();
		ArrayList<String> CE = new ArrayList<>();
		
		SL.add("Associa��o beneficente guilhermina maria de jesus	\"Abegui Av Paulo Guilguer Reimberg, 7003 Ch�cara Santo Amaro - S�o Paulo 04858-570	Sul\r\n"
				+ "Associa��o de Pais Amigos dos Excepcionais de S�o Paulo (Apae)	Rua Loefgren, 2109 � Vila Clementino, em S�o Paulo/SP	04040-033	Sul\r\n"
				+ "Unidade Cidade Ademar	Rua Yervant Kissajikian, 3.101	04428-010	Sul\r\n"
				+ "Unidade Graja�	Avenida Dona Belmira Marin, 1.959	04846-010	Sul\r\n"
				+ "Unidade Heli�polis	Estrada das L�grimas, 2.608	04244-000	Sul\r\n"
				+ "Unidade Santo Amaro	Avenida Mario Lopes Le�o, 685	04754-010	Sul\r\n"
				+ "Alimentos Zaeli	R. Olimp�adas, 200 - Vila Ol�mpia, S�o Paulo - SP	04551-000 Sul\n");
				
		
		
		ZN.add(" Creche Imaculada Cora��o de Maria do Jardim Princesa	Rua Ant�nio Susini, 19 � Jardim Princesa, em S�o Paulo/SP	02856-100	Norte\r\n"
				+ "Unidade Brasil�ndia	Avenida Parapu�, 1.479	02675-031	Norte\r\n"
				+ "Unidade Lim�o Avenida Professor Celestino Bourroul, 779	02710-001	Norte\r\n"
				+ "Unidade Santana	Rua Dr. Zuquim, 532	02035-020 Norte\r\n"
				+ "Unidade Tucuruvi	Avenida Mazzei, 495	02331-003 Norte\r\n"
				+ "Unidade Vila Nova Cachoeirinha Avenida Dep. Cant�dio Sampaio, 140	02860-001	Norte\r\n"
				+ "Unidade Franca	Rua General Carneiro, 1317	02331-003	Norte\r\n"
				+ "Prefeitura Banco de Alimentos Sp	R. Sobral J�nior, 264 - Vila Maria Alta, S�o Paulo	02130-020	Norte\r\n"
				+ "CRESAN - Centro de Refer�ncia em Seguran�a Alimentar e Nutricional	Gast�o Madeira, 150 - Vila Maria Alta, S�o Paulo - SP	02131-080	Norte\r\n");
				
		ZO.add("Unidade Campo Limpo	Estrada de Itapecerica, 4.728	05858-000 Oeste\r\n"
				+ "Unidade Cap�o Redondo Avenida Atos Tom�s Ferraci�, 318 05861-240	Oeste\r\n"
				+ "Unidade Lapa	Rua Afonso Sardinha, 245 05076-000 Oeste\r\n"
				+ "Unidade Parais�polis	Rua Ernest Renan, 1.000	05659-020 Oeste\r\n"
				+ "Unidade Perus Rua Ant�nio Maia, 652	05204-110 Oeste\r\n"
				+ "Unidade Carapicuiba	Avenida Miriam, 385	06320-060 Oeste\r\n"
				+ "Unidade Osasco Rua Jo�o Colino, 240	06013-020 Oeste\r\n"
				+ "anco de Alimentos de Osasco	Av. Gen. Pedro Pinho, 1340 - Pestana, Osasco - SP	06122-160	Oeste\r\n");
		
		
		ZL.add("Comunidade da Gra�a	Rua Eponina, 390 � Vila Carr�o, em S�o Paulo/SP	03426-010 Leste\r\n"
				+ "Comunidade Evang�lica Casa de Ora��o	Rua Francisco Coimbra, 870 � Penha, em S�o Paulo/SP	03639-000	Leste\r\n"
				+ "Associa��o Alfa e Omega	Rua Augusto Giorgio, 222 � S�o Mateus, em S�o Paulo/SP	03965-050	Leste\r\n"
				+ "Unidade Br�s	Avenida Rangel Pestana, 2.327,Sp 03001-000 Leste\r\n"
				+ "Unidade Guaianases	Estrada de Po�, 13, Jardim Soares, S�o Paulo 08460-000	Leste\r\n"
				+ "Unidade Itaim Paulista	Rua Alfredo Moreira Pinto, 87 08110-220	Leste\r\n"
				+ "Unidade Itaquera	Rua Victorio Santim, 247 08290-000	Leste\r\n"
				+ "Unidade S�o Mateus	Avenida Mateo Bei, 2.604 03949-200 Leste\r\n"
				+ "Unidade S�o Miguel Paulista	Rua Jos� Otoni, 256	08010-290 Leste\r\n");
		
		CE.add("Unidade 25 de Mar�o	Rua 25 de Mar�o, 166, - Centro Hist�rico de S�o Paulo 01021-000	Centro\r\n"
				+"Unidade Campos El�seos	 R. Gen. J�lio Marcondes Salgado, 56 - Campos El�seos	01226-010 Centro\r\n"
				+"Unidade Limeira	Rua 13 de Maio, 527	01021-000	Centro\r\n"
				+"Unidade Sorocaba	Rua dos Andradas, 115 - Centro Hist�rico de S�o Paulo, S�o Paulo - SP 01021-000 Centro\r\n"
				+"ONG Banco de Alimentos	Rua Atibaia, 218 - Perdizes, S�o Paulo - SP	01235-010	Centro\r\n");

		
		
		System.out.println("Digite o Nome: ");
		cad1.setNome(scan.nextLine());
		
		System.out.println("Digite o G�nero:");
		cad1.setG�nero(scan.nextLine());
		
		System.out.println("Digite a Idade:");
		cad1.setIdade(scan.nextInt());
		cad1.limpa();
		Thread.sleep(1000);
		cad1.Impressao();
        
		System.out.println("Digite o peso em kg e a altura em metros: ");
		System.out.print("Peso: ");
		Imc.setPeso(scan.nextDouble());
		System.out.print("Altura: ");
		Imc.setAltura(scan.nextDouble());
		cad1.limpa();
		Thread.sleep(1000);
		cad1.Impressao();
		Imc.setCalculoImc(Imc.getPeso(),Imc.getAltura());
		
		
		Thread.sleep(1000);
		System.out.println("Aguarde enquanto fazemos o c�lculo do IMC...........");
		Thread.sleep(3000);
		
		//codi��es
		
	    Imc.avaliacao();
	    
	     Thread.sleep(8000);
	   
	     cad1.limpa();
	     
	    Thread.sleep(500);
	    
	     System.out.println("Qual � a zona da cidade de S�o Paulo onde o paciente mora ([1]-sul, [2]-norte,[3]- oeste, [4]-leste,[5]- centro):" );
	     endereco=scan.nextInt();
	     cad1.limpa(); 
		Thread.sleep(2000);
	     System.out.println("========================================================================================================================");
	     System.out.println("SEGUE A LISTA DE UBS, BANCO DE ALIMENTOS E UNIDADES DA REDE BOM PRATO, MAIS PR�XIMAS DA SUA RESID�NCIA PARA OBTER AJUDA");
	     System.out.println("=========================================================================================================================");
	     
		 if (endereco == 1) {
	    
	   
			 System.out.println("Zona Sul\n" + SL);
			
		 } 
    
		 else if(endereco == 2) {
		 
			 System.out.println("Zona Norte\n" + ZN);
		 } 
		 

	     else if(endereco == 3) {
	 
	    	 System.out.println("Zona Oeste\n" + ZO);
	     } 
	 
		 
         else if(endereco == 4) {
	 
        	 System.out.println("Zona Leste\n" + ZL);
         } 

		 
         else if(endereco == 5) {
    		 
        	 System.out.println("Centro\n" + CE);
         } 
	 		
		cad1.Impressao();
		Imc.setCalculoImc(Imc.getPeso(),Imc.getAltura());
		//Thread.sleep(1000);
		Imc.avaliacao();
		System.out.println("==============================================================================================================================");
        System.out.println(" \n\nDigite [1] para imprimir a lista e finalizar atendimento ===== Digite [2] Para Finalizar e ir para o pr�ximo atendimento:");
        lista=scan.nextInt();
        
        if(lista==1) {
        	
        	System.out.println("Imprimindo a lista e finalizando atendimento...");
        }
    
        else if(lista==2) {
        	System.out.println("Atendimento finalizado");
        	
        }
        
	    scan.close();
        
	}
}

	




