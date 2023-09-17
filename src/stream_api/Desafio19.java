package stream_api;

import java.util.Arrays;
import java.util.List;

//Desafio 19 - Encontre a soma dos números divisíveis por 3 e 5:
//Com a Stream API, encontre a soma dos números da
// lista que são divisíveis tanto por 3 quanto por 5
// e exiba o resultado no console.
public class Desafio19 {
    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 15, 25, 30);
        //Separei para fins didáticos, mas poderia escrever direto:
        //System.out.println("A soma dos números divisíveis é: \n" + numeros.stream().filter(n -> n%3 == 0 && n%5 ==0).mapToInt(n -> n).sum());

        List<Integer> listaDivisiveis = numeros.stream()
                .filter(n -> n % 3 == 0 && n % 5 == 0)
                .toList();
        int somaDosDivisíveis = listaDivisiveis.stream()
                .mapToInt( n -> n)
                .sum();

        System.out.println("Os números que podem ser divididos por 3 e por 5 são: \n"
                + listaDivisiveis);

        System.out.println("A soma dos divisíveis é: \n"
                + somaDosDivisíveis);
    }
}
