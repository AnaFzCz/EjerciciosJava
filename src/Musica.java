public class Musica {
//   3. Crie uma classe Musica com atributos titulo, artista, anoLancamento, avaliacao e numAvaliacoes, e métodos para exibir a ficha técnica, avaliar a música e calcular a média de avaliações.

    String titulo;
    String artista;
    int anoLancamento;
    int avaliacao;
    int numAvaliacoes;


    void exibeMusica() {
        System.out.println("el titulo de la canción es: " + titulo);
        System.out.println("El nombre del artista es: " + artista);
        System.out.println("El año de lanzamiento fue: " + anoLancamento);
    }

    void evaluacion(double nota) {
        avaliacao += nota;
        numAvaliacoes++;
    }

    double media() {
        return avaliacao / numAvaliacoes;
    }
}
