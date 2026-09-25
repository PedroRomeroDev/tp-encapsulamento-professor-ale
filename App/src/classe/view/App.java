import model.Carro;
import model.ContaBancaria;
import model.Produto;

public class App {
    public static void main(String[] args) throws Exception {
        // Exemplo do Carro
        Carro carro = new Carro("Renault", "Clio", "JDK-129U");
        carro.capacidadeTanque = 75;
        double valor = carro.encherTanque(6.5);
        System.out.println("Valor Encher Tanque de Gasolina: " + valor);

        System.out.println("############################################");
        // Exemplo Conta Bancaria
        ContaBancaria conta = new ContaBancaria("Alessandro");

        conta.depositar(5000);
        conta.sacar(3000);

        // Erro de Saque
        conta.sacar(3000);
        conta.consultarInformacoes();

        System.out.println("############################################");
        // Exemplo Produto
        Produto produto = new Produto();
        produto.getInformacoes();
        produto.setNome("Cabo HDMI");
        produto.setPreco(18.99);
        produto.setEstoque(200);
        produto.getInformacoes();

        // Forcando Erros
        produto.setEstoque(-200);


    }
}
