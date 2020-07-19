public class BmiService {
    public float calculate (float heightMM, float weightGR){
        float index = (weightGR / (heightMM * heightMM));
                return index;
    }
}
