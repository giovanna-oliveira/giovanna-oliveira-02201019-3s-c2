package com.example.continuada2;

import org.hibernate.annotations.ColumnDefault;

import javax.persistence.*;
import javax.validation.constraints.*;

@Entity
public class Lutador {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Size(min = 3, max = 12)
    private String nome;

    @PositiveOrZero
    @NotBlank
    private Double forcaGolpe;

    @PositiveOrZero
    @Column(columnDefinition = "decimal default 100.0")
    private Double vida;

    @Column(columnDefinition = "int default 0")
    private int concentracoesRealizadas;

    @Column(columnDefinition = "boolean default true")
    private Boolean vivo;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getForcaGolpe() {
        return forcaGolpe;
    }

    public void setForcaGolpe(Double forcaGolpe) {
        this.forcaGolpe = forcaGolpe;
    }

    public Double getVida() {
        return vida;
    }

    public void setVida(Double vida) {
        this.vida = vida;
    }

    public int getConcentracoesRealizadas() {
        return concentracoesRealizadas;
    }

    public void setConcentracoesRealizadas(int concentracoesRealizadas) {
        this.concentracoesRealizadas = concentracoesRealizadas;
    }

    public Boolean getVivo() {
        return vivo;
    }

    public void setVivo(Boolean vivo) {
        this.vivo = vivo;
    }
}
