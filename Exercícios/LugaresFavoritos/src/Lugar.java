import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class Lugar {
    public String nome;
    public Double avaliacao;
    public void mostraNoMapa() throws URISyntaxException, IOException {
        Desktop.getDesktop().browse(new URI("https://www.google.com/maps/search/?api=1&query="+nome));
    }
    void mostraNoMapa(String existeString) {
        this.nome=existeString;
    }
}
