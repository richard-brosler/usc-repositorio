package br.usc.segusc.repositorio.impl;

import br.usc.segusc.repositorio.exception.LoginInvalidoException;
import br.usc.segusc.repositorio.services.IRepositorioService;

public class Repositorio implements IRepositorioService {

	@Override
	public String consultarLogin(String login) throws LoginInvalidoException {
		// TODO Auto-generated method stub
		return "senha";
	}

}
