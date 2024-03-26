import processing.core.PApplet;

public class Sketch extends PApplet {
	/**
   * This program will print what needs to be printed
   * @author E.Fung
   **/
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(1200, 600);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(45, 150, 207);
  }

  public void draw() {
    draw_section_outlines();
    draw_section1();
    draw_section2();
    draw_section3();
    draw_section4();
	  
    draw_section5();
    draw_section6();
    draw_section7();
    draw_section8();
  }
  
  /**
   * Draw the outlines for all sections
   */
  public void draw_section_outlines(){
    stroke(0);
    noFill();

    // draw bottom row boxes
    rect(0,300, 300, 300);
    rect(300, 300, 300, 300);
    rect(600, 300, 300, 300);
    rect(900, 300, 300, 300);

    // draw top row boxes
    rect(0,0, 300, 300);
    rect(300, 0, 300, 300);
    rect(600, 0, 300, 300);
    rect(900, 0, 300, 300);
  }
  
  /**
   * draws the bottom left section 
   * draws 30 by 30 grid of squares
   */
  public void draw_section1(){
    int intX = 0;
    int intY = 0;

    for(int intRow = 0; intRow < 30; intRow++){
      for(int intColumn = 0; intColumn < 30; intColumn++){
        intX = 3 + 10 * intRow;
        intY = 300 + 3 + 10 * intColumn; 

        fill(255);
        noStroke();
        rect(intX, intY, 5, 5);
      }
    }
  }

  /**
   * Use the modulus operator and an if statement to select the color
   * Don't loop from 30 to 60 to shift everything over, just add 300 to x.
   * draws 30 by 30 grid of squares but even number columns are coloured black
   */
  public void draw_section2(){
    int intX = 0;
    int intY = 0;

    for(int intRow = 0; intRow < 30; intRow++){
      for(int intColumn = 0; intColumn < 30; intColumn++){
        intX = 300 + 3 + 10 * intRow;
        intY = 300 + 3 + 10 * intColumn; 

        noStroke();

        if (intRow % 2 == 1){
          fill(0);
        }
        else{
          fill(255);
        }
        rect(intX, intY, 5, 5);
      }
    }
  }

  /**
   * Use the modulus operator and an if/else statement to select the color.
   * Don't use multiple 'if' statements.
   * draws a 30 by 30 grid of squares but odd number rows are coloured black
   */
  public void draw_section3(){
    int intX = 0;
    int intY = 0;

    for(int intRow = 0; intRow < 30; intRow++){
      for(int intColumn = 0; intColumn < 30; intColumn++){
        intX = 600 + 3 + 10 * intRow;  
        intY = 300 + 3 + 10 * intColumn; 

        noStroke();

        if (intColumn % 2 == 1){
          fill(255);
        }
        else{
          fill(0);
        }
        rect(intX, intY, 5, 5);
      }
    }
  }

  /**
   * Use the modulus operator and just one 'if' statement to select the color.
   * draws a 30 by 30 grid of square but odd rows and even columns are coloured black
   */
  public void draw_section4(){
    int intX = 0;
    int intY = 0;

    for(int intRow = 0; intRow < 30; intRow++){
      for(int intColumn = 0; intColumn < 30; intColumn++){
        intX = 900 + 3 + 10 * intRow;  
        intY = 300 + 3 + 10 * intColumn; 

        noStroke();

        if (intRow % 2 == 1 || intColumn % 2 == 0){
          fill(0);
        }
        else{
          fill(255);
        }
        rect(intX, intY, 5, 5);
      }
    }
  }

  /**
   * Do NOT use 'if' statements to complete 5-8. Manipulate the loops instead
   */

   /**
    * Draws a right angle triangle with a base of 29 squares and a height of 29 squares
    * pointing left and up
    */
  public void draw_section5(){
    int intX = 0;
    int intY = 0;

    for(int intRow = 0; intRow < 30; intRow++){
      for(int intColumn = 29; intColumn > 29 - intRow; intColumn--){
        intX = 3 + 10 * intRow;
        intY = 3 + 10 * intColumn;

        noStroke();

        fill(255);
        
        rect(intX, intY, 5, 5);
      }
    }
  }
  /**
   * Draws a right angle triangle with a base of 30 squares and a height of 30 squares
   * pointing right and up
   */
  public void draw_section6(){
    int intX = 0;
    int intY = 0;

    for(int intRow = 30; intRow >= 0; intRow--){
      for(int intColumn = 29; intColumn >= intRow; intColumn--){
        intX = 300 + 3 + (10 * intRow);
        intY = 3 + (10 * intColumn);

        noStroke();

        fill(255);
        
        rect(intX, intY, 5, 5);
      }
    }
  }
  /**
   * Draws a right angle triangle with a base of 30 squares and a height of 30 squares
   * reflected along the x-axis pointing down and right
   */
  public void draw_section7(){
    int intX = 0;
    int intY = 0;

    for(int intRow = 0; intRow < 30; intRow++){
      for(int intColumn = 29; intColumn >= intRow; intColumn--){
        intX = 600 + 3 + (10 * intRow);
        intY = 300 - 7 - (10 * intColumn);

        noStroke();

        fill(255);
        
        rect(intX, intY, 5, 5);
      }
    }
  }
  /**
   * Draws a right angle triangle with a base of 30 squares and a height of 30 squares
   * reflected along the x-axis pointing down and left
   */
  public void draw_section8(){
    int intX = 0;
    int intY = 0;

    for(int intRow = 0; intRow < 30; intRow++){
      for(int intColumn = 0; intColumn <= intRow; intColumn++){
        intX = 900 + 3 + (10 * intRow);
        intY = 3 + (10 * intColumn);

        noStroke();

        fill(255);
        
        rect(intX, intY, 5, 5);
      }
    }
  }
}
