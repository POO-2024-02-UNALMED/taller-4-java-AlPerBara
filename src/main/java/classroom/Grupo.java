package classroom;

public class Grupo {

    public Persona[] estudiantes;
    public Persona profesor;
    public Asignatura asignatura;
    public final int codigo /*= 0*/; //O se le pone final, o se le pone un valor predeterminado, pero no ambas
    public String horario;

    public Grupo(Persona[] estudiantes, Persona profesor, Asignatura asignatura, int codigo, String horario) {
        this.estudiantes = estudiantes;
        this.profesor = profesor;
        this.asignatura = asignatura;
        this.codigo = codigo;
        this.horario = horario;
    }

    public Grupo(int cantidadEstudiantes, Persona profesor, Asignatura asignatura, int codigo, String horario) {
        Persona[] personas = new Persona[cantidadEstudiantes];
        this.estudiantes=personas;
        this.profesor=profesor;
        this.asignatura=asignatura;
        this.codigo=codigo;
        this.horario=horario;
    }

    public Grupo(Persona[] estudiantes, Persona profesor, Asignatura asignatura) {
        this(estudiantes, profesor, asignatura, 0,""); //Colocar los valores que se conocen, los otros by default
    }

    void cambiarEstudiante(Persona estudianteViejo, Persona estudianteNuevo) {
        for (int i = 0; i < estudiantes.length; i++) {
            if (estudiantes[i].getCedula() == estudianteViejo.getCedula()) {
                estudiantes[i] = estudianteNuevo;
                break;
            }
        }
    }
    
    void cambiarEstudiante(int indice, Persona estudiante) {
        estudiantes[indice] = estudiante;
    }
}