## MS_PackedWool 1.12.2 Dev ToDo List
### Main
- [x] [Jitpack publishing](https://jitpack.io/) **I am done with it. pls help if u can. Still it's  a minor feature**
- [x]  Change revision (actually no i am fine with how it is) and build order. 
  *The thing is i would have to set revision to 0 when i build. Therefore i would have different git versioning system.*
- [ ] Try making the textures slightly darker.
- [ ] Create a file containing Minecraft account info. *buildcraft git - private.properties.example*
### ShearsLib
- [ ] Implement blocks material - harvest lvl etc (look at serious_core project).
- [ ] Think about making packed wool long to harvest and drop wool instead. And when harvested with shears it would drop packed wool.
- [ ] Make shears extensible (different speeds for different shear material).
- [ ] Include Shears into the project.
*https://github.com/BuildCraft/BuildCraft/tree/8.0.x-1.12.2/common/buildcraft*
*https://forums.minecraftforge.net/topic/64469-have-a-modblock-break-faster-with-shears-like-wool/*
### Config

- [ ] Understand better whats going on here.
- [ ] Think about whats here and whats in 1.13+ versions.

- [ ] Config to make only "red_bed"/"legacy_bed" craftable.
- [ ] Config to disable overriding minecraft basic shears.
- [ ] Config to disable new bed recipes.
- [ ] Config option to make hoes harvest wool/packed wool with the speed of 0.5f of shear equivalent.
- [ ] Config to disable beds spawning in minecraft villages.

### Links that i am looking into
[OLD_API](https://skmedix.github.io/ForgeJavaDocs/)
[API](https://forge.yue.moe)
[Config_something](https://mcforge.readthedocs.io/en/1.12.x/config/annotations/)
[deobf](https://github.com/neworldmc/mc-deobf)
*https://github.com/bernie-g/geckolib/blob/1.12/build.gradle*
*https://github.com/bernie-g/geckolib/blob/1.12/gradle.properties*
*https://geckolib.com/en/latest/2.0.0/*
*https://github.com/supermassimo/DynamicTrees-ExC/blob/1.12.2/.DONE/DynamicTrees-Forestry/src/main/java/maxhyper/dynamictreesforestry/DynamicTreesForestry.java*
*https://github.com/iLexiconn/LLibrary*
*https://github.com/BlakeBr0/Cucumber*
*https://github.com/jaquadro/Chameleon*
*https://github.com/Chisel-Team/ConnectedTexturesMod*
*https://github.com/Darkhax-Minecraft/Bookshelf*
*https://github.com/Shadows-of-Fire/Placebo*
*https://github.com/TheCBProject/CodeChickenLib/tree/1.12.x/src/main/java/codechicken/lib*
*https://github.com/Vazkii/Botania/blob/1.12-final/build.gradle*
*https://github.com/Vazkii/AutoRegLib/blob/1.12/build.gradle*
*https://github.com/WanionCane/UniDict*
*https://github.com/WanionCane/WanionLib/tree/1.12.2/src/main*
*https://github.com/SilentChaos512/SilentLib/tree/1.12*
*https://github.com/SilentChaos512/SilentLib/blob/1.12/build.gradle*
*https://github.com/SilentChaos512/Silent-Gear/blob/1.12/build.gradle*





/// config

https://github.com/MinecraftForge/MinecraftForge/blob/603903db507a483fefd90445fd2b3bdafeb4b5e0/src/test/java/net/minecraftforge/debug/ConfigTest.java

https://github.com/Glitchfiend/BiomesOPlenty/blob/BOP-1.12.x-7.0.x/src/main/java/biomesoplenty/api/config/IConfigObj.java

https://github.com/Glitchfiend/BiomesOPlenty/blob/BOP-1.12.x-7.0.x/src/main/java/biomesoplenty/core/BiomesOPlenty.java

https://github.com/Glitchfiend/BiomesOPlenty/blob/BOP-1.12.x-7.0.x/src/main/java/biomesoplenty/common/init/ModConfiguration.java

https://github.com/Glitchfiend/BiomesOPlenty/blob/BOP-1.12.x-7.0.x/src/main/java/biomesoplenty/common/config/MiscConfigurationHandler.java

https://github.com/lumien231/Hardcore-Darkness/blob/master/src/main/java/lumien/hardcoredarkness/config/ConfigHandler.java

https://github.com/lumien231/Hardcore-Darkness/blob/master/src/main/java/lumien/hardcoredarkness/config/HardcoreDarknessConfig.java

https://github.com/MattCzyr/NaturesCompass/blob/NaturesCompass-1.12.2/src/main/java/com/chaosthedude/naturescompass/NaturesCompass.java

https://github.com/MattCzyr/NaturesCompass/blob/NaturesCompass-1.12.2/src/main/java/com/chaosthedude/naturescompass/config/ConfigHandler.java

https://github.com/MattCzyr/NaturesCompass/blob/NaturesCompass-1.12.2/src/main/java/com/chaosthedude/naturescompass/NaturesCompass.java

https://github.com/MattCzyr/NaturesCompass/tree/NaturesCompass-1.12.2/src/main/java/com/chaosthedude/naturescompass

https://skmedix.github.io/ForgeJavaDocs/javadoc/forge/1.11.2-13.20.0.2228/net/minecraftforge/fml/client/event/ConfigChangedEvent.html#getConfigID--

https://forums.minecraftforge.net/topic/62627-112-how-to-create-config/