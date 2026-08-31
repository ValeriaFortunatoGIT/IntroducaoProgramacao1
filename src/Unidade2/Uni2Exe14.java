package Unidade2;
import java.util.Scanner;

public class Uni2Exe14 {
public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.println("Informe um valor: ");
    int valor = sc.nextInt();
    int nota100, nota50, nota20, nota10, nota5, nota2, nota1;

    nota100 = valor / 100;
    valor = valor % 100;

    nota50 = valor / 50;
    valor = valor % 50;

    nota20 = valor / 20;
    valor = valor % 20;

    nota10 = valor / 10;
    valor = valor % 10;

    nota5 = valor / 5;
    valor = valor % 5;

    nota2 = valor / 2;
    valor = valor % 2;

    nota1 = valor / 1;
    valor = valor % 1;

    System.out.println(nota100 + ": notas de 100");
    System.out.println(nota50 + ": notas de 50");
    System.out.println(nota20 + ": notas de 20");
    System.out.println(nota10 + ": notas de 10");
    System.out.println(nota5 + ": notas de 5");
    System.out.println(nota2 + ": notas de 2");
    System.out.println(nota1 + ": notas de 1");

}
}
