/*
 * Developed by Robert Baumgartner (c)2014
 * for SEW and INSY classes 
 * Use outside of HTL Ottakring prohibited
 * Contact: lbaum@htl-ottakring.at 
 */

package at.htlottakring.konsolendemo;

 
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;

/**
 *
 * @author Robert Baumgartner
 */
public class KonsolenDemo {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
//        BufferedReader bufferedreader = 
//                new BufferedReader(new InputStreamReader(System.in));
//        String zeile = bufferedreader.readLine();
//        System.out.println(zeile);
//        BufferedReader filereader = new BufferedReader(new FileReader("test.txt"));
//        String z = filereader.readLine();
//        try {
//            int a = Integer.parseInt(zeile);
//            double d = Double.parseDouble(zeile);
//            d=d*a;
//            String zz = String.valueOf(d);
//            System.out.println(zz);
//            
//        } catch (NumberFormatException numberFormatException) {
//            System.out.println("keine Zahl");
//        }
//        filereader.close();
//        FileWriter filewriter = new FileWriter("test.txt",true);
//        filewriter.write(zeile);
//        filewriter.close();
//        BufferedReader buff = new BufferedReader(new FileReader("test.txt"));
//        String zz;
//        while ((zz=buff.readLine())!= null) {
//           System.out.println(zz);
           
//           FileInputStream filein = new FileInputStream("test.txt");
//           
//           int b = filein.read();
//           char c = (char) b;
//           System.out.println(String.valueOf(c));
//           byte[] bar = new byte[15];
//           filein.read(bar,0,15);
//           String z = new String(bar);
//           System.out.println(z);
        
           FileOutputStream fileout = new FileOutputStream("Neu.dat");
       
           ByteBuffer b = ByteBuffer.allocate(4);
           b.putInt(123332);
           fileout.write(b.array());
           fileout.close();
           FileInputStream fin = new FileInputStream("Neu.dat");
           byte[] bar = new byte[4];
           fin.read(bar,0,bar.length);
           ByteBuffer bb = ByteBuffer.wrap(bar); 
           System.out.println(bb.getInt());
    }
        
    
    
}
