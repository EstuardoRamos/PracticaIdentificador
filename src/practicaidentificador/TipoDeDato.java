/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practicaidentificador;

/**
 * 
 * @author Estuardo Ramos
 */
public enum TipoDeDato {
    NUMERO("Es un numero"),
    ID("Es un ID"),
    CARACTER("Es un caracter");
    
    private String tipo;

    private TipoDeDato(String tipo) {
        this.tipo = tipo;
    }
    
    

}
