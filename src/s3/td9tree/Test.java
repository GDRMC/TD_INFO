package s3.td9tree;

public class Test{
    public static void main(String[]args){
        ArbreCons tree1 = new ArbreCons(
                "A",
                new ArbreCons("B",
                        new ArbreCons("C"), 
                        new ArbreCons("D")),
                new ArbreCons("E",
                        new ArbreCons("F"), 
                        new ArbreCons("G"))
                );
        System.out.println(tree1.getAg().lePlusAGauche());
        System.out.println(tree1.lePlusADroite());
        System.out.println(tree1.nbFeuille());
        tree1.afficheGRD();
        Arbre tree2 = tree1.supprimer("B");
        System.out.println();
        tree2.afficheGRD();
    }
}
