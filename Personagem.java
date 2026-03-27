package projetoJava;

public abstract class Personagem implements Acoes {

    protected String nome;
    protected int vida;
    protected int ataque;
    protected int defesa;

    public Personagem(String nome, int vida, int ataque, int defesa) {
        this.nome = nome;
        this.vida = vida;
        this.ataque = ataque;
        this.defesa = defesa;
    }

    public void exibirStatus() {
        System.out.println("Nome: " + nome);
        System.out.println("Vida: " + vida);
        System.out.println("Ataque: " + ataque);
        System.out.println("Defesa: " + defesa);

        if (vida == 0) {
            System.out.println("STATUS: DERROTADO");
        } else {
            System.out.println("STATUS: VIVO");
        }
    }

    public void receberDano(int dano) {
        int danoFinal = dano - (defesa / 2);

        if (danoFinal <= 0) {
            danoFinal = 1;
        }

        vida -= danoFinal;

        if (vida < 0) {
            vida = 0;
        }

        System.out.println(nome + " sofreu " + danoFinal + " de dano! Vida atual: " + vida);
    }

    public boolean estaVivo() {
        return vida > 0;
    }

    public void atacarOutro(Personagem alvo) {
        if (!alvo.estaVivo()) {
            System.out.println(alvo.nome + " já está derrotado!");
            return;
        }

        System.out.println("\n" + nome + " atacou " + alvo.nome + "!");
        alvo.receberDano(this.ataque);
    }
}