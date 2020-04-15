public class PythagoreanTest {
    public static void main(String[] args) {
        Pythagorean p = new Pythagorean();
        Double getHypo = p.calculateHypotenuse(legA,legB);
        System.out.println("El valor de la Hipotenusa es " + getHypo);
    }
}