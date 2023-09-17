package stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;

//Desafio 7 - Encontrar o segundo número maior da lista:
//Com a ajuda da Stream API, encontre o segundo número maior
// da lista e exiba o resultado no console.
public class Desafio7 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3, 32, 23);
        OptionalInt segundoMaior = numeros.stream()
                .mapToInt(n -> n)
                .sorted()
                .skip(numeros.size() -2)
                .findFirst();
        System.out.println(segundoMaior.getAsInt());
    }
}
