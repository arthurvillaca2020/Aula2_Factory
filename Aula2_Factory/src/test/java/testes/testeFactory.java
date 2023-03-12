package testes;

import org.example.IService;
import org.example.SericeFactory;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class testeFactory {
    @Test
    void deveExecutarCriacao() {
        IService servico = SericeFactory.obterServico("Create");
        assertEquals("Linha criada", servico.executar());
    }

    @Test
    void deveExecutarDelecao() {
        try {
            IService servico = SericeFactory.obterServico("Delete");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Serviço inválido", e.getMessage());
        }
    }
}
