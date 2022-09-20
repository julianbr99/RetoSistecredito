package co.com.certification.sistecredito.dafiti.utils.enums;

public enum Translate {
    PROCEED_PAYMENT("PROCEDER AL PAGO");
    private String word;

    Translate(String word) {
        this.word = word;
    }

    public String word() {
        return word;
    }
}
