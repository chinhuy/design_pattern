package src.patterns.iterator;

public class DinerMenuIterator implements Iterator{

  private MenuItem[] list;
  int position = 0;
  public DinerMenuIterator(MenuItem[] menuItems){
    this.list = menuItems;
  }
  @Override
  public boolean hasNext() {
    if(position < list.length){
      return true;
    }
    return false;
  }

  @Override
  public MenuItem next() {
    MenuItem mi = list[position];
    position += 1;
    return mi;
  }
  
}
