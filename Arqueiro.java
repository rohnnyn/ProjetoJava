package projetoJava;

public class Arqueiro extends Personagem {

    private int precisao;

    public Arqueiro(String nome, int vida, int ataque, int defesa, int precisao) {
        super(nome, vida, ataque, defesa);
        this.precisao = precisao;
    }

    @Override
    public void atacar() {
        System.out.println("O arqueiro " + nome + " atirou causando " + ataque + " de dano!");
    }

    @Override
    public void defender() {
        System.out.println("O arqueiro " + nome + " se esquivou!");
    }

    @Override
    public void usarHabilidadesEspeciais() {
        int danoEspecial = ataque + (precisao / 2);
        System.out.println("O arqueiro " + nome + " usou tiro preciso causando " + danoEspecial + " de dano!");
    }
    
    
    
}