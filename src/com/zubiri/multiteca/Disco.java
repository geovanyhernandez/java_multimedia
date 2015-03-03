package com.zubiri.multiteca;

public class Disco extends Obra{
	
	private String discografia;
	private int nCanciones;
	
	public Disco(String titulo, Artista autor, int añoEdicion, String discografia, int nCanciones) {
		
	}
	
	public String getDiscografia() {
		
		return discografia;
	}
	
	public void setDiscografia(String discografia) {
		
		this.discografia = discografia;
	}
	
	public int getnCanciones() {
		
		return nCanciones;
	}
	
	public void setnCanciones(int nCanciones) {
		
		this.nCanciones = nCanciones;
	}
	
	@Override public String formattedObra() {
		String formattedObra=
		super.formattedObra() +
		"Discografia " + this.discografia + " Numero de Canciones" + this.nCanciones;
		return formattedObra;
	}
}
