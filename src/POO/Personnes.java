package POO;

import interfaces.Personnage;

public enum Personnes {
    ENSEIGNANT,
    SECRETAIRE,
    ETUDIANT_REGULIER,
    ETUDIANT_ECHANGE
}

class MainEnum {
    public static void main(String[] args) {
        Personnes etudiant = Personnes.ETUDIANT_ECHANGE;
    }
}
