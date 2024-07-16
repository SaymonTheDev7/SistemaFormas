public class Circunferencia extends Forma {

    private double area = 0;
    private double perimetro = 0;
    private double diametro = 0;
    private double raio = 0;

    public Circunferencia ( double area, double raio, double perimetro, double diametro  ) {

            this.area = area;
            this.raio = raio;
            this.perimetro = perimetro;
            this.diametro = diametro;

    }

    @Override

    public double area () {

        return area = Math.PI * (raio*raio);

    }

    @Override

    public double perimetro () {

        return  perimetro = Math.PI * diametro;

    }

    public double diametro () {

        return diametro = raio * (raio*raio);

    }

    public double raio () {

        return raio = diametro / 2;

    }
    public String toString () {

        return  "/nÁrea:" + area+
                "/nPerimetro:" + perimetro +
                "/nDiâmetro:" + diametro +
                "Raio:" + raio;

    }
}
