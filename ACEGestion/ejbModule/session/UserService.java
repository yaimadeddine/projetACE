package session;

import java.util.List;
import bean.User;
import dao.IDao;
import dao.IDaoLocal;
import jakarta.annotation.security.PermitAll;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;

/**
 * Session Bean implementation class UserService
 */
@Stateless
public class UserService implements IDao<User>, IDaoLocal<User> {

	@PersistenceContext
	private EntityManager u;
	
    /**
     * Default constructor. 
     */
    public UserService() {
        // TODO Auto-generated constructor stub
    }

    @Override
	@PermitAll
    public boolean delete(User o) {
        u.remove(o);
        return true;
    }

	@Override
	@PermitAll
    public List<User> findAll() {
        Query req= u.createQuery("select u from User u");
        return req.getResultList();
    }

	@Override
	@PermitAll
    public boolean create(User o) {
        u.persist(o);
        return true;
    }

	@Override
	@PermitAll
    public boolean update(User o) {
		u.persist(o);
        return true;
    }
	
	@Override
	@PermitAll
    public User findById(int id) {
		User user = u.find(User.class, id);
        if(user == null) throw new RuntimeException("Utilisateur introuvable");
        return user;
    }

}
