/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import Abstract.Funcionario;
import Enum.EstadoCivil;
import Enum.Genero;
import Enum.Setor;
import java.time.LocalDate;

/**
 *
 * @author Aluno
 */
public class Engenheiro extends Funcionario{
    private String crea;
    
  
     //cosntrutor

    public Engenheiro(String crea, String nome, String cpf, String rg, Endereco endereco, Genero genero, double salario, EstadoCivil estadocivil, LocalDate dataNascimento, Setor setor) {
        super(nome, cpf, rg, endereco, genero, salario, estadocivil, dataNascimento, setor);
        this.crea = crea;
    }
    
 
    
    //geteres e seteres
    public String getCrea() {
        return crea;
    }

    public void setCrea(String crea) {
        this.crea = crea;
    }

//    SALARIO
    @Override
    public double getSalarioFinal() {
    return super.salario;
    }
    

    //toString
    @Override
    public String toString() {
        return super.toString() + 
                "\nCrea:" + crea + 
                "\nSalário Final:" +getSalarioFinal(); 
    }
    
    
    
}
