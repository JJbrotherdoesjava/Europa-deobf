/*
 * Decompiled with CFR 0.151.
 */
package com.europa.api.utilities.sound;

import com.europa.api.utilities.sound.SoundRegistrator;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.eventhandler.EventPriority;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.registries.IForgeRegistryEntry;

public class SoundRegisterListener {
    public SoundRegisterListener() {
        MinecraftForge.EVENT_BUS.register((Object)this);
    }

    /*
     * WARNING - void declaration
     */
    @SubscribeEvent(priority=EventPriority.NORMAL, receiveCanceled=true)
    public void registerSoundEvents(RegistryEvent.Register<SoundEvent> register) {
        void event;
        event.getRegistry().registerAll((IForgeRegistryEntry[])new SoundEvent[]{SoundRegistrator.DOUBLE_KILL});
    }
}

