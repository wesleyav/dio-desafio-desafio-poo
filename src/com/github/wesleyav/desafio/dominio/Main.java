package com.github.wesleyav.desafio.dominio;

import java.time.LocalDate;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Curso curso1 = new Curso();
		curso1.setTitulo("Curso Java");
		curso1.setDescricao("descrição curso java");
		curso1.setCargaHoraria(8);

		Curso curso2 = new Curso();
		curso2.setTitulo("Curso JavaScript");
		curso2.setDescricao("descrição curso javascript");
		curso2.setCargaHoraria(8);

		Mentoria mentoria = new Mentoria();
		mentoria.setTitulo("mentoria de java");
		mentoria.setDescricao("descrição mentoria java");
		mentoria.setData(LocalDate.now());

//		System.out.println(curso1);
//		System.out.println(curso2);
//		System.out.println(mentoria);

		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcamp Java Developer");
		bootcamp.setDescricao("Descrição Bootcamp Java Developer");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria);

		Dev dev1 = new Dev();
		dev1.setNome("Dev 1");
		dev1.inscreverBootcamp(bootcamp);
		System.out.println("Conteúdos Inscritos de Dev1" + dev1.getConteudosInscritos());
		dev1.progredir();
		dev1.progredir();
		System.out.println("-");
		System.out.println("Conteúdos Inscritos de Dev1" + dev1.getConteudosInscritos());
		System.out.println("Conteúdos Concluidos de Dev1" + dev1.getConteudosConcluidos());
		System.out.println("XP:" + dev1.calcularTotalXP());

		System.out.println("---------------");

		Dev dev2 = new Dev();
		dev2.setNome("Dev 2");
		dev2.inscreverBootcamp(bootcamp);
		System.out.println("Conteúdos Inscritos de Dev2" + dev2.getConteudosInscritos());
		dev2.progredir();
		dev2.progredir();
		dev2.progredir();
		System.out.println("-");
		System.out.println("Conteúdos Inscritos de Dev2" + dev2.getConteudosInscritos());
		System.out.println("Conteúdos Concluidos de Dev2" + dev2.getConteudosConcluidos());
		System.out.println("XP:" + dev2.calcularTotalXP());

	}

}
