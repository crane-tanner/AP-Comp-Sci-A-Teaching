public class GiftCard {
    private String category;
    private String company;
    private double monetaryValue;

    public GiftCard(String category, String company, double monetaryValue) {
        this.category = category;
        this.company = company;
        this.monetaryValue = monetaryValue;

    }

    public String getCategory() {
        return category;
    }

    public String getCompany() {
        return company;
    }

    public double getMonetaryValue() {
        return monetaryValue;
    }

    @Override
    public String toString() {
        return "GiftCard{" +
                "category='" + category + '\'' +
                ", company='" + company + '\'' +
                ", monetaryValue=" + monetaryValue + '}';

    }
}
