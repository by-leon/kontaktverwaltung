
/**
 * Beschreiben Sie hier die Klasse kontakte.
 * 
 * @author Leon, Wibke, Tom
 * @version 30.11.20
 */
public class Kontakt  
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    private String vorname;
    private String nachname;
    private String adresse;
    
    /**
     * Konstruktor für Objekte der Klasse Kontakte
     */
    public Kontakt(String vorname, String nachname, String adresse)
    {
        // Instanzvariable initialisieren
        this.vorname = vorname;
        this.nachname = nachname;
        this.adresse = adresse;
    }
    
    public String gibVorname()
    {
        return this.vorname;
    }
    
    public String gibNachname()
    {
        return this.nachname;
    }
    
    public String gibAdresse()
    {
        return this.adresse;
    }
}
