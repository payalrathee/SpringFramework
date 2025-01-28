package repositories;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import beans.User;

@Repository
public class UserRepository {
	
	@Autowired
	private HibernateTemplate hTemplate;
	
	@Transactional
	public User insertUser(User user) {
		hTemplate.save(user);
		return user;
	}
	
	@Transactional 
	public User updateUser(User user) {
		hTemplate.update(user);
		return user;
	}
	
	@Transactional
	public User deleteUser(User user) {
		hTemplate.delete(user);
		return user;
	}
	
	public User getUserById(int id) {
		return hTemplate.get(User.class, id);
	}

	public User getUserByEmail(String email) {
		
		User user = null;
		
		DetachedCriteria criteria = DetachedCriteria.forClass(User.class);
		criteria.add(Restrictions.eq("email", email));
		
		List<User> result = (List<User>) hTemplate.findByCriteria(criteria);
		if(result != null && !result.isEmpty()) {
			user = result.get(0);
		}
		
		return user;
		
	}
	
	public User getUserByUsername(String username) {
		
		User user = null;
		
		DetachedCriteria criteria = DetachedCriteria.forClass(User.class);
		criteria.add(Restrictions.eq("username", username));
		
		List<User> result = (List<User>) hTemplate.findByCriteria(criteria);
		if(result != null && !result.isEmpty()) {
			user = result.get(0);
		}
		
		return user;
		
	}
}
