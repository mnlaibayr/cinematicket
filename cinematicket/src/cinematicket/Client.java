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
import java.io.OutputStreamReader;
                





public class Client {
    
    
    public static void main(String [] args) {
        
        
        Socket socket = null;
        InputStreamReader    InputStreamReader = null;
        OutputStreamReader   OutputStreamReader =null;
        BufferedOutputStream BufferedOutputStream = null;
        BufferedInputStream BufferedInputStream =null;
        
       try 
        {
            socket = new Socket (host "localhost", port 12345 );
            
            
            InputStreamReader = new  InputStreamReader(socket.getInputStream());
            OutStreamwriter = new OutStreamReader (socket.getOutputStream());
            
            BufferedReader = new BufferedReader(InputStreamReader);
            BufferedWriter = new Bufferedwriter(OutputStreamwriter);
            
            Scanner scanner = new Scanner(System.in);
            
            while (true) {
                String selectedtime, selectedseat,  total, selectedblock, tickettype = scanner.nextLine();
                bufferedwriter.write(electedtime, selectedseat,  total, selectedblock, tickettype);
                bufferedwriter.nextLine();
                bufferedwriter.flush();
            }
        }
        
        
    }
    
    
}
