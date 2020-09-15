package Inheritance;

public class Tigre extends Mamifero{
    @Override
    public void emitirsom() {
        System.out.println("Arrrgg");
    }
    @Override
    public String getNome() {
        return super.getNome();
    }
}
