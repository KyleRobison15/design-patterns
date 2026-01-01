package template;

public abstract class Task {
    private AuditTrail auditTrail;

    public Task(){
        auditTrail = new AuditTrail();
    }

    public Task(AuditTrail auditTrail) {
        this.auditTrail = auditTrail;
    }

    public void execute(){
        auditTrail.record();
        doExecute();
    }

    // Protected encapsulates this method in this class, but makes it available to any subclasses and any classes inside this package
    // Important here so that clients using the concrete Task implementations can't call this method directly, skipping the execute method's logic
    protected abstract void doExecute();
}
