package uz.xtreme.oauth2resource;

/**
 * Author: Rustambekov Avazbek
 * Date: 26/12/2019
 * Time: 12:42
 */
public class Customer {

    private String name;

    private String organization;

    public Customer(String name, String organization) {
        this.name = name;
        this.organization = organization;
    }

    public Customer() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOrganization() {
        return organization;
    }

    public void setOrganization(String organization) {
        this.organization = organization;
    }
}
