/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dm;

import java.text.DecimalFormat;
/**
 *
 * @author rkaune
 */
public class DM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double number = 912.345;
        DecimalFormat x = new DecimalFormat("###.##");
        System.out.println (x.format(number) );
    }
    
}
