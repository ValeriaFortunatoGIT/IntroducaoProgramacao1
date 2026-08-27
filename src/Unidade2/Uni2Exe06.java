package Unidade2;

import java.util.Scanner;

public class Uni2Exe06 {
 public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int numFuncionario;
    double horas;
    double valorRecebido;
    double salario;

    System.out.printf("Digite o número de um funcionário:");
    numFuncionario = sc.nextInt();

    System.out.printf("Digite o número de horas trabalhadas:");
    horas = sc.nextDouble();

    System.out.printf("Digite o valor recebido por hora:");
    valorRecebido = sc.nextDouble();

    salario = (horas * valorRecebido);
    System.out.printf("O salario do funcionario com numero: " + numFuncionario  + " tem o salario de: " + salario);

 }
}
