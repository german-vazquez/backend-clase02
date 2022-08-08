package mesas;

public class EmpleadoVegetariano extends Empleado{

    @Override
    protected String armarMenu(MenuClasico menu) {
        return "Menú vegetariano. ";
    }

    @Override
    protected Double calcularPrecio(MenuClasico menu) {
        Double respuesta=0.0;
        if (menu instanceof MenuVegetariano){
            MenuVegetariano veg = (MenuVegetariano) menu;
            respuesta = veg.getPrecioBase()+(2* veg.getSalsas())+((veg.getPrecioBase()*0.01)*veg.getEspecias());
        }
        return respuesta;
    }

    @Override
    protected String detalle(MenuClasico menu) {
        String respuesta="";
        if (menu instanceof MenuVegetariano){
            MenuVegetariano veg = (MenuVegetariano) menu;
            respuesta = "Descripción: es un menú vegetariano con el adicional de "+ veg.getEspecias()+" especias y "+veg.getSalsas()+" salsas. ";
        }
        return respuesta;
    }


}
