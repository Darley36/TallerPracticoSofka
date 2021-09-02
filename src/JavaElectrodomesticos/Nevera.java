package JavaElectrodomesticos;

public class Nevera extends Electrodomestico{

    private String Consumo;

    @Override
    public String getConsumo() {
        return Consumo;
    }

    @Override
    public void setConsumo(String consumo) {
        Consumo = consumo;
    }

    public Nevera(String consumo, String procedencia, String consumo1) {
        super(consumo, procedencia);
        Consumo = consumo1;
    }

    public Nevera(String consumo, String procedencia) {
        super(consumo, procedencia);
    }
}
