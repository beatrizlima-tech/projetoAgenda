package interfaces;

import entities.Compromisso;

public interface CompromissoRepository {

    /*
        Método para exportar compromissos
        (Método abstrato)
     */
    void exportar(Compromisso compromisso) throws Exception;


}
