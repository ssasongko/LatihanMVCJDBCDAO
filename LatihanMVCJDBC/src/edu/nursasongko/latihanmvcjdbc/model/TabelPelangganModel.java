/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.nursasongko.latihanmvcjdbc.model;

import edu.nursasongko.latihanmvcjdbc.entity.Pelanggan;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
* @author 
 * Nama : Nur Sasongko
 * Kelas : IF-2 
 * NIM : 10119049
 * 
 */
public class TabelPelangganModel extends AbstractTableModel{

    private List<Pelanggan> list = new ArrayList<Pelanggan>();

    public void setList(List<Pelanggan> list) {
        this.list = list;
    }
    
    
    @Override
    public int getRowCount() {
        return list.size();
    }

    @Override
    public int getColumnCount() {
        return 5;
    }

    public boolean add(Pelanggan e) {
        try {
            return list.add(e);
        } finally {
            fireTableRowsInserted(getRowCount()-1, getRowCount()-1);
        }
    }

    public Pelanggan get(int i) {
        return list.get(i);
    }

    public Pelanggan set(int i, Pelanggan e) {
        try {
            
        return list.set(i, e);
        } finally {
            fireTableRowsUpdated(i, i);
        }
        
    }

    public Pelanggan remove(int i) {
        try {
            
        return list.remove(i);
        } finally{
            fireTableRowsDeleted(i, i);
        }
    }

    
    
    @Override
    public String getColumnName(int i) {
        switch(i){
            case 0 : return "ID";
            case 1 : return "Nama";
            case 2 : return "Alamat";
            case 3 : return "Telepon";
            case 4 : return "Email";
            default :
                return null;
        }
    }
    
    @Override
    public Object getValueAt(int i, int i1) {
        switch(i1){
            case 0 : return list.get(i).getId();
            case 1 : return list.get(i).getNama();
            case 2 : return list.get(i).getAlamat();
            case 3 : return list.get(i).getTelepon();
            case 4 : return list.get(i).getEmail();
            
            default:
                return null;
        }        
    }
    
}
