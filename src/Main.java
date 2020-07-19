public class Main {
    public static void main(String[] args){
        BmiService service = new BmiService();
        float heightMM = 1.65F;
        float weightGR = 60F;
        float index = service.calculate(heightMM, weightGR);
        System.out.println(index);
    }
}
