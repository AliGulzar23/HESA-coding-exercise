/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gulza
 */
public class Bee {
     public String ID;
     //holds initials of bee plus the number assigned to it
     public float health;
     //holds value of health
     public boolean isAlive;
     //holds status of bee
     protected float dmgLevel;
     //holds the health required to kill bee
     
     public Bee(){
         health = 100;
         //default value of health
         isAlive = true;
         //all bees are created alive
     }
     public void Damage (float damage){
         //reduces the health of bee by damage
         if(isAlive){
             health = health- damage;
             if (health <0){
                 health = 0;
                 //prevents any negative numbers from showing up
             }
            Check_Status();
         }
     }

    private void Check_Status() {
        if(health<=dmgLevel){
            //checks if health is low enough for bee to be dead
            isAlive = false;
            //changes status of bee
        }
    }
}
