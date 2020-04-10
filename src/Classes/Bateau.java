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
public class Bateau extends MoyenDeTransportSurEau implements AUnIdentifiant{
    private String nom;
    private String portAttache;
    private int tonnage;
    private int longueur;
    private String pavillon;
    
    public Bateau()
    {
        try 
        {
            setNom("b0");
            setPortAttache("pa0");
            setTonnage(0);
            setLongueur(0);
            setPavillon("inconnu");
        } 
        catch (ShipWithoutIdentificationException e) 
        {
            System.out.println(e.getMessage());
        }
        
    }
    
    public Bateau(String name, String port, int tonnes, int lg, String nationalite)
    {
        try 
        {
            setNom(name);
            setPortAttache(port);
            setTonnage(tonnes);
            setLongueur(lg);
            setPavillon(nationalite);
        } 
        catch (ShipWithoutIdentificationException e) 
        {
            System.out.println(e.getMessage());
        }
        
    }
    
    public Bateau(Bateau b)
    {
        this.nom = b.getNom();
        this.portAttache = b.getPortAttache();
        this.tonnage = b.getTonnage();
        this.longueur = b.getLongueur();
        this.pavillon = b.getPavillon();
        
    }
     
    public final void setNom(String name)throws ShipWithoutIdentificationException
    {
        if (name == null)
            throw new ShipWithoutIdentificationException("Nom manquant !"); 
        else
            nom = name;
    }
    
    public final void setPortAttache(String port)throws ShipWithoutIdentificationException
    {
        if (portAttache == null)
            throw new ShipWithoutIdentificationException("Port d'attache manquant !");
        else
            portAttache = port;
    }
    
    public final void setTonnage(int tonnes)
    {
        tonnage = tonnes;
    }
    
    public final void setLongueur(int lg)
    {
        longueur = lg;
    }
    public final void setPavillon(String nationalite)
    {
        pavillon = nationalite;
    }
     
    public String getNom()
    {
        return nom;
    }
    
    public String getPortAttache()
    {
        return portAttache;
    }
    
    public int getTonnage()
    {
        return tonnage;
    }
    
    public int getLongueur()
    {
        return longueur;
    }
    
    public String getPavillon()
    {
        return pavillon;
    }
    
    public void Affiche()
    {
        System.out.println("Bateau: " + getNom()+ " - " + getPortAttache()+ " - " + getTonnage()+ " - " + getLongueur()+ " - "+ getPavillon());
    }
    
    @Override
    public String getIdentifiant()
    {
        return nom + portAttache;
    }
    
    @Override
    public int getNombreHumains()
    {
        return 0;
    }

    
}
