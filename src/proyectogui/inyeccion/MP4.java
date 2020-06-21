/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectogui.inyeccion;

/**
 *
 * @author alfon
 */
public class MP4 implements iMedio{

    @Override
    public void beginplay() {
        System.out.println("Inicia tocar MP4"); 
    }

    @Override
    public void stopplay() {
        System.out.println("Detiene tocar MP4"); 
    }
    
}
