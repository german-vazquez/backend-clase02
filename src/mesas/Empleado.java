package mesas;

public abstract class Empleado {
    public String hacerPedido(MenuClasico menu){
        String respuesta ="";
        //armar menu
        String pedido = armarMenu(menu);
        //calcular su precio
        Double precio = calcularPrecio(menu);
        //solicitar detalle
        String descripcion = detalle(menu);
        respuesta = pedido + descripcion + "Precio final: " + precio;
        return respuesta;
    }

    protected abstract  String armarMenu (MenuClasico menu);
    protected abstract Double calcularPrecio (MenuClasico menu);
    protected abstract String detalle(MenuClasico menu);

}
