package it.dstech.gestioneutenti;

import java.util.ArrayList;
import java.util.List;

public class Utente {
	private  String nome;
	private List<Scontrino> scontriniUtente;
	public Utente(String nome) {
		this.nome = nome;
		this.scontriniUtente= new ArrayList<Scontrino>();
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public List<Scontrino> getScontriniUtente() {
		return scontriniUtente;
	}
	public void setScontriniUtente(List<Scontrino> scontriniUtente) {
		this.scontriniUtente = scontriniUtente;
	}
	@Override
	public String toString() {
		return "Utente [nome=" + nome + ", scontriniUtente=" + scontriniUtente + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((scontriniUtente == null) ? 0 : scontriniUtente.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Utente other = (Utente) obj;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (scontriniUtente == null) {
			if (other.scontriniUtente != null)
				return false;
		} else if (!scontriniUtente.equals(other.scontriniUtente))
			return false;
		return true;
	}

}
