/*Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo los atributos:
numeroCuenta (entero), el DNI del cliente (entero largo) y el saldo actual (entero).
Las operaciones asociadas a dicha clase son:
a) Constructor por defecto y constructor con DNI, saldo, número de cuenta e interés. ++
b) Agregar los métodos getters y setters correspondientes++
c) Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.++
d) Método ingresar(double ingreso): el método recibe una cantidad de dinero a ingresar
y se la sumara a saldo actual.++
e) Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y se
la restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se
pondrá el saldo actual en 0+++
f) Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar que el
usuario no saque más del 20%.+++
g) Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.++
h) Método consultarDatos(): permitirá mostrar todos los datos de la cuenta++
*/

package bancoo;

import java.util.Scanner;

public class Cuenta {
    int numeroCuenta;
    int DNI;
  Double SaldoActual;
    int interes;
    Double SaldoIngresado;
    Double Total;
    Double retirar;
  
  Scanner entrada= new Scanner (System.in);

    public Cuenta(int numeroCuenta, int DNI, Double SaldoActual, int interes, Double SaldoIngresado, Double Total, Double retirar) {
        this.numeroCuenta = numeroCuenta;
        this.DNI = DNI;
        this.SaldoActual = SaldoActual;
        this.interes = interes;
        this.SaldoIngresado = SaldoIngresado;
        this.Total = Total;
        this.retirar = retirar;
        
    }


  
    public int getDNI() {
        return DNI;
    }

    public Double getSaldoActual() {
        return SaldoActual;
    }

    public int getInteres() {
        return interes;
    }

    public Double getSaldoIngresado() {
        return SaldoIngresado;
    }

    public Double getTotal() {
        return Total;
    }

    public Double getRetirar() {
        return retirar;
    }

    public Scanner getEntrada() {
        return entrada;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public void setSaldoActual(Double SaldoActual) {
        this.SaldoActual = SaldoActual;
    }

    public void setInteres(int interes) {
        this.interes = interes;
    }

    public void setSaldoIngresado(Double SaldoIngresado) {
        this.SaldoIngresado = SaldoIngresado;
    }

    public void setTotal(Double Total) {
        this.Total = Total;
    }

    public void setRetirar(Double retirar) {
        this.retirar = retirar;
    }

    public void setEntrada(Scanner entrada) {
        this.entrada = entrada;
    }

    
  
    }

    
  
    
 

