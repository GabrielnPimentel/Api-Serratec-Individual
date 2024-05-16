package br.org.serratec.livraria.model;

import jakarta.annotation.Generated;
import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "livro")
public class Livro {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_livro")
	private Long id;

	@Column(name = "titulo", nullable = false)
	@NotBlank(message = "Insira o título do livro")
	@Size(max = 30, message = "Limite de 30 caracteres alcançado")
	private String titulo;

	@Embedded
	private InfoPubli infopubli;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public InfoPubli getInfopubli() {
		return infopubli;
	}

	public void setInfopubli(InfoPubli infopubli) {
		this.infopubli = infopubli;
	}

}
