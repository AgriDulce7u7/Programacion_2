package co.edu.uniquindio.programacion2.Model;

public abstract class Vehiculo {
    private String placa;
    private  int modelo;
    private String marca;
    private  String color;
    EmpresaTransporte ownedByEmpresaTransporte;


    /* Constructor */
    public Vehiculo(){

    }

    /* Getters and Setters */
    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public EmpresaTransporte getOwnedByEmpresaTransporte() {
        return ownedByEmpresaTransporte;
    }

    public void setOwnedByEmpresaTransporte(EmpresaTransporte ownedByEmpresaTransporte) {
        this.ownedByEmpresaTransporte = ownedByEmpresaTransporte;
    }
}
