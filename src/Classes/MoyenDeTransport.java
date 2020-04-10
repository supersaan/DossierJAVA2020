/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 *
 * @author vange
 */
abstract class MoyenDeTransport implements AvecHumains{
    private String formeEnergie;
    
    public void setFormeEnergie(String energie)
    {
        formeEnergie = energie;
    }
    
    public String getFormeEnergie()
    {
        return formeEnergie;
    }
}
