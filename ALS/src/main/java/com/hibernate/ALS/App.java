package com.hibernate.ALS;
import com.hibernate.ALS.dao.libraryDao;
import com.hibernate.ALS.model.library;
public class App 
{
    public static void main( String[] args )
    {
    	libraryDao libdao= new libraryDao();
        library lib=new library("One-Piece","Shonen");
        libdao.saveAnime(lib);
        
        library lib1=new library("Jujutsu Kaisen","Adventure Fiction");
        libdao.saveAnime(lib1);
        
        library lib2=new library("One Punch Man","Shonen");
        libdao.saveAnime(lib2);
        
        lib1.setTitle("JJKS");
        libdao.updateAnime(lib1);
        
        //libdao.deleteAnime(2);
        libdao.getAnimeById(1);
        libdao.getAnimeById(2);
        libdao.getAnimeById(3);
    }
}
