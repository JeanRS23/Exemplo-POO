package br.senai.sp.jandira.model;

import java.util.Scanner;

public class Torcedor extends Pessoas{

    Scanner scanner = new Scanner(System.in);

    public void comemorar(){
        System.out.println("Vamos time!!");
    }

    public void cadastrarTorcedor(){

        System.out.println("Informe o nome: ");
        super.setNome(scanner.nextLine());
        System.out.println("Informe a idade: ");
    }
}
