package model;

public class Produto {
    private String nome = "Sem Nome";
    private double preco = 0;
    private int emEstoque = 0;

    public void setPreco (double preco) {
        if(preco <= 0){
            System.out.println("Impossivel Precificar Com Valores Negativos.");
            return;
        }

        this.preco = preco;
        System.out.println("Preco de: " + this.nome + " foi alterado para " + this.preco);
    }

    public void setNome (String nome) {
        this.nome = nome;
    }

    public void setEstoque (int emEstoque) {

        if(emEstoque <= 0){
            System.out.println("Impossivel Estoque Com Valores Negativos.");
            return;
        }

        this.emEstoque = emEstoque;
        System.out.println("Estoque de: " + this.nome + " foi alterado para " + this.emEstoque);
    }

    public void getInformacoes () {
        System.out.println("Produto: " + this.nome + "\n" + "Preco: " + this.preco + "\n" + "Estoque: " + this.emEstoque);
    }
}
