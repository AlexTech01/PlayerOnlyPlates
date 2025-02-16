# PlayerOnlyPlates
PlayerOnlyPlates is a very simple plugin for Paper that prevents mobs and other non-player entities from triggering pressure plates.

## Installation
Go to the Releases tab and download the latest jar file, then copy it to your server and put it in your plugins folder. After installation, please restart your server to load PlayerOnlyPlates.

## Usage
PlayerOnlyPlates does not offer a command or any configuration. To verify that the plugin has loaded, you can use the /plugins command on your server, or check the server logs for a `PlayerOnlyPlates has been loaded` message that the plugin prints on load.

## Compatibility
PlayerOnlyPlates is only officially compatible with Paper servers on version 1.21.4, but does not use any Spigot or Paper-specific features and should work on any Bukkit-based server. I will do my best to update the plugin when new versions of Minecraft come out.

## Development
Contribution is always welcome. To compile the plugin from source, make sure you have openjdk and maven installed, then run `mvn package`.
