package co.edu.uniquindio.parcial1.parcial_1.Ejercicio4.Model.Builder;

import co.edu.uniquindio.parcial1.parcial_1.Ejercicio4.Model.Usuario;
import co.edu.uniquindio.parcial1.parcial_1.Ejercicio4.Model.VehiculoCarga;
import co.edu.uniquindio.parcial1.parcial_1.Ejercicio4.Model.VehiculoTransporte;

import java.util.ArrayList;
import java.util.List;

public class VehiculoTransporteBuilder extends VehiculoBuilder<VehiculoTransporteBuilder>{
    private int maximoPasajeros;
    List<Usuario> listaUsuariosAsociados = new ArrayList<>();

    public VehiculoTransporteBuilder maximoPasajeros(int maximoPasajeros) {
        this.maximoPasajeros = maximoPasajeros;
        return this;
    }
    public VehiculoTransporteBuilder listaUsuariosAsociados(List<Usuario> listaUsuariosAsociados) {
        this.listaUsuariosAsociados = listaUsuariosAsociados;
        return this;
    }

    @Override
    public VehiculoTransporte build() {
        return new VehiculoTransporte(placa, modelo, marca, color, propietarioAsociado, listaPropietariosAsociados, ownedByEmpresaTransporte, maximoPasajeros, listaUsuariosAsociados);
    }

    @Override
    protected VehiculoTransporteBuilder self() {
        return this;
    }
}
