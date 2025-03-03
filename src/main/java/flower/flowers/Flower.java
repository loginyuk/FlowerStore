package flower.flowers;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @AllArgsConstructor @NoArgsConstructor
public class Flower {
    public Flower(Flower flower) {
        this.price = flower.price;
        this.sepalLength = flower.sepalLength;
        this.color = flower.color;
        this.flowerType = flower.flowerType;
    }
    @Setter double price;
    double sepalLength;
    @Setter FlowerColor color;
    @Setter FlowerType flowerType;
}
