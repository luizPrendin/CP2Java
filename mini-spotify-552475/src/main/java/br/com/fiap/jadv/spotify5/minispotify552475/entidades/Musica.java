package br.com.fiap.jadv.spotify5.minispotify552475.entidades;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "TB_MUSICA")
@NoArgsConstructor
@Getter
@Setter
public class Musica {
	
	@Id
	@GeneratedValue(
			generator = "geradorIds", 
			strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name= "DS_NOME")
	private String nomeMusica;
	
	@Column(name = "NR_DURACAO")
	private float duracaoMusica;
	
	@ManyToOne
    private Grupo grupo;

	
	@ManyToMany(mappedBy = "musicas")
    private List<Playlist> playlists;
}
