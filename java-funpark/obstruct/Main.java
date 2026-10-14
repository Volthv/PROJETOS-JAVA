//nome do programa "main.java"

class Mountain {
   private String nome;
   private Double codigo;
    public Mountain(String nome, Double codigo){
    this.nome = nome;
    this.codigo = codigo;      
}

  public void testeA(){
    System.out.println(nome + ": teste A" + ", Identifica: " + codigo);  
}
   public void finald(){
   System.out.println(nome + ": teste B" + ", Identifica: " + codigo);  
}

}

public class Main {
  public static void main(String[] args) {
    Mountain montanha = new Mountain("Diego", 402.516);
    Mountain mont = new Mountain("Yudi", 426.246);

    montanha.testeA();
    mont.finald();
  } 
}