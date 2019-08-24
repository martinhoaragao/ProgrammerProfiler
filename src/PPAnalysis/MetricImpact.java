public class MetricImpact {

    private Metric metric;
    private float impactReadability;
    private float impactSkill;
    private float value;
    private float ratio;

    public MetricImpact(Metric metric, float value, float ratio) {
        this.metric = metric;
        this.value = value;
        this.ratio = ratio;
    }

    public float getImpact() {
        float impact;
        if (metric.getImplies().contains("S")) {
            impact = impactSkill;
        } else {
            impact = impactReadability;
        }
        return impact;
    }

    public float getValue() {
        return value;
    }

    public float getRatio() {
        return ratio;
    }

    public Metric getMetric() {
        return metric;
    }

    public String getMetricName() {
        return metric.getMethodName();
    }

    public void register(float skillBefore, float skillAfter, float readabilityBefore, float readabilityAfter) {
        impactSkill = skillAfter - skillBefore;
        impactReadability = readabilityAfter - readabilityBefore;
    }

    public float getImpactReadability() {
        return impactReadability;
    }

    public float getImpactSkill() {
        return impactSkill;
    }

    public void setImpactSkill(float impactSkill) {
        this.impactSkill = impactSkill;
    }

    public void setImpactReadability(float impactReadability) {
        this.impactReadability = impactReadability;
    }
}
