package service;

import model.ProdutoModel;

import java.util.ArrayList;
import java.util.List;

public class ProdutoService {
    private List<ProdutoModel> listaProdutos;

    public ProdutoService() {
        listaProdutos = new ArrayList<>();
    }

    // adiciona o produto na lista
    public void adicionarProduto(ProdutoModel produto) {
        listaProdutos.add(produto);
        System.out.println("Produto cadastrado com sucesso!");
    }

    // lista os produtos
    public void listarProdutos() {

        if (listaProdutos.isEmpty()) {
            System.out.println("Nenhum produto cadastrado.");
            return;
        }

        for (ProdutoModel produto : listaProdutos) {
            System.out.println(produto);
        }
    }

    // esse é pra retornar a lista para outras equipes
    public List<ProdutoModel> getListaProdutos() {
        return listaProdutos;
    }
}
