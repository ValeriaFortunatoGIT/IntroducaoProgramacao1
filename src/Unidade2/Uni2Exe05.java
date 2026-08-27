package Unidade2;

import java.util.Scanner;

public class Uni2Exe05 {
 public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    int A, B, C, D;
    int diferenca;

    System.out.println("Digite o numero da letra A: ");
    A = sc.nextInt();
    System.out.println("Digite o numero da letra B: ");
    B = sc.nextInt();
    System.out.println("Digite o numero da letra C: ");
    C = sc.nextInt();
    System.out.println("Digite o numero da letra D: ");
    D = sc.nextInt();
    diferenca = (A * B - C * D);

    System.out.println("A diferença de A e B pelo produto de C e D é: " + diferenca);

 }
}
