package org.example;

public class ServiceCreate implements IService {
    public String executar() {
        return "Linha criada";
    }

    public String cancelar() {
        return "Operacao de criar linha cancelada";
    }
}
