/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Abstract;

import Classes.Endereco;
import Enum.Bonificacao;
import Enum.EstadoCivil;
import Enum.Genero;
import Enum.Setor;
import java.time.LocalDate;

/**
 *
 * @author Aluno
 */
public abstract class CargoDeConfianca extends Funcionario{
   protected Bonificacao bonificacao;
   
   //cosntrutor

    public CargoDeConfianca(Bonificacao bonificacao, String nome, String cpf, String rg, Endereco endereco, Genero genero, double salario, EstadoCivil estadocivil, LocalDate dataNascimento, Setor setor) {
        super(nome, cpf, rg, endereco, genero, salario, estadocivil, dataNascimento, setor);
        this.bonificacao = bonificacao;
    }

   
    //geteres e seteres

    public Bonificacao getBonificacao() {
        return bonificacao;
    }

    public void setBonificacao(Bonificacao bonificacao) {
        this.bonificacao = bonificacao;
    }
    
    //toString

    @Override
    public String toString() {
        return  "\n Bonificacao: " + bonificacao;
    }
    
    
    
}
