
import java.awt.Point;
import java.util.ArrayList;
import java.util.Random;

public class Engel {

    private Point baslangic = new Point();
    private Point hedef = new Point();
    ArrayList<Integer> yol = new ArrayList();
    ArrayList<Integer> iy = new ArrayList();
    ArrayList<Integer> jy = new ArrayList();
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
   

    public Engel(int[][] matris, int satir, int sutun) {

        for (int i = 0; i < satir; i++) {
            for (int j = 0; j < sutun; j++) {
                if (matris[i][j] == 2) {
                    matris[i + 1][j] = 0;

                } else if (matris[i][j] == 3) {
                    matris[i + 1][j] = 0;

                    matris[i + 2][j] = 0;

                } else if (matris[i][j] == 0) {
                    iy.add(i);
                    jy.add(j);

                    yol.add(matris[i][j]);
                }
            }

        }

        Random random = new Random();
        int index = random.nextInt(yol.size() + 1);

        baslangic.x = iy.get(index);
        baslangic.y = jy.get(index);
        int index1 = random.nextInt(yol.size() + 1);
        hedef.x = iy.get(index1);
        hedef.y = jy.get(index1);

    }

}
