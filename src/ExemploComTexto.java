public class ExemploComTexto {
 public static void main(String[] args) {

    String nome = "valeria";
    System.out.println(nome.toLowerCase());
    System.out.println(nome.toUpperCase());

    char letra = nome.charAt(0);
    int resultado = nome.compareTo("valeria");
    System.out.println(letra);
    System.out.println(resultado);

    boolean res = nome.equalsIgnoreCase("valeria");

 }
}
