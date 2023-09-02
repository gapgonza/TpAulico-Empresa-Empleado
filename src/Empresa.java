
import java.util.ArrayList;

public class Empresa {
    private String razonSocial;
    private int cuit;
    private ArrayList<Empleado> empleados;

    public Empresa(String razonSocial, int cuit) {
        this.razonSocial = razonSocial;
        this.cuit = cuit;
        this.empleados = new ArrayList<Empleado>();
    }
     public void agregarEmpleado(Empleado e) {
         this.empleados.add(e);
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public int getCuit() {
        return cuit;
    }

    public void setCuit(int cuit) {
        this.cuit = cuit;
    }
    
    public void mostrarEmpleado() {
    }

    @Override
    public String toString() {
        return "Empresa{" + "razonSocial=" + razonSocial + ", cuit=" + cuit + '}';
    }

       
}
