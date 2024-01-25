
package com.mycompany.ventaautomoviles.logica;

import com.mycompany.ventaautomoviles.persistencia.ControladorPersistencia;
import java.util.List;


public class ControladorLogica {
    ControladorPersistencia controlPersis = new ControladorPersistencia();
    
    
    public List<Atomovil> traerVehiculos() {
        return controlPersis.mostrarVehiculos();
    }
    
    
    

    public void guardar(String modelo, String marca, String motor, String color, String placa, String can_puertas) {
        
        //creamos el objeto auto
        Atomovil automovil = new Atomovil();
        //seteamos los valores al objeto
        automovil.setModelo(modelo);
        automovil.setMarca(marca);
        automovil.setMotor(motor);
        automovil.setColor(color);
        automovil.setPlaca(placa);
        automovil.setCantidad_puertas(can_puertas);
        
        controlPersis.guardar(automovil);
        
    }
    
}
