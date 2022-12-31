package Product;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Recipes {
    public Set<Product> productSet;
    public String name;
    public int total;

    public Recipes(String name) {
        this.productSet = new HashSet<>();
    this.name = name;
    }

    public Set<Product> getProductSet() {
        return productSet;
    }

    public String getName() {
        return name;
    }

    public int getTotal() {
        return total;
    }

    public void addProductsInRecipes(Product...products) {
        this.productSet.addAll(Arrays.asList(products));
        for (Product prod : this.productSet) {
            this.total += prod.getPrice();
        }
    }
    public void addRecipeInSet(Set<Recipes> recipesSet) {
        if (!recipesSet.contains((this))) {
            recipesSet.add(this);
        } else {
            throw  new UnsupportedOperationException("Рецепт " + this.getName() + " уже находится в коллекции" );
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Recipes recipes = (Recipes) o;
        return Objects.equals(name, recipes.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Рецепт " + name + "\n"+
                " требуется: " + productSet + "\n" +
                " общая стоимость " + total +
                "руб" + "\n";
    }
}
