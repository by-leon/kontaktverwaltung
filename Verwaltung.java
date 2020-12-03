
/**
 * @author 
 * @version 
 */
public class Verwaltung
{
    private List <Kontakt> verwaltung;

    /**
     * Konstruktor für Objekte der Klasse Kontakte
     */
    public Verwaltung()
    {
        // Instanzvariable initialisieren
        verwaltung = new List<Kontakt>();
    }
    
    /**
     * Diese Methode gibt eine Liste zurück, die alle Kontakte enthält,
     * die den übergebenen Namen tragen.
     * 
     * @param name nach dem gesucht wird
     * 
     * @return Liste mit Kontakte
     */
    public List <Kontakt> namenstagsliste (String name)
    {
        List <Kontakt> ergebnisliste = new List<Kontakt>();
        // Hier die Lösung implementieren
        return ergebnisliste;
    }
    
    /**
     * Diese Methode legt eine neues Kontakte mit dem übergebenen namen an
     * und hängt es an die Liste verwaltung an.
     * 
     * @param name
     */
    public void neuesKontakte(Kontakt k)
    {
        verwaltung.append(k);
    }
}
