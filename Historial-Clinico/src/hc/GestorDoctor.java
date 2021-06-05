package hc;
import java.util.ArrayList;
import java.util.Scanner;
public final class GestorDoctor{
    private ArrayList<Doctor> doctors;
    private Scanner keyboard;
    public GestorDoctor(){
        doctors = new ArrayList<Doctor>();
        keyboard = new Scanner(System.in);
    }
    public boolean nuevoDoctor(){
        System.out.println("\n\tALTA NUEVO PACIENTE");
		System.out.print("Introduzca Identificador: ");
		String id = keyboard.nextLine();
		System.out.print("Name: ");
		String nombre = keyboard.nextLine();
		System.out.print("LastName: ");
		String apellidos = keyboard.nextLine();
		keyboard.nextLine();
		Doctor newDoctor = new Doctor(id, name, lastname, specialization);
		return doctors.add(newDoctor);
	}
    public void showDoctors() {
		for (Doctor d: doctors)
			d.Show();
	}

}