package projetoJava;

public class Guerreiro extends Personagem {

    private int forcaExtra;

    public Guerreiro(String nome, int vida, int ataque, int defesa, int forcaExtra) {
        super(nome, vida, ataque, defesa);
        this.forcaExtra = forcaExtra;
    }

    @Override
    public void atacar() {
        System.out.println("O guerreiro " + nome + " atacou causando " + ataque + " de dano!");
    }

    @Override
    public void defender() {
        System.out.println("O guerreiro " + nome + " se defendeu!");
    }

    @Override
    public void usarHabilidadesEspeciais() {
        int danoEspecial = ataque + forcaExtra;
        System.out.println("O guerreiro " + nome + " usou golpe especial causando " + danoEspecial + " de dano!");
    }
}