package tn.esprit.spring.entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ROLE")
public class Role implements Serializable {
       
	     @Id
	     @GeneratedValue(strategy = GenerationType.IDENTITY)
	     private Long role_id;
	     private String role;
        public Role() {}
		public Role(String role) {
			super();
			this.role = role;
		
		}

		public Long getRole_id() {
			return role_id;
		}

		public void setRole_id(Long role_id) {
			this.role_id = role_id;
		}

		public String getRole() {
			return role;
		}

		public void setRole(String role) {
			this.role = role;
		}


	     
}
