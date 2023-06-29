/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Abstract.Funcionario;
import Classes.Diretor;
import Classes.Endereco;
import Classes.Engenheiro;
import Classes.Motoboy;
import Enum.EstadoCivil;
import Enum.Genero;
import Enum.UnidadeFederativa;
import java.time.LocalDate;
import java.time.Month;


/**
 *
 * @author Theu
 */
public class Main {
    public static void main(String[] args) {


        
    Diretor diretor = new Diretor("000-000-000-00", "000000000", "1", Funcionario.Setor.ENGENHARIA, 1000, Genero.MASCULINO, EstadoCivil.SEPARADO, LocalDate.of(2002, Month.JUNE, 6), "Macita", "(00) 0000-0000", "Macita@gmail.com", new Endereco("Rua 4", "4", "bloco 4", "4444-44", "Camaçari", UnidadeFederativa.BAHIA));
    Engenheiro engenheiro = new Engenheiro("3", "000.000.000-00", "000.000.0.0.0", "2", Funcionario.Setor.ENGENHARIA, 1000, Genero.FEMININO, EstadoCivil.SOLTEIRO, LocalDate.of(2001, Month.JUNE, 6), "Marcia", "(00) 0000-0000", "Marcia@gmail.com",new Endereco("Rua 5", "5", "bloco 5", "5555", "São Gonçalo", UnidadeFederativa.RIO_DE_JANEIRO));
    Motoboy motoboy = new Motoboy("5555", "000.000.000-00", "00000000", "5", Funcionario.Setor.OPERACOES, 1000, Genero.MASCULINO, EstadoCivil.VIUVO, LocalDate.of(2000, Month.JUNE, 6), "Justin", "(00) 0000-0000", "justin@gmail.com", new Endereco("Rua 6", "6", "bloco 6", "6666", "Lauro", UnidadeFederativa.BAHIA));
    
    
        System.out.println("");
    diretor.adimitir(diretor);
        System.out.println("");
    diretor.demitir(engenheiro);
        System.out.println("");
    diretor.demitir(motoboy);
    

        

        
        
        
}
    
    
}
