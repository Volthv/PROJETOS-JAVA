package referencia;

abstract class refb {
    private String nome;
    private int DatadeNascimento;
    private int idade;


    //construtor (Protected para que seja acessado apenas por classes filhas)
    public refb(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
    //nome
    public String getNome() {
        return nome;
    }

    //data de nascimento
    public int getDatadeNascimento() {
        return DatadeNascimento;
    }
    //idade
    public int getIdade() {
        return idade;
    }

    //Calculo pra ver a idade do aluno
    public void calcularIdade(int anoAtual, int anoNascimento) {
        idade = anoAtual - anoNascimento;
    }
}


class Anoatual extends refb {
    private int anoAtual;

    public Anoatual(String nome, int idade, int anoAtual) {
        super(nome, idade);
        this.anoAtual = anoAtual;
    }

    public int getAnoAtual() {
        return anoAtual;
    }
}

public class Main {
    public static void main(String[] args) {
        Anoatual aluno = new Anoatual("Diego", 0, 2026);
        aluno.calcularIdade(aluno.getAnoAtual(), 2000);
        System.out.println("Nome do Aluno: " + aluno.getNome());
        System.out.println("Idade do Aluno: " + aluno.getIdade());
    }
}
