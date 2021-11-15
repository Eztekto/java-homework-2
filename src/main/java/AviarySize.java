package main.java;

public enum AviarySize {
    SMALLEST(1, 1, 1, 1),
    SMALL(2,2,2,2),
    NORMAL(3,3,3,3),
    LARGE(4,4,4,4);
    private int width, height, weight, appetite;


    AviarySize(int width, int height, int weight, int appetite) {
            this.width = width;
            this.height = height;
            this.weight = weight;
            this.appetite = appetite;

    }
    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

    public int getAppetite() {
        return appetite;
    }

}