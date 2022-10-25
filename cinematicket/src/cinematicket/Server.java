/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cinematicket;

/**
 *
 * @author user
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.net.Socket;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.SocketImpl;
                

public class Server {
    public static void main (String[]args ){
        Socket socket = null;
        InputStreamReader  InputStreamReader = null;
        OutputStreamWriter    OutputStreamWriter = null;
        BufferedReader      bufferedReader = null;
        BufferedWriter      bufferedWriter = null;
        ServerSocket serveSocket = null;
        SocketImpl port = null;
        
        serverSocket = new ServerSocket(port:  12345);
         while (true) {
            
            try {
                socket = serverSocket.accept();
                
                InputStreamReader = new InputStreamReader(socket.getInputStream());
                OutputStreamWriter = new OutputStreamWriter(socket.getOutputStream());
                
                
            }
             
        }
    }

    private static class serverSocket {

        public serverSocket() {
        }
    }
    
    
}
