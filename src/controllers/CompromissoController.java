package controllers;

import entities.Compromisso;
import entities.Participante;
import enums.Prioridade;
import interfaces.CompromissoRepository;
import repositories.CompromissoRepositoryTXT;
import repositories.CompromissoRepositoryXML;

import javax.swing.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.UUID;

public class CompromissoController {

    /*
        Método para realizar a exportação dos dados
     */

    public void gerarCompromisso(){

        try{

            // Criando um compromisso
            var compromisso = new Compromisso();

            compromisso.setId(UUID.randomUUID());
            compromisso.setTitulo("Aula de Java WebDeveloper - Formação Fullstack");
            compromisso.setData(LocalDate.now());
            compromisso.setHora(LocalTime.now());
            compromisso.setPrioridade(Prioridade.ALTA);

            // Criando os participantes
            var participante1 = new Participante();
            participante1.setId(UUID.randomUUID());
            participante1.setNome("Daniel Augusto");

            var participante2 = new Participante();
            participante2.setId(UUID.randomUUID());
            participante2.setNome("Matheus Magalhães");

            // Adicionando os participantes no compromisso
            compromisso.setParticipantes(new ArrayList<Participante>());
            compromisso.getParticipantes().add(participante1);
            compromisso.getParticipantes().add(participante2);

            // POLIMORFISMO
            CompromissoRepository repository;

            var opcao = JOptionPane.showInputDialog("Informe (1) TXT ou (2) XML: ");

            switch (opcao){
                case "1": repository = new CompromissoRepositoryTXT(); break;
                case "2": repository = new CompromissoRepositoryXML(); break;
                default:
                    System.out.println("\nOPÇÃO INVÁLIDA");
                    return;
            }

            // Exportar os dados
            repository.exportar(compromisso);

            System.out.println("\nCOMPROMISSO CADASTRADO COM SUCESSO!");

        }

        catch(Exception e) {
        System.out.println("\nErro: " + e.getMessage());
        }

    }

}
