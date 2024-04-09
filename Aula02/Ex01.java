//ex01
public class Ex01 {
    static void metodo (String x , String y){
        if ( x == y) {
            System.out.println("As palavras " + x + " e " + y + " são iguais.");
        } else {
            System.out.println("As palavras " + x + " e " + y + " são diferentes.");
        }
    }

    public static void main (String[] args) {
        metodo("batata" , "batata");
    }
}
