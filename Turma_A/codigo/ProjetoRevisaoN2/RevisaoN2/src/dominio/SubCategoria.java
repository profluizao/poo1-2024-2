package dominio;

public class SubCategoria extends BaseAtributo{
    private int codigoCategoria;

    public int getCodigoCategoria() {
        return codigoCategoria;
    }

    public void setCodigoCategoria(int codigoCategoria) {
        this.codigoCategoria = codigoCategoria;
    }

    public SubCategoria(){
        super();
    }

    public SubCategoria(int cod, String desc, int codCategoria){
        super(cod, desc);
        this.codigoCategoria = codCategoria;
    }

}
