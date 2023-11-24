/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services.Auth;

import java.util.logging.Logger;
import auth.Permisos;
import Models.PermisosModel;

/**
 *
 * @author Usuario
 */
public class PermisosService {
    private Permisos permisosData;
    public PermisosService(String userBD, String passDB, String hostDB, String portDB, String dataBase){
        permisosData = new Permisos(userBD, passDB, hostDB, portDB, dataBase);
    }
    
    public void RegistrarPermisos(PermisosModel permisos){
        validarDatos(permisos);
        permisosData.registrarPermisos(permisos);
    }
    
    private void validarDatos(PermisosModel permisos){
        try {
            if(permisos.usuario == null){
                new Exception("El modelo de permisos se encuentra vacìo");
            }
        } catch (Exception e) {
            return;
        }
    }
}
