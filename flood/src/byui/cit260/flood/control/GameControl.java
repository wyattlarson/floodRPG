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
            throw new MapControlException ("map error.");
        }
        game.setMap(map);

        ArrayList<Item> survivors = new ArrayList<>();
        survivors = GameControl.getSurvivors(items);
        game.setListOfSurvivors(survivors);
        
        ArrayList<Item> inventory = new ArrayList<>();
        inventory = GameControl.getInventoryItems(items);
        game.setInventory(inventory);

        return 1;
    }

    public static Item[] createItems() {
        System.out.println("create items called");
        Item[] items = new Item[8];

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
        return items;
    }

    public static Inventory createInventory(Item[] items)
            throws GameControlException {

        System.out.println("Create Inventory Called");

        throw new GameControlException("inventory error.");

        /*            Item[] inventory = new Item[8];
            for (int i = 0; i < items.length; i++){
            inventory = items.setName(i);
            }    */
    }

    public static Map createMap(int noOfRows, int noOfColumns, Item[] items) 
            throws GameControlException, MapControlException {
            
            System.out.println("create map called");
                if (noOfRows < 0 || noOfColumns < 0) {
                    throw new GameControlException("map issue.");
                }
                if (items == null ||  items.length < 1) {
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

    public static ArrayList<Item> getSurvivors(Item[] items) {
        ArrayList<Item> survivors = new ArrayList<>();
        for (Item item : items) {
            if (item.getItemId() == 3) {
                survivors.add(item);
            }
        }
        return survivors;
    }
    
        public static ArrayList<Item> getInventoryItems(Item[] items) {
        ArrayList<Item> inventory = new ArrayList<>();
        for (Item item : items) {
            if (item.getItemId() == 10) {
                inventory.add(item);
            }
        }
        return inventory;
    }


}
