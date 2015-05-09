package javaapplication1;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import static javaapplication1.TicTacToe.board;
 
public class MAC_Addr {
   
MAC_Addr() throws IOException{
//   public static void main(String[] args){
 
	InetAddress ip;
	try {
 
		ip = InetAddress.getLocalHost();
		System.out.println("Current IP address : " + ip.getHostAddress());
 
		NetworkInterface network = NetworkInterface.getByInetAddress(ip);
 
		byte[] mac = network.getHardwareAddress();
                
 		System.out.print("Current MAC address : "); 
                
 
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < mac.length; i++) {
			sb.append(String.format("%02X%s", mac[i], (i < mac.length - 1) ? "-" : ""));		
		}
		
                 Path p2= Paths.get("D:\\Address.txt");
                 if(Files.exists(p2)== true){
                     
                 }
                 else{
                File mac_file = new File("D:\\Address.txt");
                if (!mac_file.exists()){
                    mac_file.createNewFile();
                    }
                FileWriter fw = new FileWriter(mac_file.getAbsoluteFile());    
            try (BufferedWriter bw = new BufferedWriter(fw)) {
                bw.write(sb.toString());
            }
                
                System.out.println(sb.toString());
// return sb;
 
	} catch (UnknownHostException | SocketException e) {
	}
 
   }
 
    
}