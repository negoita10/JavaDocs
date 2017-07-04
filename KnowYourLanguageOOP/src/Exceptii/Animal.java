package Exceptii;

/**
 * Created by Alexandru.Negoita on 7/4/2017.
 */
public abstract class Animal {
    abstract void mananca(Object obj);
    abstract void seJoaca();
    abstract void faceBaie();
    public void doarme(){
        System.out.println("Animalul doarme");
    }

    public Animal(){
        System.out.println("Animal nou");
    }

}
