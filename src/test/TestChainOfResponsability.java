import org.example.*;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestChainOfResponsability {

    @Test
    public void testCadeiaDeResponsabilidade() {
        Cliente infoPessoal = new InfoPessoal(null);
        Cliente infoEmpresa = new InfoEmpresa(infoPessoal);

        String resultado = infoEmpresa.processarCadeia("dados_iniciais");

        assertNotNull(resultado, "O resultado da cadeia não deve ser nulo.");
        assertEquals("<infoPessoal>xxxxx</infoPessoal>", resultado,
                "O XML gerado pela InfoPessoal deve ser retornado.");

           }

    @Test
    public void testInfoEmpresaGerarXML() {
        Cliente infoEmpresa = new InfoEmpresa(null);

        String xmlGerado = ((InfoEmpresa) infoEmpresa).gerarXML("dados");

        assertEquals("<infoEmpresa>xxxxx</infoEmpresa>", xmlGerado,
                "O XML gerado pela InfoEmpresa deve corresponder ao esperado.");
    }

    @Test
    public void testInfoPessoalGerarXML() {
        Cliente infoPessoal = new InfoPessoal(null);

        String xmlGerado = ((InfoPessoal) infoPessoal).gerarXML("dados");

        assertEquals("<infoPessoal>xxxxx</infoPessoal>", xmlGerado,
                "O XML gerado pela InfoPessoal deve corresponder ao esperado.");
    }
}
