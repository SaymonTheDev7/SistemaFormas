public class Isosceles extends Triangulo {

    private double ladoDif = 0;
    private double ladoIgu = 0;
    private double area = 0;
    private double perimetro = 0;
    private double altura = 0;

    public Isosceles ( double area, double perimetro, double altura, double ladoDif, double ladoIgu ) {
        super(area, perimetro);

        this.area = area;
        this.perimetro = perimetro;
        this.altura = altura;
        this.ladoDif = ladoDif;
        this.ladoIgu = ladoIgu;

    }

    @Override
    public double area() {
        return area = ladoDif * altura /2;
    }

    @Override
    public double perimetro() {
        return perimetro = ladoDif + 2 * ladoIgu;
    }

    public double altura () {

        return Math.sqrt(( ladoIgu*ladoIgu) - (ladoDif*ladoDif) / 4 );

    }

    public String toString () {

        return  "/nÁrea:" + area+
                "/nPerimetro:" + perimetro +
                "Altura:" + altura;

    }
}
