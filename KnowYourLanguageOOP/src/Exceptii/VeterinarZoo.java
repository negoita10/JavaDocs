package Exceptii;

/**
 * Created by Alexandru.Negoita on 7/4/2017.
 */
public class VeterinarZoo implements AngajatZoo {
    private int nrActiuni;
    @Override
    public void lucreaza(Animal animal) {
        System.out.println("Veterinarul are grija de animal");
        if(animal instanceof AnimalZooFeroce){
            animal.faceBaie();
        }
    }

    public int bonusSalarial(){
        return this.nrActiuni * valoareBonusPerAnimal * 3;
    }
}
