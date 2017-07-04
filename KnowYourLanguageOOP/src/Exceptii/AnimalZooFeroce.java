package Exceptii;

/**
 * Created by Alexandru.Negoita on 7/4/2017.
 */
public class AnimalZooFeroce extends Animal {

    @Override
    void mananca(Object obj) throws AnimalManancaOmException {
        if(obj instanceof AngajatZoo)
            throw new AnimalManancaOmException("HAm");
        System.out.println("eat");
    }

    @Override
    void seJoaca() {
        System.out.println("plays");
    }

    @Override
    void faceBaie() {
        System.out.println("washes");
    }

    @Override
    public void doarme(){
        super.doarme();
        System.out.println("Animalul feroce doarme");
    }

}
