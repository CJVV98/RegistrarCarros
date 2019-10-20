/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udec.datatable2.controler;

import com.udec.datatable2.utilitarios.Carros;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.inject.Named;
import javax.faces.view.ViewScoped;

/**
 * Clase encargada de registrar los carros
 * @author Corin V, Alisson Celeita
 */
@Named(value = "registroCarro")
@ViewScoped
public class RegistroCarro implements Serializable{
    /**
     * nombre, del vehiculo
     * marca, del carro
     * marcas, existentes de carros
     * filtros, lista para los filtros
     * modelo, año de lanzamiento del carro
     */
    private String nombre;
    private String marca;
    private List<String> marcas;
    private List<Carros> carros;
    private List<Carros> filtros;
    private Date modelo;
    /**
     * Constructor de la clase, se inicializa las listas
     * y se crea la lista de marcas
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
    /**
     * Metodo para obtener el nombre del vehiculo
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * Metodo para asignar el nombre del carro
     * @param nombre del carro
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * Metodo obtiene la marca seleccionada
     * @return marca seleccionada
     */
    public String getMarca() {
        return marca;
    }
    /**
     * Metodo para asignar la marca del carro
     * @param marca del carro
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }
    /**
     * Obtiene el listado de las marcas
     * @return listado de marcas
     */
    public List<String> getMarcas() {
        return marcas;
    }
    /**
     * Asigna el listado de marcas de carro
     * @param marcas de carros
     */
    public void setMarcas(List<String> marcas) {
        this.marcas = marcas;
    }
    /**
     * Metodo para obtener el modelo(año) del carro
     * @return año de lanzamiento del carro
     */
    public Date getModelo() {
        return modelo;
    }
    /**
     * Metodo para asignar el año del modelo
     * @param modelo del carro
     */
    public void setModelo(Date modelo) {
        this.modelo = modelo;
    }
    /**
     * Metodo para obtener el listado de carros
     * @return listado de carros
     */
    public List<Carros> getCarros() {
        return carros;
    }
    /**
     * Metodo para asignar el listado de carros
     * @param carros, listado de carros
     */
    public void setCarros(List<Carros> carros) {
        this.carros = carros;
    }
    /**
     * Metodo para obtener el listado segun el filtro
     * @return lista filtrada
     */
    public List<Carros> getFiltros() {
        return filtros;
    }
    /**
     * Metodo para asignar el listado de filtros
     * @param filtros, listado segun el filtro
     */
    public void setFiltros(List<Carros> filtros) {
        this.filtros = filtros;
    }
    /**
     * Metodo para llenar el DataTable
     */
    public void llenarTabla(){
        carros.add(new Carros(nombre,marca,modelo));
        nombre="";
        modelo=null;
                
    }

}
