package com.javanauta.bffagendadortarefas.business.dto.out;

import com.javanauta.bffagendadortarefas.business.dto.in.EnderecoRequestDTO;
import com.javanauta.bffagendadortarefas.business.dto.in.TelefoneRequestDTO;
import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UsuarioResponseDTO {

    private Long id;
    private String nome;
    private String email;
    private String senha;
    private List<EnderecoRequestDTO> enderecos;
    private List<TelefoneRequestDTO> telefones;
}
