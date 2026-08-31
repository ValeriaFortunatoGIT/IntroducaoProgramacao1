package Unidade2;  
import java.util.Scanner;  
public class Uni2Exe08 {      
    public static void main(String[] args) {    

        Scanner sc = new Scanner(System.in);          
        
        int codigo1;         
        int quantidade1;         
        float valor1;         
        int codigo2;         
        int quantidade2;         
        float valor2;          
        float total;          
        
        System.out.println("Digite o codigo da peca 1: ");         
        codigo1 = sc.nextInt();          

        System.out.println("Digite a quantidade de pecas 1: ");         
        quantidade1 = sc.nextInt();          
        
        System.out.println("Digite o valor unitario da peca 1: ");         
        valor1 = sc.nextFloat();          
        
        System.out.println("Digite o codigo da peca 2: ");         
        codigo2 = sc.nextInt();          
        
        System.out.println("Digite a quantidade de pecas 2: ");         
        quantidade2 = sc.nextInt();

        System.out.println("Digite o valor unitario da peca 2: ");
        valor2 = sc.nextFloat(); 
        
        total = (quantidade1 * valor1) + (quantidade2 * valor2); 
        
        System.out.printf("Valor a pagar: R$ %.2f%n", total); } } 