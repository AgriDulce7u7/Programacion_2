package co.edu.uniquindio.programacion2.Model;

public class VehiculoCarga extends Vehiculo{
    private float capacidadCarga;
    private int numeroEjes;

    /* Constructor */
    public VehiculoCarga(){

    }

    /* Getters and Setters */
    public float getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(float capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }

    public int getNumeroEjes() {
        return numeroEjes;
    }

    public void setNumeroEjes(int numeroEjes) {
        this.numeroEjes = numeroEjes;
    }
}
