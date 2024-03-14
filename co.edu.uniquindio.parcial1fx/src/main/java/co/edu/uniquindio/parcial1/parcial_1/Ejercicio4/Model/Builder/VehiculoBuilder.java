package co.edu.uniquindio.parcial1.parcial_1.Ejercicio4.Model.Builder;

import co.edu.uniquindio.parcial1.parcial_1.Ejercicio4.Model.EmpresaTransporte;
import co.edu.uniquindio.parcial1.parcial_1.Ejercicio4.Model.Propietario;
import co.edu.uniquindio.parcial1.parcial_1.Ejercicio4.Model.Vehiculo;

import java.util.ArrayList;
import java.util.List;

public class VehiculoBuilder<T extends VehiculoBuilder<T>> {
    protected String placa;
    protected String modelo;
    protected String marca;
    protected String color;
    protected Propietario propietarioAsociado;
    List<Propietario> listaPropietariosAsociados = new ArrayList<>();
    EmpresaTransporte ownedByEmpresaTransporte;

    public T placa(String placa) {
        this.placa = placa;
        return self();
    }
    public T modelo(String modelo) {
        this.modelo = modelo;
        return self();
    }
    public T marca(String marca) {
        this.marca = marca;
        return self();
    }
    public T color(String color) {
        this.color = color;
        return self();
    }
    public T propietarioAsociado(Propietario propietarioAsociado) {
        this.propietarioAsociado = propietarioAsociado;
        return self();
    }
    public T listaPropietariosAsociados(List<Propietario> listaPropietariosAsociados) {
        this.listaPropietariosAsociados = listaPropietariosAsociados;
        return self();
    }
    public T ownedByEmpresaTransporte(EmpresaTransporte ownedByEmpresaTransporte) {
        this.ownedByEmpresaTransporte = ownedByEmpresaTransporte;
        return self();
    }
    @SuppressWarnings("unchecked")
    protected T self() {
        return (T) this;
    }

    public Vehiculo build(){return new Vehiculo(placa, modelo, marca, color, propietarioAsociado, listaPropietariosAsociados, ownedByEmpresaTransporte);}
}
