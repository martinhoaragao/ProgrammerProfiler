public class MetricImpact {

    private Metric metric;
    private boolean isImpactSkill = false;
    private float impact;
    private float value;
    private float ratio;

    public MetricImpact(Metric metric, float value, float ratio) {
        this.metric = metric;
        this.value = value;
        this.ratio = ratio;
    }

    public void register(float skillBefore, float skillAfter, float readabilityBefore, float readabilityAfter) {
        if (metric.getImplies().contains("S")) {
            isImpactSkill = true;

            impact = skillAfter - skillBefore;
        } else {
            impact = readabilityAfter - readabilityBefore;
        }
    }
}
