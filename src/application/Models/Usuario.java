package application.Models;

// Classe Usuario para possível login

public class Usuario {

    private String nome;
    private String email;
    private int idade;

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome () {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
