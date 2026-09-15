
class Animal {
    protected String Animal;
    protected String animaltype;
    protected int idade;

    public Animal(String Animal, String animaltype, int idade) {
        this.Animal = Animal;
        this.animaltype = animaltype;
        this.idade = idade;
    }

    public void FazSom() {
        System.out.println(Animal + " é um " + animaltype + " e tem " + idade + " anos");
    }
}  

public class Main {
    public static void main(String[] args) {
        Animal[] animais = {
            new Animal("Rex", "Cachorro", 5),
            new Animal("Whiskers", "Gato", 3)
        };

        for (Animal  animal : animais) {
            animal.FazSom();
        }   
    }
}