package org.douglasalvarado.service;

import org.douglasalvarado.model.Usuario;
import org.douglasalvarado.repository.UsuarioRepository;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

@Service
public class UsuarioService implements UsuarioRepository {
    private HashMap<Long, Usuario> usuarios = new HashMap<>();
    private Long idCounter = 1L;

    @Override
    public Usuario createUsuario(Usuario usuario) {
        usuario.setId(idCounter++);
        usuarios.put(usuario.getId(), usuario);
        return usuario;
    }

    @Override
    public Usuario getUsuario(Long id) {
        return usuarios.get(id);
    }

    @Override
    public List<Usuario> getAllUsuarios() {
        return new ArrayList<>(usuarios.values());
    }

    @Override
    public Usuario updateUsuario(Long id, Usuario usuario) {
        Usuario usuarioExistente = usuarios.get(id);

        if (usuarioExistente != null) {
            usuarioExistente.setNombre(usuario.getNombre());
            usuarioExistente.setCorreo(usuario.getCorreo());
            usuarios.put(id, usuarioExistente);
            return usuarioExistente;
        }

        return null;
    }

    @Override
    public void deleteUsuario(Long id) {
        usuarios.remove(id);
    }
}
