package Exceptii;

/**
 * Created by Alexandru.Negoita on 7/4/2017.
 */
public class IngrijitorZoo implements AngajatZoo {
    private int nrActiuni;

    @Override
    public void lucreaza(Animal animal) {
        System.out.println("Ingrijitorul intra in cusca Animalului");
        nrActiuni++;
    }

    public void lucreaza(Animal animal,Object mancare) throws AnimalManancaOmException{
        this.lucreaza(animal);
        animal.seJoaca();
        animal.faceBaie();
        animal.doarme();
        this.nrActiuni++;
        if(animal instanceof AnimalZooRar && mancare==null){
                throw new AnimalManancaOmException("HAmmm");
        }
    }

    public int bonusSalarial(){
        return this.nrActiuni * valoareBonusPerAnimal * 3;
    }
}
