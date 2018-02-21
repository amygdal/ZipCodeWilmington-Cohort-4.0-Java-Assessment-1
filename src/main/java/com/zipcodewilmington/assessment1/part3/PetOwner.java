package com.zipcodewilmington.assessment1.part3;

import java.util.TreeMap;

/**
 * Created by leon on 2/16/18.
 */
public class PetOwner {
   private String name;
   private Pet[] petlist;

    TreeMap<Pet, PetOwner> petOwnerTreeMap = new TreeMap<Pet, PetOwner>();

    /**
     * @param name name of the owner of the Pet
     * @param pets array of Pet object
     */
    public PetOwner(String name, Pet... pets) {
   // PetOwner newOwner = new PetOwner(name, pets);
this.name=name;
if (pets == null){
    //this.petList = new Pet[0];
}
    }

    /**
     * @param pet pet to be added to the composite collection of Pets
     */
    public void addPet(Pet pet) {
       //petOwnerTreeMap.put(pet);
    }

    /**
     * @param pet pet to be removed from the composite collection Pets
     */
    public void removePet(Pet pet) {
        //petOwnerTreeMap.remove(Pet);
    }

    /**
     * @param pet pet to evaluate ownership of
     * @return true if I own this pet
     */
    public Boolean isOwnerOf(Pet pet) {
        Boolean isOwnerOf= false;

        return isOwnerOf;
    }

    /**
     * @return the age of the Pet object whose age field is the lowest amongst all Pets in this class
     */
    public Integer getYoungetPetAge() {

        Integer answer = 0;

        return answer;
    }




    /**
     * @return the age of the Pet object whose age field is the highest amongst all Pets in this class
     */
    public Integer getOldestPetAge() {
        Integer answer = 0;

        return answer;
    }


    /**
     * @return the sum of ages of Pet objects stored in this class divided by the number of Pet object
     */
    public Float getAveragePetAge() {
        Float answer = 0F;

        return answer;
    }

    /**
     * @return the number of Pet objects stored in this class
     */
    public Integer getNumberOfPets() {
        Integer answer = 0;

        return answer;
    }

    /**
     * @return the name property of the Pet
     */
    public String getName() {
        String answer = "";

        return answer;
    }

    /**
     * @return array representation of animals owned by this PetOwner
     */
    public Pet[] getPets() {
        Pet[] answer = {};

        return answer;
    }
}
