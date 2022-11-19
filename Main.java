package com.filipe.List;
import java.util.List;
import java.util.Date;
import java.util.Calendar;

	public class Main {

		public static void main(String[] args) {
		// TODO Auto-generated method stub

		ListaPessoas l = new ListaPessoas();
		
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.DAY_OF_MONTH, 10);
		cal.set(Calendar.MONTH, 9);
		cal.set(Calendar.YEAR, 2003);
		Date dt = cal.getTime();

		Pessoa p = new Pessoa("Filipe", "buritinho@gmail.com",dt);
		l.add(p);
			//Segundo nome igual o primeiro(Não vai entrar na lista!).
		p = new Pessoa("Filipe", "zapzap@hotmail.com",dt);
		l.add(p);

		cal.set(Calendar.DAY_OF_MONTH, 20);
		cal.set(Calendar.MONTH, 10);
		cal.set(Calendar.YEAR, 2000);
		dt = cal.getTime();
		
		p = new Pessoa("romário", "romas@ifc.edu.br",dt);
		l.add(p);
		
		cal.set(Calendar.DAY_OF_MONTH, 29);
		cal.set(Calendar.MONTH, 10);
		cal.set(Calendar.YEAR, 1974);
		dt = cal.getTime();
		
		p = new Pessoa("pedro", "pedrinho_velho@orkut.com",dt);
		l.add(p);
		
		cal.set(Calendar.DAY_OF_MONTH, 12);
		cal.set(Calendar.MONTH, 10);
		cal.set(Calendar.YEAR, 1999);
		dt = cal.getTime();
		
		p = new Pessoa("ramiro kkk", "ramiras@gremio.com",dt);
		l.add(p);
		
		
		List<Pessoa> lista = l.getLista();
		
		System.out.println("Lista 1: Lista padrão\n");
		for(Pessoa item : lista) {
			System.out.println(item.toString());
		}
		System.out.println("");
		
		//Domínios de email.
		System.out.println("Domínios de email: \n");
		System.out.println(l.domain());
		System.out.println("");
		
		l.delete("romário");
		
		System.out.println("Lista 2: Deletando o nome 'Romário'\n");
		for(Pessoa item : lista) {
			System.out.println(item.toString());
		}
		System.out.println("");
		

		System.out.println("Mudando email e nome do primeiro usuário: \n");
		l.emailupdate("buritinho@gmail.com", "filipefranciscof3@gmail.com");
		l.nameupdate("Filipe", "Filipinho");
		
		for(Pessoa item : lista) {
			System.out.println(item.toString());
		}
		System.out.println("");
		
		System.out.println("Fazendo pesquisa pela inicial 'F': \n");
		System.out.println(l.buscainicial("F"));
		
		System.out.println("buscando a idade por meio do nome 'pedro': \n");
		System.out.println(l.buscaridade("pedro"));
		
		System.out.println("Pessoas restando na lista: \n");
		for(Pessoa item : lista) {
			System.out.println(item.toString());
		}
		
		System.out.println("\nVerificando se contém aniversariantes do mês 11: \n");
		System.out.println(l.aniversariante());
		
		}
	
}

