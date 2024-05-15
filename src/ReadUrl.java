
import java.awt.Point;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

public class ReadUrl{

    private URL url = new URL("http://bilgisayar.kocaeli.edu.tr/prolab2/url1.txt");
    private int satir = 0;
    private int sutun = 0;
    private int matris[][];
    private Point baslangic;
    private Point hedef;

    public Point getBaslangic() {
        return baslangic;
    }

    public void setBaslangic(Point aBaslangic) {
        baslangic = aBaslangic;
    }

    public Point getHedef() {
        return hedef;
    }

    public void setHedef(Point aHedef) {
        hedef = aHedef;
    }

    public URL getUrl() {
        return url;
    }

    public int getSatir() {
        return satir;
    }

    public void setSatir(int satir) {
        this.satir = satir;
    }

    public int getSutun() {
        return sutun;
    }

    public void setSutun(int sutun) {
        this.sutun = sutun;
    }

    public int[][] getMatris() {
        return matris;
    }

    public void setMatris(int[][] matris) {
        this.matris = matris;
    }

    public void setUrl(int a) throws MalformedURLException {
        if (a == 2) {
            this.url = new URL("http://bilgisayar.kocaeli.edu.tr/prolab2/url2.txt");
        } else {
            this.url = url;
        }
    }

     
    public ReadUrl(int a) throws MalformedURLException, IOException {

        if (a == 1) {
            this.getUrl();
        } else if (a == 2) {
            this.setUrl(2);
        }

        StringBuilder stb = new StringBuilder();

        URLConnection UrlConnection = url.openConnection();

        BufferedReader bf = new BufferedReader(new InputStreamReader(url.openStream()));

        String line;

        while (((line = bf.readLine()) != null)) {
            stb.append(line + "\n");
            satir++;
            sutun = line.length();

        }

        Scanner scan = new Scanner(new String(stb));
        matris = new int[satir][sutun];

        for (int i = 0; i < satir; i++) {
            String string = scan.nextLine();

            for (int j = 0; j < sutun; j++) {
                int sc = Character.getNumericValue(string.charAt(j));

                matris[i][j] = sc;
            }

        }

        bf.close();

        Engel engel = new Engel(matris, satir, sutun);
        baslangic = engel.getBaslangic();
        hedef = engel.getHedef();

    }

}
