public class Camping {
    private String name;
    private String city;
    private boolean hasAnimation;
    private double pricePerNight;
    private int stars;
    private boolean hasPool;
    private String country;

    public Camping(String name, String city, boolean hasAnimation, double pricePerNight, int stars, boolean hasPool,
            String country) {
        this.name = name;
        this.city = city;
        this.hasAnimation = hasAnimation;
        this.pricePerNight = pricePerNight;
        this.stars = stars;
        this.hasPool = hasPool;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public boolean hasAnimation() {
        return hasAnimation;
    }

    public void setHasAnimation(boolean hasAnimation) {
        this.hasAnimation = hasAnimation;
    }

    public double getPricePerNight() {
        return pricePerNight;
    }

    public void setPricePerNight(double pricePerNight) {
        this.pricePerNight = pricePerNight;
    }

    public int getStars() {
        return stars;
    }

    public void setStars(int stars) {
        this.stars = stars;
    }

    public boolean hasPool() {
        return hasPool;
    }

    public void setHasPool(boolean hasPool) {
        this.hasPool = hasPool;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}