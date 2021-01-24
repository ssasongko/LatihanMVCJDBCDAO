/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.nursasongko.latihanmvcjdbc.event;

import edu.nursasongko.latihanmvcjdbc.entity.Pelanggan;
import edu.nursasongko.latihanmvcjdbc.model.PelangganModel;

/**
* @author 
 * Nama : Nur Sasongko
 * Kelas : IF-2 
 * NIM : 10119049
 * 
 */
public interface PelangganListener {
    
    public void onChange(PelangganModel model);
    public void onInsert(Pelanggan pelanggan);
    public void onDelete();
    public void onUpdate(Pelanggan pelanggan);
}
