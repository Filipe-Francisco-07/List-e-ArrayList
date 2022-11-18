package com.filipe.List;
import java.util.List;

	public class Main {

		public static void main(String[] args) {
		// TODO Auto-generated method stub

		ListaPessoas l = new ListaPessoas();

		Pessoa p = new Pessoa("Filipe", "buritinho@gmail.com","10/11/2003");
		l.add(p);

		//Segundo nome igual o primeiro(Não vai entrar na lista!).
	p = new Pessoa("Filipe", "zapzap@hotmail.com","30/11/2000");
	l.add(p);
	
	p = new Pessoa("romário", "romas@ifc.edu.br","03/11/1989");
	l.add(p);
	
	p = new Pessoa("pedro", "pedrinho@orkut.com","11/11/2000");
	l.add(p);
	
	p = new Pessoa("ramiro kkk", "ramiras@gremio.com","15/11/1995");
	l.add(p);
	
	List<Pessoa> lista = l.getLista();
	
	System.out.println("Lista 1: Lista padrão\n");
	for(Pessoa item : lista) {
		System.out.println(item.toString());
	}
	System.out.println("");
	
	//Domínios de email.
	System.out.println(l.domain());
	System.out.println("");
	
	l.delete("romário");
	
	System.out.println("Lista 2: Deletando o nome 'Romário'\n");
	for(Pessoa item : lista) {
		System.out.println(item.toString());
	}
	System.out.println("");
	
	//mudando email e nome
	l.emailupdate("buritinho@gmail.com", "filipefranciscof3@gmail.com");
	l.nameupdate("Filipe", "Filipinho");
	
	System.out.println("Lista 3: Trocando nome e email do primeiro usuário \n");
	
	for(Pessoa item : lista) {
		System.out.println(item.toString());
	}
	System.out.println("");
	
	System.out.println("Fazendo pesquisa Por inicial:");
	System.out.println(l.buscainicial("F"));
	
	System.out.println("buscando a idade por nome: ");
	System.out.println(l.buscaridade("pedro"));
	
	System.out.println("Verificando se contém aniversariantes do mês 11:");
	System.out.println(l.aniversariante());
	
	}
	
}

