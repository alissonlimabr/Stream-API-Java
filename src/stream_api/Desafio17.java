package stream_api;

import java.util.Arrays;
import java.util.List;

// Desafio 17 - Filtrar os números primos da lista:
//Com a ajuda da Stream API, filtre os números primos da
// lista e exiba o resultado no console.
public class Desafio17 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        //Verificar quais números da lista é primo
        List<Integer> numerosPrimos = numeros.stream()
                .filter(n -> ehPrimo(n))
                .toList();
        System.out.println(numerosPrimos);
    }

    //Quando chamado, verifica se o número é primo.
    public static boolean ehPrimo(int numero) {
        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
}
