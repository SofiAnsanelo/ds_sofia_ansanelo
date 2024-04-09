public class Ex02 {
    static void metodo (String frase , String palavra) {
        if (frase.contains(palavra)) {
            System.out.println("A frase " + frase + " contem a palavra " + palavra );
        } else {
            System.out.println("A frase " + frase + " nao contem a palavra " + palavra );
        }
    }

    public static void main (String[] args) {
        metodo("eu sou um desenvolvedor senhora", "desenvolvedor");
    }
    
}
