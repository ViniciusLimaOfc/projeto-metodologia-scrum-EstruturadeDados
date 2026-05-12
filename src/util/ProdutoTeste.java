package util;

import model.ProdutoModel;
import service.ProdutoService;

public class ProdutoTeste {public static void executarTeste(ProdutoService service) {

    service.adicionarProduto(new ProdutoModel(1, "Mouse", 120.0));
    service.adicionarProduto(new ProdutoModel(2, "Teclado", 250.0));
    service.adicionarProduto(new ProdutoModel(3, "Monitor", 900.0));
    service.adicionarProduto(new ProdutoModel(4, "Notebook", 3500.0));
    service.adicionarProduto(new ProdutoModel(5, "Headset", 180.0));

    System.out.println("\nPRODUTOS CADASTRADOS:");
    service.listarProdutos();
}}
