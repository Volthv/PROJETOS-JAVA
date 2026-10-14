package escolaalunos;

//Class abstrata da escola
abstract class Escola {
    protected String nomeAluno;
    protected String matriculaAluno;
    //construtor (Protected para que seja acessado apenas por classes filhas)
    public Escola(String nomeAluno, String matriculaAluno) {
        this.nomeAluno = nomeAluno;
        this.matriculaAluno = matriculaAluno;
    }
    //Informações do aluno
    public void exibirInformacoes() {
        System.out.println("Nome do Aluno: " + nomeAluno);
        System.out.println("Matrícula do Aluno: " + matriculaAluno);
    }
}

//A classe rua herda a classe escola.
class Rua extends Escola {
    private String enderecoRua;
    //construtor (Public para que seja acessado por qualquer classe)
    public Rua(String nomeAluno, String matriculaAluno, String enderecoRua) {
        super(nomeAluno, matriculaAluno);
        this.enderecoRua = enderecoRua;
    }
    //Informações do aluno e endereço
    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Endereço do Aluno: " + enderecoRua);
    }

}

//Classe final
public class Main {
    public static void main(String[] args) {
        Rua aluno = new Rua("Diego", "123456", "Rua das Flores, 123");
        aluno.exibirInformacoes();
    }
}