package com.javanauta.bffagendadortarefas.infrastructure.client;


import com.javanauta.bffagendadortarefas.business.dto.in.EnderecoRequestDTO;
import com.javanauta.bffagendadortarefas.business.dto.in.LoginRequestDTO;
import com.javanauta.bffagendadortarefas.business.dto.in.TelefoneRequestDTO;
import com.javanauta.bffagendadortarefas.business.dto.in.UsuarioRequestDTO;
import com.javanauta.bffagendadortarefas.business.dto.out.EnderecoResponseDTO;
import com.javanauta.bffagendadortarefas.business.dto.out.TelefoneResponseDTO;
import com.javanauta.bffagendadortarefas.business.dto.out.UsuarioResponseDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

@FeignClient(value = "usuario", url = "${usuario.url}")
public interface UsuarioClient {

    @GetMapping
    UsuarioResponseDTO buscarPorEmail(@RequestParam String email,
                                      @RequestHeader("Authorization") String token);

    @PostMapping
    UsuarioResponseDTO salvaUsuario(@RequestBody UsuarioRequestDTO usuarioRequestDTO);


    @PostMapping("/login")
    String login(@RequestBody LoginRequestDTO loginRequestDTO);

    @DeleteMapping("/{email}")
    void deletarPorEmail(@PathVariable String email,
                         @RequestHeader("Authorization") String token);

    @PutMapping
    UsuarioResponseDTO atualizaDadosUsuario(@RequestBody UsuarioRequestDTO dto,
                                           @RequestHeader("Authorization") String token);

    @PutMapping("/endereco")
    EnderecoResponseDTO atualizaDadosEndereco(@RequestBody EnderecoRequestDTO dto,
                                              @RequestParam("id") Long id,
                                              @RequestHeader("Authorization") String token);

    @PutMapping("/telefone")
    TelefoneResponseDTO atualizaDadosTelefone(@RequestBody TelefoneRequestDTO dto,
                                              @RequestParam("id") Long id,
                                              @RequestHeader("Authorization") String token);

    @PostMapping("/endereco")
    EnderecoResponseDTO cadastraEndereco(@RequestBody EnderecoRequestDTO dto,
                                        @RequestHeader("Authorization") String token);

    @PostMapping("/telefone")
    TelefoneResponseDTO cadastraTelefone(@RequestBody TelefoneRequestDTO dto,
                                        @RequestHeader("Authorization") String token);

}
