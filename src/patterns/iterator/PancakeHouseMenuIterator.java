package src.patterns.iterator;

import java.util.ArrayList;

public class PancakeHouseMenuIterator implements Iterator{

  private ArrayList<MenuItem> menuItems;
  private int position = 0;
  public PancakeHouseMenuIterator(ArrayList<MenuItem> menuItems){
    this.menuItems = menuItems;
  }
  @Override
  public boolean hasNext() {
    if (position < menuItems.size()){
      return true;
    }
    return false;
  }

  @Override
  public MenuItem next() {
    MenuItem mi = menuItems.get(position);
    position += 1;
    return mi;
  }
  
}
