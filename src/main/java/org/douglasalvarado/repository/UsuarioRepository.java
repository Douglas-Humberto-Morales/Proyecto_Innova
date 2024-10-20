package org.douglasalvarado.repository;

import org.douglasalvarado.model.Usuario;

import java.util.List;

public interface UsuarioRepository {
    Usuario createUsuario(Usuario usuario);
    Usuario getUsuario(Long id);
    List<Usuario> getAllUsuarios();
    Usuario updateUsuario(Long id, Usuario usuario);
    void deleteUsuario(Long id);
}
