/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Abstract;

import Classes.Endereco;
import Enum.EstadoCivil;
import Enum.Genero;
import Enum.Setor;
import Interface.SalarioFinal;
import java.time.LocalDate;
import java.time.Period;

/**
 *
 * @author Aluno
 */
public abstract class Funcionario implements SalarioFinal{

    
    protected String nome;
    protected String cpf;
    protected String rg;
    protected Endereco endereco;
    protected Genero genero;
    protected double salario;
    protected EstadoCivil estadocivil;
    protected LocalDate dataNascimento;
    protected Setor setor;
    
    //construtor

    public Funcionario(String nome, String cpf, String rg, Endereco endereco, Genero genero, double salario, EstadoCivil estadocivil, LocalDate dataNascimento, Setor setor) {
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.endereco = endereco;
        this.genero = genero;
        this.salario = salario;
        this.estadocivil = estadocivil;
        this.dataNascimento = dataNascimento;
        this.setor = setor;
    }
    
   

    //geteres e seteres
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public EstadoCivil getEstadocivil() {
        return estadocivil;
    }

    public void setEstadocivil(EstadoCivil estadocivil) {
        this.estadocivil = estadocivil;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Setor getSetor() {
        return setor;
    }

    public void setSetor(Setor setor) {
        this.setor = setor;
    }

    public int getIdade() {
        return Period.between(dataNascimento, LocalDate.now()).getYears();
    }
    
    //toString

    @Override
    public String toString() {
        return super.toString()+ 
                "\n Nome: " + nome + 
                "\n CPF: " + cpf + 
                "\n RG: " + rg + 
                "\n Endereco: " + endereco + 
                "\n Genero: " + genero + 
                "\n Salario: " + salario + 
                "\n Estado Civil: " + estadocivil + 
                "\n Data Nascimento: " + dataNascimento + 
                "\n Setor: " + setor;
    }

   
   

    
}
