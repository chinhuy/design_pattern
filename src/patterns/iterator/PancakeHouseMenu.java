package src.patterns.iterator;

import java.util.ArrayList;

public class PancakeHouseMenu implements Menu{

  private ArrayList<MenuItem> menuItems;
  public PancakeHouseMenu(ArrayList<MenuItem> menuItems){
    this.menuItems = menuItems;
  }

  @Override
  public Iterator createIterator() {
    return new PancakeHouseMenuIterator(menuItems);
  }
  
}
