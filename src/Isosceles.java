public class Isosceles extends Triangulo {
    
    public Isosceles(double area, double perimetro, double ladoDif, double ladoIgu) {
        super(area, perimetro);
        this.ladoDif = ladoDif;
        this.ladoIgu = ladoIgu;
    }


    @Override
    public void area() {
         area = ladoDif * altura / 2;
    }

    @Override
    public void perimetro() {
        perimetro = ladoDif + 2 * ladoIgu;
    }

    public double altura() {

        return Math.sqrt((ladoIgu * ladoIgu) - (ladoDif * ladoDif) / 4);

    }

    @Override
    public String toString() {

        return "/nTriângulo isósceles:" +
                "/nÁrea:" + area +
                "/nPerimetro:" + perimetro +
                "Altura:" + altura;

    }
}
