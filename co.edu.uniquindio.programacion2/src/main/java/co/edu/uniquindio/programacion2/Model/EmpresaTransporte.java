package co.edu.uniquindio.programacion2.Model;

import java.util.ArrayList;
import java.util.List;

public class EmpresaTransporte {
    private String nombre;
    List<Asociado> listaAsociados = new ArrayList<>();
    List<VehiculoPasajero> listaVehiculosPasajeros = new ArrayList<>();
    List<VehiculoCarga> listaVehiculosCarga = new ArrayList<>();

    /* Constructor */
    public EmpresaTransporte() {
    }

    /* Getters and Setters */
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Asociado> getListaAsociados() {
        return listaAsociados;
    }

    public void setListaAsociados(List<Asociado> listaAsociados) {
        this.listaAsociados = listaAsociados;
    }

    public List<VehiculoPasajero> getListaVehiculosPasajeros() {
        return listaVehiculosPasajeros;
    }

    public void setListaVehiculosPasajeros(List<VehiculoPasajero> listaVehiculosPasajeros) {
        this.listaVehiculosPasajeros = listaVehiculosPasajeros;
    }

    public List<VehiculoCarga> getListaVehiculosCarga() {
        return listaVehiculosCarga;
    }

    public void setListaVehiculosCarga(List<VehiculoCarga> listaVehiculosCarga) {
        this.listaVehiculosCarga = listaVehiculosCarga;
    }
}
