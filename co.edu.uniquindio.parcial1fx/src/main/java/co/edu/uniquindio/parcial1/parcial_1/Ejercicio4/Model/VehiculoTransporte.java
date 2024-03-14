package co.edu.uniquindio.parcial1.parcial_1.Ejercicio4.Model;

import co.edu.uniquindio.parcial1.parcial_1.Ejercicio4.Model.Builder.VehiculoTransporteBuilder;

import java.util.ArrayList;
import java.util.List;

public class VehiculoTransporte extends Vehiculo {
    private int maximoPasajeros;
    List<Usuario> listaUsuariosAsociados = new ArrayList<>();

    /* Constructor */
    public VehiculoTransporte(String placa, String modelo, String marca, String color, Propietario propietarioAsociado, List<Propietario> listaPropietariosAsociados, EmpresaTransporte ownedByEmpresaTransporte, int maximoPasajeros, List<Usuario> listaUsuariosAsociados) {
        super(placa, modelo, marca, color, propietarioAsociado, listaPropietariosAsociados, ownedByEmpresaTransporte);
        this.maximoPasajeros = maximoPasajeros;
        this.listaUsuariosAsociados = listaUsuariosAsociados;
    }

    public static VehiculoTransporteBuilder builder(){return new VehiculoTransporteBuilder();}

    /* Getter */
    public int getMaximoPasajeros() {
        return maximoPasajeros;
    }

    public List<Usuario> getListaUsuariosAsociados() {
        return listaUsuariosAsociados;
    }

    @Override
    public String toString() {
        return "VehiculoTransporte{" +
                "maximoPasajeros=" + maximoPasajeros +
                '}';
    }
}
