/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package escolapoo;

import escola.Disciplina; // Importar do pacote em que está a classe
                          // Importar do pacote escola, a classe Disciplina

/**
 *
 * @author Alexandre
 */
public class EscolaPoo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Intanciação
        Disciplina disciplina1 = new Disciplina(); // Variável do tipo de uma classe é um objeto
        disciplina1.setNome("Matemática");
        disciplina1.setCargaHoraria(- 10);
        
        // Imprimindo os dados
        System.out.println(disciplina1.getNome());
        System.out.println(disciplina1.getCargaHoraria());
        
    }
    
}
