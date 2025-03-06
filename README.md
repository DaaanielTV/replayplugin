# ReplayPlugin 🎬

A Minecraft plugin that allows players to record and replay their gameplay! Relive your best moments or analyze your strategies with ease. 

## Features ✨

-   **Record Gameplay:** Capture your in-game actions and events. ⏺️
-   **Replay System:** Watch your recordings from different perspectives. ⏪
-   **GUI Menu:** User-friendly interface to manage and access replays. 🧰
-   **Admin Commands:** Tools for administrators to manage replays. ⚙️
-   **BedWars Integration:** Automatically start and stop recording during BedWars games. 🛏️⚔️

## Dependencies 📦

-   [Paper API](https://papermc.io/) (Minecraft server platform)
-   [ProtocolLib](https://www.spigotmc.org/resources/protocollib.1997/) (Packet interception library)
-   [ZNPCsPlus](https://www.spigotmc.org/resources/znpcsplus.80754/) (NPC management - optional)
-   [Screaming BedWars API](https://github.com/ScreamingSandals/BedWars) (BedWars game integration)

## Installation 🛠️

1.  Ensure you have [Java 23.0.1](https://www.oracle.com/java/technologies/javase-jdk23-downloads.html) installed.
2.  Clone the repository: `git clone https://github.com/DaaanielTV/replayplugin`
3.  Navigate to the project directory: `cd ReplayPlugin`
4.  Build the project using Maven: `mvn clean install`
5.  The compiled `.jar` file will be located in the `target` directory.
6.  Place the compiled `.jar` file into your server's `plugins` folder.
7.  Restart your Minecraft server. 🔄

## Configuration ⚙️

No configuration is required. All settings are managed in-game.

## Commands ⌨️

-   `/replay`: Opens the replay menu. 
    -   Permission: `replayplugin.use`
-   `/replayadmin <Replay-ID>`: Loads a replay by its ID.
    -   Permission: `replayplugin.admin`
-   `/replaystop`: Stops a currently running replay.
    -   Permission: `replayplugin.use`

## Permissions 🔑

-   `replayplugin.use`: Allows players to use the `/replay` and `/replaystop` commands.
-   `replayplugin.admin`: Allows players to use the `/replayadmin` command.

## Usage 🎮

1.  Use the `/replay` command to open the replay menu.
2.  Select a replay from the GUI to start watching.
3.  Use the `/replaystop` command to stop the replay.

## Development 💻

### Building from Source

1.  Clone the repository: `git clone [repository-url]`
2.  Navigate to the project directory: `cd ReplayPlugin`
3.  Build the project using Maven: `mvn clean install`
4.  The compiled `.jar` file will be located in the `target` directory.

### Contributing

Contributions are welcome! Please submit pull requests with detailed descriptions of your changes.

## Planned Features 🚀

-   [ ] Save and load replays to files. 💾
-   [ ] Implement actual replay playback (teleporting, packet injection). 🏃
-   [ ] Add more detailed replay information to the GUI. ℹ️
-   [ ] Implement more admin commands for managing replays. 👮

## Support ❓

For bug reports, feature requests, or general questions, please open an issue on the [GitHub repository](https://github.com/DaaanielTV/replayplugin).

## License 📄

This project is licensed under the [MIT License](link-to-license).

## Keywords 🔑

Minecraft, Plugin, Replay, Record, Gameplay, BedWars, Paper, ProtocolLib, ZNPCsPlus, ScreamingSandals, Admin, GUI

## Author 👨‍💻

[DaaanielTV](https://github.com/DaaanielTV)