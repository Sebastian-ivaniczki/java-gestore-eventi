package org.event.gesture;

import java.time.LocalDate;

public class Event {
    private String titolo;
    private LocalDate data;
    private int postiTotali;
    public int postiPrenotati;

    public Event(String titolo, LocalDate data) throws Exception {
        if (data.isBefore(LocalDate.now())) {
            throw new IllegalArgumentException("La data dell'evento è già passata.");
        }


        setTitolo(titolo);
        setData(data);
        this.postiTotali = 100;
        this.postiPrenotati = 0;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) throws Exception {
        if (data.isBefore(LocalDate.now())) {
            throw new Exception("La data dell'evento è già passata.");
        }

        this.data = data;
    }

    public int getPostiTotali() {
        return postiTotali;
    }
    
    public int getPostiPrenotati() {
        return postiPrenotati;
    }

    public void prenota(int postiPrenotati) throws Exception {
       
    	
    	if (postiPrenotati >= postiTotali) {
            throw new Exception("Non ci sono posti disponibili per l'evento.");
        }
    	
        this.postiPrenotati= postiPrenotati;
        
        
    }

    public void disdici(int postiPrenotati) throws Exception {

        if (postiPrenotati <= 0) {
            throw new Exception("Non ci sono prenotazioni per l'evento.");
        }

        this.postiPrenotati = this.postiPrenotati - postiPrenotati;
    }

    @Override
    public String toString() {
        return data.toString() + " - " + titolo + " posti prenotati: " + getPostiPrenotati()+ " su: "+getPostiTotali();
    }
}
