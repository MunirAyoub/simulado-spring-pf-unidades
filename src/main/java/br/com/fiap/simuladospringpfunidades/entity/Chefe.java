package br.com.fiap.simuladospringpfunidades.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

//MANY TO ONE EM TODAS AS ENTIDADES
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

@Entity
@Table(name = "TBL_CHEFE")
public class Chefe {

    @Column(name = "")
    private Long id;

    private Boolean substituto;

    private Usuario usuario;

    private Unidade unidade;

    private LocalDateTime inicio;

    private LocalDateTime fim;

}
