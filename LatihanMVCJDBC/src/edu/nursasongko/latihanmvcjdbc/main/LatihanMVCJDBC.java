/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.nursasongko.latihanmvcjdbc.main;

import edu.nursasongko.latihanmvcjdbc.database.KingBarbershopDatabase;
import edu.nursasongko.latihanmvcjdbc.entity.Pelanggan;
import edu.nursasongko.latihanmvcjdbc.error.PelangganException;
import edu.nursasongko.latihanmvcjdbc.service.PelangganDao;
import edu.nursasongko.latihanmvcjdbc.view.MainViewPelanggan;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.SwingUtilities;

/**
* @author 
 * Nama : Nur Sasongko
 * Kelas : IF-2 
 * NIM : 10119049
 * 
 */
public class LatihanMVCJDBC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException, PelangganException {
        // TODO code application logic here
        
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    MainViewPelanggan pelanggan = new MainViewPelanggan();
                    pelanggan.loadDatabase();
                    pelanggan.setVisible(true);
                } catch (SQLException e) {
                } catch (PelangganException ex) {
                    Logger.getLogger(LatihanMVCJDBC.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
                
    }
    
}
