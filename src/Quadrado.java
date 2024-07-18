public class Quadrado extends Forma {

    private double lado = 0;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    @Override

    public double area() {

         return lado * lado;

    }

    public double perimetro() {

        return lado * 4;

    }

    @Override
    public String toString() {

        return "\nQuadrado:" +
                "\nÁrea:" + area() +
                "\nPerimetro:" + perimetro();

    }
}