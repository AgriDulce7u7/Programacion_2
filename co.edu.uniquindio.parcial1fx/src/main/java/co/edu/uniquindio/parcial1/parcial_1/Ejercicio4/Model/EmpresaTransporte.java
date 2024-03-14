package co.edu.uniquindio.parcial1.parcial_1.Ejercicio4.Model;

import java.util.ArrayList;
import java.util.List;

public class EmpresaTransporte {
    List<Propietario> listaPropietarios = new ArrayList<>();
    List<VehiculoCarga> listaVehiculosCarga = new ArrayList<>();
    List<VehiculoTransporte> listaVehiculoTransporte = new ArrayList<>();
    List<Usuario> listaUsuarios = new ArrayList<>();

    /* Constructor */
    public EmpresaTransporte() {
    }

    /* Getter and Setter */
    public List<Propietario> getListaPropietarios() {
        return listaPropietarios;
    }

    public void setListaPropietarios(List<Propietario> listaPropietarios) {
        this.listaPropietarios = listaPropietarios;
    }

    public List<VehiculoCarga> getListaVehiculosCarga() {
        return listaVehiculosCarga;
    }

    public void setListaVehiculosCarga(List<VehiculoCarga> listaVehiculosCarga) {
        this.listaVehiculosCarga = listaVehiculosCarga;
    }

    public List<VehiculoTransporte> getListaVehiculoTransporte() {
        return listaVehiculoTransporte;
    }

    public void setListaVehiculoTransporte(List<VehiculoTransporte> listaVehiculoTransporte) {
        this.listaVehiculoTransporte = listaVehiculoTransporte;
    }

    public List<Usuario> getListaUsuarios() {
        return listaUsuarios;
    }

    public void setListaUsuarios(List<Usuario> listaUsuarios) {
        this.listaUsuarios = listaUsuarios;
    }

}
