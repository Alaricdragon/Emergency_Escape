package EmergencyEscape.data.scripts.lunaSettings;

import EmergencyEscape.data.scripts.hullmods.EscapeHullMod;
import com.fs.starfarer.api.Global;
import lunalib.lunaSettings.LunaSettings;

public class StoredSettings {
    public static void getSettings(){
        if (Global.getSettings().getModManager().isModEnabled("lunalib")){
            getLunaSettings();
        }else {
            getConfigSettings();
        }
    }
    public static void attemptEnableLunalib(){
        if (!Global.getSettings().getModManager().isModEnabled("lunalib")) return;
        LunaSettings.addSettingsListener(new ApplySettingsOnChange());
    }
    private static void getLunaSettings(){
        EscapeHullMod.maxJumps = LunaSettings.getInt("emergency_escape","maxShips");
    }
    private static void getConfigSettings(){
        EscapeHullMod.maxJumps = Global.getSettings().getInt("EmergencyEscape_MaxJumps");
    }
}
