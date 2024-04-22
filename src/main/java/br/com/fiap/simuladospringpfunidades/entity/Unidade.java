package br.com.fiap.simuladospringpfunidades.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


//MANY TO ONE EM TODAS AS ENTIDADES
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class Unidade {

    private Long id;

    private String nome;

    private String sigla;

    private String descricao;

    private Unidade macro;

}
