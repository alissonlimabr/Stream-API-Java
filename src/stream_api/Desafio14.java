package stream_api;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

// Desafio 14 - Encontre o maior número primo da lista:
//Com a Stream API, encontre o maior número primo da lista e
// exiba o resultado no console.
public class Desafio14 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        //Verificar quais números da lista é primo
        numeros.stream()
                .filter(n -> ehPrimo(n))
                // Encontra o maior número da lista
                .max(Comparator.naturalOrder())
                .ifPresent(System.out::println);
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
