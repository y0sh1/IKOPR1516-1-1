//import .....

import javax.swing.*;
import java.awt.*;

public class VerkeersLichtView extends JPanel
{
  private VerkeersLichtModel model;

  public VerkeersLichtView( VerkeersLichtModel model )
  {
  	this.model = model;
  }

  public void paintComponent( Graphics g )
  {
  	super.paintComponent( g );
    g.setColor( Color.GRAY );
    int midden = getBounds().width / 2;
    g.fillRect( midden - 30, 50, 60, 160 ); // De kast voor de lampen
    g.fillRect( midden - 5, 210, 10, 120 ); // De paal

    if ( model.getRood() )                   // Teken de lampen
      g.setColor( Color.RED );
    else
      g.setColor( Color.LIGHT_GRAY );
    g.fillOval( midden - 20, 60, 40, 40 );

    if ( model.getOranje() )
      g.setColor( Color.ORANGE );
    else
      g.setColor( Color.LIGHT_GRAY );
    g.fillOval( midden - 20, 110, 40, 40 );

    if ( model.getGroen() )
      g.setColor( Color.GREEN );
    else
      g.setColor( Color.LIGHT_GRAY );
    g.fillOval( midden - 20, 160, 40, 40 );
  }

}