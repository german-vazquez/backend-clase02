package mesas;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmpleadoTest {
    @Test
    public void pedidoVeggie(){
        Empleado empleado = new EmpleadoVegetariano();
        MenuClasico menu = new MenuVegetariano(200.0, 2, 3);
        String espectativa ="Menú vegetariano. Descripción: es un menú vegetariano con el adicional de 2 especias y 3 salsas. Precio final: 210.0";
        String realidad = empleado.hacerPedido(menu);
        assertEquals(espectativa,realidad);
    }

    @Test
    public void pedidoClasico(){
        Empleado empleado= new EmpleadoClasico();
        MenuClasico menu = new MenuClasico(200.0);
        String espectativa ="Menú clásico. Descripción: es un menú clásico sin agregados. Precio final: 200.0";
        String realidad = empleado.hacerPedido(menu);
        assertEquals(espectativa,realidad);
    }

    @Test
    public void pedidoInfantil(){
        Empleado empleado= new EmpleadoInfantil();
        MenuClasico menu = new MenuInfantil(200.0, 2);
        String espectativa ="Menú infantil. Descripción: es un menú infantil con 2 juguetes incluidos. Precio final: 206.0";
        String realidad = empleado.hacerPedido(menu);
        assertEquals(espectativa,realidad);
    }

}