package ProgramaCalculadoraIMC;

public class calculadoraImc {
	
	private double calculoImc;
	private double peso;
	private double altura;
	public double Peso;
	
	public double getCalculoImc() {
		return calculoImc;
	}
	public void setCalculoImc(double calculoImc) {
		this.calculoImc = calculoImc;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public double setCalculoImc (double peso, double altura) {
		calculoImc =  peso / (altura * altura);
		System.out.println("\t==============PESO E ALTURA==========================\n"
				+ "\n\tPeso: " + peso + " kg" + "\n\tAltura: " + altura + " metros"
				+ "\n\t=====================================================");
		return calculoImc;
	}
	public void avaliacao() {
		System.out.println("\nO seu IMC �: " + getCalculoImc());
	    System.out.println();
	    System.out.println("=======================================================================================");
	    System.out.println("LEIA � SEGUIR AS RECOMENDA��ES NUTRICIONAIS BASEADAS NO RESULTADO DO C�LCULO DO SEU IMC");
	    System.out.println("=======================================================================================");

	    if (getCalculoImc() < 18.5) {
			System.out.println("Usuario est� abaixo do peso ideal (IMC < 18.5)");
			System.out.println("Procurar ajuda nutricional para dar in�cio a uma dieta rica em vitaminas, \nnutrientes e sais minerais.");
			
		}else if(getCalculoImc() >= 18.5 && getCalculoImc() <25 ) {
			System.out.println("Usuario est� dentro do peso ideal (IMC >= 18.5 e < 25)");
			System.out.println("Para manter-se com o IMC saud�vel, � importante investir tamb�m em atividades f�sicas di�rias e \nno consumo de todos os nutrientes necess�rios para o corpo manter-se em equil�brio.");

			
		}else if(getCalculoImc() >=25 && getCalculoImc() <30 ) {
			System.out.println("Usuario est� em sobrepeso (IMC >= 25 e <30)");
			System.out.println("Converse com uma nutricionista e adote uma pr�tica de exerc�cios aer�bicos");

			
			
		}else if(getCalculoImc() >=30 && getCalculoImc() <35 ) {
			System.out.println("Usuario est� com Obesidade Grau I (IMC >=30 e <35)");
			System.out.println("Isso se deve ao excesso de gordura que leva � falta de preparo f�sico \ne que acaba otimizando os fatores sedent�rios e aumentando a obesidade. \n� preciso procurar ajuda m�dica com urg�ncia (Tratamentos de Obesidade) \npara que o quadro n�o se agrave.");
			
			
		}else if(getCalculoImc() >=35 && getCalculoImc() <40 ) {
			System.out.println("Usuario est� com Obesidade Grau II (IMC >= 35 e <40)");
			System.out.println("O excesso de gordura coloca em alto risco o bem-estar e a vida do paciente, \npodendo levar ao desenvolvimento de diversas doen�as, dentre elas a \ndiabetes, a hipertens�o, ataques do cora��o, infarto, derrames cerebrais, \nartrite, m� circula��o e muitas outras.");
			
			
		}else if(getCalculoImc() >=40 ) {
			System.out.println("Usuario est� com Obesidade Grau III (IMC >= 40)");
			System.out.println("O excesso de gordura coloca em alto risco o bem-estar e a vida do paciente, \npodendo levar ao desenvolvimento de diversas doen�as, dentre elas a \ndiabetes, a hipertens�o, ataques do cora��o, infarto, derrames cerebrais, \nartrite, m� circula��o e muitas outras.");
		}
	    System.out.println("=======================================================================================");
	    
	}
}





