package filmRating;

public class FilmeTerror extends Filme{

    public String verificarAvaliacao() {
        if (this.calcularMedia() >= 6.0f) {
            return "Bem-avaliado";
        }
        else {
            return "Mal-avaliado";
        }
    }

    @Override
    public String getTipo() {
        return "FilmeTerror";
    }

}
