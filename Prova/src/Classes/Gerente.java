/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import Abstract.CargoDeConfianca;
import Enum.Bonificacao;
import Enum.EstadoCivil;
import Enum.Genero;
import Enum.Setor;
import java.time.LocalDate;

/**
 *
 * @author Aluno
 */
public class Gerente extends CargoDeConfianca{
   protected String gerente;

    //construtor

    public Gerente(String gerente, Bonificacao bonificacao, String nome, String cpf, String rg, Endereco endereco, Genero genero, double salario, EstadoCivil estadocivil, LocalDate dataNascimento, Setor setor) {
        super(bonificacao, nome, cpf, rg, endereco, genero, salario, estadocivil, dataNascimento, setor);
        this.gerente = gerente;
    }

    
    //geteres e seteres

    public String getGerente() {
        return gerente;
    }

    public void setGerente(String gerente) {
        this.gerente = gerente;
    }
    
    //toString

    @Override
    public String toString() {
        return super.toString() + 
                "\n Gerente: " + gerente;
                 
    }

    @Override
    public double getSalarioFinal() {
        return super.getSalario();
    }
    
}
