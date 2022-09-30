package br.com.escolinhadotioali.main;

import br.com.escolinhadotioali.modelo.Curso;

public class MainCurso {

	public static void main(String[] args) {
		try {

			Curso curso1 = new Curso("Java Exceções: aprenda a criar, lançar e controlar exceções", "Nico Steppat", 9.5, 12);

			System.out.println(curso1.getId());
			System.out.println(curso1.getNome());
			System.out.println(curso1.getInstrutor());
			System.out.println(curso1.getNota());
			System.out.println(curso1.getNumeroDeHoras());
			System.out.println(curso1.getStatus());
			System.out.println("----------------");

			Curso curso2 = new Curso("Level Up BRX", "Alexandre Aquiles", 8.0, 150);

			System.out.println(curso2.getId());
			System.out.println(curso2.getNome());
			System.out.println(curso2.getInstrutor());
			System.out.println(curso2.getNota());
			System.out.println(curso2.getNumeroDeHoras());
			System.out.println(curso2.getStatus());
			System.out.println("----------------");

			Curso curso3 = new Curso(3, "Java e java.lang", "Nico Steppat", 9.5, 12, Curso.Status.ATIVO);

			System.out.println(curso3.getId());
			System.out.println(curso3.getNome());
			System.out.println(curso3.getInstrutor());
			System.out.println(curso3.getNota());
			System.out.println(curso3.getNumeroDeHoras());
			System.out.println(curso3.getStatus());
			System.out.println("----------------");

			Curso curso4 = new Curso("Java e java.util", "Nico Steppat", 9.4, 12);
			System.out.println(curso4.getId());
			System.out.println(curso4.getNome());
			System.out.println(curso4.getInstrutor());
			System.out.println(curso4.getNota());
			System.out.println(curso4.getNumeroDeHoras());
			System.out.println(curso4.getStatus());
			System.out.println("----------------");

		} catch (IllegalArgumentException ex) {
			System.out.println("Ih! Deu erro: " + ex.getMessage());
			System.out.println("----------------");
		}

		System.out.println("Boas vindas à Escolinha do Tio Ali");
		System.out.println("Temos 1405 cursos para você fazer!");

	}

}
