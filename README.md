🃏 Trading Card Inventory System
A Java-based command-line application for managing your personal trading card collection. Track your inventory, log sales, record purchases, and view your full sales history — all from a simple interactive menu.

📋 Features

View Inventory — Display all cards currently in your collection with full details
Add a Card — Add new trading cards with a unique name, rarity, price, and evolution stage
Sell a Card — Remove a card from inventory and log it as a sale
Purchase a Card — Record the purchase of a card and add it to your inventory
Sales History — View a complete log of all past transactions with timestamps


🗂️ Project Structure
├── src/
│   ├── InventoryApp.java    # Main application entry point and menu logic
│   ├── TradingCard.java     # TradingCard model with UUID-based ID generation
│   └── Sale.java            # Sale model that records card, purchaser, and date
├── bin/                     # Compiled .class files (auto-generated)
├── lib/                     # External dependencies (if any)
└── .vscode/
    └── settings.json        # VS Code Java project settings

🚀 Getting Started
Prerequisites

Java JDK 11+
Visual Studio Code (recommended)
VS Code Extension Pack for Java

Running the Application
Option 1 — VS Code:

Open the project folder in VS Code
Open InventoryApp.java
Click Run above the main method or press F5

Option 2 — Terminal:
bash# Compile
javac -d bin src/InventoryApp.java src/TradingCard.java src/Sale.java

# Run
java -cp bin InventoryApp

🖥️ Menu Options
Trading Card Inventory System
1. Show Inventory
2. Add Trading Card
3. Sell Trading Card
4. Purchase Trading Card
5. Show Sales
0. Exit

🃏 Trading Card Fields
Each card stores the following information:
FieldDescriptionIDAuto-generated unique identifier (UUID)NameCustom card nameRaritye.g., Common, Uncommon, Rare, Epic, LegendaryPriceMonetary value of the cardEvolutionEvolution stage (e.g., 1st evo, 2nd evo)

📦 Classes Overview
TradingCard.java
Represents a single trading card. Each card is assigned a unique UUID on creation.
Sale.java
Records a completed transaction, storing the card sold, the purchaser's name, and the date/time of the sale.
InventoryApp.java
The main application class. Handles all user interaction through a menu-driven loop, and manages the inventory and sales lists.

📝 Notes

Card IDs are randomly generated using UUID.randomUUID() — no two cards will share the same ID
Sales are logged with a timestamp using LocalDateTime.now()
Data is stored in memory only — inventory and sales history will reset when the application is closed


🛠️ Built With

Java — Core language
java.util.UUID — Unique card ID generation
java.time.LocalDateTime — Sale timestamp tracking
java.util.ArrayList — In-memory storage for inventory and sales
