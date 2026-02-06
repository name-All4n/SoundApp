package br.com.soundapp.soundapp.model;

import jakarta.persistence.*;

@Entity
@Table(name="Musicas")
public class Musica {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    @ManyToOne
    private Artista artista;

    public Musica() {}

    public Musica(String nomeMusica, Artista artista) {
        this.titulo = nomeMusica;
        this.artista = artista;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Artista getArtista() {
        return artista;
    }

    public void setArtista(Artista artista) {
        this.artista = artista;
    }

    @Override
    public String toString() {
        return ", titulo='" + titulo + '\'' +
                ", artista=" + artista.getNome();
    }
}
