package stream_api;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//Desafio 9 - Verificar se todos os números da lista são distintos (não se repetem):
//Com a Stream API, verifique se todos os números da lista
// são distintos (não se repetem) e exiba o resultado no console.
public class Desafio9 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        boolean isTodosNumerosSaoDinstintos = numeros.stream()
                .distinct()
                .count() == numeros
                .size();
        //Se os números forem distintos, exibe uma mensagem + a lista de números.
        if (isTodosNumerosSaoDinstintos) {
            System.out.println("Todos os números da lista são distintos:" + '\n'
                    + numeros.stream().distinct().toList());
        } else {
            //Se os números não forem totalmente distintos, exibe uma mensagem + a lista de nÚmeros repetidos.
            System.out.println("A lista possui nÚmeros repetidos:" + '\n'
                    + numeros.stream().filter(n -> Collections.frequency(numeros, n) > 1).distinct().toList());
        }
    }
}
