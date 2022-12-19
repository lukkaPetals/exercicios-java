package poo11;

public class Ave extends Animal {

    @Override
    public void locomover() {
        System.out.println("Voando");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo frutas");
        
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de Ave");
        
    }

    public void fazerNinho() {
        System.out.println("Construir ninho");
    }
    
}
