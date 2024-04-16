package br.com.fiap.jadv.spotify5.minispotify552475.entidades;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "TB_PLAYLIST")
@NoArgsConstructor
@Getter
@Setter
public class Playlist {

	 @Id
	    @GeneratedValue(generator = "geradorIds", strategy = GenerationType.IDENTITY)
	    private Long id;
	    
	    private String nome;
	    
	    private Long usuarioCriadorId;
	    
	    private String privado;
	    
	    @ManyToMany
	    private List<Musica> musicas;
	
}
