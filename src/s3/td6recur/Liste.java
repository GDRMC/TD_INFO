package s3.td6recur;

public abstract class Liste {

    public abstract boolean estVide(); //redefinition obligatoire

    public abstract String getPremier();

    public abstract Liste getReste();
    
    public abstract void afficheIt();
    
    public abstract boolean rechercheIt(String val);
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
    
    public void afficheIt(){
        Liste l1 = this;
        while(!l1.estVide()){
            System.out.println(l1.getPremier());
            l1=l1.getReste();
        }
    }

    public boolean rechercheIt(String val) {
        return false; //lel
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
    
    public void afficheIt(){
        Liste l1 = this;
        while(!l1.estVide()){
            System.out.println(l1.getPremier());
            l1=l1.getReste();
        }
    }

    public boolean rechercheIt(String val) {
        Liste l1 = this;
        while(!l1.estVide()&&l1.getPremier()!=val){
            l1=l1.getReste();
        }
        return !l1.estVide();
    }
    
}