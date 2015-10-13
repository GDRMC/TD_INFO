package s3.td5recur;

public class test {
    public static void main(String[]args){
        Liste l = new ListeCons("A",new ListeCons("B", new ListeCons("C", new ListeCons("D", new ListeVide()))));
    }
}
