package jadestrouble.musicdiscs;

import net.glasslauncher.mods.gcapi3.api.*;

public class Config {

    @ConfigRoot(value = "config", visibleName = "Music Discs")
    public static ConfigFields config = new ConfigFields();

    public static class ConfigFields {

        @ConfigCategory(
                name = "Config: Dungeon Chest Disc List",
                description = "Options here require restart to take effect"
        )
        public final DungeonDiscListConfig DUNGEON_DISC_LIST_CONFIG = new DungeonDiscListConfig();

//        @ConfigCategory(
//                name = "Config: Lightning Killed Zombie Disc List",
//                description = "Options here require restart to take effect"
//        )
//        public final LightningDiscListConfig LIGHTNING_DISC_LIST_CONFIG = new LightningDiscListConfig();

        @ConfigCategory(
                name = "Config: Skeleton Killed Creeper Disc List",
                description = "Options here require restart to take effect"
        )
        public final CreeperDiscListConfig CREEPER_DISC_LIST_CONFIG = new CreeperDiscListConfig();

        @ConfigEntry(
                name = "Enable Dungeon Chest Disc List",
                description = "Dungeons chests spawn with discs from list",
                multiplayerSynced = true
        )
        public Boolean enableDungeonChestDiscList = true;

        @ConfigEntry(
                name = "Enable Skeleton Killed Creeper Disc List",
                description = "Skeleton creeper kills drop discs from list",
                multiplayerSynced = true
        )
        public Boolean enableSkeletonKilledCreeperDiscList = true;

//        @ConfigEntry(
//                name = "Enable Lightning Killed Zombie Disc List",
//                description = "Lightning zombie kills drop discs from list",
//                multiplayerSynced = true
//        )
//        public Boolean enableLightningKilledZombieDiscList = false;

        @ConfigEntry(
                name = "Ghasts Drop Pigstep Chance",
                description = "Float value between 0.0 (0%) and 1.0 (100%)",
                multiplayerSynced = true
        )
        public Float chanceGhastsDropPigstep = 0.056f;

        @ConfigEntry(
                name = "Modern Music Disc Tooltips Enabled"
        )
        public Boolean enableModernMusicDiscTooltips = true;

        @ConfigEntry(
                name = "Use Magnetic As Calm4 Disc Name",
                description = "Restart required for changes to take effect",
                multiplayerSynced = true
        )
        public Boolean useMagneticAsCalm4DiscName = true;
    }

    public static class DungeonDiscListConfig {
        @ConfigEntry(
                name = "Add To List Disc: 13",
                multiplayerSynced = true
        )
        public Boolean addToListDiscThirteen = true;

        @ConfigEntry(
                name = "Add To List Disc: cat",
                multiplayerSynced = true
        )
        public Boolean addToListDiscCat = true;

        @ConfigEntry(
                name = "Add To List Disc: blocks",
                multiplayerSynced = true
        )
        public Boolean addToListDiscBlocks = true;

        @ConfigEntry(
                name = "Add To List Disc: chirp",
                multiplayerSynced = true
        )
        public Boolean addToListDiscChirp = true;

        @ConfigEntry(
                name = "Add To List Disc: far",
                multiplayerSynced = true
        )
        public Boolean addToListDiscFar = true;

        @ConfigEntry(
                name = "Add To List Disc: mall",
                multiplayerSynced = true
        )
        public Boolean addToListDiscMall = true;

        @ConfigEntry(
                name = "Add To List Disc: mellohi",
                multiplayerSynced = true
        )
        public Boolean addToListDiscMellohi = true;

        @ConfigEntry(
                name = "Add To List Disc: stal",
                multiplayerSynced = true
        )
        public Boolean addToListDiscStal = true;

        @ConfigEntry(
                name = "Add To List Disc: strad",
                multiplayerSynced = true
        )
        public Boolean addToListDiscStrad = true;

        @ConfigEntry(
                name = "Add To List Disc: ward",
                multiplayerSynced = true
        )
        public Boolean addToListDiscWard = true;

        @ConfigEntry(
                name = "Add To List Disc: 11",
                multiplayerSynced = true
        )
        public Boolean addToListDiscEleven = true;

        @ConfigEntry(
                name = "Add To List Disc: wait",
                multiplayerSynced = true
        )
        public Boolean addToListDiscWait = true;

        @ConfigEntry(
                name = "Add To List Disc: otherside",
                multiplayerSynced = true
        )
        public Boolean addToListDiscOtherside = true;

        @ConfigEntry(
                name = "Add To List Disc: pigstep",
                multiplayerSynced = true
        )
        public Boolean addToListDiscPigstep = false;

        @ConfigEntry(
                name = "Add To List Disc: calm4",
                multiplayerSynced = true
        )
        public Boolean addToListDiscCalm4 = false;
    }

//    public static class LightningDiscListConfig {
//        @ConfigEntry(
//                name = "Add To List Disc: 13",
//                multiplayerSynced = true
//        )
//        public Boolean addToListDiscThirteen = false;
//
//        @ConfigEntry(
//                name = "Add To List Disc: cat",
//                multiplayerSynced = true
//        )
//        public Boolean addToListDiscCat = false;
//
//        @ConfigEntry(
//                name = "Add To List Disc: blocks",
//                multiplayerSynced = true
//        )
//        public Boolean addToListDiscBlocks = false;
//
//        @ConfigEntry(
//                name = "Add To List Disc: chirp",
//                multiplayerSynced = true
//        )
//        public Boolean addToListDiscChirp = false;
//
//        @ConfigEntry(
//                name = "Add To List Disc: far",
//                multiplayerSynced = true
//        )
//        public Boolean addToListDiscFar = false;
//
//        @ConfigEntry(
//                name = "Add To List Disc: mall",
//                multiplayerSynced = true
//        )
//        public Boolean addToListDiscMall = false;
//
//        @ConfigEntry(
//                name = "Add To List Disc: mellohi",
//                multiplayerSynced = true
//        )
//        public Boolean addToListDiscMellohi = false;
//
//        @ConfigEntry(
//                name = "Add To List Disc: stal",
//                multiplayerSynced = true
//        )
//        public Boolean addToListDiscStal = false;
//
//        @ConfigEntry(
//                name = "Add To List Disc: strad",
//                multiplayerSynced = true
//        )
//        public Boolean addToListDiscStrad = false;
//
//        @ConfigEntry(
//                name = "Add To List Disc: ward",
//                multiplayerSynced = true
//        )
//        public Boolean addToListDiscWard = false;
//
//        @ConfigEntry(
//                name = "Add To List Disc: 11",
//                multiplayerSynced = true
//        )
//        public Boolean addToListDiscEleven = false;
//
//        @ConfigEntry(
//                name = "Add To List Disc: wait",
//                multiplayerSynced = true
//        )
//        public Boolean addToListDiscWait = false;
//
//        @ConfigEntry(
//                name = "Add To List Disc: otherside",
//                multiplayerSynced = true
//        )
//        public Boolean addToListDiscOtherside = false;
//
//        @ConfigEntry(
//                name = "Add To List Disc: pigstep",
//                multiplayerSynced = true
//        )
//        public Boolean addToListDiscPigstep = false;
//
//        @ConfigEntry(
//                name = "Add To List Disc: calm4",
//                multiplayerSynced = true
//        )
//        public Boolean addToListDiscCalm4 = false;
//    }

    public static class CreeperDiscListConfig {
        @ConfigEntry(
                name = "Add To List Disc: 13",
                multiplayerSynced = true
        )
        public Boolean addToListDiscThirteen = true;

        @ConfigEntry(
                name = "Add To List Disc: cat",
                multiplayerSynced = true
        )
        public Boolean addToListDiscCat = true;

        @ConfigEntry(
                name = "Add To List Disc: blocks",
                multiplayerSynced = true
        )
        public Boolean addToListDiscBlocks = true;

        @ConfigEntry(
                name = "Add To List Disc: chirp",
                multiplayerSynced = true
        )
        public Boolean addToListDiscChirp = true;

        @ConfigEntry(
                name = "Add To List Disc: far",
                multiplayerSynced = true
        )
        public Boolean addToListDiscFar = true;

        @ConfigEntry(
                name = "Add To List Disc: mall",
                multiplayerSynced = true
        )
        public Boolean addToListDiscMall = true;

        @ConfigEntry(
                name = "Add To List Disc: mellohi",
                multiplayerSynced = true
        )
        public Boolean addToListDiscMellohi = true;

        @ConfigEntry(
                name = "Add To List Disc: stal",
                multiplayerSynced = true
        )
        public Boolean addToListDiscStal = true;

        @ConfigEntry(
                name = "Add To List Disc: strad",
                multiplayerSynced = true
        )
        public Boolean addToListDiscStrad = true;

        @ConfigEntry(
                name = "Add To List Disc: ward",
                multiplayerSynced = true
        )
        public Boolean addToListDiscWard = true;

        @ConfigEntry(
                name = "Add To List Disc: 11",
                multiplayerSynced = true
        )
        public Boolean addToListDiscEleven = true;

        @ConfigEntry(
                name = "Add To List Disc: wait",
                multiplayerSynced = true
        )
        public Boolean addToListDiscWait = true;

        @ConfigEntry(
                name = "Add To List Disc: otherside",
                multiplayerSynced = true
        )
        public Boolean addToListDiscOtherside = false;

        @ConfigEntry(
                name = "Add To List Disc: pigstep",
                multiplayerSynced = true
        )
        public Boolean addToListDiscPigstep = false;

        @ConfigEntry(
                name = "Add To List Disc: calm4",
                multiplayerSynced = true
        )
        public Boolean addToListDiscCalm4 = true;
    }
}