import entities.Converter;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Converter converte = new Converter();
        Locale.setDefault(Locale.US);
        System.out.println("Qual o valor do dólar? ");
        converte.dolar = sc.nextDouble(); //3.10
        System.out.println("Quantos dólares serão comprados? ");
        converte.dolaresComprados = sc.nextDouble(); //200
        System.out.println("O valor a ser pago em reais: " + converte.conversor());



    }
}
