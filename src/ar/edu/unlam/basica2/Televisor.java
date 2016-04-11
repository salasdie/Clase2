package ar.edu.unlam.basica2;

public class Televisor {
	private int volumen;
	private int canal;
	
	public Televisor(){
		this.volumen = 10;
		this.canal = 2;
	}
	
	public Televisor(int volumen, int canal){
		this.volumen = volumen;
		this.canal = canal;
	}
	
	public void setVolumen(int volumen){
		if (volumen<=0){
			this.volumen = volumen;
		}
	}
	
	public int getVolumen(){
		return this.volumen;
	}
	
	public void setCanal(int canal){
		if (canal<0 && canal>200){
			this.canal = canal;
		}			
	}
	
	public int getCanal(){
		return this.canal;
	}
	
	public void cambiarVolumen(String modo){
		if (modo.equals("subir")){
			volumen++;
		}
		else{
			volumen--;
		}
	}
	
	public void cambiarCanal(String modo){
		if (modo.equals("subir")){
			canal++;
		}
		else{
			canal--;
		}
	}
}
