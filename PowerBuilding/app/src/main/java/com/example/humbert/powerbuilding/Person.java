package com.example.humbert.powerbuilding;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by Humbert on 10/07/2017.
 */

public class Person implements Parcelable {
    private boolean gender;
    private float weight;
    private boolean weight_units;
    private float height;
    private boolean height_units;

    public void setGender(boolean gender){
        this.gender=gender;
    }

    public boolean getGender(){
        return gender;
    }
    public void setWeight(float weight){
        this.weight=weight;
    }

    public float getWeight(){
        return weight;
    }

    public boolean isWeight_units() {
        return weight_units;
    }

    public void setWeight_units(boolean weight_units) {
        this.weight_units = weight_units;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public boolean isHeight_units() {
        return height_units;
    }

    public void setHeight_units(boolean height_units) {
        this.height_units = height_units;
    }
    @Override
    public int describeContents() {
        return hashCode();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeByte((byte)(gender ? 1:0));
        dest.writeFloat(weight);
        dest.writeByte((byte)(weight_units ? 1:0));
        dest.writeFloat(height);
        dest.writeByte((byte)(height_units ? 1:0));

    }

    // We reconstruct the object reading from the Parcel data
    public Person(Parcel p) {
        gender = p.readByte() !=0;
        weight = p.readFloat();
        weight_units = p.readByte() !=0;
        height= p.readFloat();
        height_units=p.readByte() !=0;
    }

    public Person() {}

// We need to add a Creator
    public static final Parcelable.Creator<Person> CREATOR = new Parcelable.Creator<Person>() {

        @Override
        public Person createFromParcel(Parcel parcel) {
            return new Person(parcel);
        }

        @Override
        public Person[] newArray(int size) {
            return new Person[size];
        }
    };
}

