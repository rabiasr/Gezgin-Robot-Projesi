
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Izgara extends JPanel {

    private int str;
    private int stn;
    private int matris[][];
    private Point baslangic;
    private Point hedef;
    JFrame frame;

    Grid grid = new Grid();
      
    @Override
    public void paint (Graphics g) {
        grid.paintComponent(g);
    }
 
    public int getStr() {
        return str;
    }

    public void setStr(int str) {
        this.str = str;
    }

    public int getStn() {
        return stn;
    }

    public void setStn(int stn) {
        this.stn = stn;
    }

    public int[][] getMatris() {
        return matris;
    }

    public void setMatris(int[][] matris) {
        this.matris = matris;
    }

    public Point getBaslangic() {
        return baslangic;
    }

    public void setBaslangic(Point baslangic) {
        this.baslangic = baslangic;
    }

    public Point getHedef() {
        return hedef;
    }

    public void setHedef(Point hedef) {
        this.hedef = hedef;
    }

    

    
    public class Grid {

        private int i, j =0;

        private final int blokh = 30;
        private final int blokw = 30;

        private final int w = 30;
        private final int h = 30;
       
        
        public void paintComponent(Graphics g) {
            for (i = 0; i < str; i++) {
                for (j = 0; j < stn; j++) {
                    if (getMatris()[i][j] == 0) {
                        g.setColor(Color.black);
                        g.drawRect(j * 30, i * 30, 30, 30);
                    }
                       
                    if (getMatris()[i][j] == 1) {
                        g.setColor(Color.gray);
                        g.fillRect(j * 30, i * 30, blokh, blokw);
                        g.setColor(Color.black);
                        g.drawRect(j * 30, i * 30, blokh, blokw);
                    }
                    if (getMatris()[i][j] == 2) {
                        g.setColor(Color.GREEN);
                        g.fillRect(j * 30, i * 30, blokh, blokw);
                        g.setColor(Color.black);
                        g.drawRect(j * 30, i * 30, blokh, blokw);
                    }
                    if (getMatris()[i][j] == 3) {
                        g.setColor(Color.blue);
                        g.fillRect(j * 30, i * 30, blokh, blokw);
                        g.setColor(Color.black);
                        g.drawRect(j * 30, i * 30, blokh, blokw);
                    }

                    if (i == getBaslangic().x && j == getBaslangic().y) {

                        g.setColor(Color.MAGENTA);
                        g.fillOval(j*30, i*30, w, h);
                        g.setColor(Color.black);
                        g.drawOval(j*30, i*30, w, h);
                    }
                   if(i==getHedef().x && j == getHedef().y)
                    {
                        g.setColor(Color.red);
                        g.fillOval(j*30, i*30, w, h);
                        g.setColor(Color.black);
                        g.drawOval(j*30, i*30, w, h);
                    } 
                    
                    
                }
            }
        }
    }
}
