
package com.mycompany.ventaautomoviles.persistencia;

import com.mycompany.ventaautomoviles.logica.Atomovil;




public class ControladorPersistencia {
    
    AtomovilJpaController autoJpa = new AtomovilJpaController();

    public void guardar(Atomovil automovil) {
        autoJpa.create(automovil);
    }
    
    
}
