public class Fatorial {
    public static void main(String[] args) {
        System.out.println(calcularFatorial(3));
    }

    public static int calcularFatorial(int numero) {
        int fatorial = 1;

        for (int i = numero; i > 1; i--) {
            fatorial *= numero;
            numero--;
        }
        return fatorial;
    }
}