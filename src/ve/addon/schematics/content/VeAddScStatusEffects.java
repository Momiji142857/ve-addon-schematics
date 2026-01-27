package ve.addon.schematics.content;

import arc.graphics.Color;
import mindustry.type.StatusEffect;

public class VeAddScStatusEffects {
    public static StatusEffect waterDrop;

    public static void load() {
        waterDrop = new StatusEffect("water-drop") {{
            speedMultiplier = 3f;
            dragMultiplier = 4f;
            color = Color.sky;
        }};

    }
}
