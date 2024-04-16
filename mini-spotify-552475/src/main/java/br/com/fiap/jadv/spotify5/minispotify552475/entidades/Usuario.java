package br.com.fiap.jadv.spotify5.minispotify552475.entidades;

import jakarta.persistence.AttributeOverride;
import jakarta.persistence.AttributeOverrides;
import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name ="TB_USUARIO")
@NoArgsConstructor
@Getter
@Setter
public class Usuario {

	@Id
	@GeneratedValue(
			generator = "geradorIds", 
			strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Embedded
	@AttributeOverrides({
		@AttributeOverride(
				name = "nome", column = @Column(name = "DS_NOME")),
		@AttributeOverride(
				name = "dataNascimento", column = @Column(name = "DT_NASCIMENTO"))
	})
	private Pessoa pessoa;
	
	@Column(name = "DS_EMAIL")
	private String email;
	
	@Column(name ="DT_CRIACAO")
	private String dataCriacao;
	
}
