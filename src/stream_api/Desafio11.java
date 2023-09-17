package stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// Desafio 11 - Encontre a soma dos quadrados de todos os números da lista:
//Utilizando a Stream API, encontre a soma dos quadrados de todos
// os números da lista e exiba o resultado no console.
public class Desafio11 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        List<Integer> numerosAoQuadrado = numeros.stream().map(n -> n * n).collect(Collectors.toList());
        int somaDosQuadrados = numerosAoQuadrado.stream().mapToInt(n -> n).sum(); // (n -> n * n

        System.out.println( "Lista de nÚmeros: \n" + numeros.stream().toList());
        System.out.println( "Lista de nÚmeros ao quadrado: \n" + numerosAoQuadrado );
        System.out.println( "Soma dos quadrados dos números da lista: \n" + somaDosQuadrados);
    }
}
