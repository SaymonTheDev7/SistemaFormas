public abstract class Forma {

    private static int gerador = 0;
    private int codigo = 0;
    private String nome;

    public Forma() {

        gerador++;
        codigo = gerador;

    }

    public abstract void area();

    public abstract void perimetro();

    @Override

    public String toString() {

        return "/nGerador automático:" + gerador;

    }
}