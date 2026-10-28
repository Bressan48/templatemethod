package filmRating;

public class FilmeClassico extends Filme {

    public String verificarAvaliacao() {
        if (this.calcularMedia() >= 7.0f) {
            return "Bem-avaliado";
        }
        else {
            return "Mal-avaliado";
        }
    }
}
