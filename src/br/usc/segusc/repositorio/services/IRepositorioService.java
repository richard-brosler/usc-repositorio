package br.usc.segusc.repositorio.services;

import br.usc.segusc.repositorio.exception.LoginInvalidoException;

public interface IRepositorioService {
	public String consultarLogin(String login) throws LoginInvalidoException;
}
