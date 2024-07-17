public class Quadrado extends Forma {

    private double lado = 0;
    private double area = 0;
    private double perimetro = 0;

    public Quadrado(double lado1, double lado2) {
        this.lado = lado1;
        this.lado = lado2;
    }

    @Override

    public void area() {

         area = lado * (lado + lado);

    }

    public void perimetro() {

         perimetro = lado * 4;

    }

    @Override
    public String toString() {

        return "/nQuadrado:" +
                "/nÁrea:" + area +
                "Perimetro:" + perimetro;

    }
}