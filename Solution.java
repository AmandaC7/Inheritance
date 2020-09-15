package Inheritance;

public class Solution {
    public static void main(String[] args){

        Corvo corvo = new Corvo();
        corvo.setNome("Poe");
        corvo.andar();
        corvo.voar();
        corvo.cantar();
        corvo.emitirsom();
        Tigre tigre = new Tigre();
        tigre.setNome("Mufasa");
        tigre.andar();
        tigre.amamentar();
        tigre.emitirsom();

        Cachorro cachorro = new Cachorro();
        cachorro.setNome("Thor");
        cachorro.brincar();
        cachorro.passear();
        cachorro.andar();
        cachorro.emitirsom();
    }


}
