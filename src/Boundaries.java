public class Boundaries {

    final String profile;
    //(S)kill and (R)eadability
    private final float minS, maxS, minR, maxR;

    Boundaries(String profile, float minS, float maxS, float minR, float maxR) {
        this.profile = profile;
        this.minS = minS;
        this.maxS = maxS;
        this.minR = minR;
        this.maxR = maxR;
    }

    String getProfileName() {
        return profile;
    }

    float getMaxR() {
        return maxR;
    }

    float getMaxS() {
        return maxS;
    }

    float getMinR() {
        return minR;
    }

    float getMinS() {
        return minS;
    }
}