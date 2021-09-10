package fernandamakihirose.animaispolimorfismo;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Mamifero extends Animal {

    private String corPelo;

    public Mamifero() {
    }

    public Mamifero(String corPelo, float peso, int idade, int membros) {
        super(peso, idade, membros);
        this.corPelo = corPelo;
    }

    @Override
    public void locomover() {
        System.out.println("Correr");
    }

    @Override
    public void alimentar() {
        System.out.println("Mamar");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som mamífero");
    }

}