package curso.api.rest.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import curso.api.rest.model.Usuario;
@Repository
public interface UsuarioRepository extends CrudRepository<Usuario, Long>{

	
	@Query("SELECT u FROM Usuario u WHERE u.login = ?1")
	Usuario findUserByLogin(String login);
	List< Usuario> findByNomeContainingIgnoreCase(String nome);
	
	//pesquisa por parte do nome (like)
		
		//@Query("select u from Usuario u where u.nome like %?1%")
		
		//List< Usuario> findByNomeContainingIgnoreCase(String nome);

		
	
	
	
	
	
}
