package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		
		Curso curso1 = new Curso();
		curso1.setTitulo("java");
		curso1.setDescricao("descricao");
		curso1.setCargaHoraria(8);

		System.out.println(curso1);
		
		Mentoria mentoria1 = new Mentoria();
		mentoria1.setTitulo("gestão de projetos");
		mentoria1.setDescricao("descricao");
		mentoria1.setData(LocalDate.now());
		
		System.out.println(mentoria1);
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcamp Java Developer");
		bootcamp.setDescricao("Descricao bootcamp Java");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(mentoria1);
		
		Dev dedev = new Dev();
		dedev.setNome("Andre");
		dedev.inscreverBootcamp(bootcamp);
		System.out.println("Conteudos Incritos: " + dedev.getConteudoInscritos());
		dedev.progredir();
		dedev.progredir();
		System.out.println("Conteudos Concluídos: " + dedev.getConteudosConcluidos());
		System.out.println("XP : " + dedev.calcularTotalXp());
		System.out.println("Conteudos Incritos: " + dedev.getConteudoInscritos());
		
		
		Dev devAndressa = new Dev();
		devAndressa.setNome("Andressa");
		devAndressa.inscreverBootcamp(bootcamp);
		System.out.println("Conteudos Incritos: " + devAndressa.getConteudoInscritos());
		devAndressa.progredir();
		System.out.println("Conteudos Concluídos: " + devAndressa.getConteudosConcluidos());
		System.out.println("XP : " + devAndressa.calcularTotalXp());
		
		
		

	}

}
