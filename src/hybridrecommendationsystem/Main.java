/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hybridrecommendationsystem;

import de.javasoft.plaf.synthetica.SyntheticaBlueIceLookAndFeel;
import javax.swing.UIManager;

/**
 *
 * @author Elcot
 */
public class Main {
    public static void main(String[] args) 
    {                
        try
        {                    			
            UIManager.setLookAndFeel(new SyntheticaBlueIceLookAndFeel());                                                            
            
            Homepage uf=new Homepage();
            uf.setTitle("Homepage");
            uf.setVisible(true);
            uf.setResizable(false);             
	}
	catch (Exception ex)
	{            
            
	}        
    }
}
