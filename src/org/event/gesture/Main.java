package org.event.gesture;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
			Concerto evento = null;
		 try {
	           
	            

	             evento = new Concerto("Liga bue", LocalDate.of(2023, 6, 1), LocalTime.of(13, 30), new BigDecimal("123.12"));
	            System.out.println("Evento creato con successo!" + evento.toString());
		  } catch (Exception e) {
	            System.out.println("Si è verificato un'errore: " + e.getMessage());
	        }
		 
		 System.out.println("\n----------------------------------\n");
		 	
		 System.out.println("vuoi evettuare una prentazione per l'evento " + evento.getTitolo() + "? 1=si 2=no");
		 
		 int risposta = sc.nextInt();
		 boolean cond = true;
		 while(cond) {
			 if(risposta <1 || risposta > 2) {
				 System.out.println("devi scegliere fra 1 e 2");
				 risposta = sc.nextInt();
				 continue;
			 }else {
				 cond = false;
			 }
			 
		 }
		 int prenotazioni = 0;
			 
		 if(risposta == 1) {
				 System.out.println("quante prenotazioni vuoi effettuare?");
				 prenotazioni = sc.nextInt();
				 try {
					 
					 evento.prenota(prenotazioni);
					 System.out.println("prenotazione avvenuta con successo per: " + evento.toString());
				 }catch (Exception e) {
			            System.out.println("Si è verificato un'errore: " + e.getMessage());
			            return;
			           
			        }
			 }else {
				 System.out.println("hasta la vista");
				
			 }
		 
		 System.out.println("\n----------------------------------\n");
		 
		 System.out.println("vuoi disdirre la tua prenotazione? dicita 1 per si 2 per no");
		 
		 int disdici = sc.nextInt();
		 boolean cond2 = true;
			 
		 while(cond2) {
			 if(disdici <1 || disdici > 2) {
				 System.out.println("devi scegliere fra 1 e 2");
				 disdici = sc.nextInt();
				 continue;
			 }else {
				 cond2 = false;
			 }
			 
		 }
		 
		 if(disdici == 1) {
			 System.out.println("quante prenotazzioni vuoi disdirre? ");
			 int val = sc.nextInt();
			 
			 
				 try {
					 
					 evento.disdici(val);
					 System.out.println("disdetta avvenuta con successo per: " + evento.toString());
				 }catch (Exception e) {
			            System.out.println("Si è verificato un'errore: " + e.getMessage());
			            return;
			        }finally{
			        	sc.close();
			        }
			 }
		 
		 
	}
}
