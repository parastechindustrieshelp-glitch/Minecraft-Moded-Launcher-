# Minecraft Launcher (Java Edition Wrapper)

A lightweight, modern Minecraft launcher designed to seamlessly run multiple offline client versions (including WebAssembly/HTML runtimes and standalone executables) in an official-style dark UI.

---

## Features

* **Multi-Version Selector:** Built-in profiles for **Release 1.5.2**, **Release 1.8.8**, and **Release 1.12.2**.
* **Modern PyQt6 UI:** Clean, dark-themed dashboard modeled after the modern official desktop client.
* **Smart Launch Engine:**
  * Releases **1.5.2** and **1.8.8** boot automatically via a local, background-hosted runtime in a dedicated WebView window.
  * Release **1.12.2** launches directly via the native `minecraft.exe` executable.
* **Safe Local Storage:** Keeps worlds, configuration profiles, and browser data stored persistently in `%APPDATA%\.minecraft_pygames`.
* **Dynamic Slideshow:** Smooth-rotating wallpaper dashboard featuring custom artwork.
* **Auto-Recovery:** Detects missing installations and guides the user through initialization.

---

## Directory Structure

To ensure the launcher functions correctly, maintain the following directory layout:

```text
Minecraft Launcher/
├── launcher.exe                # Built executable (or launcher.py)
├── icons/                      # Graphical assets
│   ├── mc.ico                  # Application & taskbar logo
│   ├── bg1.png                 # Rotating background 1
│   ├── bg2.png                 # Rotating background 2
│   └── bg3.png                 # Rotating background 3
└── versions/                   # Game runtime files
    ├── 1.5.2/
    │   └── index.html          # (or game.html)
    ├── 1.8/
    │   └── index.html          # (or game.html + WASM files)
    └── 1.12.2/
        └── minecraft.exe       # Standalone client executable