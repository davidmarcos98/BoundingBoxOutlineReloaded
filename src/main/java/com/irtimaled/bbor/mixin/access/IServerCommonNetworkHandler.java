package com.irtimaled.bbor.mixin.access;

import net.minecraft.network.ClientConnection;
import net.minecraft.server.network.ServerCommonNetworkHandler;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(ServerCommonNetworkHandler.class)
public interface IServerCommonNetworkHandler {

    @Accessor
    ClientConnection getConnection();

}
