/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udec.datatable2.controler;

import com.udec.datatable2.utilitarios.Carros;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.inject.Named;
import javax.faces.view.ViewScoped;

/**
 *
 * @author Corin V
 */
@Named(value = "registroCarro")
@ViewScoped
public class RegistroCarro implements Serializable{
    private String nombre;
    private String marca;
    private List<String> marcas;
    private List<Carros> carros;
    private List<Carros> filtros;
    private int modelo;
    /**
     * Creates a new instance of RegistroCarro
     */
     @PostConstruct
    public void iniciar(){
       carros=new ArrayList<>();
        marcas=new ArrayList<>();
        marcas.add("Renault");
        marcas.add("Mazda");
        marcas.add("Chevrolet");
        marcas.add("Ford");
		marcas.add("Hyundai");
		marcas.add("Susuki");
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public List<String> getMarcas() {
        return marcas;
    }

    public void setMarcas(List<String> marcas) {
        this.marcas = marcas;
    }
     public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public List<Carros> getCarros() {
        return carros;
    }

    public void setCarros(List<Carros> carros) {
        this.carros = carros;
    }

    public List<Carros> getFiltros() {
        return filtros;
    }

    public void setFiltros(List<Carros> filtros) {
        this.filtros = filtros;
    }

    public void llenarTabla(){
        carros.add(new Carros(nombre,marca,modelo));
                
    }

}
