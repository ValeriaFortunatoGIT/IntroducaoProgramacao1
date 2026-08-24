import java.util.Scanner;

public class ExemploScanner {
public static void main(String[] args) {
    int idade;
    System.out.println("Digite sua idade: ");
    Scanner sc = new Scanner(System.in);
    idade = sc.nextInt();
    System.out.println("A idade digitada é: " + idade);
    sc.close();

}
}
