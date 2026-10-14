

class Salario {
    private String CLTCNPJ;
    private Double Salario;
    private double bonus;
    private double SalarioFinal;
//construtor de privado para publico
    public Salario(String CLTCNPJ, Double Salario, double bonus, double SalarioFinal) {
        this.CLTCNPJ = CLTCNPJ;
        this.Salario = Salario;
        this.bonus = bonus;
        this.SalarioFinal = SalarioFinal;
    }
//checagem do salario
    public void ChecagemSalario(){
        if (Salario < 1500){
           bonus = Salario * 0.10;
        }else if (Salario >= 1500 && Salario <= 2500){
           bonus = Salario * 0.20;
        }else{
           bonus = Salario * 0.30;
        }

    }

    public void SalarioFinal(){
        //Salario com desconto pro 
        SalarioFinal = Salario + bonus / 2;
        System.out.println("O salario final do cliente " + CLTCNPJ + " é: " + SalarioFinal);
    }
}
//principal
public class Main {
    public static void main(String[] args) {

        Salario salario = new Salario("12345678000199", 1500.0, 0.0, 0.0);
        salario.ChecagemSalario();
        salario.SalarioFinal();
       
    }
}