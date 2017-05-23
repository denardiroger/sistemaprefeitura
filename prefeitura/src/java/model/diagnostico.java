/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author rogerd
 */
public class diagnostico {
    private int codigo;
    private int codigo_consulta;
    private String data;
    private int codigo_usuario;
    private int cpf_paciente;
    private int cid_doenca;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCodigo_consulta() {
        return codigo_consulta;
    }

    public void setCodigo_consulta(int codigo_consulta) {
        this.codigo_consulta = codigo_consulta;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public int getCodigo_usuario() {
        return codigo_usuario;
    }

    public void setCodigo_usuario(int codigo_usuario) {
        this.codigo_usuario = codigo_usuario;
    }

    public int getCpf_paciente() {
        return cpf_paciente;
    }

    public void setCpf_paciente(int cpf_paciente) {
        this.cpf_paciente = cpf_paciente;
    }

    public int getCid_doenca() {
        return cid_doenca;
    }

    public void setCid_doenca(int cid_doenca) {
        this.cid_doenca = cid_doenca;
    }
    
    
}
