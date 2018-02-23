package com.zipcodewilmington.assessment1.part3;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by leon on 2/16/18.
 */
public class PetOwner {
    String name;
    ArrayList<Pet> petManifest;


//   private String name;
//   private Pet[] petManifest;

    //TreeMap<Pet, PetOwner> petOwnerTreeMap = new TreeMap<Pet, PetOwner>();

    /**
     * @param name name of the owner of the Pet
     * @param pets array of Pet object
     */
    public PetOwner(String name, Pet... pets) {
        this.name=name;
        if (pets == null){
            this.petManifest = null;
        }
        else {for (Pet p : pets) {

            this.addPet(p);

            }
        }
    }

    /**
     * @param pet pet to be added to the composite collection of Pets
     */
    public void addPet(Pet pet) {
        if (this.petManifest == null) {
            this.petManifest = new ArrayList<Pet>();
        }
        this.petManifest.add(pet);
        pet.setOwner(this);
    }

    /**
     * @param pet pet to be removed from the composite collection Pets
     */
    public void removePet(Pet pet) {
        this.petManifest.remove(pet);
    }

    /**
     * @param pet pet to evaluate ownership of
     * @return true if I own this pet
     */
    public Boolean isOwnerOf(Pet pet) {
        Boolean isOwnerOf= this.petManifest.contains(pet);

        return isOwnerOf;
    }

    /**
     * @return the age of the Pet object whose age field is the lowest amongst all Pets in this class
     */
    public Integer getYoungetPetAge() {
        Integer answer = Integer.MAX_VALUE;
        for (Pet p : this.petManifest) {
            if (p.getAge() < answer ) {
                answer = p.getAge();
            }
        }
        return answer;
    }




    /**
     * @return the age of the Pet object whose age field is the highest amongst all Pets in this class
     */
    public Integer getOldestPetAge() {
        Integer answer = 0;
        for (Pet p : this.petManifest) {
            if (p.getAge() > answer ) {
                answer = p.getAge();
            }
        }
        return answer;
    }


    /**
     * @return the sum of ages of Pet objects stored in this class divided by the number of Pet object
     */
    public Float getAveragePetAge() {
        Integer sumOfAllPetsAges = 0;
        for (Pet p : this.petManifest) {
            sumOfAllPetsAges += p.getAge();
        }
        return sumOfAllPetsAges / (float) getNumberOfPets();
    }

    /**
     * @return the number of Pet objects stored in this class
     */
    public Integer getNumberOfPets() {
        Integer count = 0;
        if (this.petManifest == null) {
            count= 0;
        }
        Integer answer = this.petManifest.size();

        return answer;
    }

    /**
     * @return the name property of the Pet
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return array representation of animals owned by this PetOwner
     */
    public Pet[] getPets() {
        if (this.petManifest.size() == 0) return new Pet[1];
        return this.petManifest.toArray(new Pet[this.petManifest.size()]);
    }
}
