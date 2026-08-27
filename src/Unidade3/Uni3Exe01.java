package Unidade3;

import java.util.Scanner;
import javax.sql.rowset.spi.SyncResolver;

public class Uni3Exe01 {
 public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    double comprimento; 
    double largura;
    double area;

    System.out.println("Informe a largura do terreno:");
    largura = sc.nextDouble();
    System.out.println("Informe o comprimento do terreno:");
    comprimento = sc.nextDouble();

    area = largura * comprimento;
    System.out.println("A area do terreno é de:" + area );
 }
   

}
