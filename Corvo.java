package Inheritance;

public class Corvo extends Ave{

    @Override
    public void emitirsom() {
        System.out.println("cocóo");
    }
    @Override
    public String getNome() {
        return super.getNome();
    }
}
