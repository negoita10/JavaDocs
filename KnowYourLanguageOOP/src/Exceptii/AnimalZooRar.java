package Exceptii;

/**
 * Created by Alexandru.Negoita on 7/4/2017.
 */
public class AnimalZooRar extends Animal {

    private String nume;
    private String numeleTariiDeOrigine;

    public void setNume(String nume){
        this.nume=nume;
    }
    public void setNumeleTariiDeOrigine(String numeleTariiDeOrigine){
        this.numeleTariiDeOrigine=numeleTariiDeOrigine;
    }

    public String getNume() {
        return nume;
    }

    public String getNumeleTariiDeOrigine() {
        return numeleTariiDeOrigine;
    }

    public AnimalZooRar(String nume,String numeleTariiDeOrigine){}
    public AnimalZooRar(String nume){}
    public AnimalZooRar(){}

    @Override
    void mananca(Object obj) throws AnimalManancaOmException {
        if(obj instanceof AngajatZoo)
            throw new AnimalManancaOmException("HAm");
        else
            System.out.println("AnimalZooRar mananca");
    }

    @Override
    void seJoaca() {
        System.out.println("AnimalulZooRar se joaca");
        super.doarme();

    }

    @Override
    void faceBaie() {
        System.out.println("AnimalulZooRar face baie");

    }
}
