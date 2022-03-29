
class DiceCup{
  
  Die[] diceCup;
  
//Constructor
  public DiceCup () {  
    diceCup = new Die[15];
    println("initialized");
   }

// Add's dice to cup

  void addDie (Die die){
    println("add die with color = " + die.dieColor);
    
    boolean dieAdded = false;
    
    for(int i = 0 ; i < diceCup.length ; i++){
      if (diceCup[i] == null && dieAdded == false){
       diceCup[i] = die;
       println("die with diecolor = "+ diceCup[i].dieColor +"added to place = " + i);
       dieAdded = true;
      }
    }
}

//Shakes die
 void shake(){
    for(int i = 0 ; i < diceCup.length ; i++ ){
      if(diceCup[i] != null) {
        diceCup[i].rollDie();
      }
 }
  
}
// Draws dice
 void draw (){
   
   
   
   
   /*diceCup[0].draw(100,100,150);
   diceCup[1].draw(100,300,150);
   
   for(int i = 0 ; i < diceCup.length ; i++ ){
   diceCup[0].draw(100,100,100);
   diceCup[1].draw(100,300,100);
   */
 }
   
 
}
