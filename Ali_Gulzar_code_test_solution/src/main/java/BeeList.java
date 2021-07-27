/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
import java.util.Random;
/**
 *
 * @author gulza
 */

public class BeeList {
    
    public ArrayList<Bee> beeList;
    //holds a list of all bees
    public BeeList(){
        beeList = new ArrayList<Bee>();
    
    }
    public void Populate_Bees(){
        //fills the list with 10 of each bee
        for (int i = 0 ; i<30; i++){
            if(i<10){
                //only adds worker bees
                beeList.add(new WorkerBee(i));
            }else if (i>= 10 && i<20){
                //only adds queen bees, id is still 0 - 9
                beeList.add(new QueenBee(i-10));
            } else if (i>=20){
                beeList.add(new DroneBee(i-20));
            }
        }
    }
    public void Damage_Bee(){
        Random random = new Random();
        for (Bee bee: beeList){
            //iterates through every bee and applys a random amount of damage to them
            int rand = random.nextInt(80);
            bee.Damage(rand);
            
        }
    }
    public String Get_Bee_Info(int i ){
        //returns all information about a specific bee
        Bee bee = beeList.get(i);
        //gets the specicif bee
        String status = "Dead";
        //defaults to dead so it can be changed later
        if (bee.isAlive){
            status = "Alive";
        }
        String beeInfo = "<HTML>ID: " + bee.ID + "<br/>Health:  "+bee.health +"<br/>"+ status +"<br/></HTML>";
        return beeInfo;
    }
}
