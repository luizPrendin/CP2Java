package br.com.fiap.jadv.spotify5.minispotify552475.entidades;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "TB_GRUPO")
@NoArgsConstructor
@Getter
@Setter
public class Grupo {

	@Id
    @GeneratedValue(generator = "geradorIds", strategy = GenerationType.IDENTITY)
    private Integer id;
	
	@Column(name="DS_NOME")
	private String nomeGrupo;
    
    @OneToMany(mappedBy = "grupo")
    private List<Artista> artistas;
    
    @OneToMany(mappedBy = "grupo")
    private List<Musica> musicas;
	
	
}
