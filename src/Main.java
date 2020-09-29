public class Main {

    public static void main (String[] args){
        alumno ale = new alumno();

        double[] califiaciones = {90, 80, 85, 100, 95};
        ale.setNombre("Alejandra");
        ale.setCalificaciones(califiaciones);

        ale.imprimirResultados();
    }
}
