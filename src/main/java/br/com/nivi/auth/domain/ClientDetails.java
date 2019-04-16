package br.com.nivi.auth.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "oauth_client_details")
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class ClientDetails implements Serializable {

	private static final long serialVersionUID = -8416458905262374983L;

	@Id
	@Column(name = "client_id", nullable = false, unique = true)
	private Long clientId;

	@Column(name = "resource_ids")
	private String resourceIds;

	@Column(nullable = false)
	private String scope;

	@Column(name = "web_server_redirect_uri")
	private String webServerRedirectUri;

	@Column(name = "authorized_grant_types", nullable = false)
	private String authorizedGrantTypes;

	@Column(name = "client_secret", nullable = false)
	private String clientSecret;

	@Column(name = "access_token_validity", nullable = false)
	private Long accessTokenValidity;

	@Column(name = "refresh_token_validity", nullable = false)
	private Long refreshTokenValidity;

	@Column(name = "additional_information")
	private String additionalInformation;

	private String authtorities;

}
