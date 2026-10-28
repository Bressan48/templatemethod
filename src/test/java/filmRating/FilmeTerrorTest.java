package filmRating;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FilmeTerrorTest {

    @Test
    void deveRetonarAprovado() {
        FilmeTerror filme = new FilmeTerror();
        filme.setNotaProfissionais(6.0f);
        filme.setNotaPublico(6.0f);
        assertEquals("Bem-avaliado", filme.verificarAvaliacao());
    }

    @Test
    void deveRetonarReprovado() {
        FilmeTerror filme = new FilmeTerror();
        filme.setNotaProfissionais(6.0f);
        filme.setNotaPublico(5.9f);
        assertEquals("Mal-avaliado", filme.verificarAvaliacao());
    }

    @Test
    void deveRetornarInformacoes() {
        FilmeTerror filme = new FilmeTerror();
        filme.setNotaProfissionais(6.0f);
        filme.setNotaPublico(5.9f);
        filme.setNome("Todo Mundo em Pânico");
        filme.setMatricula(2);
        assertEquals("FilmeTerror{filmId=2, nome='Todo Mundo em Pânico', resultado=Mal-avaliado}", filme.getInfo());
    }

}
