package ma.fstm.ilisi2.ExpertSysCovid19.controller;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;

import ma.fstm.ilisi2.ExpertSysCovid19.model.bo.*;

public class HandlerClient {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Socket socket = new Socket("localhost",2030);
		System.out.println("Connected!");
		
		OutputStream outputs = socket.getOutputStream();
		
		ObjectOutputStream objectoutputs = new ObjectOutputStream(outputs);
		
		/***********************************************/
		
		Client cl = new Client();
        
        
        Diagnostic diag = new Diagnostic(cl);
        
        Etatpandemie etat = new Etatpandemie("faible");
        Region r = new Region("casablanca-settat",etat);
        Ville v = new Ville("casa",r);
         cl.setVille(v);
         
         Symptome s1 = new Symptome();
         s1.setDescription("fievre");
         
         Mesure m = new Temperature(40);
         s1.setMesure(m);
         
         
         Symptome s2 = new Symptome();
         s2.setDescription("congestion nasal");
         
         Symptome s3 = new Symptome();
         s3.setDescription("toux sèche");
         
         Symptome s4 = new Symptome();
         s4.setDescription("fatigue");
         
         Symptome s5 = new Symptome();
         s5.setDescription("perte de goût");
         
         diag.ajouter_symptome(s1);
         diag.ajouter_symptome(s2);
         diag.ajouter_symptome(s3);
         diag.ajouter_symptome(s4);
         diag.ajouter_symptome(s5); 
         
         diag.setContact_Covid19(true);
         
         cl.ajouter_diagnostic(diag);
         
		
		
		/***********************************************/
		
		objectoutputs.writeObject(diag);
		
		
		InputStream is=socket.getInputStream();
		ObjectInputStream ois=new ObjectInputStream(is);
		
		diag =  (Diagnostic) ois.readObject();
		
		//for(Message m:listOfMessages) {
			System.out.println("aprés traitement le degré final !! : "+diag.getDegreCont_C19());
		//}
		
		
		System.out.println("Closing socket and terminating program.");
		
		socket.close();
	}

}
