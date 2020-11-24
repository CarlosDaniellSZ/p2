package Dominio;

public class Aluno {

    private Integer id;
    private Integer nome;
    private String rgm;

    public Integer getNome() {
        return nome;
    }

    public void setNome(Integer nome) {
        this.nome = nome;
    }

    public String getRgm() {
        return rgm;
    }

    public void setRgm(String rgm) {
        this.rgm = rgm;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    @Override
    public String toString() {
        return
                "Nome:\n" + nome +
                        ", RGM:\n" + rgm +
                        "";
    }
}
