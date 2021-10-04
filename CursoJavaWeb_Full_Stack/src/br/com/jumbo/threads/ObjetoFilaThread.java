package br.com.jumbo.threads;

import java.util.Objects;

public class ObjetoFilaThread {
	
	private int cod;
	private String nome;
	private String email;
	
	
	
	public int getCod() {
		return cod;
	}
	public void setCod(int cod) {
		this.cod = cod;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public int hashCode() {
		return Objects.hash(email, nome);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ObjetoFilaThread other = (ObjetoFilaThread) obj;
		return Objects.equals(email, other.email) && Objects.equals(nome, other.nome);
	}

	
}
