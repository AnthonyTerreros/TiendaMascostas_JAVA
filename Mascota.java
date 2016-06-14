
public class Mascota implements Acciones {

	private String especie;
	
	public void setEspecie(String especie) {
		this.especie = especie;
		System.out.println("Tu mascota es de la especie " + especie);
	}

	public String getEspecie() {
		return especie;
	}

	///////////////////////// 7
	// Usando m�todos implementados de la interface Acciones

	@Override
	public void Alimentarse() {
		System.out.println("El animal de especie " + getEspecie() + " est� alimentandose");

	}
	@Override 
	public void Dormir(){
		System.out.println("El animal de especie " + getEspecie() + " est� dumiendo");
		
	}
	
	@Override
	public void Caminar(){
		System.out.println("El animal de especie " + getEspecie() + " le gusta caminar");
	}
	

}
