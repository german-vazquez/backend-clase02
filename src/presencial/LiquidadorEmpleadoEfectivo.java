package presencial;

public class LiquidadorEmpleadoEfectivo extends Liquidador{

    @Override
    protected Double calcularSueldo(Empleado empleado) {
        Double respuesta=0.0;
        //casteo seguro
        if(empleado instanceof EmpleadoEfectivo){
            //con casteo
            EmpleadoEfectivo emp=(EmpleadoEfectivo) empleado;
            respuesta=emp.getSueldoBase()+emp.getPremios()-emp.getDescuentos();

            //sin casteo
            //respuesta=((EmpleadoEfectivo)empleado).getSueldoBase()+((EmpleadoEfectivo)empleado).getPremios()-((EmpleadoEfectivo)empleado).getDescuentos();
        }
         return respuesta;
    }

    @Override
    protected String emitirRecibo(Empleado empleado) {
        return "La liquidación generada es un documento escrito.";
    }
}
