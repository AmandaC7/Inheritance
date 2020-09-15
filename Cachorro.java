package Inheritance;

public class Cachorro extends Animal implements AnimalEstimacao{

    @Override
    public String getNome() {
        return super.getNome();
    }

    @Override
    public void brincar() {
        System.out.println("Eu gosto de correr atrás da bola");
    }

    @Override
    public void passear() {
        System.out.println("Eu gosto de passear no parque");

    }

    @Override
    public void emitirsom() {
        System.out.println("Oufouf");
    }

}
