	package br.cesed.p2.bruno.numero;
	import java.util.ArrayList;
	
public class Numeros {
		private static int qntUnidades;
		private static int qntDecimais;
		private static int qntCentenas;
		
		
		public static void qntNumeros(int numero){
			String strNum = String.valueOf(numero);
			qntUnidades = strNum.length();
			if (strNum.length() >=2){
			qntDecimais = strNum.length() -1;
			System.out.println("quantidade de decimais: " + qntDecimais);
			}
			else{
				System.out.println("quantidade de decimais = 0");
			}
			if (strNum.length() >=3){
				qntCentenas = strNum.length() -2;
				System.out.println("quantidade de centenas: " + qntCentenas);
			}
			else{ 
				System.out.println("quantidade de centenas = 0");
			}
		}
		
		public static void arredondadorNumeros(float d){
			int a = (int) d;
			//int b = 1;
			if(d - a >= 0.5){
			System.out.println("numero arredondado: " + (a +1));
			}else{
				System.out.println("numero arredondado: " + a);
			}
			
		}
		public static void converteCelsiusParaFahrenheit(double temperatura){
			double fahrenheit = ((temperatura * 9/5) + 32);
			System.out.println("A temperatura em Fahrenheit é: " + fahrenheit);
		}
		public static void converteFahrenheitParaCelsius(double temperatura){
			double Celsius = ((temperatura-32) * 5/9);
			System.out.println("A temperatura em Celsius é: " + Celsius);
		}
		
		public static void calculaMedia(double a, double b, double c){
			double media = (a + b +c)/3;
			System.out.println("a média das notas é igual a: " + media);
		}
		public static void maiorMultiploMenorQue(int k, int n){
			int loop = 0;
			final int l =k;
				while (k < n){
					loop += 1;
					k = k+l;
					}
				System.out.println("O maior multiplo foi: " + (loop*l));}
		
			
		
		
}
