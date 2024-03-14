package co.edu.uniquindio.parcial1.parcial_1.Ejercicio4.Model;

import co.edu.uniquindio.parcial1.parcial_1.Ejercicio4.Model.Builder.PropietarioBuilder;

import java.util.ArrayList;
import java.util.List;

public class Propietario {
    private String nombre;
    private String cedula;
    private String email;
    private String celular;
    public Vehiculo vehiculoPrincipal;
    List<Vehiculo> listaVehiculosAsociados = new ArrayList<>();
    EmpresaTransporte ownedByEmpresaTransporte;

    /* Constructor */
    public Propietario(String nombre, String cedula, String email, String celular, Vehiculo vehiculoPrincipal, List<Vehiculo> listaVehiculosAsociados, EmpresaTransporte ownedByEmpresaTransporte) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.email = email;
        this.celular = celular;
        this.vehiculoPrincipal = vehiculoPrincipal;
        this.listaVehiculosAsociados = listaVehiculosAsociados;
        this.ownedByEmpresaTransporte = ownedByEmpresaTransporte;
    }

    public static PropietarioBuilder builder(){return new PropietarioBuilder();}

    /* Getter */
    public String getNombre() {
        return nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public String getEmail() {
        return email;
    }

    public String getCelular() {
        return celular;
    }

    public Vehiculo getVehiculoPrincipal() {
        return vehiculoPrincipal;
    }

    public List<Vehiculo> getListaVehiculosAsociados() {
        return listaVehiculosAsociados;
    }

    public EmpresaTransporte getOwnedByEmpresaTransporte() {
        return ownedByEmpresaTransporte;
    }

    @Override
    public String toString() {
        return "Propietario{" +
                "nombre='" + nombre + '\'' +
                ", cedula='" + cedula + '\'' +
                ", email='" + email + '\'' +
                ", celular='" + celular + '\'' +
                '}';
    }
}
