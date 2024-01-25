
package com.mycompany.ventaautomoviles.persistencia;

import com.mycompany.ventaautomoviles.logica.Atomovil;
import java.util.List;




public class ControladorPersistencia {
    
    AtomovilJpaController autoJpa = new AtomovilJpaController();

    public void guardar(Atomovil automovil) {
        autoJpa.create(automovil);
    }

    public List<Atomovil> mostrarVehiculos() {
        return autoJpa.findAtomovilEntities();
    }
    
    
}
