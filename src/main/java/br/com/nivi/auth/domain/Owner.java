package br.com.nivi.auth.domain;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class Owner implements Serializable {

	private static final long serialVersionUID = -8416458905262374983L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(nullable = false, unique = true)
	private String cgcOwner;

	@Column(nullable = false, unique = false)
	private String name;

	@Column(nullable = false, unique = false)
	private String clientSecret;

	@Column(nullable = false, unique = true, updatable = false)
	private String clientId;

	private Set<String> authtorities;

}
