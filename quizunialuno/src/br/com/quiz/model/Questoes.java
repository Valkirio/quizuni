package br.com.quiz.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TBL_QUESTOES")
public class Questoes implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "ID")
	private Long id;
	
	@Column(name = "TITULO")
	private String titulo;	
	
	@Column(name = "FG_QUESTAO_ATIVA")
	private String fgQuestaoAtiva;
	
	@Column(name = "TX_OPCAO_A")
	private String opcaoA;
	
	@Column(name = "TX_OPCAO_B")
	private String opcaoB;
	
	@Column(name = "TX_OPCAO_C")
	private String opcaoC;
	
	@Column(name = "TX_OPCAO_D")
	private String opcaoD;
	
	@Column(name = "TX_OPCAO_E")
	private String opcaoE;
	
	@Column(name = "FG_VERD_A")
	private String fgVerdadeiraA;
	
	@Column(name = "FG_VERD_B")
	private String fgVerdadeiraB;
	
	@Column(name = "FG_VERD_C")
	private String fgVerdadeiraC;
	
	@Column(name = "FG_VERD_D")
	private String fgVerdadeiraD;
	
	@Column(name = "FG_VERD_E")
	private String fgVerdadeiraE;

	public Long getId() {
		return id;
	}

	public String getTitulo() {
		return titulo;
	}

	public String getFgQuestaoAtiva() {
		return fgQuestaoAtiva;
	}

	public String getOpcaoA() {
		return opcaoA;
	}

	public String getOpcaoB() {
		return opcaoB;
	}

	public String getOpcaoC() {
		return opcaoC;
	}

	public String getOpcaoD() {
		return opcaoD;
	}

	public String getOpcaoE() {
		return opcaoE;
	}

	public String getFgVerdadeiraA() {
		return fgVerdadeiraA;
	}

	public String getFgVerdadeiraB() {
		return fgVerdadeiraB;
	}

	public String getFgVerdadeiraC() {
		return fgVerdadeiraC;
	}

	public String getFgVerdadeiraD() {
		return fgVerdadeiraD;
	}

	public String getFgVerdadeiraE() {
		return fgVerdadeiraE;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public void setFgQuestaoAtiva(String fgQuestaoAtiva) {
		this.fgQuestaoAtiva = fgQuestaoAtiva;
	}

	public void setOpcaoA(String opcaoA) {
		this.opcaoA = opcaoA;
	}

	public void setOpcaoB(String opcaoB) {
		this.opcaoB = opcaoB;
	}

	public void setOpcaoC(String opcaoC) {
		this.opcaoC = opcaoC;
	}

	public void setOpcaoD(String opcaoD) {
		this.opcaoD = opcaoD;
	}

	public void setOpcaoE(String opcaoE) {
		this.opcaoE = opcaoE;
	}

	public void setFgVerdadeiraA(String fgVerdadeiraA) {
		this.fgVerdadeiraA = fgVerdadeiraA;
	}

	public void setFgVerdadeiraB(String fgVerdadeiraB) {
		this.fgVerdadeiraB = fgVerdadeiraB;
	}

	public void setFgVerdadeiraC(String fgVerdadeiraC) {
		this.fgVerdadeiraC = fgVerdadeiraC;
	}

	public void setFgVerdadeiraD(String fgVerdadeiraD) {
		this.fgVerdadeiraD = fgVerdadeiraD;
	}

	public void setFgVerdadeiraE(String fgVerdadeiraE) {
		this.fgVerdadeiraE = fgVerdadeiraE;
	}

}
