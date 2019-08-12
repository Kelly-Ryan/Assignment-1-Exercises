public class Peach {

    float price;
    static int count;
    static float totalCost;

    public Peach(){

        price = 0.0F;
        totalCost = totalCost+price;
        count++;
    }

    public Peach(float price) {

        this.price = price;
        totalCost = totalCost+price;
        count++;
    }

    public float getPrice(){

        return price;
    }

    public static int getCount() {

        return count;
    }

    public static float getAverageCost(){

        return totalCost/count;
    }
}
