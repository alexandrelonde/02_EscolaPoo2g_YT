// ========== CLASSE PESSOA

// nome de pacote se escreve com letra minúscula
package escola; // Está dentro do pacote escola

public class Pessoa {
    // Atributos
    private String nome;
    private int matricula;   
    
    
    // Gerando Getters and Setters (encapsulamento privado)
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    } 
}



