/*
 * Decompiled with CFR 0.151.
 */
package com.europa.api.utilities.sound;

import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;

public class SoundRegistrator {
    public static SoundEvent DOUBLE_KILL = SoundRegistrator.addSoundsToRegistry("double_kill");

    public static SoundEvent addSoundsToRegistry(String string) {
        String soundId;
        ResourceLocation shotSoundLocation = new ResourceLocation(soundId);
        SoundEvent soundEvent = new SoundEvent(shotSoundLocation);
        soundEvent.setRegistryName(shotSoundLocation);
        return soundEvent;
    }
}

