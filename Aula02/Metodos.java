public class Metodos {
    static void MeuMetodo () {
        System.out.println("Assim que funciona um metodo");
    }
    //Static define que esse método pertence a classe main e não é Objeto
    //Void significa que o método não vai ter um retorno 

    static void meuMetodoComParamentos(String nome, int idade) {
        System.out.println(nome + " tem " + idade);
    }

    public static void main(String[] args) {
        MeuMetodo();
        meuMetodoComParamentos("João", 36);
    }
}