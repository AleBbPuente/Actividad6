public class alumno {
    private String nombre;
    private double [] calificaciones;

    public String getNombre (){
        return this.nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setCalificaciones(double[] calificaciones) {
        this.calificaciones = calificaciones;
    }

    public double getPromedio(){
        double suma = 0;

        for (double calificacione : this.calificaciones) {
            suma += calificacione;
        }

        return suma/this.calificaciones.length;
        }

        public char getCalificacionFinal(double promedio){
        if (promedio > 50 && promedio <= 60) return 'E';
        if (promedio > 60 && promedio <= 70) return 'D';
        if (promedio > 70 && promedio <= 80) return 'C';
        if (promedio > 80 && promedio <= 90) return 'B';
        if (promedio > 90 && promedio <= 100) return 'A';
        return 'F';
        }

        public void imprimirResultados (){
        System.out.println("Nombre:" + this.getNombre());
        for (int i=0;i<this.calificaciones.length;i++){
            System.out.println("Calificacion final" + (i+1)+ ":" + this.calificaciones[i]);
        }
        double promedio = this.getPromedio();
        System.out.println("Promedio:" + promedio);
        System.out.println("Calificacion final:" + this.getCalificacionFinal(promedio));
        }
    }
