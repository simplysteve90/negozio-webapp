package it.dstech.gestioneprodotti;

public class Prodotto {
	private String nome;
	private String descrizione;
	private long qta;
	private double prezzo;
	
	
	public Prodotto(String nome, String descrizione, long qta, double prezzo) {
		super();
		this.nome = nome;
		this.descrizione = descrizione;
		this.qta = qta;
		this.prezzo = prezzo;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getDescrizione() {
		return descrizione;
	}


	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}


	public long getQta() {
		return qta;
	}


	public void setQta(long qta) {
		this.qta = qta;
	}


	public double getPrezzo() {
		return prezzo;
	}


	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}


	@Override
	public String toString() {
		return "Prodotto [nome=" + nome + ", descrizione=" + descrizione + ", qta=" + qta + ", prezzo=" + prezzo + "]";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((descrizione == null) ? 0 : descrizione.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		long temp;
		temp = Double.doubleToLongBits(prezzo);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + (int) (qta ^ (qta >>> 32));
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
		Prodotto other = (Prodotto) obj;
		if (descrizione == null) {
			if (other.descrizione != null)
				return false;
		} else if (!descrizione.equals(other.descrizione))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (Double.doubleToLongBits(prezzo) != Double.doubleToLongBits(other.prezzo))
			return false;
		if (qta != other.qta)
			return false;
		return true;
	}
	
	
	
	
}