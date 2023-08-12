package br.com;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.com.models.Quadrado;
import br.com.models.Triangulo;

public class Aplicacao {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String fraseResultado = "";

		double tamanhoLado, resultadoTriangulo, resultadoQuadrado, resultadoFinal = 0.0;

		int numeroLados, opcao = 100;

		List<String> listaResultados = new ArrayList<>();

		Quadrado quadrado = new Quadrado();

		Triangulo triangulo = new Triangulo();

		DecimalFormat formato = new DecimalFormat("0.00");

		do {
			System.out.println("+++++++++++++++++++++++++++++++++++++");
			System.out.println("+                                   +");
			System.out.println("+  Calculadora de Polígonos         +");
			System.out.println("+                                   +");
			System.out.println("+ 1 - Inserir um polígono           +");
			System.out.println("+ 0 - Retornar resultados           +");
			System.out.println("+                                   +");
			System.out.println("+++++++++++++++++++++++++++++++++++++");
			System.out.print("Escolha uma opção: ");

			opcao = scan.nextInt();
			scan.nextLine();

			switch (opcao) {
			case 1:

				System.out.print("Numero de lados, Digite: 3 - Para 3 lados \n 4 - Para 4 lados \n");
				numeroLados = scan.nextInt();
				scan.nextLine();

				switch (numeroLados) {

				case 3:
					System.out.println("Digite o tamanho do lado (em cm): ");
					tamanhoLado = scan.nextDouble();

					if (tamanhoLado >= 0.0) {
						resultadoTriangulo = triangulo.AreaTriangulo(tamanhoLado);

						resultadoFinal = resultadoFinal + resultadoTriangulo;
						
						String resultadoTrianguloFormat = formato.format(resultadoTriangulo);

						fraseResultado = "Triangulo de lado " + tamanhoLado + " cm e área " + resultadoTrianguloFormat
								+ " cm2";

						listaResultados.add(fraseResultado);

						break;

					} else {
						System.out.println("O tamanho do Lado digitado é invalido");
						break;
					}

				case 4:

					System.out.println("Digite o tamanho do lado (em cm): ");
					tamanhoLado = scan.nextDouble();

					if (tamanhoLado >= 0.0) {
						resultadoQuadrado = quadrado.AreaQuadrado(tamanhoLado);

						resultadoFinal = resultadoFinal + resultadoQuadrado;
						
						String resultadoQuadradoFormat = formato.format(resultadoQuadrado);

						fraseResultado = "Quadrado de lado " + tamanhoLado + " cm e área " + resultadoQuadradoFormat + " cm2";

						listaResultados.add(fraseResultado);

						break;

					} else {
						System.out.println("O tamanho do Lado digitado é invalido");
						break;
					}

				default:

					System.out.println("O poligono deve ter 3 ou 4 lados");

				}

				break;
			case 0:
				System.out.println(" ");
				System.out.println("Finalizando a calculadora...\n");
				
				break;
			default:
				System.out.println("Opção inválida. Escolha novamente.");
			}

		} while (opcao != 0);

		for (String frase : listaResultados) {
			System.out.println(frase);
			System.out.println("");
		}
		
		String resultadoFinalFormat = formato.format(resultadoFinal);

		System.out.println("Área total " + resultadoFinalFormat + " cm2");

	}

}
