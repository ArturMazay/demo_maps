
pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
        maven {
            url = uri("https://api.mapbox.com/downloads/v2/releases/maven")
            authentication
            credentials {
                username ="mapbox"
                password ="sk.eyJ1IjoibWF6YXkiLCJhIjoiY2xsdjkxNnJlMXJkYjNxdGg1cnJzc3A2cCJ9.3_DubkUjAoZaVSpTCUQU9w"
                println(System.getProperty("MAPBOX_DOWNLOADS_TOKEN"))
            }
        }
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.PREFER_SETTINGS)
    repositories {
        google()
        mavenCentral()
        maven {
            url = uri("https://api.mapbox.com/downloads/v2/releases/maven")
            authentication
            credentials {
                username ="mapbox"
                password =System.getProperty("MAPBOX_DOWNLOADS_TOKEN")
                println(System.getProperty("MAPBOX_DOWNLOADS_TOKEN"))
            }
        }
    }
}

rootProject.name = "My Application"
include(":app")
