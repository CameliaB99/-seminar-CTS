package ro.ase.cts.FactoryMethod;

public class FactoryBrancardier implements FactoryPersonal {
    @Override
    public PersonalSpital createPersonal(String nume, int salariu) {
        return new Brancardier(nume, salariu);
    }
}