package Unidade2;

import java.util.Scanner;

public class Uni2Exe01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1, num2;
        int soma;

        System.out.println("Digite o primeiro numero:");
        num1 = sc.nextInt();

        System.out.println("Digite o segundo numero:");
        num2 = sc.nextInt();

        soma = num1 + num2;

        System.out.println("O resultado da soma é: " + soma);


    }

}
