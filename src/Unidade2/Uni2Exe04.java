package Unidade2;

import java.util.Scanner;

public class Uni2Exe04 {


public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    float nota1;
    float nota2;
    float media;
    System.out.println("Digite a nota 1: ");
    nota1 = sc.nextFloat();
    System.out.println("Digite a nota 2:");
    nota2 = sc.nextFloat();

    //media pomderada é a nota1 * peso + nota2 * peso
    media = (nota1 * 3.5f) + (nota2 * 7.5f);
    media = media / (3.5f + 7.5f);
    System.out.println("A media é: " + media);
    
}
}


