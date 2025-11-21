package krakedev.entidades;

import java.util.ArrayList;

public class Estudiante {
	private String nombre;
	private String apellido;
	private String cedula;
	private ArrayList<Nota> notas;
	public Estudiante(String cedula, String nombre, String apellido) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.cedula = cedula;
		this.notas = new ArrayList<Nota>();
	}
	public void agregarNota(Nota nuevaNota) {
        if (nuevaNota.getCalificacion() >= 0 && nuevaNota.getCalificacion() <= 10) {
            boolean materiaExistente = false;
            for (int i = 0; i < notas.size(); i++) {
                Nota nota = notas.get(i);
                if (nota.getMateria().getCodigo().equals(nuevaNota.getMateria().getCodigo())) {
                    materiaExistente = true;
                    break;
                }
            }
            
            if (!materiaExistente) {
                notas.add(nuevaNota);
            } else {
                System.out.println("Ya existe una nota para la materia con código: " + nuevaNota.getMateria().getCodigo());
            }
        } else {
            System.out.println("La calificación debe estar entre 0 y 10");
        }
    }
	
	public void modificarNota(String codigo, double nuevaCalificacion) {
        if (nuevaCalificacion >= 0 && nuevaCalificacion <= 10) {
            boolean encontrado = false;
            for (int i = 0; i < notas.size(); i++) {
                Nota nota = notas.get(i);
                if (nota.getMateria().getCodigo().equals(codigo)) {
                    nota.setCalificacion(nuevaCalificacion);
                    encontrado = true;
                    break;
                }
            
        }if (! encontrado) {
            System.out.println("No se encontró la materia con código: " + codigo);
        }
    } else {
        System.out.println("La calificación debe estar entre 0 y 10");
    	}
}
	public double calcularPromedioNotasEstudiante() {
        if (notas.isEmpty()) {
            return 0.0;
        }
        
        double suma = 0.0;
        for (int i = 0; i < notas.size(); i++) {
            Nota nota = notas.get(i);
            suma += nota.getCalificacion();
        }
        
        return suma / notas.size();
    }
	public void mostrar() {
		System.out.println("Estudiante [nombre=" + nombre + ", apellido=" + apellido + 
                ", cedula=" + cedula + "]");
		System.out.println("Notas:");
		for (int i = 0; i < notas.size(); i++) {
			Nota nota = notas.get(i);
			nota.mostrar(); 
		}
		System.out.println("Promedio: " + calcularPromedioNotasEstudiante());
		System.out.println("------------------------");
}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	public ArrayList<Nota> getNotas() {
		return notas;
	}
	public void setNotas(ArrayList<Nota> notas) {
		this.notas = notas;
	}
	
	
}
