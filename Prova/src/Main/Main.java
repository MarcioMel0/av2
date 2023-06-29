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
       Engenheiro engenheiro = new Engenheiro("1", "Felipe", "000.000.000-00", "00000000000", new Endereco("Rua 1", "1", "Bairro 1", "11111-111", "Salvador", UnidadeFederativa.BAHIA), Setor.ENGENHARIA, Genero.MASCULINO, 1000, EstadoCivil.SOLTEIRO, LocalDate.of(2003, Month.JUNE, 6));
       Motoboy motoboy = new Motoboy("22222", "Andrea", "000.000.000-00", "111111111", new Endereco("Rua 2", "2", "Bairro 2", "33333-333", "Guarulhos", UnidadeFederativa.SAO_PAULO), Setor.OPERACOES, Genero.FEMININO, 2000, EstadoCivil.DIVORCIADO, LocalDate.of(2002, Month.JUNE, 6));
       Gerente gerente = new Gerente(Bonificacao.GERENTE, "Adolfo", "000.000.000-00", "00000000", new Endereco("Rua 3", "3", "Bairro 3", "33333-333", "Copacabana", UnidadeFederativa.RIO_DE_JANEIRO), Setor.OPERACOES, Genero.MASCULINO, 2000, EstadoCivil.VIUVO, LocalDate.of(2001, Month.MARCH, 6));
       Diretor diretor = new Diretor(Bonificacao.DIRETOR, "Rosa", "000.000.000-00", "0000000000", new Endereco("Rua 4", "4", "Bairro 4", "44444-444", "Camaçari", UnidadeFederativa.BAHIA), Setor.OPERACOES, Genero.FEMININO, 2000, EstadoCivil.CASADO, LocalDate.of(2000, Month.MARCH, 6));
       
               
//        System.out.println(engenheiro);
//        System.out.println("");
//        System.out.println(motoboy);
//        System.out.println("");
//        System.out.println(gerente);
//        System.out.println("");

        System.out.println(diretor);
        System.out.println("");
        
        System.out.println("Engenheiro:");
        diretor.admitir(engenheiro);
        System.out.println("");
        System.out.println("Motoboy:");
        diretor.demitir(motoboy);
        System.out.println("");
        System.out.println("Diretor:");
        diretor.admitir(gerente);
    }
