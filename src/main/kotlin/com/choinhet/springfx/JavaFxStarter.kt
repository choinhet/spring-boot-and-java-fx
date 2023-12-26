package com.choinhet.springfx

import javafx.application.Application
import javafx.application.Platform
import javafx.fxml.FXMLLoader
import javafx.scene.Scene
import javafx.stage.Stage
import org.springframework.boot.runApplication
import org.springframework.context.ConfigurableApplicationContext

class JavaFxStarter : Application() {

    private val springContext: ConfigurableApplicationContext = runApplication<SpringFxApplication>()

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
}

fun main() {
    Application.launch(JavaFxStarter::class.java)
}
