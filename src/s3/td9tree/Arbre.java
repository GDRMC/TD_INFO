package s3.td9tree;

public abstract class Arbre {
    public abstract String getRacine();
    public abstract Arbre getAg();
    public abstract Arbre getAd();
    
    public abstract void setRacine(String s);
    public abstract void setAg(Arbre Ag);
    public abstract void setAd(Arbre Ad);
    
    public abstract boolean estVide();
    
    public abstract void afficheGRD();
    
    public abstract String lePlusAGauche();
    public abstract String lePlusADroite();
    
    //supprimer
    
    public abstract boolean trouver(String element);
    
    public abstract boolean estFeuille();
    
    public abstract int nbFeuille();
    
    //nbnoeuds
    
    //hauteur
}

class ArbreVide extends Arbre {
    
    public boolean estVide(){
        return true;
    }
    
    ArbreVide(){ }
    
    public void afficheGRD(){
        //System.out.println("Vide");
    }
    
    public int nbFeuille(int nb){
        return nb;
    }

    @Override
    public String getRacine() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Arbre getAg() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Arbre getAd() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setRacine(String s) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setAg(Arbre Ag) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setAd(Arbre Ad) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String lePlusAGauche() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String lePlusADroite() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean trouver(String element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean estFeuille() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int nbFeuille() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}

class ArbreCons extends Arbre {
    private String racine;
    private Arbre Ag;
    private Arbre Ad;
    
    public boolean estVide(){
        return false;
    }
    
    ArbreCons(String val, Arbre Ag, Arbre Ad) {
        this.racine = val;
        this.Ag = Ag;
        this.Ad = Ad;
    }
    
    ArbreCons(String val) {
        this.racine = val;
        this.Ag = new ArbreVide();
        this.Ad = new ArbreVide();
    }
    
    public String getRacine(){
        return this.racine;
    }
    
    public Arbre getAg(){
        return this.Ag;
    }
    
    public Arbre getAd(){
        return this.Ad;
    }
    
    public void setRacine(String s){
        this.racine = s;
    }
    
    public void setAg(Arbre Ag){
        this.Ag = Ag;
    }
    
    public void setAd(Arbre Ad){
        this.Ag = Ad;
    }
    
    public void afficheGRD(){
        this.getAg().afficheGRD();
        System.out.print(this.getRacine()+" ");
        this.getAd().afficheGRD();
    }
    
    public int nbFeuille(){
        if(this.estFeuille()){
            return 1;
        } else {
            return this.getAg().nbFeuille()+this.getAd().nbFeuille();
        }
    }
    
    public boolean estFeuille(){
        return this.getAg().estVide() && this.getAd().estVide();
    }
    
    public boolean trouver(String element){
        if(this.getRacine().equals(element)){
            return true;
        } else {
            return this.getAg().trouver(element) || this.getAd().trouver(element);
        }
    }
    
    public String lePlusAGauche(){
        if(this.getAg().estFeuille()){
            return this.getAg().getRacine();
        } else {
            return this.getAg().lePlusAGauche();
        }
    }
    
    public String lePlusADroite(){
        if(this.getAd().estFeuille()){
            return this.getAd().getRacine();
        } else {
            return this.getAd().lePlusADroite();
        }
    }
}