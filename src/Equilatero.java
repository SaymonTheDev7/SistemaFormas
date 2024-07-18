public class Equilatero extends Triangulo {
    public Equilatero(double lado1, double lado2, double lado3) {
        super(lado1, lado2, lado3);
    }

    @Override
    public double area() {

        return Math.sqrt(3) / 4 * Math.pow(getLado1(), 2);

    }

    public double perimetro () {

        return 3 * getLado1();

    }

    @Override
    public String toString() {

        return "\nTriângulo Equilatero:" +
                "\nÁrea:" + area() +
                "\nPerimetro:" + perimetro();

    }
}
