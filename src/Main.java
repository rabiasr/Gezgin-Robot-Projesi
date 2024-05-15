
import java.io.IOException;
import javax.swing.JFrame;
import java.awt.Point;

public class Main {

    public static void main(String[] args) throws IOException {

        int matris[][];
        int str = 0;
        int stn = 0;
        Point baslangic;
        Point hedef;

        ReadUrl readurl = new ReadUrl(1);

        JFrame frame = new JFrame("Labirent");
        Izgara ızgara = new Izgara();

        stn = readurl.getSutun();
        str = readurl.getSatir();
        matris = readurl.getMatris();
        baslangic = readurl.getBaslangic();
        hedef = readurl.getHedef();
        ızgara.setStn(stn);
        ızgara.setStr(str);
        ızgara.setMatris(matris);
        ızgara.setBaslangic(baslangic);
        ızgara.setHedef(hedef);

        frame.add(ızgara);

        frame.setSize(1200,800);

        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

}
