package org.comp2522.ProjectRocketMan;

import processing.core.PApplet;
import processing.core.PVector;

public class Button {

  private PVector postion;

  private PVector dimensions;

  private Window window;

  private String label;
  public Button(PVector postion, PVector dimensions, String label){
      this.dimensions = dimensions;
      this.postion = postion;
      window = Window.getInstance();
      this.label = label;
  }


  public void draw(){
    window.stroke(0);
    window.fill(255);
    window.rect(postion.x, postion.y, dimensions.x, dimensions.y);
    window.fill(0);
    window.textAlign(window.CENTER, window.CENTER);
    window.text(label, postion.x+ dimensions.x/2, postion.y + dimensions.y/2);
  }


  public boolean isClicked(){
    return window.mouseX >= postion.x && window.mouseX <= postion.x + dimensions.x &&
            window.mouseY >= postion.y && window.mouseY <= postion.y + dimensions.y &&
            window.mousePressed;
  }

  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }
}
