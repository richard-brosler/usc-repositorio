package br.usc.segusc.repositorio.services;

import br.usc.segusc.repositorio.impl.Repositorio;

public class RepositorioFactory {

	private static RepositorioFactory inst;
	private Repositorio repo;
	
	private RepositorioFactory(){
		repo = new Repositorio();
	}
	
	public static RepositorioFactory getInstance(){
		if (inst==null)
			inst= new RepositorioFactory();
		return inst;
	}
	
	public static IRepositorioService getRepositorioServiceImpl(){
		return getInstance().repo;
	}
}
