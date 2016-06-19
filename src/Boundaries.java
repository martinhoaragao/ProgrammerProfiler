
public class Boundaries {

    //(S)kill and (R)eadability
    float minS, maxS, minR, maxR;

    public Boundaries(float minS, float maxS, float minR, float maxR) {
        this.minS = minS;
        this.maxS = maxS;
        this.minR = minR;
        this.maxR = maxR;
    }

    public Boundaries(Boundaries b) {
        this.minS = b.getMinS();
        this.maxS = b.getMaxS();
        this.minR = b.getMinR();
        this.maxR = b.getMaxR();
    }

    public float getMaxR() {
        return maxR;
    }

    public float getMaxS() {
        return maxS;
    }

    public float getMinR() {
        return minR;
    }

    public float getMinS() {
        return minS;
    }
}
