// ========== CLASSE ALUNO

package escola; // Está dentro do pocote escola

import java.util.Date; // Importação da classe Date

// A classe Aluno herda os atributos da classe Pessoa
public class Aluno extends Pessoa {
    // Atributos
    private Date dataNascimento;
    
    // Associações
    private Turma turma; // Colocamos em aluno um objeto da classe turma
    
    // Métodos
    void realizarAvaliacao(){
        
    }  
    
    
    // Gerando Getters and Setters (encapsulamento privado)
    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }
    
}
