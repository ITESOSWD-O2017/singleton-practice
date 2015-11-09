package waiters;

import com.iteso.singleton.Dish;
import com.iteso.singleton.Drink;
import com.iteso.singleton.TableOrder;
import com.iteso.singleton.Waiter;
import com.iteso.singleton.waiter.Waiter4;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by ShaSkills on 08/11/2015.
 */
public class Waiter4Test {

    public Dish dish;
    public Drink drink;
    public TableOrder table;
    public Waiter waiter;

    @Before
    public void setUp(){

        drink = mock(Drink.class);
        table = mock(TableOrder.class);
        waiter = new Waiter4();
        dish = mock(Dish.class);

    }



    @Test
    public void addDishTest(){
        Waiter4 wait =  mock(Waiter4.class);
        when(wait.getTable(2)).thenReturn(table);
        assertTrue(waiter.addDish(2, dish));
    }

    @Test
    public void addDrinkTest(){
        Waiter4 wait =  mock(Waiter4.class);
        when(wait.getTable(1)).thenReturn(table);
        assertTrue(waiter.addDrink(1, drink));
    }

}
