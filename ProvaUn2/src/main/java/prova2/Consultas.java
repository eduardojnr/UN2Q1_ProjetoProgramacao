
package prova2;

import java.util.ArrayList;

public class Consultas {
    
    private String cod_consulta;
    private String data_consulta;
    private String horario_consulta; // 8 as 12 e 14 as 18 | Possui 1 hora cada
    private String crm_consulta;
    private String cpf_consulta;
    private String status_consulta;
    
    ArrayList<Consultas> listaConsultas;
    
    public Consultas(){ 
        listaConsultas = new ArrayList();
    }

    public Consultas(String cod_consulta, String data_consulta, String horario_consulta, String crm_consulta, String cpf_consulta, String status_consulta) {
        this.cod_consulta = cod_consulta;
        this.data_consulta = data_consulta;
        this.horario_consulta = horario_consulta;
        this.crm_consulta = crm_consulta;
        this.cpf_consulta = cpf_consulta;
        this.status_consulta = status_consulta;
        listaConsultas = new ArrayList();
    }

    public String getCod_consulta() {
        return cod_consulta;
    }

    public void setCod_consulta(String cod_consulta) {
        this.cod_consulta = cod_consulta;
    }

    public String getData_consulta() {
        return data_consulta;
    }

    public void setData_consulta(String data_consulta) {
        this.data_consulta = data_consulta;
    }

    public String getHorario_consulta() {
        return horario_consulta;
    }

    public void setHorario_consulta(String horario_consulta) {
        this.horario_consulta = horario_consulta;
    }

    public String getCrm_consulta() {
        return crm_consulta;
    }

    public void setCrm_consulta(String crm_consulta) {
        this.crm_consulta = crm_consulta;
    }

    public String getCpf_consulta() {
        return cpf_consulta;
    }

    public void setCpf_consulta(String cpf_consulta) {
        this.cpf_consulta = cpf_consulta;
    }

    public String getStatus_consulta() {
        return status_consulta;
    }

    public void setStatus_consulta(String status_consulta) {
        this.status_consulta = status_consulta;
    }

    public ArrayList<Consultas> getListaConsultas() {
        return listaConsultas;
    }

    public void setListaConsultas(ArrayList<Consultas> listaConsultas) {
        this.listaConsultas = listaConsultas;
    }
    
    public void addConsultas(Consultas C){
        listaConsultas.add(C);
    }
}