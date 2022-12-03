interface LandAnimal {
    public void land();

}
interface WaterAnimal {
    public void water();
}
class Amphibian implements LandAnimal,WaterAnimal {
    public void land() {
        System.out.println("This animal can live on land");
    }
    public void water() {
        System.out.println("This animal can live on water");
    }
}

class animal1 {
    public static void main(String[] args) {
        Amphibian frog = new Amphibian();
        frog.land();
        frog.water();
    }
}