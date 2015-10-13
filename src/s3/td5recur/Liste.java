package s3.td5recur;

public abstract class Liste {

    public abstract boolean estVide(); //redefinition obligatoire

    public abstract String getPremier();

    public abstract Liste getReste();
}

class ListeVide extends Liste {

    ListeVide() {
    }

    public boolean estVide() {
        return true;
    }

    public String getPremier() {
        return null;
    }

    public Liste getReste() {
        return null;
    }
}

class ListeCons extends Liste {

    private String valeur;
    private Liste suiv ;

    ListeCons(String val, Liste L) {
        this.valeur = val;
        this.suiv = L;
    }

    public boolean estVide() {
        return false;
    }

    public String getPremier() {
        return this.valeur;
    }

    public Liste getReste() {
        return this.suiv;
    }

}
