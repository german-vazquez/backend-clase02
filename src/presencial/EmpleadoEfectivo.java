package presencial;

public class EmpleadoEfectivo extends Empleado{
    private Double sueldoBase;
    private Double descuentos;
    private Double premios;

    public EmpleadoEfectivo(String nombre, String apellido, String numeroDeCuenta, Double sueldoBase, Double descuentos, Double premios) {
        super(nombre, apellido, numeroDeCuenta);
        this.sueldoBase = sueldoBase;
        this.descuentos = descuentos;
        this.premios = premios;
    }

    public Double getSueldoBase() {
        return sueldoBase;
    }

    public void setSueldoBase(Double sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

    public Double getDescuentos() {
        return descuentos;
    }

    public void setDescuentos(Double descuentos) {
        this.descuentos = descuentos;
    }

    public Double getPremios() {
        return premios;
    }

    public void setPremios(Double premios) {
        this.premios = premios;
    }
}
