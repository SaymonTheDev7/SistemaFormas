public class Retangulo extends Forma {

    private double lado1 = 0;

    private double area = 0;

    private double perimetro = 0;

    private double lado2 = 0;

    public Retangulo(double lado1, double perimetro, double lado2) {

        this.lado1 = lado1;
        this.perimetro = perimetro;
        this.lado2 = lado2;

    }

    @Override
    public void area() {

         area = lado1 * lado2;

    }

    @Override
    public void perimetro() {
         perimetro = 2 * (lado1 + lado2);
    }

    @Override
    public String toString() {

        return "/nRetangulo:" +
                "/nÁrea:" + area +
                "Perimetro:" + perimetro;

    }
}
