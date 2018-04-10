/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import connect_4_deneme.Client;
import java.awt.Button;
import java.awt.Color;
import java.awt.Image;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.io.IOException;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
/**
 *
 * @author M. Furkan Çankaya
 */
public class oyun extends javax.swing.JFrame {

    /**
     * Creates new form oyunn
     */
        //framedeki komponentlere erişim için satatik oyunn değişkeni
    public static oyun ThisGame;
    //ekrandaki resim değişimi için timer yerine thread
    public Thread tmr_slider;
    public String renk="";
    public String oyunn="";
    public String gonderilenButon="";
    int sayac=0;
    int sıra=0;
    int sayac2=0;
    public oyun() {
        initComponents();
        
        
        
        
        ThisGame = this;
        
        
        // resimleri döndürmek için tread aynı zamanda oyunn bitiminide takip ediyor
        tmr_slider = new Thread(() -> {
            //soket bağlıysa dönsün
            while (Client.socket.isConnected()) {
                System.out.println(oyunn+"-"+renk+"-"+gonderilenButon);
                try {
                    //
                    Thread.sleep(100);
                    
                    
                    if(oyunn.equals("strt")){
                        //oyun sırası bzde yada biz başlıyoruz
                        jButton1.setText("connected");
                        jLabel1.setText("Oyun sırası sende.");
                        
                        if(!gonderilenButon.equals("")){
                            butona_renk_ver(gonderilenButon);
                            gonderilenButon="";
                        }
                    }else if(oyunn.equals("wt")){
                        jLabel1.setText("Bekle.");
                    
                    }
                    

                } catch (InterruptedException ex) {
                    Logger.getLogger(oyun.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        
        
        
        
        
        
        
        
        
        
        
        
        button7.setEnabled(false);
        button8.setEnabled(false);
        button9.setEnabled(false);
        button10.setEnabled(false);
        button11.setEnabled(false);
        button12.setEnabled(false);
        button13.setEnabled(false);
        button14.setEnabled(false);
        button15.setEnabled(false);
        button16.setEnabled(false);
        button17.setEnabled(false);
        button18.setEnabled(false);
        button19.setEnabled(false);
        
        button20.setEnabled(false);
        button21.setEnabled(false);
        button22.setEnabled(false);
        button23.setEnabled(false);
        button24.setEnabled(false);
        button25.setEnabled(false);
        button26.setEnabled(false);
        button27.setEnabled(false);
        button28.setEnabled(false);
        button29.setEnabled(false);
        button30.setEnabled(false);
        button31.setEnabled(false);
        button32.setEnabled(false);
        button33.setEnabled(false);
        button34.setEnabled(false);
        button35.setEnabled(false);
        button36.setEnabled(false);
       
        
    }

    public void butona_renk_ver(String butonismi){
 /*   Button dizi[][]={{button1,button2,button3,button4,button5,button6},
                        {button7,button8,button9,button10,button11,button12},
                        {button13,button14,button15,button16,button17,button18},
                        {button19,button20,button21,button22,button23,button24},
                        {button25,button26,button27,button28,button29,button30},
                        {button31,button32,button33,button34,button35,button36}
            
                        };
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if(butonismi.equals(dizi[i][j].getName())){
                    if(renk.equals("kirmizi"))
                        dizi[i][j-1].setBackground(Color.green);
                    else
                        dizi[i][j-1].setBackground(Color.red);
                    dizi[i][j-1].setEnabled(false);
                    if((i+1)!=6)
                        dizi[i+1][j-1].setEnabled(true);
                    break;
                }
            }
        }*/
        
           if(butonismi.equals("button1")){
            if(renk.equals("kirmizi")){
                button1.setBackground(Color.green);
            }
            else{
                button1.setBackground(Color.red);
            }
            
            button1.setEnabled(false);
            button7.setEnabled(true);
        }
       else if(butonismi.equals("button2")){
            if(renk.equals("kirmizi")){
                button2.setBackground(Color.green);
            }
            else{
                button2.setBackground(Color.red);
            }
            
            button2.setEnabled(false);
            button8.setEnabled(true);
        }
       else if(butonismi.equals("button3")){
            if(renk.equals("kirmizi")){
                button3.setBackground(Color.green);
            }
            else{
                button3.setBackground(Color.red);
            }
            
            button3.setEnabled(false);
            button9.setEnabled(true);
        }
       else if(butonismi.equals("button4")){
            if(renk.equals("kirmizi")){
                button4.setBackground(Color.green);
            }
            else{
                button4.setBackground(Color.red);
            }
            
            button4.setEnabled(false);
            button10.setEnabled(true);
        }
       else if(butonismi.equals("button5")){
            if(renk.equals("kirmizi")){
                button5.setBackground(Color.green);
            }
            else{
                button5.setBackground(Color.red);
            }
            
            button5.setEnabled(false);
            button11.setEnabled(true);
        }
        else if(butonismi.equals("button6")){
            if(renk.equals("kirmizi")){
                button6.setBackground(Color.green);
            }
            else{
                button6.setBackground(Color.red);
            }
            
            button6.setEnabled(false);
            button12.setEnabled(true);
        }
        else if(butonismi.equals("button7")){
            if(renk.equals("kirmizi")){
                button7.setBackground(Color.green);
            }
            else{
                button7.setBackground(Color.red);
            }
            
            button7.setEnabled(false);
            button13.setEnabled(true);
        }
        else if(butonismi.equals("button8")){
            if(renk.equals("kirmizi")){
                button8.setBackground(Color.green);
            }
            else{
                button8.setBackground(Color.red);
            }
            
            button8.setEnabled(false);
            button14.setEnabled(true);
        }
        else if(butonismi.equals("button9")){
            if(renk.equals("kirmizi")){
                button9.setBackground(Color.green);
            }
            else{
                button9.setBackground(Color.red);
            }
            
            button9.setEnabled(false);
            button15.setEnabled(true);
        }
        else if(butonismi.equals("button10")){
            if(renk.equals("kirmizi")){
                button10.setBackground(Color.green);
            }
            else{
                button10.setBackground(Color.red);
            }
            
            button10.setEnabled(false);
            button16.setEnabled(true);
        }
        else if(butonismi.equals("button11")){
            if(renk.equals("kirmizi")){
                button11.setBackground(Color.green);
            }
            else{
                button11.setBackground(Color.red);
            }
            
            button11.setEnabled(false);
            button17.setEnabled(true);
        }
        else if(butonismi.equals("button12")){
            if(renk.equals("kirmizi")){
                button12.setBackground(Color.green);
            }
            else{
                button12.setBackground(Color.red);
            }
            
            button12.setEnabled(false);
            button18.setEnabled(true);
        }
        else if(butonismi.equals("button13")){
            if(renk.equals("kirmizi")){
                button13.setBackground(Color.green);
            }
            else{
                button13.setBackground(Color.red);
            }
            
            button13.setEnabled(false);
            button19.setEnabled(true);
        }
        else if(butonismi.equals("button14")){
            if(renk.equals("kirmizi")){
                button14.setBackground(Color.green);
            }
            else{
                button14.setBackground(Color.red);
            }
            
            button14.setEnabled(false);
            button20.setEnabled(true);
        }
        else if(butonismi.equals("button15")){
            if(renk.equals("kirmizi")){
                button15.setBackground(Color.green);
            }
            else{
                button15.setBackground(Color.red);
            }
            
            button15.setEnabled(false);
            button21.setEnabled(true);
        }
        else if(butonismi.equals("button16")){
            if(renk.equals("kirmizi")){
                button16.setBackground(Color.green);
            }
            else{
                button16.setBackground(Color.red);
            }
            
            button16.setEnabled(false);
            button22.setEnabled(true);
        } 
        else if(butonismi.equals("button17")){
            if(renk.equals("kirmizi")){
                button17.setBackground(Color.green);
            }
            else{
                button17.setBackground(Color.red);
            }
            
            button17.setEnabled(false);
            button23.setEnabled(true);
        } 
        else if(butonismi.equals("button18")){
            if(renk.equals("kirmizi")){
                button18.setBackground(Color.green);
            }
            else{
                button18.setBackground(Color.red);
            }
            
            button18.setEnabled(false);
            button24.setEnabled(true);
        } 
        else if(butonismi.equals("button19")){
            if(renk.equals("kirmizi")){
                button19.setBackground(Color.green);
            }
            else{
                button19.setBackground(Color.red);
            }
            
            button19.setEnabled(false);
            button25.setEnabled(true);
        } 
        else if(butonismi.equals("button20")){
            if(renk.equals("kirmizi")){
                button20.setBackground(Color.green);
            }
            else{
                button20.setBackground(Color.red);
            }
            
            button20.setEnabled(false);
            button26.setEnabled(true);
        } 
        else if(butonismi.equals("button21")){
            if(renk.equals("kirmizi")){
                button21.setBackground(Color.green);
            }
            else{
                button21.setBackground(Color.red);
            }
            
            button21.setEnabled(false);
            button27.setEnabled(true);
        } 
        else if(butonismi.equals("button22")){
            if(renk.equals("kirmizi")){
                button22.setBackground(Color.green);
            }
            else{
                button22.setBackground(Color.red);
            }
            
            button22.setEnabled(false);
            button28.setEnabled(true);
        } 
        else if(butonismi.equals("button23")){
            if(renk.equals("kirmizi")){
                button23.setBackground(Color.green);
            }
            else{
                button23.setBackground(Color.red);
            }
            
            button23.setEnabled(false);
            button29.setEnabled(true);
        } 
        else if(butonismi.equals("button24")){
            if(renk.equals("kirmizi")){
                button24.setBackground(Color.green);
            }
            else{
                button24.setBackground(Color.red);
            }
            button24.setEnabled(false);
            button30.setEnabled(true);
        } 
        else if(butonismi.equals("button25")){
            if(renk.equals("kirmizi")){
                button25.setBackground(Color.green);
            }
            else{
                button25.setBackground(Color.red);
            }
            button25.setEnabled(false);
            button31.setEnabled(true);
        }
        else if(butonismi.equals("button26")){
            if(renk.equals("kirmizi")){
                button26.setBackground(Color.green);
            }
            else{
                button26.setBackground(Color.red);
            }
            button26.setEnabled(false);
            button32.setEnabled(true);
        }
        else if(butonismi.equals("button27")){
            if(renk.equals("kirmizi")){
                button27.setBackground(Color.green);
            }
            else{
                button27.setBackground(Color.red);
            }
            button27.setEnabled(false);
            button33.setEnabled(true);
        }
        else if(butonismi.equals("button28")){
            if(renk.equals("kirmizi")){
                button28.setBackground(Color.green);
            }
            else{
                button28.setBackground(Color.red);
            }
            button28.setEnabled(false);
            button34.setEnabled(true);
        }
        else if(butonismi.equals("button29")){
            if(renk.equals("kirmizi")){
                button29.setBackground(Color.green);
            }
            else{
                button29.setBackground(Color.red);
            }
            button29.setEnabled(false);
            button35.setEnabled(true);
        }
        else if(butonismi.equals("button30")){
            if(renk.equals("kirmizi")){
                button30.setBackground(Color.green);
            }
            else{
                button30.setBackground(Color.red);
            }
            button30.setEnabled(false);
            button36.setEnabled(true);
        }
        else if(butonismi.equals("button31")){
            if(renk.equals("kirmizi")){
                button31.setBackground(Color.green);
            }
            else{
                button31.setBackground(Color.red);
            }
            button31.setEnabled(false);
        }
        else if(butonismi.equals("button32")){
            if(renk.equals("kirmizi")){
                button32.setBackground(Color.green);
            }
            else{
                button32.setBackground(Color.red);
            }
            button32.setEnabled(false);
        }
        else if(butonismi.equals("button33")){
            if(renk.equals("kirmizi")){
                button33.setBackground(Color.green);
            }
            else{
                button33.setBackground(Color.red);
            }
            button33.setEnabled(false);
        }
        else if(butonismi.equals("button34")){
            if(renk.equals("kirmizi")){
                button34.setBackground(Color.green);
            }
            else{
                button34.setBackground(Color.red);
            }
            button34.setEnabled(false);
        }
        else if(butonismi.equals("button35")){
            if(renk.equals("kirmizi")){
                button35.setBackground(Color.green);
            }
            else{
                button35.setBackground(Color.red);
            }
            button35.setEnabled(false);
        }
        else if(butonismi.equals("button36")){
            if(renk.equals("kirmizi")){
                button36.setBackground(Color.green);
            }
            else{
                button36.setBackground(Color.red);
            }
            button36.setEnabled(false);
        }
        
        buton1();
        buton2();
    }

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        button1 = new java.awt.Button();
        button2 = new java.awt.Button();
        button3 = new java.awt.Button();
        button4 = new java.awt.Button();
        button5 = new java.awt.Button();
        button6 = new java.awt.Button();
        button7 = new java.awt.Button();
        button8 = new java.awt.Button();
        button9 = new java.awt.Button();
        button10 = new java.awt.Button();
        button11 = new java.awt.Button();
        button12 = new java.awt.Button();
        button13 = new java.awt.Button();
        button14 = new java.awt.Button();
        button15 = new java.awt.Button();
        button16 = new java.awt.Button();
        button17 = new java.awt.Button();
        button18 = new java.awt.Button();
        button19 = new java.awt.Button();
        button20 = new java.awt.Button();
        button21 = new java.awt.Button();
        button22 = new java.awt.Button();
        button23 = new java.awt.Button();
        button24 = new java.awt.Button();
        button25 = new java.awt.Button();
        button26 = new java.awt.Button();
        button27 = new java.awt.Button();
        button28 = new java.awt.Button();
        button29 = new java.awt.Button();
        button30 = new java.awt.Button();
        button31 = new java.awt.Button();
        button32 = new java.awt.Button();
        button33 = new java.awt.Button();
        button34 = new java.awt.Button();
        button35 = new java.awt.Button();
        button36 = new java.awt.Button();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        button1.setLabel("       ");
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });

        button2.setLabel("      ");
        button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button2ActionPerformed(evt);
            }
        });

        button3.setLabel("       ");
        button3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button3ActionPerformed(evt);
            }
        });

        button4.setLabel("        ");
        button4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button4ActionPerformed(evt);
            }
        });

        button5.setLabel("       ");
        button5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button5ActionPerformed(evt);
            }
        });

        button6.setLabel("        ");
        button6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button6ActionPerformed(evt);
            }
        });

        button7.setLabel("      ");
        button7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button7ActionPerformed(evt);
            }
        });

        button8.setLabel("      ");
        button8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button8ActionPerformed(evt);
            }
        });

        button9.setLabel("       ");
        button9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button9ActionPerformed(evt);
            }
        });

        button10.setLabel("        ");
        button10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button10ActionPerformed(evt);
            }
        });

        button11.setLabel("        ");
        button11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button11ActionPerformed(evt);
            }
        });

        button12.setLabel("        ");
        button12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button12ActionPerformed(evt);
            }
        });

        button13.setLabel("      ");
        button13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button13ActionPerformed(evt);
            }
        });

        button14.setLabel("      ");
        button14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button14ActionPerformed(evt);
            }
        });

        button15.setLabel("        ");
        button15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button15ActionPerformed(evt);
            }
        });

        button16.setLabel("        ");
        button16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button16ActionPerformed(evt);
            }
        });

        button17.setLabel("        ");
        button17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button17ActionPerformed(evt);
            }
        });

        button18.setLabel("       ");
        button18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button18ActionPerformed(evt);
            }
        });

        button19.setLabel("      ");
        button19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button19ActionPerformed(evt);
            }
        });

        button20.setLabel("       ");
        button20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button20ActionPerformed(evt);
            }
        });

        button21.setLabel("       ");
        button21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button21ActionPerformed(evt);
            }
        });

        button22.setLabel("       ");
        button22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button22ActionPerformed(evt);
            }
        });

        button23.setLabel("        ");
        button23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button23ActionPerformed(evt);
            }
        });

        button24.setLabel("        ");
        button24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button24ActionPerformed(evt);
            }
        });

        button25.setLabel("      ");
        button25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button25ActionPerformed(evt);
            }
        });

        button26.setLabel("        ");
        button26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button26ActionPerformed(evt);
            }
        });

        button27.setLabel("        ");
        button27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button27ActionPerformed(evt);
            }
        });

        button28.setLabel("        ");
        button28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button28ActionPerformed(evt);
            }
        });

        button29.setLabel("        ");
        button29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button29ActionPerformed(evt);
            }
        });

        button30.setLabel("        ");
        button30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button30ActionPerformed(evt);
            }
        });

        button31.setLabel("      ");
        button31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button31ActionPerformed(evt);
            }
        });

        button32.setLabel("       ");
        button32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button32ActionPerformed(evt);
            }
        });

        button33.setLabel("        ");
        button33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button33ActionPerformed(evt);
            }
        });

        button34.setLabel("       ");
        button34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button34ActionPerformed(evt);
            }
        });

        button35.setLabel("        ");
        button35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button35ActionPerformed(evt);
            }
        });

        button36.setLabel("       ");
        button36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button36ActionPerformed(evt);
            }
        });

        jLabel1.setText("jLabel1");

        jButton1.setText("connect");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(button31, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(button25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(button19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(button13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(button7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(button2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(button8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(button14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(button20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(button26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(button32, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(74, 74, 74)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(button3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(button9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(button15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(button21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(button27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(button33, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(66, 66, 66)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(button4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(button10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(button16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(button22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(button28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(button34, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(button5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(button11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(button17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(button23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(button29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(button35, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(button24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(button30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(button6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(button12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(button18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(button36, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE))
                        .addGap(96, 96, 96))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(212, 212, 212))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(jButton1))
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(button31, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(button32, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(button33, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(button34, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(button35, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(button36, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(button25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(button26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(button27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(button28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(button29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(button30, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(button19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(button20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(button21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(button22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(button23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(button24, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(button13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(button14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(button15, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(button16, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button17, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button18, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(button7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(button8, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(button9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(button6, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                            .addComponent(button5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(button4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(button3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(button2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(100, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void Reset()
    {
        if (Client.socket!=null) {
            if (Client.socket.isConnected())
            {
                Client.Stop();
            }
        }
    }
    
    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
        // TODO add your handling code here:
        
//        sıra++;
//        if(sıra%2==0){
//            button1.setBackground(Color.green);
//            buton1();
//        
//        }
//        else{
//        button1.setBackground(Color.red);
//        buton2();
//        }
//        button7.setEnabled(true);
//        sayac++;
//        button1.setEnabled(false);

        if(button1.isEnabled() && oyunn.equals("strt")){
            
            if(renk.equals("kirmizi")){
                button1.setBackground(Color.red);
            }
            else{
                button1.setBackground(Color.green);
            }
            button1.setEnabled(false);
            button7.setEnabled(true);
            
            oyunn = "wt";
            Message msg = new Message(Message.Message_Type.Start);
            msg.content = "strt";
            Client.Send(msg);
            
            msg = new Message(Message.Message_Type.Buton);
            msg.content = "button1";
            Client.Send(msg);
            
            oyun_bittimi_kontrol();
        }
        
        
        
        
        
        
    }//GEN-LAST:event_button1ActionPerformed

    public void oyun_bittimi_kontrol(){
    buton1();
    buton2();
    kirmiziCapraz();
    
    
    }
    
    public void yeşilCapraz(){
        Button dizi[][]={{button1,button2,button3,button4,button5,button6},
                        {button7,button8,button9,button10,button11,button12},
                        {button13,button14,button15,button16,button17,button18},
                        {button19,button20,button21,button22,button23,button24},
                        {button25,button26,button27,button28,button29,button30},
                        {button31,button32,button33,button34,button35,button36}
            
                        };
        sayac2=0;
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if(dizi[i][j].getBackground().equals(dizi[i+1][j+1].getBackground())&& (dizi[i+2][j+2].getBackground().equals(dizi[i+3][j+3].getBackground())) && dizi[i][j].getBackground().equals(Color.green)&& dizi[i+3][j+3].getBackground().equals(Color.green)){
                    sayac2=3;
                    break;
                }
                
                
        }
            if(sayac2==3)
                break;
        }
        if(sayac2>=3){
                    
            
            JOptionPane.showMessageDialog(this, "Yeşiller Kazandın", "Tebrikler", JOptionPane.INFORMATION_MESSAGE);
            sonuç s = new sonuç();
            s.setVisible(true);
            this.dispose();
                }
        else{
            for (int i = 0; i < 3; i++) {
            for (int j = 5; j >= 3; j--) {
                if(dizi[i][j].getBackground().equals(dizi[i+1][j-1].getBackground())&& dizi[i+2][j-2].getBackground().equals(dizi[i+3][j-3].getBackground().equals(Color.green)) && dizi[i][j].getBackground().equals(Color.green)){
                    sayac2=3;
                }
            }
            if(sayac2==3)
                break;
            sayac2=0;
        }
            if(sayac2>=3){
                    
            
            JOptionPane.showMessageDialog(this, "Yeşiller Kazandın", "Tebrikler", JOptionPane.INFORMATION_MESSAGE);
            sonuç s = new sonuç();
            s.setVisible(true);
            this.dispose();
                }
        }
        
    }
    
     public void kirmiziCapraz(){
        Button dizi[][]={{button1,button2,button3,button4,button5,button6},
                        {button7,button8,button9,button10,button11,button12},
                        {button13,button14,button15,button16,button17,button18},
                        {button19,button20,button21,button22,button23,button24},
                        {button25,button26,button27,button28,button29,button30},
                        {button31,button32,button33,button34,button35,button36}
            
                        };
        sayac2=0;
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if(dizi[i][j].getBackground().equals(dizi[i+1][j+1].getBackground())&& (dizi[i+2][j+2].getBackground().equals(dizi[i+3][j+3].getBackground())) && dizi[i][j].getBackground().equals(Color.red)&& dizi[i+3][j+3].getBackground().equals(Color.red)){
                    sayac2=3;
                    break;
                }
                
                
        }
            if(sayac2==3)
                break;
        }
        if(sayac2>=3){
                    
            
            JOptionPane.showMessageDialog(this, "Kırmızılar Kazandı", "Oyun Bitti", JOptionPane.INFORMATION_MESSAGE);
            sonuç s = new sonuç();
            s.setVisible(true);
            this.dispose();
                }
        else{
            for (int i = 0; i < 3; i++) {
            for (int j = 5; j >= 3; j--) {
                if(dizi[i][j].getBackground().equals(dizi[i+1][j-1].getBackground())&& dizi[i+2][j-2].getBackground().equals(dizi[i+3][j-3].getBackground().equals(Color.red)) && dizi[i][j].getBackground().equals(Color.red)){
                    sayac2=3;
                }
            }
            if(sayac2==3)
                break;
            sayac2=0;
        }
            if(sayac2>=3){
                    
            
            JOptionPane.showMessageDialog(this, "Kırmızılar Kazandı", "Oyun Bitti", JOptionPane.INFORMATION_MESSAGE);
            sonuç s = new sonuç();
            s.setVisible(true);
            this.dispose();
                }
        }
        
    }
    
    
    public void buton1(){
            Button dizi[][]={{button1,button2,button3,button4,button5,button6},
                        {button7,button8,button9,button10,button11,button12},
                        {button13,button14,button15,button16,button17,button18},
                        {button19,button20,button21,button22,button23,button24},
                        {button25,button26,button27,button28,button29,button30},
                        {button31,button32,button33,button34,button35,button36}
            
                        };
             sayac2=0;
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if(j!=5)
                {
                if(dizi[i][j].getBackground().equals(dizi[i][j+1].getBackground()) && dizi[i][j].getBackground().equals(Color.green))
                 {
                    sayac2++;
                 }
                else{
                    sayac2=0;
                    //break;
                    }
                }
                if(sayac2==3)
                    break;
            }
            if(sayac2==3)
                break;
            sayac2=0;
            
        }
        if(sayac2>=3){
                    
            
            JOptionPane.showMessageDialog(this, "Yeşiller Kazandı", "Oyun Bitti", JOptionPane.INFORMATION_MESSAGE);
            sonuç s = new sonuç();
            s.setVisible(true);
            this.dispose();
                }
        
        
        
        
        else{
            for (int i = 0; i < 6; i++) {
                for (int j = 0; j < 6; j++) {
                    if(j!=5){
                        if(dizi[j][i].getBackground().equals(dizi[j+1][i].getBackground()) && dizi[j][i].getBackground().equals(Color.green))
                 {
                    sayac2++;
                 }
                else{
                    sayac2=0;
                    //break;
                    }
                        
                    }
                    if(sayac2==3){
                        break;
                    }
                }
                if(sayac2==3){
                    break;
                }
                sayac2=0;
            }
            if(sayac2==3){
                JOptionPane.showMessageDialog(this, "Yeşiller Kazandı", "Oyun Bitti", JOptionPane.INFORMATION_MESSAGE);
            sonuç s = new sonuç();
            s.setVisible(true);
            this.dispose();
            }
            else{
                yeşilCapraz();
            }
        }
}

public void buton2(){
            Button dizi[][]={{button1,button2,button3,button4,button5,button6},
                        {button7,button8,button9,button10,button11,button12},
                        {button13,button14,button15,button16,button17,button18},
                        {button19,button20,button21,button22,button23,button24},
                        {button25,button26,button27,button28,button29,button30},
                        {button31,button32,button33,button34,button35,button36}
            
                        };
            sayac2=0;
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if(j!=5)
                {
                if(dizi[i][j].getBackground().equals(dizi[i][j+1].getBackground()) && dizi[i][j].getBackground().equals(Color.red))
                 {
                    sayac2++;
                 }
                else{
                    sayac2=0;
                    //break;
                    }
                }
                if(sayac2==3)
                    break;
            }
            if(sayac2==3)
                break;
            sayac2=0;
            
        }
        if(sayac2>=3){
                    
            
            JOptionPane.showMessageDialog(this, "Kırmızılar Kazandı", "Oyun Bitti", JOptionPane.INFORMATION_MESSAGE);
            sonuç s = new sonuç();
            s.setVisible(true);
            this.dispose();
                }
        
        
        
        
        else{
            for (int i = 0; i < 6; i++) {
                for (int j = 0; j < 6; j++) {
                    if(j!=5){
                        if(dizi[j][i].getBackground().equals(dizi[j+1][i].getBackground()) && dizi[j][i].getBackground().equals(Color.red))
                 {
                    sayac2++;
                 }
                else{
                    sayac2=0;
                    //break;
                    }
                        
                    }
                    if(sayac2==3){
                        break;
                    }
                }
                if(sayac2==3){
                    break;
                }
                sayac2=0;
            }
            if(sayac2>=3){
                JOptionPane.showMessageDialog(this, "Kırmızılar Kazandı", "Oyun Bitti", JOptionPane.INFORMATION_MESSAGE);
            sonuç s = new sonuç();
            s.setVisible(true);
            this.dispose();
            }
        }
        
}

    private void button7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button7ActionPerformed
        // TODO add your handling code here:
       /* sıra++;
        if(sıra%2==0){
            button7.setBackground(Color.green);
            buton1();
        }
        else{
        button7.setBackground(Color.red);
        buton2();
        }
        button13.setEnabled(true);
        sayac++;
        button7.setEnabled(false);*/
       
       if(button7.isEnabled() && oyunn.equals("strt")){
            if(renk.equals("kirmizi")){
                button7.setBackground(Color.red);
            }
            else{
                button7.setBackground(Color.green);
            }
            button7.setEnabled(false);
            button13.setEnabled(true);
            
            oyunn = "wt";
            Message msg = new Message(Message.Message_Type.Start);
            msg.content = "strt";
            Client.Send(msg);
            
            msg = new Message(Message.Message_Type.Buton);
            msg.content = "button7";
            Client.Send(msg);
            
            oyun_bittimi_kontrol();
        }
    }//GEN-LAST:event_button7ActionPerformed

    private void button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button2ActionPerformed
        // TODO add your handling code here:
  /**      sıra++;
        if(sıra%2==0){
            button2.setBackground(Color.green);
            buton1();
        }
        else{
        button2.setBackground(Color.red);
        buton2();
        }
        button8.setEnabled(true);
        sayac++;
        button2.setEnabled(false); */
  
  if(button2.isEnabled() && oyunn.equals("strt")){
            if(renk.equals("kirmizi")){
                button2.setBackground(Color.red);
            }
            else{
                button2.setBackground(Color.green);
            }
            button2.setEnabled(false);
            button8.setEnabled(true);
            oyunn = "wt";
            Message msg = new Message(Message.Message_Type.Start);
            msg.content = "strt";
            Client.Send(msg);
            
            msg = new Message(Message.Message_Type.Buton);
            msg.content = "button2";
            Client.Send(msg);
            
            oyun_bittimi_kontrol();
        }
        
    }//GEN-LAST:event_button2ActionPerformed

    private void button8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button8ActionPerformed
        // TODO add your handling code here:
     /*   sıra++;
        if(sıra%2==0){
            button8.setBackground(Color.green);
            buton1();
        }
        else{
        button8.setBackground(Color.red);
        buton2();
        }
        button14.setEnabled(true);
        sayac++;
        button8.setEnabled(false);*/
     if(button8.isEnabled() && oyunn.equals("strt")){
            if(renk.equals("kirmizi")){
                button8.setBackground(Color.red);
            }
            else{
                button8.setBackground(Color.green);
            }
            button8.setEnabled(false);
            button14.setEnabled(true);
            
            oyunn = "wt";
            Message msg = new Message(Message.Message_Type.Start);
            msg.content = "strt";
            Client.Send(msg);
            
            msg = new Message(Message.Message_Type.Buton);
            msg.content = "button8";
            Client.Send(msg);
            
            oyun_bittimi_kontrol();
        }
        
    }//GEN-LAST:event_button8ActionPerformed

    private void button3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button3ActionPerformed
        // TODO add your handling code here:
    /*    sıra++;
        if(sıra%2==0){
            button3.setBackground(Color.green);
            buton1();
        }
        else{
        button3.setBackground(Color.red);
        buton2();
        }
        button9.setEnabled(true);
        sayac++;
        button3.setEnabled(false);*/
        
    
    if(button3.isEnabled() && oyunn.equals("strt")){
            if(renk.equals("kirmizi")){
                button3.setBackground(Color.red);
            }
            else{
                button3.setBackground(Color.green);
            }
            button3.setEnabled(false);
            button9.setEnabled(true);
            
            oyunn = "wt";
            Message msg = new Message(Message.Message_Type.Start);
            msg.content = "strt";
            Client.Send(msg);
            
            msg = new Message(Message.Message_Type.Buton);
            msg.content = "button3";
            Client.Send(msg);
            
            oyun_bittimi_kontrol();
        }
    }//GEN-LAST:event_button3ActionPerformed

    private void button9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button9ActionPerformed
        // TODO add your handling code here:
    /*    sıra++;
        if(sıra%2==0){
            button9.setBackground(Color.green);
            buton1();
        }
        else{
        button9.setBackground(Color.red);
        buton2();
        }
        button15.setEnabled(true);
        sayac++;
        button9.setEnabled(false);*/
    
    if(button9.isEnabled() && oyunn.equals("strt")){
            if(renk.equals("kirmizi")){
                button9.setBackground(Color.red);
            }
            else{
                button9.setBackground(Color.green);
            }
            button9.setEnabled(false);
            button15.setEnabled(true);
            
            oyunn = "wt";
            Message msg = new Message(Message.Message_Type.Start);
            msg.content = "strt";
            Client.Send(msg);
            
            msg = new Message(Message.Message_Type.Buton);
            msg.content = "button9";
            Client.Send(msg);
            
            oyun_bittimi_kontrol();
        }
    
        
    }//GEN-LAST:event_button9ActionPerformed

    private void button13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button13ActionPerformed
        // TODO add your handling code here:
    /*     sıra++;
        if(sıra%2==0){
            button13.setBackground(Color.green);
            buton1();
        }
        else{
        button13.setBackground(Color.red);
        buton2();
        }
        button19.setEnabled(true);
        sayac++;
        button13.setEnabled(false);*/
    
        if(button13.isEnabled() && oyunn.equals("strt")){
            if(renk.equals("kirmizi")){
                button13.setBackground(Color.red);
            }
            else{
                button13.setBackground(Color.green);
            }
            button13.setEnabled(false);
            button19.setEnabled(true);
            
            oyunn = "wt";
            Message msg = new Message(Message.Message_Type.Start);
            msg.content = "strt";
            Client.Send(msg);
            
            msg = new Message(Message.Message_Type.Buton);
            msg.content = "button13";
            Client.Send(msg);
            
            oyun_bittimi_kontrol();
        }
    }//GEN-LAST:event_button13ActionPerformed

    private void button14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button14ActionPerformed
        // TODO add your handling code here:
     /*   sıra++;
        if(sıra%2==0){
            button14.setBackground(Color.green);
            buton1();
        }
        else{
        button14.setBackground(Color.red);
        buton2();
        }
        button20.setEnabled(true);
        sayac++;
        button14.setEnabled(false);*/
     
     if(button14.isEnabled() && oyunn.equals("strt")){
            if(renk.equals("kirmizi")){
                button14.setBackground(Color.red);
            }
            else{
                button14.setBackground(Color.green);
            }
            button14.setEnabled(false);
            button20.setEnabled(true);
            
            oyunn = "wt";
            Message msg = new Message(Message.Message_Type.Start);
            msg.content = "strt";
            Client.Send(msg);
            
            msg = new Message(Message.Message_Type.Buton);
            msg.content = "button14";
            Client.Send(msg);
            
            oyun_bittimi_kontrol();
        }
        
    }//GEN-LAST:event_button14ActionPerformed

    private void button15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button15ActionPerformed
        // TODO add your handling code here:
     /*   sıra++;
        if(sıra%2==0){
            button15.setBackground(Color.green);
            buton1();
        }
        else{
        button15.setBackground(Color.red);
        buton2();
        }
        button21.setEnabled(true);
        sayac++;
        button15.setEnabled(false);*/
     
      if(button15.isEnabled() && oyunn.equals("strt")){
            if(renk.equals("kirmizi")){
                button15.setBackground(Color.red);
            }
            else{
                button15.setBackground(Color.green);
            }
            button15.setEnabled(false);
            button21.setEnabled(true);
            
            oyunn = "wt";
            Message msg = new Message(Message.Message_Type.Start);
            msg.content = "strt";
            Client.Send(msg);
            
            msg = new Message(Message.Message_Type.Buton);
            msg.content = "button15";
            Client.Send(msg);
            
            oyun_bittimi_kontrol();
        }
        
            
    }//GEN-LAST:event_button15ActionPerformed

    private void button4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button4ActionPerformed
        // TODO add your handling code here:
    /*    sıra++;
        if(sıra%2==0){
            button4.setBackground(Color.green);
            buton1();
        }
        else{
        button4.setBackground(Color.red);
        buton2();
        }
        button10.setEnabled(true);
        sayac++;
        button4.setEnabled(false);*/
    
    if(button4.isEnabled() && oyunn.equals("strt")){
            if(renk.equals("kirmizi")){
                button4.setBackground(Color.red);
            }
            else{
                button4.setBackground(Color.green);
            }
            button4.setEnabled(false);
            button10.setEnabled(true);
            
            oyunn = "wt";
            Message msg = new Message(Message.Message_Type.Start);
            msg.content = "strt";
            Client.Send(msg);
            
            msg = new Message(Message.Message_Type.Buton);
            msg.content = "button4";
            Client.Send(msg);
            
            oyun_bittimi_kontrol();
        }
        
    }//GEN-LAST:event_button4ActionPerformed

    private void button10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button10ActionPerformed
        // TODO add your handling code here:
    /*    sıra++;
        if(sıra%2==0){
            button10.setBackground(Color.green);
            buton1();
        }
        else{
        button10.setBackground(Color.red);
        buton2();
        }
        button16.setEnabled(true);
        sayac++;
        button10.setEnabled(false);*/
    if(button10.isEnabled() && oyunn.equals("strt")){
            if(renk.equals("kirmizi")){
                button10.setBackground(Color.red);
            }
            else{
                button10.setBackground(Color.green);
            }
            button10.setEnabled(false);
            button16.setEnabled(true);
            
            oyunn = "wt";
            Message msg = new Message(Message.Message_Type.Start);
            msg.content = "strt";
            Client.Send(msg);
            
            msg = new Message(Message.Message_Type.Buton);
            msg.content = "button10";
            Client.Send(msg);
            
            oyun_bittimi_kontrol();
        }
        
    }//GEN-LAST:event_button10ActionPerformed

    private void button16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button16ActionPerformed
        // TODO add your handling code here:
     /*   sıra++;
        if(sıra%2==0){
            button16.setBackground(Color.green);
            buton1();
        }
        else{
        button16.setBackground(Color.red);
        buton2();
        }
        button22.setEnabled(true);
        sayac++;
        button16.setEnabled(false);*/
     if(button16.isEnabled() && oyunn.equals("strt")){
            if(renk.equals("kirmizi")){
                button16.setBackground(Color.red);
            }
            else{
                button16.setBackground(Color.green);
            }
            button16.setEnabled(false);
            button22.setEnabled(true);
            
            oyunn = "wt";
            Message msg = new Message(Message.Message_Type.Start);
            msg.content = "strt";
            Client.Send(msg);
            
            msg = new Message(Message.Message_Type.Buton);
            msg.content = "button16";
            Client.Send(msg);
            
            oyun_bittimi_kontrol();
        }
        
    }//GEN-LAST:event_button16ActionPerformed

    private void button5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button5ActionPerformed
        // TODO add your handling code here:
      /*  sıra++;
        if(sıra%2==0){
            button5.setBackground(Color.green);
            buton1();
        }
        else{
        button5.setBackground(Color.red);
        buton2();
        }
        button11.setEnabled(true);
        sayac++;
        button5.setEnabled(false);*/
      
      if(button5.isEnabled() && oyunn.equals("strt")){
            if(renk.equals("kirmizi")){
                button5.setBackground(Color.red);
            }
            else{
                button5.setBackground(Color.green);
            }
            button5.setEnabled(false);
            button11.setEnabled(true);
            
            oyunn = "wt";
            Message msg = new Message(Message.Message_Type.Start);
            msg.content = "strt";
            Client.Send(msg);
            
            msg = new Message(Message.Message_Type.Buton);
            msg.content = "button5";
            Client.Send(msg);
            
            oyun_bittimi_kontrol();
        }
        
    }//GEN-LAST:event_button5ActionPerformed

    private void button11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button11ActionPerformed
        // TODO add your handling code here:
    /*    sıra++;
        if(sıra%2==0){
            button11.setBackground(Color.green);
            buton1();
        }
        else{
        button11.setBackground(Color.red);
        buton2();
        }
        button17.setEnabled(true);
        sayac++;
        button11.setEnabled(false);*/
    if(button11.isEnabled() && oyunn.equals("strt")){
            if(renk.equals("kirmizi")){
                button11.setBackground(Color.red);
            }
            else{
                button11.setBackground(Color.green);
            }
            button11.setEnabled(false);
            button17.setEnabled(true);
            
            oyunn = "wt";
            Message msg = new Message(Message.Message_Type.Start);
            msg.content = "strt";
            Client.Send(msg);
            
            msg = new Message(Message.Message_Type.Buton);
            msg.content = "button11";
            Client.Send(msg);
            
            oyun_bittimi_kontrol();
        }
        
    }//GEN-LAST:event_button11ActionPerformed

    private void button17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button17ActionPerformed
        // TODO add your handling code here:
    /*    sıra++;
        if(sıra%2==0){
            button17.setBackground(Color.green);
            buton1();
        }
        else{
        button17.setBackground(Color.red);
        buton2();
        }
        button23.setEnabled(true);
        sayac++;
        button17.setEnabled(false);*/
    
    if(button17.isEnabled() && oyunn.equals("strt")){
            if(renk.equals("kirmizi")){
                button17.setBackground(Color.red);
            }
            else{
                button17.setBackground(Color.green);
            }
            button17.setEnabled(false);
            button23.setEnabled(true);
            
            oyunn = "wt";
            Message msg = new Message(Message.Message_Type.Start);
            msg.content = "strt";
            Client.Send(msg);
            
            msg = new Message(Message.Message_Type.Buton);
            msg.content = "button17";
            Client.Send(msg);
            
            oyun_bittimi_kontrol();
        }
        
    }//GEN-LAST:event_button17ActionPerformed

    private void button6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button6ActionPerformed
        // TODO add your handling code here:
     /*   sıra++;
        if(sıra%2==0){
            button6.setBackground(Color.green);
            buton1();
        }
        else{
        button6.setBackground(Color.red);
        buton2();
        }
        button12.setEnabled(true);
        sayac++;
        button6.setEnabled(false);*/
     
     if(button6.isEnabled() && oyunn.equals("strt")){
            if(renk.equals("kirmizi")){
                button6.setBackground(Color.red);
            }
            else{
                button6.setBackground(Color.green);
            }
            button6.setEnabled(false);
            button12.setEnabled(true);
            
            oyunn = "wt";
            Message msg = new Message(Message.Message_Type.Start);
            msg.content = "strt";
            Client.Send(msg);
            
            msg = new Message(Message.Message_Type.Buton);
            msg.content = "button6";
            Client.Send(msg);
            
            oyun_bittimi_kontrol();
        }
        
    }//GEN-LAST:event_button6ActionPerformed

    private void button12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button12ActionPerformed
        // TODO add your handling code here:
    /*    sıra++;
        if(sıra%2==0){
            button12.setBackground(Color.green);
            buton1();
        }
        else{
        button12.setBackground(Color.red);
        buton2();
        }
        button18.setEnabled(true);
        sayac++;
        button12.setEnabled(false);*/
    
    if(button12.isEnabled() && oyunn.equals("strt")){
            if(renk.equals("kirmizi")){
                button12.setBackground(Color.red);
            }
            else{
                button12.setBackground(Color.green);
            }
            button12.setEnabled(false);
            button18.setEnabled(true);
            
            oyunn = "wt";
            Message msg = new Message(Message.Message_Type.Start);
            msg.content = "strt";
            Client.Send(msg);
            
            msg = new Message(Message.Message_Type.Buton);
            msg.content = "button12";
            Client.Send(msg);
            
            oyun_bittimi_kontrol();
        }
        
    }//GEN-LAST:event_button12ActionPerformed

    private void button18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button18ActionPerformed
        // TODO add your handling code here:
    /*    sıra++;
        if(sıra%2==0){
            button18.setBackground(Color.green);
            buton1();
        }
        else{
        button18.setBackground(Color.red);
        buton2();
        }
        button24.setEnabled(true);
        sayac++;
        button18.setEnabled(false);*/
    
    if(button18.isEnabled() && oyunn.equals("strt")){
            if(renk.equals("kirmizi")){
                button18.setBackground(Color.red);
            }
            else{
                button18.setBackground(Color.green);
            }
            button18.setEnabled(false);
            button24.setEnabled(true);
            
            oyunn = "wt";
            Message msg = new Message(Message.Message_Type.Start);
            msg.content = "strt";
            Client.Send(msg);
            
            msg = new Message(Message.Message_Type.Buton);
            msg.content = "button18";
            Client.Send(msg);
            
            oyun_bittimi_kontrol();
        }
        
        
    }//GEN-LAST:event_button18ActionPerformed

    private void button19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button19ActionPerformed
        // TODO add your handling code here:
     /*    sıra++;
        if(sıra%2==0){
            button19.setBackground(Color.green);
            buton1();
        }
        else{
        button19.setBackground(Color.red);
        buton2();
        }
        button25.setEnabled(true);
        sayac++;
        button19.setEnabled(false);*/
     
     if(button19.isEnabled() && oyunn.equals("strt")){
            if(renk.equals("kirmizi")){
                button19.setBackground(Color.red);
            }
            else{
                button19.setBackground(Color.green);
            }
            button19.setEnabled(false);
            button25.setEnabled(true);
            
            oyunn = "wt";
            Message msg = new Message(Message.Message_Type.Start);
            msg.content = "strt";
            Client.Send(msg);
            
            msg = new Message(Message.Message_Type.Buton);
            msg.content = "button19";
            Client.Send(msg);
            
            oyun_bittimi_kontrol();
        }
    }//GEN-LAST:event_button19ActionPerformed

    private void button25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button25ActionPerformed
       /* // TODO add your handling code here:
         sıra++;
        if(sıra%2==0){
            button25.setBackground(Color.green);
            buton1();
        }
        else{
        button25.setBackground(Color.red);
        buton2();
        }
        button31.setEnabled(true);
        sayac++;
        button25.setEnabled(false);*/
       if(button25.isEnabled() && oyunn.equals("strt")){
            if(renk.equals("kirmizi")){
                button25.setBackground(Color.red);
            }
            else{
                button25.setBackground(Color.green);
            }
            button25.setEnabled(false);
            button31.setEnabled(true);
            
            oyunn = "wt";
            Message msg = new Message(Message.Message_Type.Start);
            msg.content = "strt";
            Client.Send(msg);
            
            msg = new Message(Message.Message_Type.Buton);
            msg.content = "button25";
            Client.Send(msg);
            
            oyun_bittimi_kontrol();
        }
    }//GEN-LAST:event_button25ActionPerformed

    private void button31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button31ActionPerformed
        // TODO add your handling code here:
     /*    sıra++;
        if(sıra%2==0){
            button31.setBackground(Color.green);
            buton1();
        }
        else{
        button31.setBackground(Color.red);
        buton2();
        }
        sayac++;
        button31.setEnabled(false);*/
     
     if(button31.isEnabled() && oyunn.equals("strt")){
            if(renk.equals("kirmizi")){
                button31.setBackground(Color.red);
            }
            else{
                button31.setBackground(Color.green);
            }
            button31.setEnabled(false);
            
            oyunn = "wt";
            Message msg = new Message(Message.Message_Type.Start);
            msg.content = "strt";
            Client.Send(msg);
            
            msg = new Message(Message.Message_Type.Buton);
            msg.content = "button31";
            Client.Send(msg);
            
            oyun_bittimi_kontrol();
        }
    }//GEN-LAST:event_button31ActionPerformed

    private void button20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button20ActionPerformed
        // TODO add your handling code here:
    /*     sıra++;
        if(sıra%2==0){
            button20.setBackground(Color.green);
            buton1();
        }
        else{
        button20.setBackground(Color.red);
        buton2();
        }
        button26.setEnabled(true);
        sayac++;
        button20.setEnabled(false);*/
    
    if(button20.isEnabled() && oyunn.equals("strt")){
            if(renk.equals("kirmizi")){
                button20.setBackground(Color.red);
            }
            else{
                button20.setBackground(Color.green);
            }
            button20.setEnabled(false);
            button26.setEnabled(true);
            
            oyunn = "wt";
            Message msg = new Message(Message.Message_Type.Start);
            msg.content = "strt";
            Client.Send(msg);
            
            msg = new Message(Message.Message_Type.Buton);
            msg.content = "button20";
            Client.Send(msg);
            
            oyun_bittimi_kontrol();
        }
    }//GEN-LAST:event_button20ActionPerformed

    private void button26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button26ActionPerformed
        // TODO add your handling code here:
     /*    sıra++;
        if(sıra%2==0){
            button26.setBackground(Color.green);
            buton1();
        }
        else{
        button26.setBackground(Color.red);
        buton2();
        }
        button32.setEnabled(true);
        sayac++;
        button26.setEnabled(false);*/
     
     if(button26.isEnabled() && oyunn.equals("strt")){
            if(renk.equals("kirmizi")){
                button26.setBackground(Color.red);
            }
            else{
                button26.setBackground(Color.green);
            }
            button26.setEnabled(false);
            button32.setEnabled(true);
            
            oyunn = "wt";
            Message msg = new Message(Message.Message_Type.Start);
            msg.content = "strt";
            Client.Send(msg);
            
            msg = new Message(Message.Message_Type.Buton);
            msg.content = "button26";
            Client.Send(msg);
            
            oyun_bittimi_kontrol();
        }
    }//GEN-LAST:event_button26ActionPerformed

    private void button32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button32ActionPerformed
    /*    // TODO add your handling code here:
         sıra++;
        if(sıra%2==0){
            button32.setBackground(Color.green);
            buton1();
        }
        else{
        button32.setBackground(Color.red);
        buton2();
        }
        sayac++;
        button32.setEnabled(false);*/
    if(button32.isEnabled() && oyunn.equals("strt")){
            if(renk.equals("kirmizi")){
                button32.setBackground(Color.red);
            }
            else{
                button32.setBackground(Color.green);
            }
            button32.setEnabled(false);
            
            oyunn = "wt";
            Message msg = new Message(Message.Message_Type.Start);
            msg.content = "strt";
            Client.Send(msg);
            
            msg = new Message(Message.Message_Type.Buton);
            msg.content = "button32";
            Client.Send(msg);
            
            oyun_bittimi_kontrol();
        }
    }//GEN-LAST:event_button32ActionPerformed

    private void button21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button21ActionPerformed
        // TODO add your handling code here:
    /*     sıra++;
        if(sıra%2==0){
            button21.setBackground(Color.green);
            buton1();
        }
        else{
        button21.setBackground(Color.red);
        buton2();
        }
        button27.setEnabled(true);
        sayac++;
        button21.setEnabled(false);*/
    if(button21.isEnabled() && oyunn.equals("strt")){
            if(renk.equals("kirmizi")){
                button21.setBackground(Color.red);
            }
            else{
                button21.setBackground(Color.green);
            }
            button21.setEnabled(false);
            button27.setEnabled(true);
            
            oyunn = "wt";
            Message msg = new Message(Message.Message_Type.Start);
            msg.content = "strt";
            Client.Send(msg);
            
            msg = new Message(Message.Message_Type.Buton);
            msg.content = "button21";
            Client.Send(msg);
            
            oyun_bittimi_kontrol();
        }
    }//GEN-LAST:event_button21ActionPerformed

    private void button27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button27ActionPerformed
        // TODO add your handling code here:
     /*    sıra++;
        if(sıra%2==0){
            button27.setBackground(Color.green);
            buton1();
        }
        else{
        button27.setBackground(Color.red);
        buton2();
        }
        button33.setEnabled(true);
        sayac++;
        button27.setEnabled(false);*/
     if(button27.isEnabled() && oyunn.equals("strt")){
            if(renk.equals("kirmizi")){
                button27.setBackground(Color.red);
            }
            else{
                button27.setBackground(Color.green);
            }
            button27.setEnabled(false);
            button33.setEnabled(true);
            
            oyunn = "wt";
            Message msg = new Message(Message.Message_Type.Start);
            msg.content = "strt";
            Client.Send(msg);
            
            msg = new Message(Message.Message_Type.Buton);
            msg.content = "button27";
            Client.Send(msg);
            
            oyun_bittimi_kontrol();
        }
    }//GEN-LAST:event_button27ActionPerformed

    private void button33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button33ActionPerformed
    /*    // TODO add your handling code here:
         sıra++;
        if(sıra%2==0){
            button33.setBackground(Color.green);
            buton1();
        }
        else{
        button33.setBackground(Color.red);
        buton2();
        }
        sayac++;
        button33.setEnabled(false);*/
    
    if(button33.isEnabled() && oyunn.equals("strt")){
            if(renk.equals("kirmizi")){
                button33.setBackground(Color.red);
            }
            else{
                button33.setBackground(Color.green);
            }
            button33.setEnabled(false);
            
            oyunn = "wt";
            Message msg = new Message(Message.Message_Type.Start);
            msg.content = "strt";
            Client.Send(msg);
            
            msg = new Message(Message.Message_Type.Buton);
            msg.content = "button33";
            Client.Send(msg);
            
            oyun_bittimi_kontrol();
        }
    }//GEN-LAST:event_button33ActionPerformed

    private void button22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button22ActionPerformed
        // TODO add your handling code here:
     /*    sıra++;
        if(sıra%2==0){
            button22.setBackground(Color.green);
            buton1();
        }
        else{
        button22.setBackground(Color.red);
        buton2();
        }
        button28.setEnabled(true);
        sayac++;
        button22.setEnabled(false);*/
           
     if(button22.isEnabled() && oyunn.equals("strt")){
            if(renk.equals("kirmizi")){
                button22.setBackground(Color.red);
            }
            else{
                button22.setBackground(Color.green);
            }
            button22.setEnabled(false);
            button28.setEnabled(true);
            
            oyunn = "wt";
            Message msg = new Message(Message.Message_Type.Start);
            msg.content = "strt";
            Client.Send(msg);
            
            msg = new Message(Message.Message_Type.Buton);
            msg.content = "button22";
            Client.Send(msg);
            
            oyun_bittimi_kontrol();
        }
    }//GEN-LAST:event_button22ActionPerformed

    private void button28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button28ActionPerformed
        // TODO add your handling code here:
    /*     sıra++;
        if(sıra%2==0){
            button28.setBackground(Color.green);
            buton1();
        }
        else{
        button28.setBackground(Color.red);
        buton2();
        }
        button34.setEnabled(true);
        sayac++;
        button28.setEnabled(false);*/
    if(button28.isEnabled() && oyunn.equals("strt")){
            if(renk.equals("kirmizi")){
                button28.setBackground(Color.red);
            }
            else{
                button28.setBackground(Color.green);
            }
            button28.setEnabled(false);
            button34.setEnabled(true);
            
            oyunn = "wt";
            Message msg = new Message(Message.Message_Type.Start);
            msg.content = "strt";
            Client.Send(msg);
            
            msg = new Message(Message.Message_Type.Buton);
            msg.content = "button28";
            Client.Send(msg);
            
            oyun_bittimi_kontrol();
        }
    }//GEN-LAST:event_button28ActionPerformed

    private void button34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button34ActionPerformed
     /*   // TODO add your handling code here:
         sıra++;
        if(sıra%2==0){
            button34.setBackground(Color.green);
            buton1();
        }
        else{
        button34.setBackground(Color.red);
        buton2();
        }
        sayac++;
        button34.setEnabled(false);*/
     
     if(button34.isEnabled() && oyunn.equals("strt")){
            if(renk.equals("kirmizi")){
                button34.setBackground(Color.red);
            }
            else{
                button34.setBackground(Color.green);
            }
            button34.setEnabled(false);
            
            oyunn = "wt";
            Message msg = new Message(Message.Message_Type.Start);
            msg.content = "strt";
            Client.Send(msg);
            
            msg = new Message(Message.Message_Type.Buton);
            msg.content = "button34";
            Client.Send(msg);
            
            oyun_bittimi_kontrol();
        }
    }//GEN-LAST:event_button34ActionPerformed

    private void button23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button23ActionPerformed
        // TODO add your handling code here:
     /*    sıra++;
        if(sıra%2==0){
            button23.setBackground(Color.green);
            buton1();
        }
        else{
        button23.setBackground(Color.red);
        buton2();
        }
        button29.setEnabled(true);
        sayac++;
        button23.setEnabled(false);*/
     if(button23.isEnabled() && oyunn.equals("strt")){
            if(renk.equals("kirmizi")){
                button23.setBackground(Color.red);
            }
            else{
                button23.setBackground(Color.green);
            }
            button23.setEnabled(false);
            button29.setEnabled(true);
            
            oyunn = "wt";
            Message msg = new Message(Message.Message_Type.Start);
            msg.content = "strt";
            Client.Send(msg);
            
            msg = new Message(Message.Message_Type.Buton);
            msg.content = "button23";
            Client.Send(msg);
            
            oyun_bittimi_kontrol();
        }
    }//GEN-LAST:event_button23ActionPerformed

    private void button29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button29ActionPerformed
     /*   // TODO add your handling code here:
         sıra++;
        if(sıra%2==0){
            button29.setBackground(Color.green);
            buton1();
        }
        else{
        button29.setBackground(Color.red);
        buton2();
        }
        button35.setEnabled(true);
        sayac++;
        button29.setEnabled(false);*/
     
     if(button29.isEnabled() && oyunn.equals("strt")){
            if(renk.equals("kirmizi")){
                button29.setBackground(Color.red);
            }
            else{
                button29.setBackground(Color.green);
            }
            button29.setEnabled(false);
            button35.setEnabled(true);
            
            oyunn = "wt";
            Message msg = new Message(Message.Message_Type.Start);
            msg.content = "strt";
            Client.Send(msg);
            
            msg = new Message(Message.Message_Type.Buton);
            msg.content = "button29";
            Client.Send(msg);
            
            oyun_bittimi_kontrol();
        }
    }//GEN-LAST:event_button29ActionPerformed

    private void button35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button35ActionPerformed
       /* // TODO add your handling code here:
         sıra++;
        if(sıra%2==0){
            button35.setBackground(Color.green);
            buton1();
        }
        else{
        button35.setBackground(Color.red);
        buton2();
        }
        sayac++;
        button35.setEnabled(false);*/
       
       if(button35.isEnabled() && oyunn.equals("strt")){
            if(renk.equals("kirmizi")){
                button35.setBackground(Color.red);
            }
            else{
                button35.setBackground(Color.green);
            }
            button35.setEnabled(false);
            
            oyunn = "wt";
            Message msg = new Message(Message.Message_Type.Start);
            msg.content = "strt";
            Client.Send(msg);
            
            msg = new Message(Message.Message_Type.Buton);
            msg.content = "button35";
            Client.Send(msg);
            
            oyun_bittimi_kontrol();
        }
    }//GEN-LAST:event_button35ActionPerformed

    private void button24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button24ActionPerformed
        // TODO add your handling code here:
     /*    sıra++;
        if(sıra%2==0){
            button24.setBackground(Color.green);
            buton1();
        }
        else{
        button24.setBackground(Color.red);
        buton2();
        }
        button30.setEnabled(true);
        sayac++;
        button24.setEnabled(false);*/
      if(button24.isEnabled() && oyunn.equals("strt")){
            if(renk.equals("kirmizi")){
                button24.setBackground(Color.red);
            }
            else{
                button24.setBackground(Color.green);
            }
            button24.setEnabled(false);
            button30.setEnabled(true);
            
            oyunn = "wt";
            Message msg = new Message(Message.Message_Type.Start);
            msg.content = "strt";
            Client.Send(msg);
            
            msg = new Message(Message.Message_Type.Buton);
            msg.content = "button24";
            Client.Send(msg);
            
            oyun_bittimi_kontrol();
        }
    }//GEN-LAST:event_button24ActionPerformed

    private void button30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button30ActionPerformed
     /*   // TODO add your handling code here:
         sıra++;
        if(sıra%2==0){
            button30.setBackground(Color.green);
            buton1();
        }
        else{
        button30.setBackground(Color.red);
        buton2();
        }
        button36.setEnabled(true);
        sayac++;
        button30.setEnabled(false);*/
     
     if(button30.isEnabled() && oyunn.equals("strt")){
            if(renk.equals("kirmizi")){
                button30.setBackground(Color.red);
            }
            else{
                button30.setBackground(Color.green);
            }
            button30.setEnabled(false);
            button36.setEnabled(true);
            
            oyunn = "wt";
            Message msg = new Message(Message.Message_Type.Start);
            msg.content = "strt";
            Client.Send(msg);
            
            msg = new Message(Message.Message_Type.Buton);
            msg.content = "button30";
            Client.Send(msg);
            
            oyun_bittimi_kontrol();
        }
    }//GEN-LAST:event_button30ActionPerformed

    private void button36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button36ActionPerformed
        // TODO add your handling code here:
      /*   sıra++;
        if(sıra%2==0){
            button36.setBackground(Color.green);
            buton1();
        }
        else{
        button36.setBackground(Color.red);
        buton2();
        }
        sayac++;
        button36.setEnabled(false);*/
      
      if(button36.isEnabled() && oyunn.equals("strt")){
            if(renk.equals("kirmizi")){
                button36.setBackground(Color.red);
            }
            else{
                button36.setBackground(Color.green);
            }
            button36.setEnabled(false);
            
            oyunn = "wt";
            Message msg = new Message(Message.Message_Type.Start);
            msg.content = "strt";
            Client.Send(msg);
            
            msg = new Message(Message.Message_Type.Buton);
            msg.content = "button36";
            Client.Send(msg);
            
            oyun_bittimi_kontrol();
        }
    }//GEN-LAST:event_button36ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Client.Start("127.0.0.1", 2000);
        jLabel1.setText("Oyun arıyoruz.");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(oyun.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(oyun.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(oyun.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(oyun.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new oyun().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button button1;
    private java.awt.Button button10;
    private java.awt.Button button11;
    private java.awt.Button button12;
    private java.awt.Button button13;
    private java.awt.Button button14;
    private java.awt.Button button15;
    private java.awt.Button button16;
    private java.awt.Button button17;
    private java.awt.Button button18;
    private java.awt.Button button19;
    private java.awt.Button button2;
    private java.awt.Button button20;
    private java.awt.Button button21;
    private java.awt.Button button22;
    private java.awt.Button button23;
    private java.awt.Button button24;
    private java.awt.Button button25;
    private java.awt.Button button26;
    private java.awt.Button button27;
    private java.awt.Button button28;
    private java.awt.Button button29;
    private java.awt.Button button3;
    private java.awt.Button button30;
    private java.awt.Button button31;
    private java.awt.Button button32;
    private java.awt.Button button33;
    private java.awt.Button button34;
    private java.awt.Button button35;
    private java.awt.Button button36;
    private java.awt.Button button4;
    private java.awt.Button button5;
    private java.awt.Button button6;
    private java.awt.Button button7;
    private java.awt.Button button8;
    private java.awt.Button button9;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
