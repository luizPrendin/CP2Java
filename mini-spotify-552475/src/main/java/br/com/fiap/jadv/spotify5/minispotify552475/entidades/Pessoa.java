package br.com.fiap.jadv.spotify5.minispotify552475.entidades;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Embeddable
@Entity
@Table(name = "TB_PESSOA")
@NoArgsConstructor
@Getter
@Setter
public class Pessoa {
	@Id
	@GeneratedValue(
			generator = "geradorIds", 
			strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "DS_NOME")
	private String nome;
	
	@Column(name = "DT_NASCIMENTO")
	private LocalDateTime dataNascimento;
	
	

}
