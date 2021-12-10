package tn.esprit.spring.control;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import tn.esprit.spring.entity.Client;
import tn.esprit.spring.entity.User;
import tn.esprit.spring.repository.UserRepository;

 


@RestController
@CrossOrigin(origins ="*")
public class UserRestController {

	@Autowired
	UserRepository userRep;
	
	@RequestMapping(value ="/login/{username}",method = RequestMethod.GET)
	public User getUserByUsernamePassword(@PathVariable("username") String username) {
	return userRep.findByUsername(username);
	}
	

}
