package com.zipcodewilmington.assessment1.part3;

import java.util.Arrays;

/**
 * Created by leon on 2/16/18.
 */
public class PetOwner {
   private String name;
   private Pet[] petManifest;

    //TreeMap<Pet, PetOwner> petOwnerTreeMap = new TreeMap<Pet, PetOwner>();

    /**
     * @param name name of the owner of the Pet
     * @param pets array of Pet object
     */
    public PetOwner(String name, Pet... pets) {
        this.name=name;
        if (pets == null){
            this.petManifest = new Pet[0];
        }
        else {
            this.petManifest = new Pet[pets.length];
            for (int i = 0; i < pets.length; i++){
                this.petManifest[i] = pets[i];
                pets[i].setOwner(this);
            }
        }
    }

    /**
     * @param pet pet to be added to the composite collection of Pets
     */
    public void addPet(Pet pet) {
        this.petManifest = Arrays.copyOf(this.petManifest, this.petManifest.length+1);
        this.petManifest[this.petManifest.length-1]= pet;
        pet.setOwner(this);
       //petOwnerTreeMap.put(pet);
    }

    /**
     * @param pet pet to be removed from the composite collection Pets
     */
    public void removePet(Pet pet) {
        Pet [] tempArray = new Pet[this.petManifest.length];
        for(Pet p : this.petManifest){
            if (!p.equals(pet)){
                tempArray[tempArray.length-1] = p;
            }
        }
        this.petManifest = tempArray;
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
