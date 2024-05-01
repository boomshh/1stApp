pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "RockPaperScissors"
include(":app")
include(":coffee")
include(":bankaccount")
include(":unitconverter")
include(":captaingame")
include(":shoppingapp")
include(":mvvm")
include(":inheritanceapp")
