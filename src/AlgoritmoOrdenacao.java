public class AlgoritmoOrdenacao {
    public static void main(String[] args) {
        Integer[] numeros = {5, 3, 2, 4, 7, 1, 0, 6};

        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros.length - 1 - i; j++) {
                if (numeros[j] > numeros[j + 1]) {
                    int maiorValor = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = maiorValor;
                }
            }
        }
        for (int numero : numeros) {
            System.out.print(numero);
        }
    }
}