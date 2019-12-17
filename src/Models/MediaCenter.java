/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import DAO.UserDAO;
import java.util.ArrayList;
import java.io.File; 
import java.io.FileInputStream;
import java.io.IOException;
import javafx.embed.swing.JFXPanel;
import org.farng.mp3.MP3File;
import org.farng.mp3.TagException;
import org.farng.mp3.id3.ID3v1;
import javafx.scene.media.*;
/**
 *
 * @author josepgrs
 */
public class MediaCenter {
    private static MediaCenter inst = null;
    private User currentlyLoggedInUser;
    
    
    //private File currenteFilePlaying = null;
    private ArrayList<Conteudo> userContentList;
    private Conteudo currentlyContent;
    private int index = 0;
    private Thread musicThread;
    //private javax.media.Player player;
    private int currentContentPos;
    private PlayerStatus playerStatus;
    private MediaPlayer mediaPlayer;
    

    public MediaCenter() {
        
        this.userContentList = new ArrayList<>();
        this.playerStatus = PlayerStatus.STOP;
        this.currentContentPos = 0;
        currentlyLoggedInUser = null;
        new JFXPanel();
        
    }
    
    public void addFile(File file){
        
        //this.userContentList.add(file);
       
    }
    
    public boolean isPlaying() {
        return playerStatus == PlayerStatus.PLAYING;
    }
    
    
    
    public static MediaCenter getInstance() {
        if(inst == null ) inst = new MediaCenter();
        return inst;
    }
    
    
    public void login(String email, String password) {
        User tmp = UserDAO.getInstance().get(email);
        if(tmp == null) return;
        if(tmp.passwordValida(password)) {
            currentlyLoggedInUser = tmp;
        }
    }
    
    public boolean isAuthenticated() {
        return currentlyLoggedInUser != null;
    }
    
    public User getUser(){
        return this.currentlyLoggedInUser;
    }
    
    public PlayerStatus getStatus(){
        return this.playerStatus;
    }
    
    public Conteudo getCurrentContent(){
        if(this.userContentList.size() == 0)return null;
        return this.userContentList.get(index);
    }
    
    public int getPlayListSize(){
        return this.userContentList.size();
    }
    
    public void readPlaylist() {
       
        //Path p = Paths.get("Conteudo/");
        String[] pathnames;
        
        File f = new File("Conteudo/");
        pathnames = f.list();
        if(pathnames != null) {    
            for(String path : pathnames){
                try {
                    Conteudo tmp = getTagAndCreateContent(path);
                    if(tmp != null)
                        this.userContentList.add(tmp);
                } catch (TagException e) {
                //TODO: FAZER ALGUMA COISA QUANDO AS MUSICAS NAO TEM INFO, GUARDAR NOME FICHEIRO E REPRODUZIR
                }
            }         
        }
    }
    
    private Conteudo getTagAndCreateContent(String path) throws TagException {
        Conteudo content = null;
        try {
                MP3File tmp = new MP3File(new File("Conteudo/" + path));
                if (tmp.hasID3v1Tag()) {
                    ID3v1 id3v1Tag = tmp.getID3v1Tag();
                    content = new Conteudo(0, id3v1Tag.getTitle(), id3v1Tag.getArtist(),"teste",path);
                }
            }catch (IOException e) {
                System.out.println(e.getMessage());
            } 
        return content;
    }
        
    
    
 
    
    public void readANDinit(){
        readPlaylist();
    }
    
    private void reproduceMusic() {
        if(currentlyContent == null) {
        currentlyContent = userContentList.get(index);
        if(currentlyContent == null) return;
        File tmpFile = new File("Conteudo/" + currentlyContent.getPath());
        mediaPlayer = new MediaPlayer(new Media(tmpFile.toURI().toString()));
        } 
        if(mediaPlayer != null) {
        mediaPlayer.play();
        playerStatus = PlayerStatus.PLAYING;
        }
        
        
        
    }
    
   

    public void play(){
        reproduceMusic();
        this.playerStatus = PlayerStatus.PLAYING;
    }
    
    
    public void pause(){
       //currentContentPos = player.getPosition();
        System.out.println(currentContentPos);
        try {
            mediaPlayer.pause();
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
        this.playerStatus = PlayerStatus.PAUSE;
    }
   
   
    
    public void skip_previous_song(){
        pause();
        if(this.userContentList.size() == 0)return;
        
        if(index > 0 ){
            index--;
        }else{
            index = 0;
        }
        //this.currenteFilePlaying = this.userContentList.get(index);
    
    }
    
    public void skip_next_song(){
        pause();
        if(this.userContentList.size() == 0)return;
        
        if(this.userContentList.size() > index + 1){
            index++;
        }else{
            index = 0;
        }
        //this.currenteFilePlaying = this.userContentList.get(index);
    }
    
    
    
    
    
}