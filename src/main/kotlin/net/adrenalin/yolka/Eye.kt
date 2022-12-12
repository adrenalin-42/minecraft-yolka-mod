package net.adrenalin.yolka

import net.adrenalin.yolka.YolkaMod.MOD_ID
import net.fabricmc.api.ModInitializer
import net.fabricmc.fabric.api.item.v1.FabricItemSettings
import net.minecraft.item.Item
import net.minecraft.item.ItemGroup
import net.minecraft.registry.Registries
import net.minecraft.registry.Registry
import net.minecraft.util.Identifier

object Eye : ModInitializer {
    private val CUSTOM_ITEM : Item = Item(FabricItemSettings())

    override fun onInitialize() {
        Registry.register(Registries.ITEM, Identifier(MOD_ID, "custom_item"), CUSTOM_ITEM)
    }
}