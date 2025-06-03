package com.demirkol.foodlyze;

import com.google.gson.annotations.SerializedName;

public class Nutriments {

    @SerializedName("energy")
    private String energy;

    @SerializedName("fat")
    private String fat;

    @SerializedName("carbohydrates")
    private String carbohydrates;

    @SerializedName("sugars")
    private String sugars;

    @SerializedName("proteins")
    private String protein;

    @SerializedName("salt")
    private String salt;

    public String getEnergy() {
        return energy;
    }

    public String getFat() {
        return fat;
    }

    public String getCarbohydrates() {
        return carbohydrates;
    }

    public String getSugars() {
        return sugars;
    }

    public String getProtein() {
        return protein;
    }

    public String getSalt() {
        return salt;
    }
}
