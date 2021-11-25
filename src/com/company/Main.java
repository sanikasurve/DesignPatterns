package com.company;

public class Main {
    private static final String colors[] = {"Green", "Blue", "Pink", "Yellow"};


    public static void main(String[] args) {
          for (int i = 0; i < 20; i++) {
              Circle circle = (Circle)ShapeFactory.getCircle(getRandomColor());
              circle.setX(getRandomX());
              circle.setY(getRandomY());
              circle.setRadius(400);
              circle.draw();

          }



    }

    private static String getRandomColor() {
        return colors[(int)(Math.random()*colors.length)];
    }

    private static int getRandomX() {
        return (int)(Math.random()*100);
    }
    private static int getRandomY() {
        return (int)(Math.random()*100);
    }
}
