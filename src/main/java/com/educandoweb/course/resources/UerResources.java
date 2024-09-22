//classe de recurso web controladores.

package com.educandoweb.course.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.educandoweb.course.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UerResources {

	// retornar resposta de requisicoes web
	// tipo do metodo e um responseentities que e um metodo generico
	// ele espera um tipo que sera a minha classe <User>
	// agora tem de dar um nome a ele
	@GetMapping
	public ResponseEntity<User> findALL() {
		User u = new User(1L, "Maria", "maria@gamail.com", "999999999", "12344");
		return ResponseEntity.ok().body(u);

	}

}
