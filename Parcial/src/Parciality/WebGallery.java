/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Parciality;

import java.util.ArrayList;

/**
 *
 * @author Estudiante
 */
public class WebGallery {
    private ArrayList<Usuario> usuarios;

    public WebGallery() {
        this.usuarios = new ArrayList<>();
    }
    
    public void añadirUsuario(Usuario u){
        this.usuarios.add(u);
    }
    
}
