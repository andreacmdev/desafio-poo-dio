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

	}

}
