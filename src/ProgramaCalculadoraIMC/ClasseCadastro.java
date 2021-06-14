package ProgramaCalculadoraIMC;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
public class ClasseCadastro {

	private String nome;
	private int idade;
	private String gênero;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int string) {
		this.idade = string;
	}
	public String getGênero() {
		return gênero;
	}
	public void setGênero(String gênero) {
		this.gênero = gênero;
	}
	public void Impressao() {
		System.out.println("\t===============INFORMAÇÕES DO USUÁRIO================\n"
				+ "\n\tNome: " + nome + "\n\tIdade: " + idade + " anos"
				+ "\n\tQual gênero você se identifica : " + gênero 
				+ "\n\t====================================================="); }
		
	public void limpa() {
		try {
			Robot robot = new Robot();
			robot.keyPress(KeyEvent.VK_SHIFT);
			robot.keyPress(KeyEvent.VK_F10);
			robot.keyPress(KeyEvent.VK_R);
			robot.keyRelease(KeyEvent.VK_SHIFT);
			robot.keyRelease(KeyEvent.VK_F10);
			robot.keyRelease(KeyEvent.VK_R);				
		}catch(AWTException e) {
		e.printStackTrace();
		}
    }

}