
public class Metric {

    final String methodname, _this, implies;
    int weight;

    public Metric(String methodname, String _this, String implies, int weight) {
        this.methodname = methodname;
        this._this = _this;
        this.implies = implies;
        this.weight = weight;
    }

    public String getThis() {
        return _this;
    }

    public String getImplies() {
        return implies;
    }

    public String getMethodName() {
        return methodname;
    }

    public int getWeight() {
        return weight;
    }
}
