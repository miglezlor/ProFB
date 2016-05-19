package proyectofacebook;

import facebook4j.Comment;
import facebook4j.Facebook;
import facebook4j.FacebookException;
import facebook4j.FacebookFactory;
import facebook4j.Post;
import facebook4j.PostUpdate;
import facebook4j.ResponseList;
import facebook4j.User;
import facebook4j.auth.AccessToken;
import facebook4j.conf.ConfigurationBuilder;
import java.net.MalformedURLException;
import java.net.URL;
import javax.swing.JOptionPane;
/**
 *
 * @author mgonzalezlorenzo
 */
public class Metodos {
    
    public Facebook mifacebook;
    
    public Facebook iniciar(){
        ConfigurationBuilder cb = new ConfigurationBuilder();
        cb.setDebugEnabled(true)
                .setOAuthAppId("172862366442417")
                .setOAuthAppSecret("c9cffd2054e4c153f743559b6de5f3fb")
                .setOAuthAccessToken("EAACEdEose0cBAD99gPAb3liTaLEF5bWhScShKiAP86Oa05LTZCDdbqXiZB4ztOOaz6sBHRxxH0rCBtUVFwdZABJnupWbmnRbuZBPooRBpK0ywia6qpTlyRLEQtIDyAfW8ZA0RQhchFwd8HtHlfgGHqyzatb3C4sFdjJuHdWhQBGbDDKeDwe3k");
            
            FacebookFactory ff = new FacebookFactory(cb.build());
            mifacebook = ff.getInstance();
            return mifacebook;
    }
    
    
    public void estado() throws FacebookException{
            
            mifacebook.postStatusMessage(JOptionPane.showInputDialog("Introduce estado"));
    }
    
    public void darLike() throws FacebookException{
        
            mifacebook.likePost(JOptionPane.showInputDialog("Introduce la ID del Post \n (Para obtenerla haz click en la hora \n del post y copia los numeros del enlace)"));
    }
    
    public void postImagen() throws MalformedURLException, FacebookException{
        
            PostUpdate post = new PostUpdate(new URL("http://www.celtavigo.net/es/"))
                    .picture(new URL("http://www.pormisbalones.com/files/styles/epsa_horizontal_thumbail/public/guidetti_camp_nou.jpg?itok=Tr73P85r"))
                    .description("Best player ever");
            mifacebook.postFeed(post);
        
    }
    
    public void buscarTema() throws FacebookException{
        //No lo admite GraphAPI 2.0 o superior
        ResponseList<Post> results = mifacebook.searchPosts(JOptionPane.showInputDialog("Selecciona el tema del que buscar posts"));
        JOptionPane.showMessageDialog(null, results);
    }
    
    public void comentarios() throws FacebookException{
        
        ResponseList <Comment> lista = mifacebook.getCommentReplies(JOptionPane.showInputDialog("Selecciona el post del que buscar comentarios"));
        System.out.println(lista);
    }
    
    
    public void comentarFoto() throws FacebookException{
        
        mifacebook.commentPhoto(JOptionPane.showInputDialog("Introduce la ID del post \n (Para obtenerla haz click en la hora \n del post y copia los numeros del enlace)"), JOptionPane.showInputDialog("Introduce el comentario"));
    }
    
    public void buscarUser() throws FacebookException{
        
        ResponseList <User> userlist = mifacebook.searchUsers(JOptionPane.showInputDialog("Introduce el nombre a buscar"));
        System.out.println(userlist);
    }
}
