/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package funcionario;

/**
 *
 * @author Aluno
 */
public enum EstadoCivil {
    SOLTEIRO("Solteiro"),
    CASADO("Casado"),
    SEPARADO("Separado"),
    DIVORCIADO("Divorciado"),
    VIUVO("Víuvo");
    
    protected String texto;
    
//    CONSTRUTOR

    private EstadoCivil(String texto) {
        this.texto = texto;
    }
    
//    GETTER

    public String getTexto() {
        return texto;
    }
    
    
    
}
