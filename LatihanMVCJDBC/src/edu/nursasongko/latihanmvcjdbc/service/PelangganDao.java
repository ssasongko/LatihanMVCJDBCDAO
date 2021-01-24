/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.nursasongko.latihanmvcjdbc.service;

import edu.nursasongko.latihanmvcjdbc.entity.Pelanggan;
import edu.nursasongko.latihanmvcjdbc.error.PelangganException;
import java.util.List;

/**
* @author 
 * Nama : Nur Sasongko
 * Kelas : IF-2 
 * NIM : 10119049
 * 
 */
public interface PelangganDao {
    public void insertPelanggan(Pelanggan pelanggan) throws PelangganException;
    public void updatePelanggan(Pelanggan pelanggan) throws PelangganException;
    public void deletePelanggan(Integer id) throws PelangganException;
    public Pelanggan getPelanggan(Integer id) throws PelangganException;
    public Pelanggan getelanggan(String email) throws PelangganException;
    public List<Pelanggan> selectAllPelanggan() throws PelangganException;


}
