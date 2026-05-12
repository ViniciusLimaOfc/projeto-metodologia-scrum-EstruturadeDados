package model;

public class Produto {
    public int id;
    public String nome;
    public double preco;

    public Produto(int id, String nome, double preco) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "ID: " + id + " | Nome: " + nome + " | Preco: R$ " + String.format("%.2f", preco);
    }
}
