package co.edu.uniquindio.programacion2.Model;

public class Asociado {
    private String nombre;
    private String id;
    private String email;
    private float celular;
    EmpresaTransporte ownedByEmpresaTransporte;
    public Vehiculo vehiculoAsociado;

    /* Constructor */
    public Asociado(){

    }

    /* Getters and Setters */
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public float getCelular() {
        return celular;
    }

    public void setCelular(float celular) {
        this.celular = celular;
    }

    public EmpresaTransporte getOwnedByEmpresaTransporte() {
        return ownedByEmpresaTransporte;
    }

    public void setOwnedByEmpresaTransporte(EmpresaTransporte ownedByEmpresaTransporte) {
        this.ownedByEmpresaTransporte = ownedByEmpresaTransporte;
    }

    public Vehiculo getVehiculoAsociado() {
        return vehiculoAsociado;
    }

    public void setVehiculoAsociado(Vehiculo vehiculoAsociado) {
        this.vehiculoAsociado = vehiculoAsociado;
    }
}
