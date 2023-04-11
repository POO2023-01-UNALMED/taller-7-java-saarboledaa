package comunicacion;

public class Alfabeto extends Pictograma{

    private String[] letras;
    private String interpretacion;

    public Alfabeto(String origen, String[] letras, String interpretacion) {
        super(origen);
        this.letras = letras;
        this.interpretacion = interpretacion;
    }

    @Override
    public String interpretacion() {
        return interpretacion;
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append(letras[0]);
        for (int i = 1; i < letras.length; i++)
            s.append(", ").append(letras[i]);
        return s.toString();
    }

    public int cantidadLetras(){
        return letras.length;
    }

    public String[] getLetras() {
        return letras;
    }

    public void setLetras(String[] letras) {
        this.letras = letras;
    }

    public String getInterpretacion() {
        return interpretacion;
    }

    public void setInterpretacion(String interpretacion) {
        this.interpretacion = interpretacion;
    }
}
