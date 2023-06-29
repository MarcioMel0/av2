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
public class Motoboy extends Funcionario{
    private String carteiraDeHabilitacao;
    
    //cosntrutor

    public Motoboy(String carteiraDeHabilitacao, String nome, String cpf, String rg, Endereco endereco, Genero genero, double salario, EstadoCivil estadocivil, LocalDate dataNascimento, Setor setor) {
        super(nome, cpf, rg, endereco, genero, salario, estadocivil, dataNascimento, setor);
        this.carteiraDeHabilitacao = carteiraDeHabilitacao;
    }

   
  
    //geteres e seteres
    public String getCarteiraDeHabilitacao() {
        return carteiraDeHabilitacao;
    }

    public void setCarteiraDeHabilitacao(String carteiraDeHabilitacao) {
        this.carteiraDeHabilitacao = carteiraDeHabilitacao;
    }
    

    //Salario
    @Override
    public double getSalarioFinal() {
       return super.salario;
    }
    

    //toString
    @Override
    public String toString() {
        return super.toString() + 
                "\nCarteira de Habilitação:" + carteiraDeHabilitacao + 
                "\nSalário:" +getSalarioFinal();
    }
    
    
}

