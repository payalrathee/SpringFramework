package services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import beans.User;
import repositories.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepo;
	
	public User registerUser(User user) throws Exception {
		
		if(userRepo.getUserByEmail(user.getEmail()) != null) {
			throw new Exception("EmailAlreadyExists");
		}
		
		if(userRepo.getUserByUsername(user.getUsername()) != null) {
			throw new Exception("UsernameAlreadyExists");
		}
		
		user.setStatus(true);
		user.setUserRole("normal");
		user = userRepo.insertUser(user);
		return user;
	}
	
	public User validate(String login, String pwd) throws Exception {
		
		User user = userRepo.getUserByEmail(login);
		if(user == null) {
			user = userRepo.getUserByUsername(login);
		}
		
		if(user != null) {
			
			if(!user.getPassword().equals(pwd)) {
				throw new Exception("InvalidPassword");
			}
			
		} else {
			throw new Exception("UserNotFound");
		}
		
		return user;
	}

}
