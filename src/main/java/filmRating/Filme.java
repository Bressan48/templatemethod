package filmRating;

public abstract class Filme {

    private int filmId;
    protected String nome;
    private float notaProfissionais;
    private float notaPublico;

    public int getMatricula() {
        return filmId;
    }

    public void setMatricula(int filmId) {
        this.filmId = filmId;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getNotaProfissionais() {
        return notaProfissionais;
    }

    public void setNotaProfissionais(float notaProfissionais) {
        this.notaProfissionais = notaProfissionais;
    }

    public float setNotaPublico() {
        return notaPublico;
    }

    public void setNotaPublico(float notaPublico) {
        this.notaPublico = notaPublico;
    }

    public float calcularMedia() {
        return (this.notaProfissionais + this.notaPublico) / 2;
    }

    public abstract String verificarAvaliacao();

    public String getTipo() {
        return "FilmeClassico";
    }

    public String getInfo() {
        return getTipo() + "{" +
                "filmId=" + this.filmId +
                ", nome='" + this.nome + '\'' +
                ", resultado=" + this.verificarAvaliacao() +
                '}';
    }

}
