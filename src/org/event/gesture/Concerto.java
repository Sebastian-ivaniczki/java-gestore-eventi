package org.event.gesture;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;

public class Concerto extends Event{
	private LocalTime ora;
	private BigDecimal prezzo;
	public Concerto(String titolo, LocalDate data, LocalTime ora, BigDecimal prezzo) throws Exception {
		super(titolo, data);
		setOra(ora);
		setPrezzo(prezzo);
	}
	public LocalTime getOra() {
		return ora;
	}
	public void setOra(LocalTime ora) {
		this.ora = ora;
	}
	public BigDecimal getPrezzo() {
		return prezzo;
	}
	public void setPrezzo(BigDecimal prezzo) {
		this.prezzo = prezzo;
	}
	
	public String formatPrezzo() {
		return String.format("%.2f", getPrezzo()); 
	}

	@Override
    public String toString() {
        return " l'evento del "+ getData().toString() + " alle ore " +getOra() +" \nevento; " + getTitolo() + " costo" + formatPrezzo()+"€" + " \nposti prenotati: " + getPostiPrenotati()+ " su: "+getPostiTotali();
    }
	
}
