package self_practice.lambda;


import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class Apple {
    private String color;
    private int weight;

    public Apple(String color, int weight) {
        this.color = color;
        this.weight = weight;
    }
}
