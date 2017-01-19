package id.sch.smktelkom_mlg.learn.recyclerview3.model;

import android.graphics.drawable.Drawable;

/**
 * Created by user on 18/01/2017.
 */
public class Hotel {

        public String judul;
        public String deksripsi;
        public Drawable foto;

             public Hotel(String judul, String deskripsi, Drawable foto)
                {
                this.judul = judul;
                this.deksripsi = deskripsi;
                this.foto = foto;
                }
    }