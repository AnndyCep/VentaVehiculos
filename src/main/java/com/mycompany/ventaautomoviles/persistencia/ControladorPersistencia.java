
package com.mycompany.ventaautomoviles.persistencia;

import com.mycompany.ventaautomoviles.logica.Atomovil;
import com.mycompany.ventaautomoviles.persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;




public class ControladorPersistencia {
    
    AtomovilJpaController autoJpa = new AtomovilJpaController();

    public void guardar(Atomovil automovil) {
        autoJpa.create(automovil);
    }

    public List<Atomovil> mostrarVehiculos() {
        return autoJpa.findAtomovilEntities();
    }

    public void borrarVehiclo(int valor_id) {
        try {
            autoJpa.destroy(valor_id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladorPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
}
