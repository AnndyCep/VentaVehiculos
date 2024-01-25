
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

    public void borrarVehiculo(int valor_id) {
        controlPersis.borrarVehiclo(valor_id);
    }

    public Atomovil traerVehiculo(int valor_id) {
        return controlPersis.traerVehiculo(valor_id);
    }

    public void actualizarVehiculo(Atomovil auto, String modelo, String marca, String motor, String color, 
            String placa, String can_puertas) {
        
        auto.setModelo(modelo);
        auto.setMarca(marca);
        auto.setMotor(motor);
        auto.setPlaca(placa);
        auto.setColor(color);
        auto.setCantidad_puertas(can_puertas);
        
        controlPersis.actualizarVehiculo(auto);
        
    }
    
}
