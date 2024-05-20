public class Carro1 {
    
    private String nome;
    private String marca;
    private int roda;
    private int porta;
        
    public String getNome () {
          return nome;
        }
        
    public void setNome (String nome) {
        this.nome = nome;
       }
        
     public String getMarca() {
        return marca;
    }
        
    public void setMarca (String marca) {
       this.marca = marca;
    }

    public int getRoda () {
        return roda;
    }

    public void setRoda (int roda) {
        this.roda = roda;
    }

    public int getPorta () {
        return porta;
    }
    
    public void setPorta (int porta) {
        this.porta = porta;
    }
        
    public String getCarro () {
        return "Carro: " + nome + " Marca: " + marca + " Roda: " + roda + "Porta: " + porta;
    }
    
}
