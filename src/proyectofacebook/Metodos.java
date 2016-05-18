package proyectofacebook;

import facebook4j.Facebook;
import facebook4j.FacebookException;
import facebook4j.FacebookFactory;
import facebook4j.conf.ConfigurationBuilder;
import javax.swing.JOptionPane;
/**
 *
 * @author mgonzalezlorenzo
 */
public class Metodos {
    ConfigurationBuilder cb = new ConfigurationBuilder();
    
    public void estado() throws FacebookException{
            cb.setDebugEnabled(true)
                .setOAuthAppId("")
                .setOAuthAppSecret("")
                .setOAuthAccessToken("");
            
            FacebookFactory ff = new FacebookFactory(cb.build());
            Facebook mifacebook = ff.getInstance();
            mifacebook.postStatusMessage(JOptionPane.showInputDialog("Introduce estado"));
    }
}
