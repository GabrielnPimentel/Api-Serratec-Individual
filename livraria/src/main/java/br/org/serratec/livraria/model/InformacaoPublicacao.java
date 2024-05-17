package br.org.serratec.livraria.model;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Embeddable
public class InformacaoPublicacao {

	@Column(name = "autor")
	@NotBlank(message = "Insira o autor")
	@Size(max = 30, message = "Limite de 30 caracteres alcançado")
	private String autor;
	
	@Column(name = "dataPublicacao")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
	@NotBlank(message = "Insira a data de publicação")
	@Size(max = 20, message = "Limite de 20 caracteres alcançado")
	private Date dataPublicacao;
	
	@Column(name = "editora")
	@NotBlank(message = "Insira a editora do livro")
	@Size(max = 30, message = "Limite de 30 caracteres alcançado")
	private String editora;

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public Date getDataPublicacao() {
		return dataPublicacao;
	}

	public void setDataPublicacao(Date dataPublicacao) {
		this.dataPublicacao = dataPublicacao;
	}

	public String getEditora() {
		return editora;
	}

	public void setEditora(String editora) {
		this.editora = editora;
	}
	
	
}
