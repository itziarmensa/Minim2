package com.grupo3.androiddsa.domain;

import com.grupo3.androiddsa.domain.vo.Dice;


public class Characters {

    private String characterId;
    private String characterName;
    private String characterDescription;
    private double characterCoins;
    String avatar;

    public Characters() {
    }

    public Characters(String characterId, String characterName, String characterDescription, double characterCoins, String avatar) {
        this.characterId = characterId;
        this.characterName = characterName;
        this.characterDescription = characterDescription;
        this.characterCoins = characterCoins;
        this.avatar = avatar;
    }

    public String getCharacterId() {
        return characterId;
    }

    public void setCharacterId(String characterId) {
        this.characterId = characterId;
    }

    public String getCharacterName() {
        return characterName;
    }

    public void setCharacterName(String characterName) {
        this.characterName = characterName;
    }

    public String getCharacterDescription() {
        return characterDescription;
    }

    public void setCharacterDescription(String characterDescription) {
        this.characterDescription = characterDescription;
    }

    public double getCharacterCoins() {
        return characterCoins;
    }

    public void setCharacterCoins(double characterCoins) {
        this.characterCoins = characterCoins;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }
}
