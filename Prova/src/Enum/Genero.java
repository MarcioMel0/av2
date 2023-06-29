/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package Enum;

/**
 *
 * @author Aluno
 */
public enum Genero {
   MASCULINO("Masculino",'M'),
   FEMININO("FEminino",'F');
   
   protected String texto;
   protected char caractere;
   
   //construtor

    private Genero(String texto, char caractere) {
        this.texto = texto;
        this.caractere = caractere;
    }
   
    //geteres e seteres

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public char getCaractere() {
        return caractere;
    }

    public void setCaractere(char caractere) {
        this.caractere = caractere;
    }
    
    
}
