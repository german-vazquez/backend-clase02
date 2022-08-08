package mesas;

public class EmpleadoClasico extends Empleado{

    @Override
    protected String armarMenu(MenuClasico menu) {
        return "Menú clásico. ";
    }

    @Override
    protected Double calcularPrecio(MenuClasico menu) {
        Double respuesta = 0.0;
        if (menu instanceof MenuClasico){
            MenuClasico clasico = (MenuClasico) menu;
            respuesta = clasico.getPrecioBase();
        }
        return respuesta;
    }

    @Override
    protected String detalle(MenuClasico menu) {
        return "Descripción: es un menú clásico sin agregados. ";
    }

}
