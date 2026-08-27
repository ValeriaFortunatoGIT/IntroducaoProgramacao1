package Unidade2;

import java.util.Scanner;

public class Uni2Exe03 {

    public static void main(String[] args) {
        
        Scanner sc  = new Scanner(System.in);
        double valorDePi = Math.PI;
        valorDePi = 3.14159;
        //considernado que tenho o raio, vou calcular a circunferencia
        Double circunferencia;
        Double raio;

        System.out.println("Digite o raio: ");
        raio = sc.nextDouble();
 
        circunferencia = Math.pow(raio , 2) *valorDePi;
        //raio ao quadrado * pi
        //pow eleva um numero ao outro

        System.out.println("Circunferencia é: " + circunferencia);

    }
}
