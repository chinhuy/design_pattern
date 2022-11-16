package src.patterns.iterator;

public class DinerMenu implements Menu{

  private MenuItem[] list;
  public DinerMenu(MenuItem[] menuItems){
    this.list = menuItems;
  }
  @Override
  public Iterator createIterator() {
    return new DinerMenuIterator(list);
  }
  
}
