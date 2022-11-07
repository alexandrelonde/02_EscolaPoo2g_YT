// ========== CLASSE ALUNO

package escola; // Está dentro do pocote escola

import java.util.Date; // Importação da classe Date

// A classe Aluno herda os atributos da classe Pessoa
public class Aluno extends Pessoa {
    // Atributos
    Date dataNascimento;
    
    // Associações
    Turma turma; // Colocamos em aluno um objeto da classe turma
    
    // Métodos
    void realizarAvaliacao(){
        
    }  
}
