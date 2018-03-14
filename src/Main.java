import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int numeroA, numeroB, numeroC;
		String tamanhoPrimeiro, tamanhoSegundo, numeroCriado, letra1, letra2;

		Scanner sc = new Scanner(System.in);
		System.out.print("Digite o número A: ");
		numeroA = sc.nextInt();

		System.out.print("Digite o número B: ");
		numeroB = sc.nextInt();

		tamanhoPrimeiro = Integer.toString(numeroA);
		tamanhoSegundo = Integer.toString(numeroB);

		numeroCriado = "";
		letra1 = "";
		letra2= "";

		for (int i = 1; i <= (tamanhoPrimeiro.length() > tamanhoSegundo.length() ?
								tamanhoPrimeiro.length() : tamanhoSegundo.length()); i++) {

			if (tamanhoPrimeiro.length() >= i) {
				letra1 = Integer.toString(numeroA).substring(i-1, i);
				numeroCriado += letra1;
			}
			if (tamanhoSegundo.length() >= i) {
				letra2 = Integer.toString(numeroB).substring(i-1, i);
				numeroCriado += letra2;
			}
		}
		numeroC = Integer.parseInt(numeroCriado);

		System.out.println((numeroC > 1000000 ? -1 : "Número C: " + numeroC));
	}

}
