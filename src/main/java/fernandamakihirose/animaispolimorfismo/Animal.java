package fernandamakihirose.animaispolimorfismo;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public abstract class Animal {

    private float peso;
    private int idade;
    private int membros;

    public Animal() {
    }

    public abstract void locomover();

    public abstract void alimentar();

    public abstract void emitirSom();
}