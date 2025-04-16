public class Main {


    public static void main(String[] args) {
        //Ejercicio 1
        System.out.println("Ejercicio 1");
        Pessoa persona = new Pessoa();
        persona.exibeMensaje("Ana");

        //Ejercicio 2
        System.out.println("\nEjercicio 2");
        Calculadora calculo = new Calculadora();
        System.out.println("El doble del número es: " + calculo.dobleNumero(8));

        //Ejercicio 3
        System.out.println("\nEjercicio 3");
        Musica cancion = new Musica();
        cancion.titulo = "Sin ti";
        cancion.artista = "Donato y Estefano";
        cancion.anoLancamento = 2000;

        cancion.evaluacion(9);
        cancion.evaluacion(8.9);
        cancion.evaluacion(9.3);
        cancion.evaluacion(8);
        cancion.evaluacion(7);


        cancion.exibeMusica();
        System.out.println("La suma de la evaluación es de: " + cancion.avaliacao);
        System.out.println("La cantidad de evaluadores fueron: " + cancion.numAvaliacoes);
        System.out.println("El promedio de la calificación de la canción es de: " + cancion.media());

        //Ejercicio 4
        System.out.println("\nEjercicio 4");
        Carro auto = new Carro();
        auto.modelo = "Honda Civic";
        auto.cor = "Plomo";
        auto.ano = 2000;

        auto.exibeDatos();
        System.out.println("El auto tiene una edad de: " + auto.calcularEdad() + " años");

        //Ejercicio 5
        System.out.println("\nEjercicio 5");
        Aluno alumno = new Aluno();

        alumno.nombre = "Ana";
        alumno.edad = 20;

        alumno.exibeAlumno();

    }
}