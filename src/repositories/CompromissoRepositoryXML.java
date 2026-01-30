package repositories;

import entities.Compromisso;
import interfaces.CompromissoRepository;

import java.io.PrintWriter;

public class CompromissoRepositoryXML implements CompromissoRepository {


    @Override
    public void exportar(Compromisso compromisso) throws Exception {

        // Criando um arquivo de extensão XML
        var printWriter = new PrintWriter("compromisso_" + compromisso.getId() + ".xml");

        // Escrever o cabeçalho do arquivo XML
        printWriter.write("<?xml version='1.0' encoding='UTF-8'?>");

        // Montando a estrutura de TAGS do XML
        printWriter.write("<compromisso>");
            printWriter.write("<id>" + compromisso.getId() + "</id>");
            printWriter.write("<titulo>" + compromisso.getTitulo() + "</titulo>");
            printWriter.write("<data>" + compromisso.getData() + "</data>");
            printWriter.write("<hora>" + compromisso.getHora() + "</hora>");
            printWriter.write("<prioridade>" + compromisso.getPrioridade() + "</prioridade>");
                printWriter.write("<participantes>");
                    for(var participante : compromisso.getParticipantes()){
                        printWriter.write("<participante>");
                            printWriter.write("<id>" + participante.getId() + "</id>");
                            printWriter.write("<nome>" + participante.getNome() +"</nome>");
                        printWriter.write("</participante>");
                    }
                printWriter.write("</participantes>");
        printWriter.write("</compromisso>");

        // Fechando o arquivo
        printWriter.close();
    }
}
