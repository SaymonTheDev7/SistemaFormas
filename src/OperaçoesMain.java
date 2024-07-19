import java.util.ArrayList;

public class OperaçoesMain {

    private static final ArrayList<Forma> FORMAS = new ArrayList<>();

    public void adicionarItem(Forma forma) {

        FORMAS.add(forma);

    }

    public void removerItem(int index) {

        FORMAS.remove(index);

    }

    public ArrayList<Forma> getFORMAS() {
        return FORMAS;
    }


    public String listarItens() {

        String formas = "";

        int codigo = 0;

        for (Forma listaFormas : FORMAS) {


            formas += listaFormas + "\n" + "Código da forma: " + codigo + "\n-----------------------------";

            codigo++;

        }

        return formas;

    }
}