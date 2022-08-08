package mesas;

public class MenuInfantil extends MenuClasico{
    private Integer juguetes;

    public MenuInfantil(Double precioBase, Integer juguetes) {
        super(precioBase);
        this.juguetes = juguetes;
    }



    public Integer getJuguetes() {
        return juguetes;
    }

    public void setJuguetes(Integer juguetes) {
        this.juguetes = juguetes;
    }
}
