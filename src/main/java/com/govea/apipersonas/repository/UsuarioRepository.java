package com.govea.apipersonas.repository;

import org.springframework.stereotype.Repository;
import com.govea.apipersonas.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
