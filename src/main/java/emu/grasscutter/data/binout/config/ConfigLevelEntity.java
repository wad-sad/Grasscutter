package emu.grasscutter.data.binout.config;

import emu.grasscutter.data.binout.config.fields.ConfigAbilityData;
import lombok.Getter;

import java.util.List;

public class ConfigLevelEntity {

    @Getter private List<ConfigAbilityData> abilities;
    @Getter private List<ConfigAbilityData> monsterAbilities;
    @Getter private List<ConfigAbilityData> avatarAbilities;
    @Getter private List<ConfigAbilityData> teamAbilities;
    @Getter private List<Integer> preloadMonsterEntityIDs;

    @Getter private String dropElemControlType;
}
