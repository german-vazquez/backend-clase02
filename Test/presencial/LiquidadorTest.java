package presencial;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LiquidadorTest {
    @Test
    public void emitirReciboParaEmpleadoEfectivo(){
        Liquidador liquidador = new LiquidadorEmpleadoEfectivo();
        Empleado empleado= new EmpleadoEfectivo("cosme","fulanito","CA58488484", 400.0, 40.0,60.0 );
        String respEsperada = "La liquidación generada es un documento escrito. Saldo a liquidar: 420.0";
        String respActual = liquidador.liquidarSueldo(empleado);
        assertEquals(respEsperada, respActual);
    }

}