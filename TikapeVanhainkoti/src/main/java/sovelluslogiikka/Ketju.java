
package sovelluslogiikka;

import java.time.LocalDateTime;


public class Ketju {
    private final int id;
    private final int alueId;
    private final LocalDateTime viimeisinPvm;
    private final String nimi;
    private final String alueNimi;
    private int viestienMaara;

    public Ketju(int id, int alueId, LocalDateTime viimeisinPvm, String nimi, String alueNimi, int viestienMaara) {
        this.alueId = alueId;
        this.id = id;
        this.nimi = nimi;
        this.viimeisinPvm = viimeisinPvm;
        this.alueNimi = alueNimi;
        this.viestienMaara = viestienMaara;
    }

    public int getId() {
        return id;
    }

    public String getNimi() {
        return nimi;
    }

    public int getAlueId() {
        return alueId;
    }

    public String getAlueNimi() {
        return alueNimi;
    }

    public LocalDateTime getViimeisinPvm() {
        return viimeisinPvm;
    }

    public int getViestienMaara(){
        return viestienMaara;
    }
    
    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }
    
    

  
    
    
    
}
