package equipe4;

import model.Produto;
import service.BubbleSortService;

public class Mockup {

    public static void main(String[] args) {

        Produto[] lista = {
            new Produto(5, "Arroz", 8.99),
            new Produto(3, "Feijão", 6.49),
            new Produto(8, "Macarrão", 4.29),
            new Produto(1, "Óleo", 7.99),
            new Produto(4, "Sal", 2.49)
        };

        System.out.println("=== ANTES DO BUBBLE SORT ===");
        imprimirLista(lista);

        BubbleSortService.bubbleSort(lista);

        System.out.println("\n=== DEPOIS DO BUBBLE SORT ===");
        imprimirLista(lista);
    }

    public static void imprimirLista(Produto[] lista) {
        for (Produto p : lista) {
            System.out.println(p);
        }
    }
}
