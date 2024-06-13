import java.util.Scanner;

public class contador {

	public static void main(String[] args) {
        
		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = scanner.nextInt();
        
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = scanner.nextInt();
		try{

	      contador(parametroUm, parametroDois);
		
		}
		catch (ParametroInvalidoException e ) {

            System.out.println("O segundo parametro deve ser maior que o primeiro");
		}
		
	}

	static void contar (int parametroUm, int parametroDois) throws  ParametrosInvalidosException  {

		if (parametroUm > parametroDois) {

			throw new ParametrosInvalidosException ("O segundo parâmetro deve ser maior que o primeiro.");
		}
        int contagem = parametroUm - parametroDois ;

		for (int i = parametroUm; i <= parametroDois; i++) {
			System.out.println("Inprimindo o  numero " + i);
		}

	}
}