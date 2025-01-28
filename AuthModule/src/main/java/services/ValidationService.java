package services;

import java.util.HashMap;

import org.springframework.stereotype.Service;

import beans.User;

@Service
public class ValidationService {
	
	public void validateUser(User user) {
		
		if(user != null) {
			String username = user.getUsername();
			String email = user.getEmail();
			String password = user.getPassword();
			String fname = user.getFname();
			String lname = user.getLname();
			String phone = user.getPhone();
			String profileImg = user.getProfileImg();
			
			
			HashMap<String, String> errors = new HashMap<String, String>();
			
			String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,}$";
			String phoneRegex = "\\d{10}|(?:\\d{3}-){2}\\d{4}|\\(\\d{3}\\)\\d{3}-?\\d{4}";
			String passwordRegex = "^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=]).{8,}$";
			
			if(username != null) {
				username = username.trim();
				if(username.isBlank()) {
					errors.put("username", "Username can't be empty");
				} else {
					user.setUsername(username);
				}
			}
			
			if(email != null) {
				email = email.trim();
				if(email.isBlank() || !email.matches(emailRegex)) {
					errors.put("email", "Invalid email");
				} else {
					user.setEmail(email);
				}
			}
			
			if(password != null) {
				password = password.trim();
				if(password.isBlank() || !password.matches(passwordRegex)) {
					errors.put("password", "Password must contain 8 characters(lowercase, uppercase, digit, special character - atleast one of each");
				} else {
					user.setPassword(password);
				}
			}
			
			if(fname != null) {
				fname = fname.trim();
				user.setFname(fname);
			}
			
			if(lname != null) {
				lname = lname.trim();
				user.setLname(lname);
			}
			
			if(phone != null) {
				phone = phone.trim();
				if(!phone.matches(phoneRegex)) {
					errors.put(phone, "Invalid number");
				} else {
					user.setPhone(phone);
				}
			}
			
			if(profileImg != null) {
				profileImg = profileImg.trim();
				user.setProfileImg(profileImg);
			}
		}
	}

}
