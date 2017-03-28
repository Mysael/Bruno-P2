package br.cesed.p2.bruno.main;
import java.util.Scanner;

import br.cesed.p2.bruno.letras.Letras;
import br.cesed.p2.bruno.numero.*;

public class Acoes {
	public static void main(String[] args) {
		Scanner tc = new Scanner (System.in);
		System.out.printf("digite um número: " );
		int num = tc.nextInt();
		Numeros.qntNumeros(num);
		Numeros.arredondadorNumeros((float) 38.4);
		Letras.converterParaMaiusculo("opa man!");
		Letras.converterParaMinusculo("YAEH BICHO!!!");
		Numeros.converteCelsiusParaFahrenheit(50);
		Numeros.converteFahrenheitParaCelsius(82);
		System.out.print("digite a primeira nota: ");
		double a = tc.nextDouble();
		System.out.print("digite a segunda nota: ");
		double b = tc.nextDouble();
		System.out.print("digite a terceira nota: ");
		double c = tc.nextDouble();
		Numeros.calculaMedia(a, b, c);
		Numeros.maiorMultiploMenorQue(13, 100);
		tc.close();
	}
}
