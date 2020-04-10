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
abstract class MoyenDeTransportSurEau extends MoyenDeTransport{
    private boolean submersible;
    
    public void setSubmersible(boolean sub)
    {
        submersible = sub;
    }
    public boolean getSubmersible()
    {
        return submersible;
    }
    
}
