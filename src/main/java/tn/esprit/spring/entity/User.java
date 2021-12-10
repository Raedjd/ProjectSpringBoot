package tn.esprit.spring.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
@Table(name = "USER")
public class User implements Serializable {


	     @Id
	     @GeneratedValue(strategy = GenerationType.IDENTITY)
	     private Long id_user;
	     private String username; 
	     private String password;
	     private boolean enabled;
	     
	     @ManyToMany(fetch = FetchType.EAGER)
		    @JoinTable(name = "user_role", joinColumns = {
		            @JoinColumn(name = "iduser") }, inverseJoinColumns = {
		            @JoinColumn(name = "idrole") })
		    private List<Role> roles;
	    
        public User() {}

		public User(String username, String password, boolean enabled, List<Role> roles) {
			super();
			this.username = username;
			this.password = password;
			this.enabled = enabled;
			this.roles = roles;
		}

		public Long getId_user() {
			return id_user;
		}

		public void setId_user(Long id_user) {
			this.id_user = id_user;
		}

		public String getUsername() {
			return username;
		}

		public void setUsername(String username) {
			this.username = username;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public boolean isEnabled() {
			return enabled;
		}

		public void setEnabled(boolean enabled) {
			this.enabled = enabled;
		}

		public List<Role> getRoles() {
			return roles;
		}

		public void setRoles(List<Role> roles) {
			this.roles = roles;
		}

		
	
}
