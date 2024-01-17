package com.example;

import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        try {
            ServerSocket ss = new ServerSocket(42069);    
            Socket s = ss.accept();

            Alunno s1 = new Alunno("Davide", "Xie", "06/09/2004");
            Alunno s2 = new Alunno("Matteo", "Faginali", "01/01/1970");
            Alunno s3 = new Alunno("Giovanni", "Brussi", "03/02/2005");
            Classe class1 = new Classe(5, "C", "2W-14");
            class1.addStudent(s1);
            class1.addStudent(s2);
            class1.addStudent(s3);

            ObjectMapper objectMapper = new ObjectMapper();
            String serializedResult = objectMapper.writeValueAsString(class1);
            System.out.println(serializedResult);
            DataOutputStream out = new DataOutputStream(s.getOutputStream());
            out.writeBytes(serializedResult);
            s.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
