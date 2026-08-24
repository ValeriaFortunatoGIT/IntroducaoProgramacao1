public class ExemploEntradoDado {
    public static void main(String[] args) {

    float prova1;
    float prova2;
    float trabalhoFinal;
    float mediaDosTrabalhos;

    prova1 = 8.5f;
    prova2 = 9.32f;
    trabalhoFinal = 8.2f;
    mediaDosTrabalhos = 5f;

    float mediaFinal = (prova1 * 0.2f) + (trabalhoFinal * 0.3f) + (prova2 * 0.3f) + (mediaDosTrabalhos * 0.2f);
    System.out.println("A media é: " + mediaFinal);
    System.out.printf("A media é: %.2f" , mediaFinal);
    }

}
