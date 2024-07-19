public class Isosceles extends Triangulo {


    public Isosceles(double lado1, double lado2, double lado3) {
        super(lado1, lado2, lado3);
    }

    @Override
    public double area() {

        return getLado1() * altura() / 2;

    }

    @Override
    public double perimetro() {

        return getLado1() + 2 * getLado2();

    }

    public double altura() {

        return Math.sqrt(Math.pow(getLado2(), 2 - Math.pow(getLado2(), 2) / 4));

    }

    @Override
    public String toString() {

        return "\nTriângulo Isósceles:" +
                "\nÁrea:" + area() +
                "\nPerimetro:" + perimetro() +
                "\nAltura:" + altura();


    }
}
