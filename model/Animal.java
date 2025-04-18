package model;

public class Animal {

    private String nome;
    private Filo filo;
    private String simetria;
    private String habitat;

    public Animal(String nome, Filo filo, String simetria, String habitat) {
        this.nome = nome;
        this.filo = filo;
        this.simetria = simetria;
        this.habitat = habitat;
    }

    public String getNome() {
        return nome;
    }

    public Filo getFilo() {
        return filo;
    }

    public String getSimetria() {
        return simetria;
    }

    public String getHabitat() {
        return habitat;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", Filo: " + filo +
               ", Simetria: " + simetria + ", Habitat: " + habitat;
    }
}

