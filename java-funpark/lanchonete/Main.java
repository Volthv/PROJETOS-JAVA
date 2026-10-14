package lanchonete;

interface PixCartao {
    void pagarPix(double valor);
    void pagarCartao(double valor);
}

abstract class Comida {
    String nome;
    double preco;

    Comida(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    abstract void preparar();
}

class VendaFinal extends Comida implements PixCartao {
    VendaFinal(String nome, double preco) {
        super(nome, preco);
    }

    @Override
    void preparar() {
        System.out.println("Preparando " + nome + " no valor de R$" + preco);
    }

    @Override
    //pegou da interface que tem o "valor" double
    public void pagarPix(double valor) {
        System.out.println("Pagamento via Pix no valor de R$" + valor);
    }
    //pegou da interface que tem o "valor" double
    @Override
    public void pagarCartao(double valor) {
        System.out.println("Pagamento via Cartão no valor de R$" + valor);
    }
}

public class Main {
    public static void main(String[] args) {
        VendaFinal venda = new VendaFinal("Hamburguer", 10.0);
        venda.preparar();
        venda.pagarPix(venda.preco);
        venda.pagarCartao(venda.preco);
    }
}