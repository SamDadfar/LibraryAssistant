package com.webApp.Demo.domain;

import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name="users")
public class Users {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="user_id")
	private long id;
	@Column(name="user_name")
	private String name;
	@Column(name="user_email")
	private String email;
	@Column(name="password")
	private String password;
	@Column(name="active")
	private int active;
	@OneToMany(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
	@JoinTable(name="user_role",joinColumns=@JoinColumn(name="user_id"))
	private Set<Role> roles;
	
	public Users() {
		super();
	}
	public Users(Users user) {
		this.active=user.getActive();
		this.name=user.getName();
		this.email=user.getEmail();
		this.password=user.getPassword();
		this.id=user.getId();
		this.roles=user.getRoles();
		
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getActive() {
		return active;
	}
	public void setActive(int active) {
		this.active = active;
	}
	public Set<Role> getRoles() {
		return roles;
	}
	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}
	
}
