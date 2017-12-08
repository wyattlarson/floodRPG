/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.flood.control;

import byui.cit260.flood.exceptions.GameControlException;
import byui.cit260.flood.exceptions.MapControlException;
import byui.cit260.flood.model.Game;
import byui.cit260.flood.model.Item;
import byui.cit260.flood.model.Player;
import byui.cit260.flood.viewLayer.StartProgramView;
import flood.Flood;
import java.util.ArrayList;
import byui.cit260.flood.model.Character;
import byui.cit260.flood.model.ItemType;
import byui.cit260.flood.model.Location;
import byui.cit260.flood.model.Map;
import byui.cit260.flood.model.BuildingScene;
import byui.cit260.flood.model.Equation;
import byui.cit260.flood.model.Inventory;
import java.util.Arrays;
import byui.cit260.flood.control.MapControl;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author wyatt
 */
public class GameControl {

    public static Player savePlayer(String name)
            throws GameControlException {

        if (name == null || name.length() < 1) {
            throw new GameControlException("name not right.");
        }

        Player player = new Player();
        Flood.setPlayer(player);
        return player;

    }

    public static int createNewGame(Player player)
            throws GameControlException, MapControlException {

        if (player == null) {
            throw new GameControlException("player?");
        }
        Game game = new Game();
        game.setPlayer(player);
        Flood.setCurrentGame(game);

        player.setCharacter(Character.Bob);

        Item[] items = GameControl.createItems();
        game.setItems(items);

        Map map = GameControl.createMap(5, 5, items);
        if (map == null) {
            throw new MapControlException("map error.");
        }
        game.setMap(map);

        ArrayList<String> survivors = new ArrayList<>();
        survivors = GameControl.getSurvivors(items);
        game.setListOfSurvivors(survivors);

        ArrayList<String> inventory = new ArrayList<>();
        inventory = GameControl.getInventoryItems(items);
        game.setInventory(inventory);
        
        ArrayList<String> saved = new ArrayList<>();
        saved = GameControl.survivorsSaved(items);
        game.setAmountSaved(saved.size());

        return 1;
    }

    public static Item[] createItems() {
        Item[] items = new Item[18];

        Item engine = new Item();
        engine.setName("Engine Parts");
        engine.setDescription("Parts for an engine");
        engine.setItemId(1);
        items[ItemType.engine.ordinal()] = engine;

        Item wood = new Item();
        wood.setName("Wood");
        wood.setDescription("Planks and driftwood that can be used to upgrade your boat.");
        wood.setItemId(2);
        items[ItemType.wood.ordinal()] = wood;

        Item paper = new Item();
        paper.setName("Paper");
        paper.setDescription("A piece of paper.");
        paper.setItemId(4);
        items[ItemType.paper.ordinal()] = paper;

        Item hammer = new Item();
        hammer.setName("Hammer");
        hammer.setDescription("A hammer used for hitting.");
        hammer.setItemId(5);
        items[ItemType.hammer.ordinal()] = hammer;

        Item rope = new Item();
        rope.setName("Rope");
        rope.setDescription("A long piece of rope.");
        rope.setItemId(6);
        items[ItemType.rope.ordinal()] = rope;

        Item nails = new Item();
        nails.setName("Nails");
        nails.setDescription("Used for upgrading boat.");
        nails.setItemId(7);
        items[ItemType.nails.ordinal()] = nails;

        Item gasoline = new Item();
        gasoline.setName("Gasoline");
        gasoline.setDescription("Used to upgrade your boat.");
        gasoline.setItemId(8);
        items[ItemType.gasoline.ordinal()] = gasoline;

        Item fred = new Item();
        fred.setName("Fred");
        fred.setDescription("A stranded survivor of the flood. Get them to safety.");
        fred.setItemId(3);
        items[ItemType.fred.ordinal()] = fred;
        
        Item susan = new Item();
        susan.setName("Susan");
        susan.setDescription("A stranded survivor of the flood. Get them to safety.");
        susan.setItemId(3);
        items[ItemType.susan.ordinal()] = susan;
        
        Item brian = new Item();
        brian.setName("Brian");
        brian.setDescription("A stranded survivor of the flood. Get them to safety.");
        brian.setItemId(3);
        items[ItemType.brian.ordinal()] = brian;
        
        Item taylor = new Item();
        taylor.setName("Taylor");
        taylor.setDescription("A stranded survivor of the flood. Get them to safety.");
        taylor.setItemId(3);
        items[ItemType.taylor.ordinal()] = taylor;
        
        Item derrick = new Item();
        derrick.setName("Derrick");
        derrick.setDescription("A stranded survivor of the flood. Get them to safety.");
        derrick.setItemId(3);
        items[ItemType.derrick.ordinal()] = derrick;
        
        Item ryan = new Item();
        ryan.setName("Ryan");
        ryan.setDescription("A stranded survivor of the flood. Get them to safety.");
        ryan.setItemId(3);
        items[ItemType.ryan.ordinal()] = ryan;
        
        Item brandon = new Item();
        brandon.setName("Brandon");
        brandon.setDescription("A stranded survivor of the flood. Get them to safety.");
        brandon.setItemId(3);
        items[ItemType.brandon.ordinal()] = brandon;
        
        Item wyatt = new Item();
        wyatt.setName("Wyatt");
        wyatt.setDescription("A stranded survivor of the flood. Get them to safety.");
        wyatt.setItemId(3);
        items[ItemType.wyatt.ordinal()] = wyatt;
        
        Item jackson = new Item();
        jackson.setName("Jackson");
        jackson.setDescription("A stranded survivor of the flood. Get them to safety.");
        jackson.setItemId(3);
        items[ItemType.jackson.ordinal()] = jackson;
        
        Item emma = new Item();
        emma.setName("Emma");
        emma.setDescription("A stranded survivor of the flood. Get them to safety.");
        emma.setItemId(3);
        items[ItemType.emma.ordinal()] = emma;
        
        Item goldKey = new Item();
        emma.setName("GoldKey");
        emma.setDescription("A golden key! it may help you unlock a building.");
        emma.setItemId(3);
        items[ItemType.goldKey.ordinal()] = goldKey;
        return items;
    }

    public static Map createMap(int noOfRows, int noOfColumns, Item[] items) 
            throws GameControlException, MapControlException {

        if (noOfRows < 0 || noOfColumns < 0) {
            throw new GameControlException("map issue.");
        }
        if (items == null || items.length < 1) {
            throw new GameControlException("other map problem.");
        }
        Map map = new Map();
        map.setRowCount(noOfRows);
        map.setColumnCount(noOfColumns);

        Location[][] locations = MapControl.createLocations(noOfRows, noOfColumns);
        map.setLocations(locations);

        BuildingScene[] scenes = MapControl.createScenes();
        Equation[] questions = MapControl.createQuestions();

        MapControl.assignQuestionsToScenes(questions, scenes);
        MapControl.assignItemsToScenes(items, scenes);
        MapControl.assignSceneToLocations(map, scenes);

        return map;
    }

        public static ArrayList<String> getSurvivors(Item[] items) {
        ArrayList<String> survivors = new ArrayList<>();
        for (Item item : items) {
            if (item.getItemId() == 3) {
                survivors.add(item.getName());
            }
        }
        return survivors;
    }

    public static ArrayList<String> getInventoryItems(Item[] items) {
        ArrayList<String> inventory = new ArrayList<>();
        for (Item item : items) {
            if (item.isInInventory() == true) {
                inventory.add(item.getName());
            }
        }
        return inventory;
    }
    
     public static ArrayList<String> survivorsSaved(Item[] items) {
        ArrayList<String> saved = new ArrayList<>();
        for (Item item : items) {
            if (item.isSaved() == true) {
                saved.add(item.getName());
            }
        }
        return saved;
    }   
    
    public static void saveGame (Game game, String filepath)
            throws GameControlException {
        try( FileOutputStream fops = new FileOutputStream(filepath)) {
            ObjectOutputStream output = new ObjectOutputStream(fops);
            
            output.writeObject(game);
        } catch (Exception e){
            throw new GameControlException(e.getMessage());
        }
    }
    
    public static void loadGame(String filepath)
            throws GameControlException {
        Game game = null;
        
        try( FileInputStream fips = new FileInputStream(filepath)) {
            ObjectInputStream input = new ObjectInputStream(fips);
            game = (Game) input.readObject();
            Flood.setCurrentGame(game);
            Flood.setPlayer(game.getPlayer());
        } catch(Exception e) {
            throw new GameControlException(e.getMessage());
        }
        Flood.setCurrentGame(game);
    }

}
