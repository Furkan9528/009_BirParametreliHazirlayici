package com.furkankara;

public class Ucgen {

	private String cesit;

	/**
	 * @return the cesit
	 * @author furkankara
	 * @since 04.09.2019
	 */
	public Ucgen(String cesit) {
		this.cesit =  cesit;
	}


	public String getCesit() {
		return cesit;
	}


	public void setCesit(String cesit) {
		this.cesit = cesit;
	}



	public void ciz(){
		System.out.println( getCesit() + "Üçgen çiz");
	}
	
	
	
	
}
