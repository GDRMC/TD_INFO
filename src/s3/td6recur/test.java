package s3.td6recur;

public class test {
    public static void main(String[]args){
        Liste l = new ListeCons("A",new ListeCons("B", new ListeCons("C", new ListeCons("D", new ListeVide()))));
    }
}
