package EmergencyEscape.data.scripts.lunaSettings;

import lunalib.lunaSettings.LunaSettingsListener;

public class ApplySettingsOnChange implements LunaSettingsListener {
    @Override
    public void settingsChanged(String s) {
        //if (!s.equals("starlords")) return;
        StoredSettings.getSettings();
        //apply all settings here.
    }
}
