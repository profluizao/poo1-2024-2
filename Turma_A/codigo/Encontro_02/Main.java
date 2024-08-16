import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Digite o seu nome: ");
		String nome = s.nextLine();
		System.out.println("Informe sua idade: ");
		int idade = s.nextInt();
		System.out.println("Boa noite, " + 
		    nome + 
		    ", você tem " + 
		    idade + " anos.");
	}
}