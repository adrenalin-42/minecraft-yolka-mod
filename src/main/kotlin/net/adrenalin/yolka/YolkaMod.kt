package net.adrenalin.yolka
import net.fabricmc.api.ModInitializer

object YolkaMod: ModInitializer {
    const val MOD_ID = "yolka"

    override fun onInitialize() {
        println("Example mod has been initialized.")
        Eye.onInitialize()
        YolkaModClient.onInitializeClient()
    }
}