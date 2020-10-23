import java.util.Scanner;

public class Hello {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Hello Word, Óia que legal !?!?");
		int valor = teclado.nextInt();
		System.out.println("Valor digitado = " + valor);
		teclado.close();
	}

}
