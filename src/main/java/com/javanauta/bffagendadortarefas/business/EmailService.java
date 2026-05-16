package com.javanauta.bffagendadortarefas.business;

import com.javanauta.bffagendadortarefas.business.dto.out.TarefasResponseDTO;
import com.javanauta.bffagendadortarefas.infrastructure.client.EmailClient;

import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EmailService {

    private final EmailClient client;
    
    public void enviaEmail(TarefasResponseDTO dto){
        client.enviarEmail(dto);

    }
}