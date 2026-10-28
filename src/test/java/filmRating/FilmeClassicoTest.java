package filmRating;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FilmeClassicoTest {

    @Test
    void deveRetonarAprovado() {
        FilmeClassico filme = new FilmeClassico();
        filme.setNotaProfissionais(7.0f);
        filme.setNotaPublico(7.0f);
        assertEquals("Bem-avaliado", filme.verificarAvaliacao());
    }

    @Test
    void deveRetonarReprovado() {
        FilmeClassico filme = new FilmeClassico();
        filme.setNotaProfissionais(6.0f);
        filme.setNotaPublico(5.9f);
        assertEquals("Mal-avaliado", filme.verificarAvaliacao());
    }

    @Test
    void deveRetornarInformacoes() {
        FilmeClassico filme = new FilmeClassico();
        filme.setNotaProfissionais(6.0f);
        filme.setNotaPublico(5.9f);
        filme.setNome("Titanic");
        filme.setMatricula(2);
        assertEquals("FilmeClassico{filmId=2, nome='Titanic', resultado=Mal-avaliado}", filme.getInfo());
    }

}
