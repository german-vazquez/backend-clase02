package mesas;

public class MenuVegetariano extends MenuClasico{
    private Integer especias;
    private Integer salsas;

    public MenuVegetariano(Double precioBase, Integer especias, Integer salsas) {
        super(precioBase);
        this.especias = especias;
        this.salsas = salsas;
    }



    public Integer getEspecias() {
        return especias;
    }

    public void setEspecias(Integer especias) {
        this.especias = especias;
    }

    public Integer getSalsas() {
        return salsas;
    }

    public void setSalsas(Integer salsas) {
        this.salsas = salsas;
    }
}
