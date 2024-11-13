package dominio;

public abstract class BaseAtributo {
    protected int codigo;
    protected String descricao;

    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public BaseAtributo(){}

    public BaseAtributo(int cod, String desc){
        this.codigo = cod;
        this.descricao = desc;
    }
    
}
