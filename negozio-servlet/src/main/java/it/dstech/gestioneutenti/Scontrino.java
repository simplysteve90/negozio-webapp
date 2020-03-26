package it.dstech.gestioneutenti;

public class Scontrino {
	private int numeroScontrino;

	public Scontrino(int numeroScontrino) {
		super();
		this.numeroScontrino = numeroScontrino;
	}

	public int getNumeroScontrino() {
		return numeroScontrino;
	}

	public void setNumeroScontrino(int numeroScontrino) {
		this.numeroScontrino = numeroScontrino;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + numeroScontrino;
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
		Scontrino other = (Scontrino) obj;
		if (numeroScontrino != other.numeroScontrino)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Scontrino [numeroScontrino=" + numeroScontrino + "]";
	}

}
