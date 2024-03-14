package co.edu.uniquindio.parcial1.parcial_1.Ejercicio4.Model;

import co.edu.uniquindio.parcial1.parcial_1.Ejercicio4.Model.Builder.VehiculoCargaBuilder;

import java.util.List;

public class VehiculoCarga extends Vehiculo{
    private double capacidadCarga;
    private int numeroEjes;

    /* Constructor */
    public VehiculoCarga(String placa, String modelo, String marca, String color, Propietario propietarioAsociado, List<Propietario> listaPropietariosAsociados, EmpresaTransporte ownedByEmpresaTransporte, double capacidadCarga, int numeroEjes) {
        super(placa, modelo, marca, color, propietarioAsociado, listaPropietariosAsociados, ownedByEmpresaTransporte);
        this.capacidadCarga = capacidadCarga;
        this.numeroEjes = numeroEjes;
    }

    public static VehiculoCargaBuilder builder(){return new VehiculoCargaBuilder();}

    /* Getter */
    public double getCapacidadCarga() {
        return capacidadCarga;
    }

    public int getNumeroEjes() {
        return numeroEjes;
    }

    @Override
    public String toString() {
        return "VehiculoCarga{" +
                "capacidadCarga=" + capacidadCarga +
                ", numeroEjes=" + numeroEjes +
                '}';
    }
}
