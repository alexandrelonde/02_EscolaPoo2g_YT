// ========== CLASSE PROFESSOR

package escola; // Está dentro do pacote escola


import java.util.ArrayList; // Importação da classe ArrayList

// A classe Professor herda os atributos da classe Pessoa
public class Professor extends Pessoa {
    // Atributos
    String formacaoAcademica;
    double salario;
    
    //Associações
    ArrayList<Disciplina> disciplinas; // Muitas disciplinas para um professor
    ArrayList<Turma> turmas; // Muitas turmas para um professor
    
    // Métodos
    void aplicarAvaliacao(){
        
    }
    
}
