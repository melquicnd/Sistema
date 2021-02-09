
package aluno;


public class Alumno {
    
    private String codigo;
    private String nombre;
    private String descriçao;
    private String edad;
    private String tipo;
    private String foto;
    private String clase;

    public Alumno() {
    }

    public Alumno(String codigo, String nombre, String edad, String descriçao, String tipo, String foto) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.descriçao = descriçao;
        this.edad = edad;
        this.tipo = tipo;
        this.foto = foto;
        this.clase = clase;
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }
    
    public String getFoto() {
        return foto;
    }
    
    public void setFoto(String foto) {
        this.foto  = foto;
    }
    
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getDescriçao(){
        return descriçao;
    }
    
    public void setDescriçao(String descriçao) {
        this.descriçao = descriçao; 
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }
    
    
}
