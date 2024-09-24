// Nova classe Mago que herda de Personagem
class Mago extends Personagem {
    int mana;
    String elemento;

    // Construtor da classe Mago
    public Mago(int ID, String nome, int mana, String elemento) {
        super(ID);
        this.tipo = "mago";
        this.nome = nome;
        this.mana = mana;
        this.elemento = elemento;
        System.out.println("Criando um Mago com nome " + this.nome + ", elemento " + this.elemento + " e ID = " + this.id);
    }

    // Método específico para Mago
    public void lançarFeitiço() {
        System.out.println(this.nome + " lançou um feitiço de " + this.elemento + "!");
    }
}

// Classe principal Main
public class Main {
    public static void main(String[] args) {
        System.out.println("Atividade de produção - CÓDIGO INICIAL");
        System.out.println("Autor: Luiz Carlos Milani Junior");

        // Criando um objeto da classe Personagem
        Personagem p = new Personagem(1);
        p.imprimeDados();

        // Criando um objeto da classe Dragao
        Dragao d1 = new Dragao(2, "Smaug");
        d1.atuar(0);

        // Criando um objeto da nova classe Mago
        Mago m1 = new Mago(3, "Gandalf", 100, "fogo");
        m1.lançarFeitiço();
    }
}