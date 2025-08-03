public class SomaDosMultiplostresOuCinco {
    public static void main(String[] args) {
        System.out.println(somMultiplosDeTresOuCinco(10));
    }

    public static String somMultiplosDeTresOuCinco(int numero) {
        int soma = 0;
        for (int i = 1; i < numero; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                System.out.println("Multiplo de 3 ou 5: " + i);
                soma += i;
            }
        }
        return (String) "Soma dos multiplos de 3 ou 5 é: " + soma;
    }
}