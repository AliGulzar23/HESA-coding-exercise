/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gulza
 */
public class Application {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BeeList beeList = new BeeList();
        beeList.Populate_Bees();
        //sets up all of the bees
        View view = new View();
        view.Build_GUI(beeList);
    }
    
}
