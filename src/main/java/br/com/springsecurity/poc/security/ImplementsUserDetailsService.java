package br.com.springsecurity.poc.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Repository;

import br.com.springsecurity.poc.domain.Usuario;
import br.com.springsecurity.poc.repository.UsuarioRepositorio;

@Repository
public class ImplementsUserDetailsService implements UserDetailsService{

	@Autowired
	UsuarioRepositorio usuarioRepositorio;
	
	@Override
	public UserDetails loadUserByUsername(String usuario) throws UsernameNotFoundException {
		
		Usuario buscaUsuario = usuarioRepositorio.findByUsername(usuario);
		
		if(buscaUsuario == null) {
			throw new UsernameNotFoundException("Usuario não encontrado");
		}
		
		return buscaUsuario;
	}

}
