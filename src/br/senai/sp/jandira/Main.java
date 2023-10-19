package br.senai.sp.jandira;

import br.senai.sp.jandira.model.Jogador;
import br.senai.sp.jandira.model.Pessoas;
import br.senai.sp.jandira.model.Torcedor;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Pessoas jogador = new Jogador();
        jogador.exibirInformacoes();
        jogador.comemorar();

        Pessoas torcedor = new Torcedor();
        torcedor.exibirInformacoes();
        torcedor.comemorar();

    }
}
