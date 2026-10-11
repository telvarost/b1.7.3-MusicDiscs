package jadestrouble.musicdiscs.items;

import jadestrouble.musicdiscs.Config;
import net.mine_diver.unsafeevents.listener.EventListener;
import net.minecraft.item.Item;
import net.modificationstation.stationapi.api.event.registry.ItemRegistryEvent;
import net.modificationstation.stationapi.api.mod.entrypoint.Entrypoint;
import net.modificationstation.stationapi.api.util.Identifier;
import net.modificationstation.stationapi.api.util.Namespace;
import net.modificationstation.stationapi.api.util.Null;

import java.util.ArrayList;

public class Discs {

    @Entrypoint.Namespace
    public static Namespace MOD_ID = Null.get();

    public static ArrayList<Item> dungeonDiscSpawnList = new ArrayList<>();
    public static ArrayList<Item> creeperDiscSpawnList = new ArrayList<>();

    public static Item[] items;
    public static Item blocks_Disc;
    public static Item chirp_Disc;
    public static Item far_Disc;
    public static Item mall_Disc;
    public static Item mellohi_Disc;
    public static Item stal_Disc;
    public static Item strad_Disc;
    public static Item ward_Disc;
    public static Item eleven_Disc;
    public static Item wait_Disc;
    public static Item otherside_Disc;
    public static Item pigstep_Disc;
    public static Item calm4_Disc;

    @EventListener
    public void registerItems(ItemRegistryEvent event) {
        blocks_Disc = (new NewDisc(Identifier.of(MOD_ID, "blocks_Disc"), "musicdiscs:blocks", "C418 - blocks")).setTranslationKey(MOD_ID, "Disc");
        chirp_Disc = (new NewDisc(Identifier.of(MOD_ID, "chirp_Disc"), "musicdiscs:chirp", "C418 - chirp")).setTranslationKey(MOD_ID, "Disc");
        far_Disc = (new NewDisc(Identifier.of(MOD_ID, "far_Disc"), "musicdiscs:far", "C418 - far")).setTranslationKey(MOD_ID, "Disc");
        mall_Disc = (new NewDisc(Identifier.of(MOD_ID, "mall_Disc"), "musicdiscs:mall", "C418 - mall")).setTranslationKey(MOD_ID, "Disc");
        mellohi_Disc = (new NewDisc(Identifier.of(MOD_ID, "mellohi_Disc"), "musicdiscs:mellohi", "C418 - mellohi")).setTranslationKey(MOD_ID, "Disc");
        stal_Disc = (new NewDisc(Identifier.of(MOD_ID, "stal_Disc"), "musicdiscs:stal", "C418 - stal")).setTranslationKey(MOD_ID, "Disc");
        strad_Disc = (new NewDisc(Identifier.of(MOD_ID, "strad_Disc"), "musicdiscs:strad", "C418 - strad")).setTranslationKey(MOD_ID, "Disc");
        ward_Disc = (new NewDisc(Identifier.of(MOD_ID, "ward_Disc"), "musicdiscs:ward", "C418 - ward")).setTranslationKey(MOD_ID, "Disc");
        eleven_Disc = (new NewDisc(Identifier.of(MOD_ID, "eleven_Disc"), "musicdiscs:eleven", "C418 - 11")).setTranslationKey(MOD_ID, "Disc");
        wait_Disc = (new NewDisc(Identifier.of(MOD_ID, "wait_Disc"), "musicdiscs:wait", "C418 - wait")).setTranslationKey(MOD_ID, "Disc");
        otherside_Disc = (new NewDisc(Identifier.of(MOD_ID, "otherside_Disc"), "musicdiscs:otherside", "Lena Raine - otherside")).setTranslationKey(MOD_ID, "Disc");
        pigstep_Disc = (new NewDisc(Identifier.of(MOD_ID, "pigstep_Disc"), "musicdiscs:pigstep", "Lena Raine - pigstep")).setTranslationKey(MOD_ID, "Disc");
        if (Config.config.useMagneticAsCalm4DiscName) {
            calm4_Disc = (new NewDisc(Identifier.of(MOD_ID, "calm4_Disc"), "musicdiscs:calm4", "Notch - magnetic")).setTranslationKey(MOD_ID, "Disc");
        } else {
            calm4_Disc = (new NewDisc(Identifier.of(MOD_ID, "calm4_Disc"), "musicdiscs:calm4", "Notch - calm4")).setTranslationKey(MOD_ID, "Disc");
        }

        items = new Item[]{
            Item.RECORD_THIRTEEN,
            Item.RECORD_CAT,
            Discs.blocks_Disc,
            Discs.chirp_Disc,
            Discs.far_Disc,
            Discs.mall_Disc,
            Discs.mellohi_Disc,
            Discs.stal_Disc,
            Discs.strad_Disc,
            Discs.ward_Disc,
            Discs.eleven_Disc,
            Discs.wait_Disc,
            Discs.otherside_Disc,
            Discs.pigstep_Disc,
            Discs.calm4_Disc,
        };

        // Dungeon Chest List Config
        if (Config.config.DUNGEON_DISC_LIST_CONFIG.addToListDiscThirteen) {
            dungeonDiscSpawnList.add(Item.RECORD_THIRTEEN);
        }
        if (Config.config.DUNGEON_DISC_LIST_CONFIG.addToListDiscCat) {
            dungeonDiscSpawnList.add(Item.RECORD_CAT);
        }
        if (Config.config.DUNGEON_DISC_LIST_CONFIG.addToListDiscBlocks) {
            dungeonDiscSpawnList.add(Discs.blocks_Disc);
        }
        if (Config.config.DUNGEON_DISC_LIST_CONFIG.addToListDiscChirp) {
            dungeonDiscSpawnList.add(Discs.chirp_Disc);
        }
        if (Config.config.DUNGEON_DISC_LIST_CONFIG.addToListDiscFar) {
            dungeonDiscSpawnList.add(Discs.far_Disc);
        }
        if (Config.config.DUNGEON_DISC_LIST_CONFIG.addToListDiscMall) {
            dungeonDiscSpawnList.add(Discs.mall_Disc);
        }
        if (Config.config.DUNGEON_DISC_LIST_CONFIG.addToListDiscMellohi) {
            dungeonDiscSpawnList.add(Discs.mellohi_Disc);
        }
        if (Config.config.DUNGEON_DISC_LIST_CONFIG.addToListDiscStal) {
            dungeonDiscSpawnList.add(Discs.stal_Disc);
        }
        if (Config.config.DUNGEON_DISC_LIST_CONFIG.addToListDiscStrad) {
            dungeonDiscSpawnList.add(Discs.strad_Disc);
        }
        if (Config.config.DUNGEON_DISC_LIST_CONFIG.addToListDiscWard) {
            dungeonDiscSpawnList.add(Discs.ward_Disc);
        }
        if (Config.config.DUNGEON_DISC_LIST_CONFIG.addToListDiscEleven) {
            dungeonDiscSpawnList.add(Discs.eleven_Disc);
        }
        if (Config.config.DUNGEON_DISC_LIST_CONFIG.addToListDiscWait) {
            dungeonDiscSpawnList.add(Discs.wait_Disc);
        }
        if (Config.config.DUNGEON_DISC_LIST_CONFIG.addToListDiscOtherside) {
            dungeonDiscSpawnList.add(Discs.otherside_Disc);
        }
        if (Config.config.DUNGEON_DISC_LIST_CONFIG.addToListDiscPigstep) {
            dungeonDiscSpawnList.add(Discs.pigstep_Disc);
        }
        if (Config.config.DUNGEON_DISC_LIST_CONFIG.addToListDiscCalm4) {
            dungeonDiscSpawnList.add(Discs.calm4_Disc);
        }

        // Skeleton Killed Creeper List Config
        if (Config.config.CREEPER_DISC_LIST_CONFIG.addToListDiscThirteen) {
            creeperDiscSpawnList.add(Item.RECORD_THIRTEEN);
        }
        if (Config.config.CREEPER_DISC_LIST_CONFIG.addToListDiscCat) {
            creeperDiscSpawnList.add(Item.RECORD_CAT);
        }
        if (Config.config.CREEPER_DISC_LIST_CONFIG.addToListDiscBlocks) {
            creeperDiscSpawnList.add(Discs.blocks_Disc);
        }
        if (Config.config.CREEPER_DISC_LIST_CONFIG.addToListDiscChirp) {
            creeperDiscSpawnList.add(Discs.chirp_Disc);
        }
        if (Config.config.CREEPER_DISC_LIST_CONFIG.addToListDiscFar) {
            creeperDiscSpawnList.add(Discs.far_Disc);
        }
        if (Config.config.CREEPER_DISC_LIST_CONFIG.addToListDiscMall) {
            creeperDiscSpawnList.add(Discs.mall_Disc);
        }
        if (Config.config.CREEPER_DISC_LIST_CONFIG.addToListDiscMellohi) {
            creeperDiscSpawnList.add(Discs.mellohi_Disc);
        }
        if (Config.config.CREEPER_DISC_LIST_CONFIG.addToListDiscStal) {
            creeperDiscSpawnList.add(Discs.stal_Disc);
        }
        if (Config.config.CREEPER_DISC_LIST_CONFIG.addToListDiscStrad) {
            creeperDiscSpawnList.add(Discs.strad_Disc);
        }
        if (Config.config.CREEPER_DISC_LIST_CONFIG.addToListDiscWard) {
            creeperDiscSpawnList.add(Discs.ward_Disc);
        }
        if (Config.config.CREEPER_DISC_LIST_CONFIG.addToListDiscEleven) {
            creeperDiscSpawnList.add(Discs.eleven_Disc);
        }
        if (Config.config.CREEPER_DISC_LIST_CONFIG.addToListDiscWait) {
            creeperDiscSpawnList.add(Discs.wait_Disc);
        }
        if (Config.config.CREEPER_DISC_LIST_CONFIG.addToListDiscOtherside) {
            creeperDiscSpawnList.add(Discs.otherside_Disc);
        }
        if (Config.config.CREEPER_DISC_LIST_CONFIG.addToListDiscPigstep) {
            creeperDiscSpawnList.add(Discs.pigstep_Disc);
        }
        if (Config.config.CREEPER_DISC_LIST_CONFIG.addToListDiscCalm4) {
            creeperDiscSpawnList.add(Discs.calm4_Disc);
        }
    }
}
