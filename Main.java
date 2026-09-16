

//classe de empresa
class Empresarial {
    protected String NomedaEmpresa;
    protected Integer PrecoMensagem;
    protected Integer PrecoEMAIL;
    protected Integer Disparos;
    protected Integer PrecoTotal;
    protected Integer descontoMensagem;
    /*Transiçao pra info protegida pra publica*/
    public Empresarial(String NomedaEmpresa, Integer PrecoMensagem, Integer PrecoEMAIL, Integer Disparos, Integer PrecoTotal) {
        this.NomedaEmpresa = NomedaEmpresa;
        this.PrecoMensagem = PrecoMensagem;
        this.PrecoEMAIL = PrecoEMAIL;
        this.Disparos = Disparos;
        this.PrecoTotal = PrecoTotal;
    }

    public void setEmpresaCal(String NomedaEmpresa, Integer PrecoMensagem, Integer PrecoEMAIL, Integer Disparos, Integer PrecoTotal){
        this.NomedaEmpresa = NomedaEmpresa;
        this.PrecoMensagem = PrecoMensagem;
        this.PrecoEMAIL = PrecoEMAIL;
        this.Disparos = Disparos;
        this.PrecoTotal = PrecoTotal;

    }



    public void aplicarDesconto() {
        if (PrecoMensagem >= 1000) {
            descontoMensagem = (int) (PrecoMensagem * 0.10);
            PrecoMensagem -= descontoMensagem / 2;
        }
        if (PrecoEMAIL >= 1000) {
            Integer descontoEmail = (int) (PrecoEMAIL * 0.10);
            PrecoEMAIL -= descontoEmail / 2;
        }

        
    }

    public Integer precoTotal() {
        this.PrecoTotal = (PrecoMensagem * Disparos) + (PrecoEMAIL * Disparos) / descontoMensagem;
        return PrecoTotal;
    }

    //Informaçoes uteis
    public void exibirInfo() {
        System.out.println("Nome da Empresa: " + NomedaEmpresa);
        System.out.println("Preço por Mensagem: " + PrecoMensagem);
        System.out.println("Preço por Email: " + PrecoEMAIL);
        System.out.println("Número de Disparos: " + Disparos);

        if (PrecoMensagem >= 1000){
            System.out.println("Desconto de 10% aplicado no preço de SMS.");
        }
        if (PrecoEMAIL >= 1000){
            System.out.println("Desconto de 10% aplicado no preço do email.");
        }

        

        System.out.println("Preço Total: " + PrecoTotal);
    }

}

public class Main {
    public static void main(String[] args) {
        
        //Informações da Empresa
        Empresarial[] empresas = {
            new Empresarial("Empresa A", 1200,1200, 10,5)

        };
        //Ate o limite de for
        for (Empresarial empresa : empresas) {
            empresa.aplicarDesconto();
            empresa.precoTotal();
            empresa.exibirInfo();
        }
       
    }
}
        
    





