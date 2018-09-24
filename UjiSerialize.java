/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ObjectSerial;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 *
 * @author SUBARI
 */
public class UjiSerialize { 
    public static void main(String[] args)throws IOException, ClassNotFoundException {
    
        //choice provided to the user
        System.out.println("Welcome To Mahasiswa Praktikum Sister");
        System.out.println("Enter your choice");
        System.out.println("Enter 1:->show mahasiswa");
        System.out.println("Enter 2:->Create new mahasiswa");
        System.out.println("Enter 3:->Delete mahasiswa");
        System.out.println("Enter 4:->quit");
        System.out.println("Enter 5:->Update mahasiswa");

        Scanner in = new Scanner(System.in);
        int choice = in.nextInt();
        
        ArrayList<Mahasiswa> object1 = new ArrayList<Mahasiswa>();
        
        //insert operation
        if(choice==2){
            try{
                String str1, str2, str3, str4;
                
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter number of mahasiswa you want to add");
                Scanner in1 = new Scanner(System.in);
                //int num = in1.nextInt();

                //ArrayList<Myclass> object1 = new ArrayList<Myclass>();

              //  for(int i=0;i<num;i++){

                    str1 = br.readLine();
                    str2 = br.readLine();
                    str3 = br.readLine();
                    str4 = br.readLine();
                    object1.add(new Mahasiswa(str1,str2,str3,str4));
                //}

                FileOutputStream fos = new FileOutputStream("Myfile.txt");
                ObjectOutputStream oos = new ObjectOutputStream(fos);

                oos.writeObject(object1);
                oos.flush();
                oos.close();
            }
            catch(Exception e){
                System.out.println("exception");
                e.printStackTrace();
                System.exit(0);
            }
        }
        
        //show operation
        if(choice==1){
            try{
                FileInputStream  fis = new FileInputStream("Myfile.txt");
                ObjectInputStream ois = new ObjectInputStream(fis);
                ArrayList object2 = (ArrayList)ois.readObject();

                ois.close();
                System.out.println("mahasiswa"+" "+object2 + " ");
            }
            catch(Exception e){
                e.printStackTrace();
            }

        }
        
        //delete data mahasiswa
        if(choice==3){
            System.out.println("Enter if you want to delete data mahasiswa");
            try {

                String str5, str6, str7, str8;

                BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
                str5 = br1.readLine();
                str6 = br1.readLine();
                str7 = br1.readLine();
                str8 = br1.readLine();


                object1.remove(new Mahasiswa(str5,str6, str7, str8));

                FileOutputStream fs = new FileOutputStream("Myfile.txt");
                ObjectOutputStream os = new ObjectOutputStream(fs);
                os.writeObject(object1);
                os.flush();
                os.close();

            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }
        
        //update operation
        if(choice==5){
            System.out.println("Enter to update data mahasiswa");
            try {

                String str5, str6, str7, str8;

                BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
                str5 = br1.readLine();
                str6 = br1.readLine();
                str7 = br1.readLine();
                str8 = br1.readLine();

                object1.add(new Mahasiswa(str5,str6, str7, str8));

                FileOutputStream fs = new FileOutputStream("Myfile.txt");
                ObjectOutputStream os = new ObjectOutputStream(fs);
                os.writeObject(object1);
                os.flush();
                os.close();

            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }
        
         //exit operation
        if(choice==4){
            System.exit(0);
        }
    }
    }
    
    

