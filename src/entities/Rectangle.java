package entities;

public class Rectangle {
    public double width;
    public double height;

    public Rectangle() {
        this.width = width;
        this.height = height;
    }

    public double area(){
        return this.width * this.height;
    }

    public double perimeter(){
        return 2 * (this.width + this.height);
    }

    public double calcularDiagonal(){
        return Math.sqrt(this.width * this.width + this.height * this.height);
    }

    @Override
    public String toString() {
        return "Área: " + String.format("%.2f",area()) + " - Perímetro: " + String.format("%.2f",perimeter())
                + " - Diagonal: " + String.format("%.2f",calcularDiagonal());
    }
}
