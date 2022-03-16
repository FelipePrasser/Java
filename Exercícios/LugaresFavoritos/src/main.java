import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
public class main {
    public static void main(String args[]) throws URISyntaxException, IOException {
        //variáveis;
        String lugar="Aperibé";
        Double avaliacao=5d/2d;
        
        System.out.println(lugar);
        System.out.println(avaliacao);
     
        mostraLugarNoMapa(lugar);
    }

    private static void mostraLugarNoMapa(String lugar) throws URISyntaxException, IOException {
        Desktop.getDesktop().browse(new URI("https://www.google.com/maps/search/?api=1&query="+lugar));
    }
}
