public class Retangulo extends Forma {

    private double lado = 0;
    private double lado1 = 0;

    public Retangulo(double lado, double lado1) {

        this.lado = lado;
        this.lado1 = lado1;

    }

    @Override
    public double area() {

        return lado * lado1;

    }

    @Override
    public double perimetro() {

        return 2 * (lado + lado1);

    }

    @Override
    public String toString() {

        return "\nRetangulo:" +
                "\nÁrea:" + area() +
                "\nPerimetro:" + perimetro();

    }


}
