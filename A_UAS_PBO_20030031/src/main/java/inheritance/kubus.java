/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritance;

/**
 *
 * @author ninda
 */
public class kubus extends BangunRuang {

    float ss;
    float luas(){
        float luas = ss * ss;        
        return luas;
    }
    float volume(){
        float volume = ss * ss * ss;
        return volume;
    }
}
