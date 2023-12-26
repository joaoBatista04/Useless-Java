    import java.awt.*;
    import java.awt.event.*;

    public class Box extends Rectangle{
        Color color;

        Box(int x, int y, int width, int height, Color color){
            this.x = x;
            this.y = y;
            this.width = width;
            this.height = height;
            this.color = color;
        }

        public void keyPressed(KeyEvent e){
            if(e.getKeyCode() == KeyEvent.VK_UP){
                this.y -= 10;
            } else if(e.getKeyCode() == KeyEvent.VK_DOWN){
                this.y += 10;
            } else if(e.getKeyCode() == KeyEvent.VK_LEFT){
                this.x -= 10;
            } else if(e.getKeyCode() == KeyEvent.VK_RIGHT){
                this.x += 10;
            } else{
            }
        }

        public void draw(Graphics g){
            g.setColor(color);
            g.fillRect(x, y, width, height);
        }
    }