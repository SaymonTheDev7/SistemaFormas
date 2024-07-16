public class Retangulo extends Forma {

    private double lado1 = 0;

    private double area = 0;

    private double perimetro = 0;

    private double lado2 = 0;

    public Retangulo ( double lado1, double lado2, double area, double perimetro) {

        this.lado1 = lado1;
        this.lado2 = lado2;
        this.area = area;
        this.perimetro = perimetro;

    }
    @Override
    public double area() {

        return area = lado1 * lado2;

    }

    @Override
    public double perimetro() {
        return perimetro = 2 * (lado1 +lado2);
    }

    public String toString () {

        return  "/nÁrea:" + area+
                "Perimetro:" + perimetro;

    }
}
