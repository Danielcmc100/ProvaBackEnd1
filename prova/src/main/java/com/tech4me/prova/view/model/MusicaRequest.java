package com.tech4me.prova.view.model;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class MusicaRequest {
    @NotBlank(message = "O titulo nao pode ser em branco")
    @NotEmpty(message = "O titulo tem que ser preenchido")
    private String titulo;
    @NotBlank(message = "O artista nao pode ser em branco")
    @NotEmpty(message = "O artista tem que ser preenchido")
    private String artista;
    @NotBlank(message = "O album nao pode ser em branco")
    @NotEmpty(message = "O album tem que ser preenchido")
    private String album;
    @NotBlank(message = "O genero nao pode ser em branco")
    @NotEmpty(message = "O genero tem que ser preenchido")
    private String genero;
    @NotNull(message = "O ano de lançamento nao pode ser em branco")
    @Min(value = 1000, message = "o ano do lançamento deve ser após 1000")
    private int anoLancamento;
    @NotBlank(message = "O compositor nao pode ser em branco")
    @NotEmpty(message = "O compositor tem que ser preenchido")
    private String compositor;

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getArtista() {
        return artista;
    }
    public void setArtista(String artista) {
        this.artista = artista;
    }
    public String getAlbum() {
        return album;
    }
    public void setAlbum(String album) {
        this.album = album;
    }
    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public int getAnoLancamento() {
        return anoLancamento;
    }
    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }
    public String getCompositor() {
        return compositor;
    }
    public void setCompositor(String compositor) {
        this.compositor = compositor;
    }
}
