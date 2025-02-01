import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server{
    public void run(){
        int port=8010;
        ServerSocket socket;
        try {
            socket = new ServerSocket(port);
            socket.setSoTimeout(10000);
       
        
        while(true){
            try{
                System.out.println("Server is listening on port "+ port);
                Socket  acceptedConnection=socket.accept();
                System.out.println("Connection accepted from the client "+acceptedConnection.getRemoteSocketAddress());
                PrintWriter toClient=new PrintWriter(acceptedConnection.getOutputStream());
            }
            catch(IOException e)
            {
                System.out.println(e);
            }
        
        }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    } 
    public static void main(String[] args) {
        
    }
}