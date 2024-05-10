/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.List;
import DAODataMovie.DataMovieDAO;
import DAOImplement.DataMovieInterface;
import javax.swing.JOptionPane;
import model.*;
import view.MainView;

/**
 *
 * @author HP
 */
public class DataMovieController {

    MainView frame;
    DataMovieInterface ImplDataMovie;
    List<DataMovie> dm;

    public DataMovieController(MainView frame) {
        this.frame = frame;
        ImplDataMovie = new DataMovieDAO();
        dm = ImplDataMovie.getALL();
    }

    public void isiTabel() {
        dm = ImplDataMovie.getALL();
        ModelTabelDataMovie mm = new ModelTabelDataMovie(dm);
        frame.getTabelDataMovie().setModel(mm);
    }

    public void insert() {
        DataMovie dm = new DataMovie();
        dm.setJudul(frame.getJTxtjudul().getText());
        dm.setAlur(Double.parseDouble(frame.getJTxtalur().getText()));
        dm.setPenokohan(Double.parseDouble(frame.getJTxtpenokohan().getText()));
        dm.setAkting(Double.parseDouble(frame.getJTxtakting().getText()));
        dm.setNilai(dm.getNilai());
        ImplDataMovie.insert(dm);
    }

    public void update() {
        DataMovie dm = new DataMovie();
        dm.setJudul(frame.getJTxtjudul().getText());
        dm.setAlur(Double.parseDouble(frame.getJTxtalur().getText()));
        dm.setPenokohan(Double.parseDouble(frame.getJTxtpenokohan().getText()));
        dm.setAkting(Double.parseDouble(frame.getJTxtakting().getText()));
        dm.setNilai(dm.getNilai());
        ImplDataMovie.update(dm);
    }

    public void delete() {
        String judul = frame.getJTxtjudul().getText();
        ImplDataMovie.delete(judul);
    }

}
