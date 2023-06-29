/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import Abstract.CargoDeConfianca;
import Abstract.Funcionario;
import Enum.Bonificacao;
import Enum.EstadoCivil;
import Enum.Genero;
import Enum.Setor;
import Interface.Contratacao;
import java.time.LocalDate;


/**
 *
 * @author Aluno
 */
public class Diretor extends CargoDeConfianca implements Contratacao{
     private double PREMIO=0.3;
    
//construtor

    public Diretor(Bonificacao bonificacao, String nome, String cpf, String rg, Endereco endereco, Genero genero, double salario, EstadoCivil estadocivil, LocalDate dataNascimento, Setor setor) {
        super(bonificacao, nome, cpf, rg, endereco, genero, salario, estadocivil, dataNascimento, setor);
    }



//geteres e seteres
    public void setPREMIO(double PREMIO) {
        this.PREMIO = PREMIO;
    }


    //salario
    @Override
    public double getSalarioFinal() {
        return super.getSalario() + (super.getSalario() * PREMIO);
    }
    
    
//toString
    @Override
    public String toString() {
        return super.toString() 
                + "\nPrêmio:" + (PREMIO * 100) + " %" +
                "\nSalário:" +getSalarioFinal();
    }

    
     
    

     @Override
    public void demitir(Funcionario funcionario) {
        System.out.println("Demitido " +super.getNome());
    }

    @Override
    public void adimitir(Funcionario funcionario) {
        System.out.println("Adimitir " +funcionario);
    }
   

    
}

    
  

