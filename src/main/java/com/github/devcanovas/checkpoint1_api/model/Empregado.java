package com.github.devcanovas.checkpoint1_api.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "empregado")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Empregado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigoEmpregado;
    
    @Column(name = "nome")
    private String nome;
    
    @Column(name = "endereco")
    private String endereco;
    
}