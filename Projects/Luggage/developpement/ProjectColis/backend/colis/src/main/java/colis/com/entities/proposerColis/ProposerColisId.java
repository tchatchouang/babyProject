package colis.com.entities.proposerColis;

import colis.com.entities.colis.Colis;
import colis.com.entities.personnes.Personnes;
import colis.com.entities.trajets.Trajet;

import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;
import java.io.Serializable;

@Embeddable
public class ProposerColisId implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@ManyToOne
	private Personnes personnes;
	
	@ManyToOne
	private Trajet trajet;
	
	@ManyToOne
	private Colis colis;

	public ProposerColisId() {
		super();
	}

	public Personnes getPersonnes() {
		return personnes;
	}

	public void setPersonnes(Personnes personnes) {
		this.personnes = personnes;
	}

	public Trajet getTrajet() {
		return trajet;
	}

	public void setTrajet(Trajet trajet) {
		this.trajet = trajet;
	}

	public Colis getColis() {
		return colis;
	}

	public void setColis(Colis colis) {
		this.colis = colis;
	}
	

}
