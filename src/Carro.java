import javax.swing.*;

public class Carro {
// 4.Crie uma classe Carro com atributos modelo, ano, cor e métodos para exibir a ficha técnica e calcular a idade do carro.

    String modelo;
    String cor;
    int ano;
    int edad;

    void exibeDatos() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Color: " + cor);
        System.out.println("Año: " + ano);

    }

    int calcularEdad() {
        return edad = 2025 - ano;
    }


}
