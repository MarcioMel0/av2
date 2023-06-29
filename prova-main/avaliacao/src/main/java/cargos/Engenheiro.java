/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cargos;

import Util.Util;
import endereco.Endereco;
import funcionario.EstadoCivil;
import funcionario.Funcionario;
import funcionario.Genero;
import funcionario.Setor;
import java.time.LocalDate;

/**
 *
 * @author Aluno
 */
public class Engenheiro extends Funcionario{
    private String crea;
    
    
//    CONSTRUTOR

    public Engenheiro(String crea, String nome, String cpf, String rg, Endereco endereco, Setor setor, Genero genero, double salario, EstadoCivil estadoCivil, LocalDate dataNascimento) {
        super(nome, cpf, rg, endereco, setor, genero, salario, estadoCivil, dataNascimento);
        this.crea = crea;
    }
  
    
//    GETTER E SETTER

    public String getCrea() {
        return crea;
    }

    public void setCrea(String crea) {
        this.crea = crea;
    }

//    SALARIO
    @Override
    public double getSalarioFinal() {
      return super.getSalario();
    }
    
    
//TO STRING

    @Override
    public String toString() {
        return super.toString() + 
                "\nCrea:" + crea + 
                "\nSalário:" + Util.formatarMonetario(getSalarioFinal());
    }
    

    
    
}
