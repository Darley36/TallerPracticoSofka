package JavaElectrodomesticos;

public class Televisor extends Electrodomestico{
    private String Tamano;

    public Televisor(String consumo, String procedencia, String tamano) {
        super(consumo, procedencia);
        Tamano = tamano;
    }

    public String getTamano() {
        return Tamano;
    }

    public void setTamano(String tamano) {
        Tamano = tamano;
    }
}
