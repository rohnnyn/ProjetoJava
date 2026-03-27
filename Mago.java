package projetoJava;

public class Mago extends Personagem {

    private int mana;

    public Mago(String nome, int vida, int ataque, int defesa, int mana) {
        super(nome, vida, ataque, defesa);
        this.mana = mana;
    }

    @Override
    public void atacar() {
        System.out.println("O mago " + nome + " lançou magia causando " + ataque + " de dano!");
    }

    @Override
    public void defender() {
        System.out.println("O mago " + nome + " se defendeu!");
    }

    @Override
    public void usarHabilidadesEspeciais() {
        int danoEspecial = ataque + mana;

        if (mana >= 20) {
            System.out.println("O mago " + nome + " usou magia poderosa causando " + danoEspecial + " de dano!");
            mana -= 20;
        } else {
            System.out.println("Mana insuficiente!");
        }
    }
}