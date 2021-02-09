
package aluno;


public class AlumnoParaUsuario {
    
    private String select;
    private int quat;
    private int valor;
    private String nome;
    private String obs;
    private String total;
    
    public  AlumnoParaUsuario(){
    }
    public AlumnoParaUsuario(String select, int quat, int valor, String nome, String obs, String total) {
        this.select = select;
        this.quat = quat;
        this.valor = valor;
        this.nome = nome;
        this.obs = obs;
        this.total = total;
        
        
        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public int getQuat() {
        return quat;
    }

    public void setQuat(int quat) {
        this.quat = quat;
    }

    
    public String getSelect(){
        return select;
    }
    public void setSelect(String select) {
        this.select = select;
    }
}
