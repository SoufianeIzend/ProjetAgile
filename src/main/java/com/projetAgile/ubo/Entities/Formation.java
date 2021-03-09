package com.projetAgile.ubo.Entities;

import lombok.Data;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


@Entity
@Data
public class Formation implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
	@Column(name="CODE_FORMATION")
	private String codeFormation;

    @Temporal(TemporalType.DATE)
    @Column(name = "DEBUT_ACCREDITATION")
    private Date debutAccreditation;

    private String diplome;

    @Column(name = "DOUBLE_DIPLOME")
    private String doubleDiplome;

    @Temporal(TemporalType.DATE)
    @Column(name = "FIN_ACCREDITATION")
    private Date finAccreditation;

    @Column(name = "N0_ANNEE")
    private int n0Annee;

    @Column(name = "NOM_FORMATION")
    private String nomFormation;

    @OneToMany(mappedBy = "formation")
    private List<UniteEnseignement> uniteEnseignements;
    
    
    
    public Formation(String codeFormation,String doubleDiplome, Date debutAccreditation, Date finAccreditation, String diplome, int n0Annee, String nomFormation  ) {
    	this.codeFormation=codeFormation;
    	this.diplome=diplome;
    	this.n0Annee=n0Annee;
    	this.nomFormation=nomFormation;
    	this.doubleDiplome=doubleDiplome;
    	this.debutAccreditation=debutAccreditation;
    	this.finAccreditation=finAccreditation;
    }
    public Formation() {
    }


	public String getCodeFormation() {
		return codeFormation;
	}



	public void setCodeFormation(String codeFormation) {
		this.codeFormation = codeFormation;
	}



	public Date getDebutAccreditation() {
		return debutAccreditation;
	}



	public void setDebutAccreditation(Date debutAccreditation) {
		this.debutAccreditation = debutAccreditation;
	}



	public String getDiplome() {
		return diplome;
	}



	public void setDiplome(String diplome) {
		this.diplome = diplome;
	}



	public String getDoubleDiplome() {
		return doubleDiplome;
	}



	public void setDoubleDiplome(String doubleDiplome) {
		this.doubleDiplome = doubleDiplome;
	}



	public Date getFinAccreditation() {
		return finAccreditation;
	}



	public void setFinAccreditation(Date finAccreditation) {
		this.finAccreditation = finAccreditation;
	}



	public int getN0Annee() {
		return n0Annee;
	}



	public void setN0Annee(int n0Annee) {
		this.n0Annee = n0Annee;
	}



	public String getNomFormation() {
		return nomFormation;
	}



	public void setNomFormation(String nomFormation) {
		this.nomFormation = nomFormation;
	}



	public List<UniteEnseignement> getUniteEnseignements() {
		return uniteEnseignements;
	}



	public void setUniteEnseignements(List<UniteEnseignement> uniteEnseignements) {
		this.uniteEnseignements = uniteEnseignements;
	}



	public static long getSerialversionuid() {
		return serialVersionUID;
	}


    
}
