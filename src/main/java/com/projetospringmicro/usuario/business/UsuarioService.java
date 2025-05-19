package com.projetospringmicro.usuario.business;

import com.projetospringmicro.usuario.infrastructure.entity.Usuario;
import com.projetospringmicro.usuario.infrastructure.repository.UsuarioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UsuarioService {
    private final UsuarioRepository usuarioRepository;

    public Usuario inserirUsuario(Usuario usuario){
        return usuarioRepository.save(usuario);
    }

}
