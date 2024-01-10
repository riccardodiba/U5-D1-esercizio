package entities;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Menu {
    private List<Pizza> pizzaList;
    private List<Drink> drinkList;
    private List<Topping> toppingList;
}
