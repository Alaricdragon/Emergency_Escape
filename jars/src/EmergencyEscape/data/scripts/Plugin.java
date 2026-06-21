package EmergencyEscape.data.scripts;
import EmergencyEscape.data.scripts.lunaSettings.StoredSettings;
import com.fs.starfarer.api.BaseModPlugin;

public class Plugin extends BaseModPlugin {
    @Override
    public void onApplicationLoad() {
    }

    @Override
    public void onGameLoad(boolean newGame) {
        super.onGameLoad(newGame);
        StoredSettings.attemptEnableLunalib();
        StoredSettings.getSettings();
    }

    @Override
    public void beforeGameSave() {
        super.beforeGameSave();
    }
}