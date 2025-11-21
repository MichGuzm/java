package krakedev.entidades;
import java.util.ArrayList;
public class Curso {
private ArrayList<Estudiante> estudiantes;
    
    public Curso() {
        this.estudiantes = new ArrayList<>();
    }
    
    public Estudiante buscarEstudiantePorCedula(Estudiante estudiante) {
        for (Estudiante est : estudiantes) {
            if (est.getCedula().equals(estudiante.getCedula())) {
                return est;
            }
        }
        return null;
    }
    
    public void matricularEstudiante(Estudiante estudiante) {
        Estudiante estudianteExistente = buscarEstudiantePorCedula(estudiante);
        if (estudianteExistente == null) {
            estudiantes.add(estudiante);
        } else {
            System.out.println("El estudiante con cédula " + estudiante.getCedula() + " ya está matriculado");
        }
    }
    
    public double calcularPromedioCurso() {
        if (estudiantes.isEmpty()) {
            return 0.0;
        }
        
        double sumaPromedios = 0.0;
        for (Estudiante estudiante : estudiantes) {
            sumaPromedios += estudiante.calcularPromedioNotasEstudiante();
        }
        
        return sumaPromedios / estudiantes.size();
    }
    
    public void mostrar() {
    	System.out.println("=== CURSO ===");
        System.out.println("Total estudiantes: " + estudiantes.size());
        System.out.println("Promedio del curso: " + calcularPromedioCurso());
        System.out.println("------------------------");
        
        for (int i = 0; i < estudiantes.size(); i++) {
            Estudiante estudiante = estudiantes.get(i);
            estudiante.mostrar();
        }
    }

	public ArrayList<Estudiante> getEstudiantes() {
		return estudiantes;
	}

	public void setEstudiantes(ArrayList<Estudiante> estudiantes) {
		this.estudiantes = estudiantes;
	}
    
}
