package br.com.nivi.auth.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Authority implements Serializable {

	private static final long serialVersionUID = -2987142688121123970L;

	@Id
	private Long id;

	private String name;

}