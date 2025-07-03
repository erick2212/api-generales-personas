package com.govea.apipersonas.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.govea.apipersonas.model.Usuario;
import com.govea.apipersonas.repository.UsuarioRepository;

@Service
public class UsuarioService {

	@Autowired
	private UsuarioRepository usuarioRepository;

	public List<Usuario> listar() {
		return usuarioRepository.findAll();
	}
	
	public Optional<Usuario> obtenerPorId(Long id) {
		return usuarioRepository.findById(id);
	}

	public Usuario crear(Usuario usuario) {
		return usuarioRepository.save(usuario);
	}

	public void eliminar(Long id) {
		usuarioRepository.deleteById(id);
	}
}
