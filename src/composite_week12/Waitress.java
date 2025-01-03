package composite_week12;
import java.util.Iterator;

public class Waitress {
    MenuComponent allMenus;

    public Waitress(MenuComponent allMenus) {
        this.allMenus = allMenus;
    }

    public void printMenu(){
        allMenus.print();
    }

    public void printVegetarianMenu(){
        Iterator<MenuComponent> iterator = allMenus.createIterator();
        System.out.println("VEGETARIAN MENU ----");
        while(iterator.hasNext()){
            MenuComponent menuComponent = iterator.next();
            try {
                if(menuComponent.isVegetarian())
                    menuComponent.print();
            } catch (UnsupportedOperationException e){
                // ignored
            }
        }
    }
}
