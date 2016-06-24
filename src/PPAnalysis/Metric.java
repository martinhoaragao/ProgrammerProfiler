
public class Metric {

    final String methodname, _this, implies;
    int priority;

    public Metric(String methodname, String _this, String implies, int priority) {
        this.methodname = methodname;
        this._this = _this;
        this.implies = implies;
        this.priority = priority;
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

    public int getPriority() {
        return priority;
    }
}
