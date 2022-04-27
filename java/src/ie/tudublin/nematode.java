package ie.tudublin;

import processing.data.TableRow;

public class nematode {
    private String name;
    private float length;
    private String limbs;
    private String gender;
    private boolean eyes;

    

    @Override
    public String toString() {
        return "nematode [eyes=" + eyes + ", gender=" + gender + ", length=" + length + ", limbs=" + limbs + ", name="
                + name + "]";
    }

    public nematode(TableRow tr)
    {
        this(
            tr.getString("name"),
            tr.getFloat("length"),
            tr.getString("limbs"),
            tr.getString("gender"),
            tr.getInt("eyes") == 1
        );
    }


    public nematode(String name, float length, String limbs, String gender, boolean eyes) {
        this.name = name;
        this.length = length;
        this.limbs = limbs;
        this.gender = gender;
        this.eyes = eyes;
    }



    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public float getLength() {
        return length;
    }
    public void setLength(float length) {
        this.length = length;
    }
    public String getLimbs() {
        return limbs;
    }
    public void setLimbs(String limbs) {
        this.limbs = limbs;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public boolean isEyes() {
        return eyes;
    }
    public void setEyes(boolean eyes) {
        this.eyes = eyes;
    }

    

}
