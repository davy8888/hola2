package hola2;

public class hola2 {

	public static void main (String [] args) throws ClassNotFoundException {
        FileOutputStream grafs = null;
        ObjectOutputStream sortida = null;
        FileInputStream frafs = null;
        ObjectInputStream entrada = null;
        Alumne a;
        Data f;
        try {
            grafs = new FileOutputStream ("data/alumnos.dat");
            sortida = new ObjectOutputStream (grafs);
            f = new Data (5,9,2011);
            a = new Alumne ("12345678A", "Lucas González", 20, f);
            sortida.writeObject (a);
            f = new Data (7,9,2011);
            a = new Alumne ("98765432B", "Anacleto Jiménez", 19, f);
            sortida.writeObject (a);
            f = new Data (8,9,2011);
            a = new Alumne ("78234212Z", "Maria Zapata", 21, f);
            sortida.writeObject (a);
           
        } catch (FileNotFoundException e) {
            System.out.println (e.getMessage ());
        } catch (IOException e) {
            System.out.println (e.getMessage ());
        } finally {
            try {
                if (grafs != null) grafs.close ();
                if (sortida != null) sortida.close ();
            } catch (IOException e) {
                System.out.println (e.getMessage ());
            }
        }
    }
	
	
	
	
	
}
