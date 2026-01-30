package repositories;

import entities.Compromisso;
import interfaces.CompromissoRepository;

import java.io.PrintWriter;

public class CompromissoRepositoryTXT implements CompromissoRepository {

    @Override
    public void exportar(Compromisso compromisso) throws Exception {

        // Criando um arquivo
        var printWriter = new PrintWriter("compromisso_"+ compromisso.getId() + ".txt");

        // Escrevendo os dados dos compromissos
        printWriter.write("\n" + compromisso.getId());
        printWriter.write("\n" + compromisso.getTitulo());
        printWriter.write("\n" + compromisso.getData());
        printWriter.write("\n" + compromisso.getHora());
        printWriter.write("\n" + compromisso.getPrioridade());

        // Percorrer a lista de participantes do compromisso (FOREACH)
        for(var participante : compromisso.getParticipantes()){

            //Imprimir cada participante
            printWriter.write("\n\t" + participante.getId());
            printWriter.write("\n\t" + participante.getNome());
        }

        // fechar o arquivo
        printWriter.close();

    }
}
