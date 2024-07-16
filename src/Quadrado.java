public class Quadrado extends Retangulo {

    private double lado = 0;

    private double area = 0;

    private double perimetro = 0;


    public Quadrado(double lado1, double lado2, double area, double perimetro) {
        super(lado1, lado2, area, perimetro);

        this.lado = lado1;
        this.area = area;
        this.perimetro = perimetro;

    }

    @Override

    public double area () {

        return area = lado * (lado+lado);

    }

    public double perimetro () {

        return perimetro = lado * 4;

    }

    public String toString () {

        return  "/nÁrea:" + area+
                "Perimetro:" + perimetro;

    }
}