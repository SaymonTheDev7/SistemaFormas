import java.util.ArrayList;

public class OperaçoesMain {

    private static final ArrayList<Forma> FORMAS = new ArrayList<>();

    public void adicionarItem(Forma forma) {

        FORMAS.add(forma);

    }

    public void removerItem(int index) {

        FORMAS.remove(index);

    }

    public String listarItens(Forma forma) {

        String formas = "";

        for ( Forma listaFormas : FORMAS ){

                formas += listaFormas + "\n" + "--------------------";

        }

        return formas;

    }
}