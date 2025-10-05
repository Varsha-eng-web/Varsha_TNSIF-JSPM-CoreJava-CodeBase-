public class MultiLevelInheritanceDemo {

    public static void main(String[] args) {
        City c = new City();
        c.setCityName("Pune");
        c.setArea(12345.890f);
        c.setStateName("Maharashtra");
        c.setLanguage("Marathi");
        c.setCountryname("India");
        c.setCapital("Delhi");

        System.out.println(c);
    }
}

class Country {
    private String countryname;
    private String capital;

    // Getters and Setters
    public String getCountryname() {
        return countryname;
    }

    public void setCountryname(String countryname) {
        this.countryname = countryname;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    @Override
    public String toString() {
        return "Country [countryname=" + countryname + ", capital=" + capital + "]";
    }
}

class State extends Country {
    private String stateName;
    private String language;

    // Getters and Setters
    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    @Override
    public String toString() {
        return "State [stateName=" + stateName + ", language=" + language +
                ", getCountryname()=" + getCountryname() +
                ", getCapital()=" + getCapital() + "]";
    }
}

class City extends State {
    private String cityName;
    private float area;

    // Getters and Setters
    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public float getArea() {
        return area;
    }

    public void setArea(float area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return "City [cityName=" + cityName +
                ", area=" + area +
                ", getStateName()=" + getStateName() +
                ", getLanguage()=" + getLanguage() +
                ", getCountryname()=" + getCountryname() +
                ", getCapital()=" + getCapital() + "]";
    }
}

