package br.com.escolinhadotioali.modelo;

public class Curso {
	
	public static enum Status {
		ATIVO, INATIVO;
	}

	
	private static final String PASTA_DO_SISTEMA = "/home/alexandre/brx"; // constante
	
	private static long proximoId = 1;

	private long id;
	private String nome;
	private String instrutor;
	private double nota;
	private int numeroDeHoras;
	private Status status;

	public Curso(long id, String nome, String instrutor, double nota, int numeroDeHoras, Status status) {
		if (id != proximoId) {
			throw new IllegalArgumentException("O id informado é diferente do próximo id");
		}
		
		this.id = id;
		this.nome = nome;
		this.instrutor = instrutor;
		this.nota = nota;
		this.numeroDeHoras = numeroDeHoras;
		this.status = status;
		proximoId++;
	}

	public Curso(String nome, String instrutor, double nota, int numeroDeHoras) {
		// boa prática: favoreça o uso de exceções do Java

		if (nome == null) {
			throw new IllegalArgumentException("O nome do curso é obrigatório!"); // lança (emitindo|sinalizando um erro)
		}
		
		if (nome.length() <= 3) {
			throw new IllegalArgumentException("O tamanho do nome do curso deve ser maior que 3 caracteres");
		}
		
		this.id = proximoId;
		this.nome = nome;
		this.instrutor = instrutor;
		this.nota = nota;
		this.numeroDeHoras = numeroDeHoras;
		this.status = Status.ATIVO;
		proximoId++;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getInstrutor() {
		return instrutor;
	}

	public void setInstrutor(String instrutor) {
		this.instrutor = instrutor;
	}

	public double getNota() {
		return nota;
	}

	public void setNota(double nota) {
		this.nota = nota;
	}

	public int getNumeroDeHoras() {
		return numeroDeHoras;
	}

	public void setNumeroDeHoras(int numeroDeHoras) {
		this.numeroDeHoras = numeroDeHoras;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

}
