package br.com.nivi.auth.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;

@Entity
@Data
public class Authority implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@NotNull
	@Size(min = 0, max = 50)
	private String name;

}