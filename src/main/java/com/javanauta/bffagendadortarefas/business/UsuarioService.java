package com.javanauta.bffagendadortarefas.business;


import com.javanauta.bffagendadortarefas.business.dto.in.EnderecoRequestDTO;
import com.javanauta.bffagendadortarefas.business.dto.in.LoginRequestDTO;
import com.javanauta.bffagendadortarefas.business.dto.in.TelefoneRequestDTO;
import com.javanauta.bffagendadortarefas.business.dto.in.UsuarioRequestDTO;
import com.javanauta.bffagendadortarefas.business.dto.out.EnderecoResponseDTO;
import com.javanauta.bffagendadortarefas.business.dto.out.TelefoneResponseDTO;
import com.javanauta.bffagendadortarefas.business.dto.out.UsuarioResponseDTO;
import com.javanauta.bffagendadortarefas.infrastructure.client.UsuarioClient;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UsuarioService {

    private final UsuarioClient client;

    public UsuarioResponseDTO salvarUsuario(UsuarioRequestDTO usuarioRequestDTO){
        return client.salvaUsuario(usuarioRequestDTO);
    }

    public String loginUsuario(LoginRequestDTO loginRequestDTO){
        return client.login(loginRequestDTO);
    }

    public UsuarioResponseDTO buscarPorEmail(String email, String token){
        return client.buscarPorEmail(email, token);
    }

    public void deletarPorEmail(String email, String token){
        client.deletarPorEmail(email, token);
    }

    public UsuarioResponseDTO atualizaDadosUsuario(String token, UsuarioRequestDTO dto){
        return client.atualizaDadosUsuario(dto, token);

    }

    public EnderecoResponseDTO atualizaDadosEndereco(Long idEndereco, EnderecoRequestDTO dto, String token){
        return client.atualizaDadosEndereco(dto, idEndereco, token);
    }

    public TelefoneResponseDTO atualizaDadosTelefone(Long idTelefone, TelefoneRequestDTO dto, String token){
        return client.atualizaDadosTelefone(dto, idTelefone, token);
    }

    public EnderecoResponseDTO cadastraEndereco(String token, EnderecoRequestDTO dto){
        return client.cadastraEndereco(dto, token);
    }

    public TelefoneResponseDTO cadastraTelefone(String token, TelefoneRequestDTO dto){
        return client.cadastraTelefone(dto, token);

    }

}
