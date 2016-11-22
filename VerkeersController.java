
//import ....


public class VerkeersController extends JPanel implements ActionListener
{
  private VerkeersLichtModel model;
  private VerkeersLichtView  view;
  private JButton roodKnop, oranjeKnop, groenKnop;


  public VerkeersController ( VerkeersLichtModel model, VerkeersLichtView view )
  {
    // wat doe je met model en view?

    // maak de achtergrondkleur van dit paneel donker-grijs

    // maak de knoppen

    // voeg een ActionListener toe aan de knoppen

    // maak de knoppen zichtbaar op het paneel
  }


  public void actionPerformed( ActionEvent e )
  {
     if ( e.getSource() == roodKnop )
       // zet het rode licht aan

     // idem met de andere knoppen

     // tenslotte .. teken de view opnieuw. Waarom?
  }

}