package Inheritance;
import java.util.Scanner;

public abstract class Animal {

    private String nome;
    public abstract void emitirsom();

    public String getNome(){
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
        System.out.println("Meu nome é: " + nome + " Eu sou um " + getClass());
    }

    void andar(){
        System.out.println("Eu ando");
    }

}
