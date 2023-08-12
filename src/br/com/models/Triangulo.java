package br.com.models;

public class Triangulo {

	//calcular area do triangulo
	
	
	public double AreaTriangulo(double lado) {
		
		double potencia = Math.pow(lado, 2);
		
		//assumindo que raiz de 3 é 1.73
		
		double resultado = (potencia * 1.73) / 4;
		
		return resultado;
	}
	
}
