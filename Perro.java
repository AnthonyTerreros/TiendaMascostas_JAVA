import javax.swing.*;

public class Perro extends Mascota{
	int vacuna;
	
	public void vacuna(){
		
	 vacuna = (JOptionPane.showConfirmDialog(null,"�Est� vacunado?","Vacuna del perro",JOptionPane.YES_NO_OPTION));
	if (vacuna == JOptionPane.YES_OPTION){
		System.out.println("El perro est� vacunado. \n \" Despreocupate. \" ");
	}
	else {
		System.out.println("Debes vacunarlo. ");
	}
	
	}
	

}
