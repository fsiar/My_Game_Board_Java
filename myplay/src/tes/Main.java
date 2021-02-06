package tes;



import com.sun.xml.internal.ws.api.PropertySet.Property;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.geom.AffineTransform;
import java.rmi.dgc.DGC;
import java.text.Normalizer.Form;
import java.util.Random;
import javax.smartcardio.CardTerminals.State;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import org.omg.CORBA.Current;
import org.omg.CORBA.PUBLIC_MEMBER;
import sun.java2d.ScreenUpdateManager;
import sun.misc.Cleaner;

public class Main {



public static void main(String[] args) {
      

        JFrame form=new JFrame("level 1")  ;
        form.setBackground(Color.lightGray)  ;
        form.add(new PaintPanel())   ;
        form.setSize(300, 350);
        form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        form.setVisible(true);
    }
}

class PaintPanel extends JPanel implements MouseListener,KeyListener,MouseMotionListener,Runnable{
    private int x1,y1,x2,y2,y3,x3,y4,x4,x5,y5,x6,y6,x7,y7,xi=0,yj=0 ,yi=0,h1=100,m2=0,c=0,d=0,flg=0,flg2=0,flgrect=0,side1=0,side2=0;
static  int big = 7 ;
static int level = 1;
int end = 0 ;
int win = 0 ;
int los = 0 ;
int co = 0  ;
int rco = 0 ;
    
    private Random rnd=new Random();
     Graphics g ;
   PaintPanel(int big,int level)
   {
       this.big = big ;
       this.level = level   ;
       
   }

    public PaintPanel(){


     x1 = rnd.nextInt(2) ;
     x2 = rnd.nextInt(10) ;
     y1 = rnd.nextInt(2) ;
     y2 = rnd.nextInt(100)+100 ;
     x3 = rnd.nextInt(100)+10 ;
     y3 = 290 ;
     x4 = 300 ;
     y4 = rnd.nextInt(100)+50 ;
     y5 = rnd.nextInt(50)+70;
     x5 = rnd.nextInt(50)+20 ;
     x6 = rnd.nextInt(50)+120 ;
     y6 = rnd.nextInt(100)+200 ;
     x7 = rnd.nextInt(70)+120 ;
     y7 = rnd.nextInt(100)+10 ;
     xi = 0 ;
     yj = 0 ;
        
       

        Thread th1=new Thread(this);
        th1.start();
         
        addMouseListener(this);
        addMouseMotionListener(this);
        addKeyListener(this) ;
    }
    @Override
    public void paintComponent(Graphics g){
    



  //..................clear screen...........................//

        g.clearRect(0, 0, 305, 320);

 //.............................................................//

   xi = rnd.nextInt(10) - rnd.nextInt(10) ;
   yi = rnd.nextInt(10) - rnd.nextInt(10) ;
//...............make line again ,,,,,,to have line in last step.......//
   if ( flgrect == 0   )
     {
        if (  d == 1  )
         {
         g.setColor(Color.red);
         g.drawLine(h1, 0, h1, m2)  ;        
         }
         if ( d == 3 )
         {
          g.setColor(Color.red);
          g.drawLine(0, h1, m2, h1)  ;
         }
     }
//.........................................................



 //................................RECT........................
   

  //................................move rect1......................\\      

   if( x1>=0  && x1 <=295  )
   {
     x1+= xi  ;
     
   }
   
        if (  x1 > 295  )
       {
         x1 -=    rnd.nextInt(10)   ;
         x1 -= 7  ;
       }

        if ( x1< 0  )
       {
       x1 +=    rnd.nextInt(10) ;  
       x1 +=    10 ;
       }

   

   if( y1>=0  && y1 <=305  )
   {
     y1+= yi  ;
     
   }
   
        if (  y1 > 305  )
       {
         y1 -=    rnd.nextInt(10)   ;
         y1 -= 7  ;
         
       }

        if ( y1< 0  )
       {
       y1 +=    rnd.nextInt(10)  ;
       y1 += 10  ;

       }

   
//...................................................................\\


  //....................................move rect2..................\\
   if( x2>=0  && x2 <=295  )
   {
     x2+= xi  ;
     
   }
   
        if (  x2 > 295  )
       {
         x2 -=    rnd.nextInt(10)    ;
         x2 -=     10  ;
       }

        if ( x2< 0  )
       {
       x2 +=    rnd.nextInt(10)   ;
       x2 +=  7 ;
   
       }

   

   if( y2 >=0  && y2 <=305  )
   {
     y2 += yi  ;
     
   }
   
        if (  y2 > 305  )
       {
         y2 -=    rnd.nextInt(10)  ;    
         y2 -=     7  ;
         
       }

        if ( y2< 0  )
       {
       y2 +=    rnd.nextInt(10)  ;
       y2 +=   7 ;
       }

   

//...........................................................\\

//.............................move rect3....................\\

      if( x3>=0  && x3 <=295  )
   {
     x3+= xi  ;

   }
   
        if (  x3 > 295  )
       {
         x3 -=    rnd.nextInt(10)   ;
         x3 -=   7  ;
       }

        if ( x3< 0  )
       {
       x3 +=    rnd.nextInt(10)   ;
       x3 +=   10 ;

       }


   if( y3>=0  && y3 <=305  )
   {
     y3+= yi  ;
    
   }
   
        if (  y3 > 305  )
       {
         y3 -=    rnd.nextInt(10)  ;
         y3 -= 7 ;
       }

        if ( y3< 0  )
       {
       y3 +=    rnd.nextInt(10)   ; 
       y3 +=  10  ;

       }

   
//...............................................................//


//............................move rect4.......................//
   if( x4>=0  && x4 <=295  )
   {
     x4-= xi  ;

   }

        if (  x4 > 295  )
       {
         x4 -=    rnd.nextInt(10)   ;
         x4 -=   7  ;
       }

        if ( x4< 0  )
       {
       x4 +=    rnd.nextInt(10)   ;
       x4 +=   10 ;

       }


   if( y4>=0  && y4 <=305  )
   {
     y4-= yi  ;

   }

        if (  y4 > 305  )
       {
         y4 -=    rnd.nextInt(10)  ;
         y4 -= 7 ;
       }

        if ( y4< 0  )
       {
       y4 +=    rnd.nextInt(10)   ;
       y4 +=  10  ;

       }



//............................................................//
        
//........................move rect5.........................//

  if( x5>=0  && x5 <=295  )
   {
     x5 += xi  ;

   }

        if (  x5 > 295  )
       {
         x5 -=    rnd.nextInt(10)   ;
         x5 -=   7  ;
       }

        if ( x5 < 0  )
       {
       x5 +=    rnd.nextInt(10)   ;
       x5 +=   10 ;

       }


   if( y5>=0  && y5 <=305  )
   {
     y5 -= yi  ;

   }

        if (  y5 > 305  )
       {
         y5 -=    rnd.nextInt(10)  ;
         y5 -= 7 ;
       }

        if ( y5 < 0  )
       {
       y5 +=    rnd.nextInt(10)   ;
       y5 +=  10  ;

       }

  //......................move rect 6 ..........................//
    if( x6>=0  && x6 <=295  )
   {
     x6-= xi  ;

   }

        if (  x6 > 295  )
       {
         x6 -=    rnd.nextInt(10)   ;
         x6 -=   7  ;
       }

        if ( x6< 0  )
       {
       x6 +=    rnd.nextInt(10)   ;
       x6 +=   10 ;

       }


   if( y6>=0  && y6 <=305  )
   {
     y6-= yi  ;

   }

        if (  y6 > 305  )
       {
         y6 -=    rnd.nextInt(10)  ;
         y6 -= 7 ;
       }

        if ( y6< 0  )
       {
       y6 +=    rnd.nextInt(10)   ;
       y6 +=  10  ;

       }

//.....................................move rect7........................//

if( x7>=0  && x7 <=295  )
   {
     x7 += xi  ;

   }

        if (  x7 > 295  )
       {
         x7 -=    rnd.nextInt(10)   ;
         x7 -=   7  ;
       }

        if ( x7 < 0  )
       {
       x7 +=    rnd.nextInt(10)   ;
       x7 +=   10 ;

       }


   if( y7>=0  && y7 <=305  )
   {
     y7 -= yi  ;

   }

        if (  y7 > 305  )
       {
         y7 -=    rnd.nextInt(10)  ;
         y7 -= 7 ;
       }

        if ( y7 < 0  )
       {
       y7 +=    rnd.nextInt(10)   ;
       y7 +=  10  ;

       }


//...............................end rect move...........................
       


if (big > 1)
{

if ( flgrect == 0  )
{
                //.....................rect1...................\\
       
    if( big >= 1 )
    {


        if (  d == 1  )
        {
        flg = x1  ;
        flg2 = y1  ;
        }

        if (  d == 3 )
        {
        flg = y1  ;
        flg2 = x1  ;

        }
                if (  ( flg > h1+4  ||  flg < h1-4 ) || flg2 >m2)
                {
                g.setColor(new Color(rnd.nextInt(255),rnd.nextInt(255) , rnd.nextInt(255)));
                g.fillRect(x1, y1, 10, 10)  ;
               
                }
                else
        {
        flgrect = 1 ;
        }

    }
        //..................................................\\
        
        
        //.......................rect2......................\\
   if( big >= 2 )
    {
        if (  d == 1  )
        {
        flg = x2  ;
        flg2  = y2  ;
        }

        if (  d == 3  )
        {
        flg = y2  ;
        flg2 = x2  ;
        }
               if ( (flg > h1+4  ||  flg < h1-4) || flg2 >m2  )
                {
                g.setColor(new Color(rnd.nextInt(255),rnd.nextInt(255) , rnd.nextInt(255)));
                g.fillRect(x2, y2, 10, 10);

                }
                else
        {
        flgrect = 1 ;
        }
   }
             //........................................\\
    
        
        
        //.......................rect3......................\\
   
    if(  big >= 3 )
    {

        if (  d == 1  )
        {
        flg = x3  ;
        flg2= y3  ;
        }

        if (  d == 3  )
        {
        flg = y3  ;
        flg2 = x3  ;
        }
                 if ( flg > h1+4  ||  flg < h1-4 || flg2 >m2 )
                {
                g.setColor(new Color(rnd.nextInt(255),rnd.nextInt(255) , rnd.nextInt(255)));
                g.fillRect(x3, y3, 10, 10);
                }
                else
        {
        flgrect = 1 ;
        }
    }
             //........................................\\
    
    
   
        //.......................rect4......................\\
    if(big>= 4 )
    {
        if (  d == 1  )
        {
        flg = x4  ;
        flg2 = y4  ;
        }
        if (  d == 3  )
        {
        flg = y4  ;
        flg2 = x4 ;
        }
                if ( flg > h1+4  ||  flg < h1-4 || flg2 >m2  )
                {
                g.setColor(new Color(rnd.nextInt(255),rnd.nextInt(255) , rnd.nextInt(255)));
                g.fillRect(x4, y4, 10, 10);
                }
               else
        {
        flgrect = 1 ;
        }
    }




   //..................................rect5......................

     if(big>= 5 )
    {
        if (  d == 1  )
        {
        flg = x5  ;
        flg2 = y5  ;
        }
        if (  d == 3  )
        {
        flg = y5  ;
        flg2 = x5 ;
        }
                if ( flg > h1+4  ||  flg < h1-4 ||  flg2 >m2 )
                {
                   
                g.setColor(new Color(rnd.nextInt(255),rnd.nextInt(255) , rnd.nextInt(255)));
                g.fillRect(x5, y5, 10, 10);
                }
               else
               {
               flgrect = 1 ;
               }
    }



    //........................rect 6..............................//



   if(big>= 6 )
    {
        if (  d == 1  )
        {
        flg = x6  ;
        flg2 = y6  ;
        }
        if (  d == 3  )
        {
        flg = y6  ;
        flg2 = x6 ;
        }
                if ( flg > h1+4  ||  flg < h1-4 ||  flg2 >m2 )
                {

                g.setColor(new Color(rnd.nextInt(255),rnd.nextInt(255) , rnd.nextInt(255)));
                g.fillRect(x6, y6, 10, 10);
                }
               else
               {
               flgrect = 1 ;
               }
    }


//..............................rect7...............................

    if( big >= 7 )
    {


        if (  d == 1  )
        {
        flg = x7  ;
        flg2 = y7  ;
        }

        if (  d == 3 )
        {
        flg = y7  ;
        flg2 = x7  ;

        }
                if (  ( flg > h1+4  ||  flg < h1-4 ) || flg2 >m2)
                {
                g.setColor(new Color(rnd.nextInt(255),rnd.nextInt(255) , rnd.nextInt(255)));
                g.fillRect(x7, y7, 10, 10)  ;

                }
                else
        {
        flgrect = 1 ;
        }

    }

   //..........................................................\\



             //...............................................\\
     
   }
  
      
//........................................end rect.................        


//.......................................line.......................

     if ( flgrect == 0   )
     {

        if (  d == 1  )
         {
         g.setColor(Color.red);
         g.drawLine(h1, 0, h1, m2)  ;
         m2 += 10 ;
         }
         if ( d == 3 )
         {

          g.setColor(Color.red);
          g.drawLine(0, h1, m2, h1)  ;
      //  g.drawLine(0, h1, m2, h1) ;
          m2 += 10 ;
         }
     }
//.................................end line...................//
     //......................last check..............................\\   

        if ( flgrect == 1  )
     {
       end = 1  ;
       los = 1  ;
        }


    if (  d == 1  )
    {
         if (m2 >= 340) {
         end = 1  ;
         win = 1  ;
         }

           
     }
    
     if ( d == 3 )
     {
         if (m2 >= 310) {
         end = 1  ;
         win = 1  ;
         }
     }
     
        //...............................end check...................
}
   
    //.......................check......................\\
 if ( end == 1 && co == 0 && win== 1 )
 {
   
   side1= 0 ;
   side2 = 0 ;
  co = 1 ;

   if ( d==1 )
   {       
       if (x1 < h1 && big>=1 )
       { side1+= 1 ;  }

       if (x1 > h1 && big>=1 )
       { side2+= 1 ;  }


       if (x2 < h1 && big>=2 )
       { side1+= 1 ;  }

       if (x2 > h1 && big>=2 )
       { side2+= 1 ;  }



       if (x3 < h1 && big>=3 )
       { side1+= 1 ;  }

       if (x3 > h1 && big>=3 )
       { side2+= 1 ;  }



       if (x4 < h1 && big>=4 )
       { side1+= 1 ;  }

       if (x4 > h1 && big>=4 )
       { side2+= 1 ;  }


       if (x5 < h1 && big>=5 )
       { side1+= 1 ;  }

       if (x5 > h1 && big>= 5)
       { side2+= 1 ;  }

       
       if (x6 < h1 && big>=6 )
       { side1+= 1 ;  }

       if (x6 > h1 && big>= 6)
       { side2+= 1 ;  }
       
       if (x7 < h1 && big>=7 )
       { side1+= 1 ;  }

       if (x7 > h1 && big>= 7)
       { side2+= 1 ;  }
       
   }       
   
  
  
   if ( d==3 )
   {       
       if (y1 < h1 && big>=1 )
       { side1+= 1 ;  }

       if (y1 > h1 && big>=1 )
       { side2+= 1 ;  }


       if (y2 < h1 && big>=2 )
       { side1+= 1 ;  }

       if (y2 > h1 && big>=2 )
       { side2+= 1 ;  }



       if (y3 < h1 && big>=3)
       { side1+= 1 ;  }

       if (y3 > h1 && big>=3 )
       { side2+= 1 ;  }



       if (y4 < h1 && big>= 4)
       { side1+= 1 ;  }

       if (y4 > h1 && big>= 4)
       { side2+= 1 ;  }



       if (y5 < h1  && big>=5)
       { side1+= 1 ;  }

       if (y5 > h1  && big>=5)
       { side2+= 1 ;  }
   

       if (y6 < h1 && big>= 6)
       { side1+= 1 ;  }

       if (y6 > h1 && big>= 6)
       { side2+= 1 ;  }



       if (y7 < h1  && big>=7)
       { side1+= 1 ;  }

       if (y7 > h1  && big>=7)
       { side2+= 1 ;  }
       
       
       
   }   
big=0 ;
  if (side1 >= side2 )
  {   big = side1 ;}
  if (side1 < side2 )
  {   big = side2 ; }

level ++ ;
new PaintPanel(big,level) ;

 }
     
    
  
}
    
//........................................................\\


    public void mouseClicked(MouseEvent p) {

    //    JOptionPane.showMessageDialog(null,"MouseClicked at " + h1 + ":" + h2);

if( c ==  0)
{

    d = p.getButton()   ;

      if ( d == 1 )
      {

       h1 = p.getX()  ;
       c++  ;
      }

      if(   d == 3  )
      {
          
       h1 = p.getY()  ;
      c++  ;

      }
      }

           
    }
    public void mousePressed(MouseEvent e) {

    }

    public void mouseReleased(MouseEvent e) {
        
    }

    public void mouseEntered(MouseEvent e) {
        
    }

    public void mouseExited(MouseEvent e) {
        
    }

    public void mouseDragged(MouseEvent e) {
        
    }

    public void mouseMoved(MouseEvent e) {
        
    }
//int nbig = big ;
    public void run() {

        //Random rnd1=new Random();

        while( end == 0  ){
                
            try{
                 repaint();

        
                synchronized(this){
                Thread.sleep(1000)  ;         
                }
            }catch(Exception e){}
        }


        if( win == 1 && big != 1 ){
        
         JOptionPane.showMessageDialog(null,"you win"  );
       JOptionPane.showMessageDialog(null,"leve "+level );
         }
     if(win == 1 && big !=1 )
   {
         
    
      JFrame fwin = new JFrame("leve "+level)   ;
      fwin.setBackground(Color.lightGray) ;
      fwin.setForeground(Color.red) ;
      fwin.setSize(300, 350);
      PaintPanel p1 = new PaintPanel() ;
      fwin.add( p1 );
      fwin.show()  ;
      fwin.setVisible(true);
   }
        
   if (win == 1 && big == 1  )
    {
       level = level-1 ;
        JOptionPane.showMessageDialog(this, "you win in"+level+"step");
    }
          if( los == 1){
         JOptionPane.showMessageDialog(null,"Game over");
         }

    }

    public void keyTyped(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void keyPressed(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void keyReleased(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet.");
    }


}