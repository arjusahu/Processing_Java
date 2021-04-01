import processing.core.PApplet;
public class TryProcessing extends PApplet{
    public static final int WIDTH=600;
    public static final int HEIGHT=600;
    int x1=0,x2=0,x3=0,x4=0;

    public static void main(String[] args) {
        PApplet.main("TryProcessing", args);

    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH,HEIGHT);
    }
    @Override
    public void setup(){
//      ellipse(WIDTH/2,HEIGHT/2,100,100);// first two are position of center and other two are height nd width
    }
    @Override
    public void draw()
    {
        ellipse(x1,HEIGHT/5,10,10);
        x1++;
        ellipse(x2,2*HEIGHT/5,10,10);
        x2=x2+2;
        ellipse(x3,3*HEIGHT/5,10,10);
        x3+=3;
        ellipse(x4,4*HEIGHT/5,10,10);
        x4+=4;
    }

}
