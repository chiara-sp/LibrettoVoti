package it.polito.tdp.librettovoti.model;

import java.util.*;

public class Libretto {
	
	private List<Voto> voti;
	private Map<String,Voto> votiMap; //identity map
	
	public Libretto(){
		this.voti= new ArrayList<Voto>();
		this.votiMap= new HashMap<String,Voto>();
	}
	public void add( Voto voto) {
		voti.add(voto);
		votiMap.put(voto.getNome(), voto);
	
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
	
	public Libretto votiUguali(int punteggio) {
		Libretto risultato = new Libretto();
		for(Voto v: this.voti) {
			if(v.getVoto()==punteggio)
				risultato.add(v);
		}
		return risultato;
	}
	/**
	 * Ricercz un voto del corso di cui è specificato il nome 
	 * se il corso non esiste, resistuisce null
	 * @param nomeCorso
	 * @return
	 */
	public Voto ricercaCorso(String nomeCorso) {
	/*	Voto risultato= null;
		for(Voto v: this.voti) {
			if(v.getNome().equals(nomeCorso))
				risultato=v;
			break;
		}
		return risultato*/
		return this.votiMap.get(nomeCorso);
	}
	 
	/**
	 * verifica se nel libretto c'è già un voto con lo stesso esame e la stessa votazione 
	 * @param v
	 * @return
	 */
	public boolean esisteDuplicato(Voto v) {
		/*boolean trovato= false;
		for(Voto voto: this.voti) {
			if(voto.getNome().equals(v.getNome())&& voto.getVoto()==v.getVoto())
				trovato=true;
			break;
		}
		return trovato;*/
		
		Voto trovato = this.votiMap.get(v.getNome()) ;
		if(trovato==null)
			return false ;
		if(trovato.getVoto()==v.getVoto()) 
			return true;
		else
			return false ;
	}
	/**
	 * verifica se nel libretto c'è già uj voto della stesso esame con votazione diversa
	 * @param v
	 * @return
	 */
	public boolean esisteConflitto(Voto v) {
	/*	boolean trovato= false;
		for(Voto voto: this.voti) {
			if(voto.getNome().equals(v.getNome())&& voto.getVoto()!=v.getVoto())
				trovato=true;
			break;
		}
		return trovato;*/
		Voto trovato = this.votiMap.get(v.getNome()) ;
		if(trovato==null)
			return false ;
		if(trovato.getVoto()!=v.getVoto()) 
			return true;
		else
			return false ;
	}
	
	public String toString() {
		String s="";
		for(Voto v:this.voti) {
			s+= v.toString()+ "\n";
		}
		return s;
	}
	

}
