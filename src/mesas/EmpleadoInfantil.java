package mesas;

public class EmpleadoInfantil extends Empleado{

    @Override
    protected String armarMenu(MenuClasico menu) {
        return "Menú infantil. ";
    }

    @Override
    protected Double calcularPrecio(MenuClasico menu) {
        Double respuesta = 0.0;
        if(menu instanceof MenuInfantil){
            MenuInfantil infantil = (MenuInfantil) menu;
            respuesta = infantil.getPrecioBase()+(3* infantil.getJuguetes());
        }
        return respuesta;
    }

    @Override
    protected String detalle(MenuClasico menu) {
        String respuesta ="";
        if(menu instanceof MenuInfantil){
            MenuInfantil infantil = (MenuInfantil) menu;
            respuesta = "Descripción: es un menú infantil con " + infantil.getJuguetes() + " juguetes incluidos. ";
        }
        return respuesta;
    }

}
