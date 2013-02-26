package eu.enhan.droidalerter.common;

/**
 * This class is designed to represent an alert abstracting its origin (mail, SMS,...).
 * It boils down to the only useful data required in the upper layer of the application.
 *
 * @author Emmanuel Nhan
 */
public class AlertMessage {


    public static Builder newBuilder(){
        return new Builder();
    }


    private final AlertLevel alertLevel;
    private final String subject ;
    private final String additionalInfos;

    protected AlertMessage(AlertLevel alertLevel, String subject, String additionalInfos) {
        this.alertLevel = alertLevel;
        this.subject = subject;
        this.additionalInfos = additionalInfos;
    }


    public AlertLevel getAlertLevel() {
        return alertLevel;
    }

    public String getSubject() {
        return subject;
    }

    public String getAdditionalInfos() {
        return additionalInfos;
    }

    public static class Builder{
        private AlertLevel alertLevel  ;
        private String subject;
        private String additionalInfos;


        public Builder withAlertLevel(AlertLevel level){
            this.alertLevel = level;
            return this;
        }

        public Builder withSubject(String subject){
            this.subject = subject;
            return this;
        }

        public Builder withAdditionalInfos(String otherInfo){
            this.additionalInfos = otherInfo;
            return this;
        }

        public AlertMessage build(){
            return new AlertMessage(alertLevel,subject,additionalInfos);
        }

    }


}
