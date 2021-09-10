package fernandamakihirose.animaispolimorfismo;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Reptil extends Animal {

    private String corEscamas;

    public Reptil() {
    }

    public Reptil(String corEscamas, float peso, int idade, int membros) {
        super(peso, idade, membros);
        this.corEscamas = corEscamas;
    }

    @Override
    public void locomover() {
        System.out.println("Rastejar");
    }

    @Override
    public void alimentar() {
        System.out.println("Comer vegetais");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de réptil");
    }
}