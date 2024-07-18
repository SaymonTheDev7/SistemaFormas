public class Escaleno extends Triangulo {

    public Escaleno(double lado1, double lado2, double lado3) {
        super(lado1, lado2, lado3);
    }

    @Override
    public double area() {


        return Math.sqrt( semiperimetro() * ( semiperimetro() - getLado1()) * ( semiperimetro() - getLado2()) * ( semiperimetro() - getLado3()));

    }
    @Override
    public double perimetro () {

        return getLado1() + getLado2() + getLado3();

    }

    public double semiperimetro () {

        return perimetro() / 2;

    }

    @Override
    public String toString() {

        return "\nTriângulo Escaleno:" +
                "\nÁrea:" + area() +
                "\nPerimetro:" + perimetro() +
                "\nSemiperímetro:" + semiperimetro();

    }
}
