
package prova2;

import java.util.ArrayList;

public class Pacientes {
    
    private String cpf_p;
    private String nome_p;
    private String endereco_p;
    
    ArrayList<Pacientes> listaPacientes;
    
    public Pacientes(){ 
        listaPacientes = new ArrayList();
    }

    public Pacientes(String cpf_p, String nome_p, String endereco_p) {
        this.cpf_p = cpf_p;
        this.nome_p = nome_p;
        this.endereco_p = endereco_p;
        listaPacientes = new ArrayList();
    }

    public String getCpf_p() {
        return cpf_p;
    }

    public void setCpf_p(String cpf_p) {
        this.cpf_p = cpf_p;
    }

    public String getNome_p() {
        return nome_p;
    }

    public void setNome_p(String nome_p) {
        this.nome_p = nome_p;
    }

    public String getEndereco_p() {
        return endereco_p;
    }

    public void setEndereco_p(String endereco_p) {
        this.endereco_p = endereco_p;
    }

    public ArrayList<Pacientes> getListaPacientes() {
        return listaPacientes;
    }

    public void setListaPacientes(ArrayList<Pacientes> listaPacientes) {
        this.listaPacientes = listaPacientes;
    }
    
    public void addPacientes(Pacientes P){
        listaPacientes.add(P);
    }   
}