package co.edu.uniquindio.parcial1.parcial_1.Ejercicio4.Model;


import co.edu.uniquindio.parcial1.parcial_1.Ejercicio4.Model.Builder.VehiculoBuilder;

import java.util.ArrayList;
import java.util.List;

public class Vehiculo {
    private String placa;
    private String modelo;
    private String marca;
    private String color;
    public Propietario propietarioAsociado;
    List<Propietario> listaPropietariosAsociados = new ArrayList<>();
    EmpresaTransporte ownedByEmpresaTransporte;

    /* Constructor */
    public Vehiculo(String placa, String modelo, String marca, String color, Propietario propietarioAsociado, List<Propietario> listaPropietariosAsociados, EmpresaTransporte ownedByEmpresaTransporte) {
        this.placa = placa;
        this.modelo = modelo;
        this.marca = marca;
        this.color = color;
        this.propietarioAsociado = propietarioAsociado;
        this.listaPropietariosAsociados = listaPropietariosAsociados;
        this.ownedByEmpresaTransporte = ownedByEmpresaTransporte;
    }

    public static VehiculoBuilder builder(){return new VehiculoBuilder();}

    /* Getter */
    public String getPlaca() {
        return placa;
    }

    public String getModelo() {
        return modelo;
    }

    public String getMarca() {
        return marca;
    }

    public String getColor() {
        return color;
    }

    public Propietario getPropietarioAsociado() {
        return propietarioAsociado;
    }

    public List<Propietario> getListaPropietariosAsociados() {
        return listaPropietariosAsociados;
    }

    public EmpresaTransporte getOwnedByEmpresaTransporte() {
        return ownedByEmpresaTransporte;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "placa='" + placa + '\'' +
                ", modelo='" + modelo + '\'' +
                ", marca='" + marca + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
