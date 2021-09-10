package fernandamakihirose.animaispolimorfismo;

import lombok.AllArgsConstructor;
import lombok.Data;

public class Canguru extends Mamifero {

    public Canguru() {
    }

    public Canguru(String corPelo, float peso, int idade, int membros) {
        super(corPelo, peso, idade, membros);
    }

    public void usarBolsa() {
        System.out.println("Usando a Bolsa");
    }

    @Override
    public void locomover() {
        System.out.println("Saltar");
    }

}