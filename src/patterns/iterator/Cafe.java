package src.patterns.iterator;

import java.util.ArrayList;

public class Cafe {
  public static void main(String[] args) {
    //PancakeHouseMenu
    ArrayList<MenuItem> menuItems = new ArrayList<>();
    menuItems.add(new MenuItem("Com chien", "dish", 150));
    menuItems.add(new MenuItem("Lau thai", "cai", 250));
    menuItems.add(new MenuItem("bia 333", "chai", 20));

    PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu(menuItems);
    Iterator pcIterator = pancakeHouseMenu.createIterator();
    printMenu(pcIterator);

    //DinerMenu
    MenuItem[] menuList = new MenuItem[5];
    menuList[0] = new MenuItem("Banh mi", "cai", 20);
    menuList[1] = new MenuItem("Cafe", "ly", 30);
    menuList[2] = new MenuItem("Bun bo", "to", 50);
    menuList[3] = new MenuItem("Nuoc chanh", "ly", 20);
    menuList[4] = new MenuItem("Dua tuoi", "trai", 20);
    DinerMenu dinerMenu = new DinerMenu(menuList);
    Iterator dnMenuIterator = dinerMenu.createIterator();
    printMenu(dnMenuIterator);
    
  }
  public static void printMenu(Iterator iterator){
    while(iterator.hasNext()){
      MenuItem mi = iterator.next();
      System.out.println(mi);
    }
  }
}
