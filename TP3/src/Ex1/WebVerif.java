package Ex1;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class WebVerif implements Runnable {

    String url;



    public WebVerif(String url){
        this.url=url;
    }



    @Override
    public void run() {
        verifyConnection();
    }

    private void verifyConnection() {
        URL urlverify = null;
        try {
            urlverify = new URL(url);
        } catch (MalformedURLException e) {
            System.out.println("Erreur url");
        }
        try {

            HttpURLConnection httpurl = (HttpURLConnection) urlverify.openConnection();
            httpurl.connect();
            if(httpurl.getResponseCode()==200){
                System.out.println(url+ " : OK");
            } else {
                System.out.println(url + " : "+ httpurl.getResponseCode());
            }

        } catch (IOException e) {
            System.out.println("Erreur de connexion sur l'url : "+url);
        }

    }
}
