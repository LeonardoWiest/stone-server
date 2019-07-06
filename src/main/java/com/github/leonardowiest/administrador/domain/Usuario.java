package com.github.leonardowiest.administrador.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.Data;

@Data
@Entity
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@Table(name = "tb_usuario")
public class Usuario {

	@Id
	@Column(name = "id_usuario", nullable = false)
	private Long id;

	@Column(name = "tx_nome", nullable = true)
	private String nome;

	@Column(name = "tx_login", nullable = false)
	private String login;

	@Column(name = "tx_senha", nullable = false)
	private String senha;

	@Column(name = "fl_superusuario", nullable = true)
	private String flagSuperUsuario;

	@Column(name = "dt_cadastro", nullable = false, updatable = false)
	@Temporal(TemporalType.TIMESTAMP)
	@CreationTimestamp
	private Date dataCadastro;

	@Column(name = "dt_manutencao", nullable = false)
	@Temporal(TemporalType.TIMESTAMP)
	@UpdateTimestamp
	private Date dataManutencao;

	@Column(name = "dt_exclusao", nullable = true)
	@Temporal(TemporalType.TIMESTAMP)
	private Date dataExclusao;

}