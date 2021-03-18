package it.polito.tdp.librettovoti.model;

import java.time.LocalDate;
import java.util.List;

public class TestLibretto {

	public static void main(String[] args) {
		
		System.out.println("Test metodi libretto");

		Libretto libretto = new Libretto();
		Voto voto1 = new Voto("Analisi 1", 30, LocalDate.of(2019, 2, 15));
		libretto.add(voto1);
		libretto.add(new Voto("Fisica 1",28, LocalDate.of(2019,7, 15)));
		libretto.add(new Voto("Informatica",24, LocalDate.of(2019,1, 15)));
		libretto.add(new Voto("Chimica",25, LocalDate.of(2019,1, 15)));
		
		System.out.println(libretto);
		List<Voto> venticinque= libretto.listaVotiUguali(25);
		System.out.println(venticinque);
		
		Libretto libventicinque= libretto.votiUguali3(25);
		System.out.println(libventicinque);
		
		Voto analisi = libretto.ricercaCorso("Analisi 1");
		System.out.println(analisi);
		
		Voto chimica = libretto.ricercaCorso("Chimica");
		Voto chimicaDoppio = new Voto("Chimica", 25, LocalDate.of(2019,1, 15));
		Voto chimica_conflitto= new Voto("Chimica", 29, LocalDate.of(2019,1, 15));
		System.out.println(chimica + "doppione di "+ chimicaDoppio+ "? ->"+ libretto.esisteDuplicato(chimicaDoppio));
		
	}

}
