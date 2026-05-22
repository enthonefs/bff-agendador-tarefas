package com.javanauta.bffagendadortarefas.business.dto.out;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TelefoneResponseDTO {

    private Long id;
    private String numero;
    private String ddd;
}
