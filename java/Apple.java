import com.sun.deploy.util.JVMParameters;

import java.awt.font.GlyphJustificationInfo;

public class Apple extends Fruit {

    private static float weight;
    private JVMParameters.ArgumentSet fruit;

    int Weight() {

        GlyphJustificationInfo apple;
        Apple.weight = 1.0f;

        return 0;
    }

    private static long sum;

    int Sum() {
        GlyphJustificationInfo apple;
        Apple.sum = 5;
        return 0;
    }

    public float getWeight(JVMParameters.ArgumentSet fruit) {
        this.fruit = fruit;
        for (int i = 0; i < fruit.size(); i++) {
            sum += fruit.get(i).getWeight();
        }
        return sum;
    }
}



