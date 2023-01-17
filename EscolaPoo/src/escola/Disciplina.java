// ========== CLASSE DISCIPLINA

package escola; // Está dentro do pacote escola

import java.util.ArrayList; // Importação da classe ArrayList


public class Disciplina {
    // Atributos
    // public String nome; // A palavra "public" na frente define o atributo como público
    // public int cargaHoraria; // A palavra "public" na frente define o atributo como público
    
    
    
    private String nome; // A palavra "private" na frente define o atributo como privado
    private int cargaHoraria; // A palavra "private" na frente define o atributo como privado
    
    
    
    // Associações
    ArrayList<Professor> professores;
    ArrayList<Turma> turmas;
    
    
    
    // Gerando Getters and Setters (encapsulamento privado)
    // Alt + Insert
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    // Protegendo o objeto de valores negativos
    public void setCargaHoraria(int cargaHoraria) {
        if(cargaHoraria >= 0) {
            this.cargaHoraria = cargaHoraria;   
        }
        
    }
      
}

// get retorna um valor
// set não retorna um valor
