import java.util.Scanner;

public class ExemploPessoa {
    public static void main(String[] args) {
        String nome;
        int idade;
        char sexo;

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu nome:");
        nome = sc.nextLine();
        System.out.println("Digite sua idade:");
        idade = sc.nextInt();
        System.out.println("Digite seu sexo:");
        sexo = sc.next().charAt(0);

        System.out.println("A pessoa de nome: " + nome + " do sexo " + sexo + " tem " + idade + " anos ");

    }

}
