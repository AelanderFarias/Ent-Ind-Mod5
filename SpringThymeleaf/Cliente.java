package com.example.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Cliente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column (name = "Nome", nullable = false)
	private String nome;
	@Column (name = "CPF", nullable = false, unique = true)
	private String cpf;
	@Column (name = "Nascimento", nullable = false)
	private String nascimento;
	@Column (name = "Email")
	private String email;
	@Column (name = "telefone")
	private String telefone;
	@Column (name = "Endereço")
	private String endereco;

	
	
}
