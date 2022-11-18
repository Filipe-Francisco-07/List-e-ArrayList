package com.filipe.List;

import java.util.ArrayList;
import java.util.List;

	public class ListaPessoas {

	List<Pessoa> Lista = new ArrayList<Pessoa>();
	
	public List<Pessoa> getLista() {
		return Lista;
	}

	public void setLista(List<Pessoa> lista) {
		this.Lista = lista;
	}

	//*nao permitir nomes iguais
	public boolean add(Pessoa pessoa) {
		boolean narga = true;

	for(int i = 0;i < Lista.size();i++) {
		if(pessoa.getNome() == Lista.get(i).getNome()){
			narga = false;
			break;
		}
	}
	if(narga) {
		Lista.add(pessoa);
		}
	return narga;
	}
	
	//*buscar dominios dos emails
	public String domain() {
		StringBuilder builder = new StringBuilder();
		
		for(int i = 0;i < Lista.size();i++) {
			String[] dom = Lista.get(i).getEmail().split("@");
			builder.append(dom[1]+"\n");
		}
	return builder.toString();
	}
	
	//*excluir a pessoa pelo nome
	public boolean delete(String nome) {
	
	for(int i = 0;i < Lista.size();i++) {
		if(nome == Lista.get(i).getNome()){
			Lista.remove(i);
			break;
		}
	}
	
	return true;
	}
	
	//*alterar nome
	public boolean nameupdate(String old, String neww) {
	
	for(int i = 0;i < Lista.size();i++) {
		if(old == Lista.get(i).getNome()){
			Lista.get(i).setNome(neww);
		}
	}
	return true;
	}
	
	//*alterar email
	public boolean emailupdate(String old, String neww) {
	
	for(int i = 0;i < Lista.size();i++) {
		if(old == Lista.get(i).getEmail()){
			Lista.get(i).setEmail(neww);
		}
	}
	return true;
	}
	
	//*fazer uma busca usando 'like' "%" inicial do nome
	
	public String buscainicial(String inicial) {
		StringBuilder builder = new StringBuilder();
		builder.append("\nResultados da busca:\n");
	
		for(int i = 0;i < Lista.size();i++) {
			if(Lista.get(i).getNome().contains(inicial))
				builder.append(Lista.get(i).getNome()+"\n");
	
		}
	return builder.toString();
	}
	
	//*buscar idade > ?(qualquer idade)
	
	public String buscaridade(String nome) {
		StringBuilder builder = new StringBuilder();
		builder.append("Idade: ");
		for(int i = 0;i < Lista.size();i++) {
			if(Lista.get(i).getNome() == nome) {
				String[] idades = Lista.get(i).getNascimento().split("/");
				builder.append(2022 - Integer.valueOf(idades[2]));
			}
		}
		
		return builder.toString();
	}
	
	
	//*aniversariantes do mes ? (qlq 1: ex- 1 - jan 2 - fev).
	
	public String aniversariante() {
		StringBuilder builder = new StringBuilder();
		builder.append("Aniversariantes do mês: ");
		for(int i = 0;i < Lista.size();i++) {
			String[] idades = Lista.get(i).getNascimento().split("/");
			if (Integer.valueOf(idades[1]) == 11) {
				builder.append(Lista.get(i).getNome()+"\n");
			}
		}
		return builder.toString();
	}
}