
package prova2;

import java.util.ArrayList;

public class Medicos {
    
    private String crm_m;
    private String cpf_m;
    private String nome_m;
    private String endereco_m;
    private String status_m; // Ativo | Desligado
    
    ArrayList<Medicos> listaMedicos;
    
    public Medicos(){ 
        listaMedicos = new ArrayList();
    }

    public Medicos(String crm_m, String cpf_m, String nome_m, String endereco_m, String status_m) {
        this.crm_m = crm_m;
        this.cpf_m = cpf_m;
        this.nome_m = nome_m;
        this.endereco_m = endereco_m;
        this.status_m = status_m;
        listaMedicos = new ArrayList();       
    }

    public String getCrm_m() {
        return crm_m;
    }

    public void setCrm_m(String crm_m) {
        this.crm_m = crm_m;
    }

    public String getCpf_m() {
        return cpf_m;
    }

    public void setCpf_m(String cpf_m) {
        this.cpf_m = cpf_m;
    }

    public String getNome_m() {
        return nome_m;
    }

    public void setNome_m(String nome_m) {
        this.nome_m = nome_m;
    }

    public String getEndereco_m() {
        return endereco_m;
    }

    public void setEndereco_m(String endereco_m) {
        this.endereco_m = endereco_m;
    }

    public String getStatus_m() {
        return status_m;
    }

    public void setStatus_m(String status_m) {
        this.status_m = status_m;
    }
    
    public ArrayList<Medicos> getListaMedicos() {
        return listaMedicos;
    }

    public void setListaMedicos(ArrayList<Medicos> listaMedicos) {
        this.listaMedicos = listaMedicos;
    }
    
    public void addMedicos(Medicos M){
        listaMedicos.add(M);
    }    
}