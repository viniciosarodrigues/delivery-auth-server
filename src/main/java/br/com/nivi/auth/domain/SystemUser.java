package br.com.nivi.auth.domain;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;

import lombok.Getter;

public class SystemUser extends org.springframework.security.core.userdetails.User {

	private static final long serialVersionUID = 5274032971632867128L;

	@Getter
	private User user;

	public SystemUser(User user, Collection<? extends GrantedAuthority> authorities) {
		super(user.getUsername(), user.getPassword(), authorities);
		this.user = user;
	}

}
