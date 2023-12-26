package com.choinhet.springfx

import javafx.application.Application
import javafx.application.Platform
import javafx.fxml.FXMLLoader
import javafx.scene.Scene
import javafx.stage.Stage
import org.springframework.boot.runApplication

class JavaFxStarter : Application() {

    private val springContext = runApplication<SpringFxApplication>()

    override fun start(stage: Stage) {
        val resource = JavaFxStarter::class.java.getResource("/javafx/hello-view.fxml")
        val scene = Scene(FXMLLoader(resource).load())
        stage.title = "SpringBoot + JavaFX"
        stage.scene = scene
        stage.show()
    }

    override fun stop() {
        springContext.close()
        Platform.exit()
    }

    companion object {
        @JvmStatic fun main(args: Array<String>) {
            launch(*args)
        }
    }
}
