/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package dam_ed04_actividad;

/**
 *
 * @author ALBERTO
 */
public class CCuenta {


    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    /**
     *Constructor vacio, que no requiere parámetros
     */
    public CCuenta()
    {
    }

    /**
     * Consturctor que requiere los siguientes parámetros para inicializar las variables:
     * @param nom Nombre del titular
     * @param cue Número de cuenta 
     * @param sal Saldo en la cuenta
     * @param tipo Tipo de Interes 
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }

    /**
     * Métododo para asignar el nombre
     * @param nom Nombre del titular
     */
    public void asignarNombre(String nom)
    {
        setNombre(nom);
    }

    /**
     * Método que devuelve el nombre
     * @return nombre
     */
    public String obtenerNombre()
    {
        return getNombre();
    }

    /**
     * Método que devuelve el saldo
     * @return saldo
     */
    public double estado()
    {
        return getSaldo();
    }

    /**
     *  Métoso para realizar un ingreso
     * @param cantidad Cantidad a ingresar
     * @throws Exception cantidades negativas
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }

    /**
     * Metodo para realizar una retirada de dinero
     * @param cantidad Cantidad a retirar
     * @throws Exception cantidades negativas o superiores al saldo
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }

    /**
     * Método que devuelve la cuenta
     * @return cuenta
     */
    public String obtenerCuenta()
    {
        return getCuenta();
    }

    /**
     * Método que devuelde el nombre del cliente
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método que asigna la variable nombre
     * @param nombre Nombre a asignar 
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Metodo que devuelve el tipo de interes
     * @return tipoInteres
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     * Método para asignar el tipo de interes
     * @param tipoInterés Tipo de Interes a aplicar
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }

    /**
     * Método que devuelve el número de Cuenta
     * @return numero de cuenta
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * Método para asignar un numero de cuenta
     * @param cuenta Número de cuenta a asignar
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * Método que nos devuelve el saldo actual
     * @return the saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Método que asigna un saldo
     * @param saldo Saldo a actualizar en la cuenta
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
