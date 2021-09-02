package JavaElectrodomesticos;

public class Electrodomestico {

    public Electrodomestico(String consumo, String procedencia) {
        this.consumo = consumo;
        this.procedencia = procedencia;
    }

    public String getConsumo() {
        return consumo;
    }

    public void setConsumo(String consumo) {
        this.consumo = consumo;
    }

    public String getProcedencia() {
        return procedencia;
    }

    public void setProcedencia(String procedencia) {
        this.procedencia = procedencia;
    }

    private String consumo;
    private String procedencia;
}
