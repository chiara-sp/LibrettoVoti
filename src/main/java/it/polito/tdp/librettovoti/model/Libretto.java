package it.polito.tdp.librettovoti.model;

import java.util.*;

public class Libretto {
	
	private List<Voto> voti;
	
	public Libretto(){
		this.voti= new ArrayList<Voto>();
	}
	public void add( Voto voto) {
		voti.add(voto);
	
	}
	/*
	public void stampaVotiUguali(int punteggio) {
		// il libretto stampa solo i voti uguali 
		System.out.println();
	}
	public String votiUguali(int punteggio) {
		//calcola una stringa che contiene i voti 
		// sarà poi il chimante a stamparli
		
	}*/
	public List<Voto> listaVotiUguali(int punteggio){
		//restituisce i voti uguali al criterio
		ArrayList<Voto> risultato= new ArrayList<Voto>();
		for(Voto v: this.voti) {
			if(v.getVoto()==punteggio)
				risultato.add(v);
		}
		return risultato;
	}
	
	public Libretto votiUguali3(int punteggio) {
		Libretto risultato = new Libretto();
		for(Voto v: this.voti) {
			if(v.getVoto()==punteggio)
				risultato.add(v);
		}
		return risultato;
	}
	
	public String toString() {
		String s="";
		for(Voto v:this.voti) {
			s+= v.toString()+ "\n";
		}
		return s;
	}
	

}
