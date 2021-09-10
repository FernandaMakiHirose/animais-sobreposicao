package fernandamakihirose.animaispolimorfismo;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Peixe extends Animal {

    private String corEscama;

    public Peixe() {
    }

    public Peixe(String corEscama, float peso, int idade, int membros) {
        super(peso, idade, membros);
        this.corEscama = corEscama;
    }

    public void soltarBolha(){
        System.out.println("Bolha");
    }

    @Override
    public void locomover() {
        System.out.println("Nadar");
    }

    @Override
    public void alimentar() {
        System.out.println("Comer substâncias");
    }

    @Override
    public void emitirSom() {
        System.out.println("Não faz som");
    }

}