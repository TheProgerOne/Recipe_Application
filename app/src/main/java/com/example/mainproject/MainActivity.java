package com.example.mainproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import com.example.mainproject.adapter.CategoryAdapter;
import com.example.mainproject.adapter.CourseAdapter;
import com.example.mainproject.model.Category;
import com.example.mainproject.model.Course;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ImageView imageviewclick;
    RecyclerView categoryRecycler, courseRecycler;
    CategoryAdapter categoryAdapter;
    static CourseAdapter courseAdapter;
    static List<Course> courseList = new ArrayList<>();
    static List<Course> fullcoursesList = new ArrayList<>();


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageviewclick  = findViewById(R.id.imageclick);
        imageviewclick.setOnClickListener(new View.OnClickListener() { // Метод обновляет список
            @Override
            public void onClick(View view) {
                courseList.clear();
                courseList.addAll(fullcoursesList);
                courseAdapter.notifyDataSetChanged();
            }
        });
        List<Category> categoryList = new ArrayList<>();  // Список всех категорий
        categoryList.add(new Category(1, "Soups"));
        categoryList.add(new Category(2, "Main dish"));
        categoryList.add(new Category(3, "Fast"));
        categoryList.add(new Category(4, "Pastry"));
        categoryList.add(new Category(5, "Biscuits"));
        categoryList.add(new Category(6, "Cakes"));
        categoryList.add(new Category(7, "Pizza"));
        categoryList.add(new Category(8, "Other"));

        setCategoryRecycler(categoryList);

        // Тут задаем рецепты
       //italian soup
        courseList.add(new Course(1, "tomato", "Italian tomato\nsoup", "~ 30\nminutes        ","Average\ndifficulty","#C81818",
                "Ingredients\n" +
                        "\n2 cups diced yellow onion\n" +
                        "4 tablespoons extra virgin olive oil, divided (2 tablespoons and 2 tablespoons)\n" +
                        "5 cloves garlic, minced\n" +
                        "2 (28-ounce) cans whole peeled tomatoes (or about 4 pounds of fresh, ripe tomatoes blanched, peeled, and chopped*)\n" +
                        "3 bay leaves\n" +
                        "2 cups chicken stock\n" +
                        "1 1/2 cups cubed rustic bread, 1 1/2-inch cubes (about 2 to 3 thick slices Italian loaf), day old is best\n" +
                        "1 teaspoon dried oregano\n" +
                        "1/2 teaspoon kosher salt, less or more to taste\n" +
                        "Freshly grated Parmesan cheese and chopped fresh basil or parsley, for garnish\n " +
                        "\n1. Sauté the onions and garlic:\n" +
                        "Heat 2 tablespoons olive oil on medium heat in a 5 to 6-quart thick-bottomed pot. Add the diced onions and cook slowly until softened and beginning to color, about 10-12 minutes.\n" +
                        "" +
                        "Add minced garlic and cook a minute more. Add the tomatoes, stock, bay leaves, and oregano, then simmer:\n" +
                        "\n2. Add tomatoes to the pot with the onions, crushing them by hand as you put them in the pot.\n" +
                        " Discard any hard stem ends or stray tomato skins. Add chicken stock,\n"  +
                        "bay leaves, and dried oregano." +
                        "\n"+
                        "\n3. Toast the croutons on the stovetop:\n" +
                        "Heat 2 tablespoons olive oil in a sauté pan on medium heat.\n" +
                        "Once the oil is hot, add the cubed bread to the pan. Toss to coat with\n" +
                        "the oil and spread the cubes out in a single layer " +
                        "\n"+
                        "\n4. Add the croutons to the soup:\n" +
                        "Once the tomatoes have cooked for 20 minutes, add the lightly browned croutons to the soup.\n" +
                        "Cook for 5 minutes. Turn off the heat and cover the pan.\n" +
                        "Let sit for 10-15 minutes.\n" +
                        "\n5. Purée:\n" +
                        "Remove the bay leaves. Use an immersion blender or upright blender to roughly purée the soup (about half of the soup, leave some chunky bits).\n" +
                        "" +
                        "Garnish with freshly grated Parmesan and chopped fresh basil or parsley.\n",1));
        //kfc
        courseList.add(new Course(2, "kfc","KFC chicken\nstrips","~ 40\nminutes        ","Average\ndifficulty","#9FA52D",
                "INGREDIENTS\n" +
                        "\n" +
                        "4 boneless, skinless chicken breasts\n" +
                        "\n" +
                        "2 large eggs\n" +
                        "\n" +
                        "1 cup buttermilk\n" +
                        "\n" +
                        "2 cups flour\n" +
                        "\n" +
                        "1 tsp. hot sauce\n" +
                        "\n" +
                        "1/8 tsp. garlic powder\n" +
                        "\n" +
                        "1/8 tsp. paprika\n" +
                        "\n" +
                        "¾ tsp. pepper\n" +
                        "\n" +
                        "2 ½ tsp. salt\n" +
                        "\n" +
                        "1/8 tsp. baking powder\n" +
                        "\n" +
                        "Canola oil\n" +
                        "\n" +
                        "DIRECTIONS\n"+
                        "1.Cut each chicken breast into 4 tenders.\n" +
                                "2.Have the marinade previously prepared by mixing the hot sauce and buttermilk in a bowl.\n" +
                                "3.Put the chicken tenders in the marinade and let them soak for half an hour.\n" +
                                "4.Beat the eggs in one bowl. Mix the flour and spices in a separate bowl.\n" +
                                "5.Dip the marinated chicken tenders in the flour and spice mixture, in the bowl with eggs, and once again in the flour and spice mixture.\n" +
                                "6.Shake off any excess flour before placing the tenders on a baking sheet. Do this with each chicken tender.\n" +
                                "7.Add canola oil in a dutch oven, around 3 inches deep, and heat it to 350°F.\n" +
                                "8.Place the chicken tenders in the heated oil and fry until golden brown, or 5 to 7 minutes.\n" +
                                "9.It’s best to fry in small batches.\n" +
                                "10.Serve and enjoy\n"
                ,3));
        // courseList.add(new Course(n, "tomato", "Italian tomato\nsoup", "~ 30\nminutes        ","Average\ndifficulty","#C81818","",1));

        //борщ
        courseList.add(new Course(3, "borsh", "Russian soup\nborsch", "~ 50\nminutes        ","Average\ndifficulty","#A52B2B",
                "INGREDIENTS\n" +
                        "For the soup:\n" +
                        "1/4 cup high-heat oil (I use canola or peanut)\n" +
                        "2 1/2 to 3 pounds bone-in beef short ribs\n" +
                        "Kosher salt\n" +
                        "1 medium yellow onion, halved and sliced into thin half-moons\n" +
                        "2 large red beets, scrubbed thoroughly\n" +
                        "2 quarts beef stock (homemade if possible)\n" +
                        "2 large Yukon Gold potatoes, peeled and cut into a 3/4-inch dice\n" +
                        "1 carrot, peeled and grated on the large holes of a box grater\n" +
                        "For serving:\n" +
                        "1/2 cup European-style sour cream\n" +
                        "1 handful thinly sliced scallions\n" +
                        "1 handful coarsely chopped fresh dill\n" +
                        "1 loaf dark Russian or Lithuanian-style bread, and Russian mustard\n"+
                        "\n"+
                                "INSTRUCTIONS\n" +
                                "1. Heat a large stockpot over high heat, and add the oil. While the pot is heating up, season the short ribs with salt on all sides. When the pot is hot, carefully add the short ribs, and brown to a nice dark sear on all sides (a few minutes per side), using tongs to flip (you may need to do this in batches). The sear on the bottom of the pot will give your soup flavor, so make sure it doesn’t burn—turn the heat down if needed. When the ribs are browned, remove them from the pot and set aside on a plate. Discard the excess grease from the pot.\n" +
                                "\n"+
                                "2. Reduce the heat to medium, and add the onion. Sauté, stirring occasionally, until caramelized (about 30 minutes), adjusting the heat as needed so that it doesn’t burn. When the onion has softened and browned, add the beets and stock.\n" +
                                "\n"+
                                "3. Bring up to a boil, then reduce the heat until it’s just high enough to maintain a simmer. Simmer until the beets are about half cooked—a knife will go in with some resistance—about 1 hour.\n" +
                                "\n"+
                                "4. When the beets are half cooked, carefully remove them from the pot with a ladle and set them aside in a bowl to cool—this may seem fussy, but it allows you to get the beet flavor in the pot early on without overcooking the beets themselves. Add the browned short ribs back to the pot, and cook at the gentlest simmer, uncovered, for 3 to 4 hours, or until the short ribs are totally falling-apart fork-tender (and going longer won’t hurt). Taste about halfway through cooking, and add salt as needed.\n" +
                                "\n"+
                                "5. When the reserved beets are cool enough to handle, peel away the skin using a paring knife (if it doesn’t just rub off on its own), and coarsely grate them on the large holes of a box grater or in a food processor.\n" +
                                "\n"+
                                "6. When the short ribs have fully cooked, taste the soup, and add more salt as needed. Use a large slotted spoon to remove the short ribs. Add the potatoes, and continue to simmer until they are just cooked through, another 10 minutes or so. While the potatoes cook, pull the short rib meat off the bones, removing any bits of connective tissue. Discard the bones and connective tissue, and chop the meat into bite-sized chunks.\n" +
                                "\n"+
                                "7. When the potatoes are cooked, stir the meat back into the pot, along with the grated beets and carrots. Turn off the heat, and let cool— the pot will take a few hours to cool enough to go in the refrigerator, and the vegetables will cook in the residual heat. Refrigerate overnight. The next day, discard the hardened fat from off the top. Reheat before serving.\n" +
                                "\n"+
                                "8. Ladle the borsch into bowls, and garnish with a dollop of the sour cream and sprinkling of the scallions and dill. Serve with slices of dark bread and spicy mustard. If you want the full Russian approach, try stirring some of the spicy mustard directly into your soup—to me, it’s not borsch without this finishing touch.\n"
                , 1));

        // луковый суп
        courseList.add(new Course(4, "onionsoup", "French onion\nsoup", "~ 1 hour 30\nminutes      ","Difficult\ncomplexity","#CB8D16",
                "Ingredients\n" +
                        "\n"+
                        "6 tablespoons extra-virgin olive oil\n" +
                        "3 pounds medium yellow onions, halved and thinly sliced\n" +
                        "¾ teaspoon sea salt\n" +
                        "1½ tablespoons balsamic vinegar\n" +
                        "1½ tablespoons tamari\n" +
                        "1½ tablespoons fresh thyme leaves\n" +
                        "3 garlic cloves, minced\n" +
                        "3 tablespoons all-purpose white flour\n" +
                        "1 cup dry white wine\n" +
                        "6 cups vegetable broth\n" +
                        "Freshly ground black pepper\n" +
                        "\n"+
                        "Topping\n" +
                        "Baguette slices\n" +
                        "Gruyère cheese, aged cheddar, and/or Parmesan cheese\n" +
                        "Fresh thyme\n" +
                        "Pinch of red pepper flakes, optional\n" +
                        "\n"+
                        "Instructions\n" +
                        "1. Heat the oil in a large pot or Dutch oven over medium heat. Add the onions, salt, and several grinds of pepper and toss to combine. Reduce the heat to low and cook for about 40 minutes, stirring every few minutes, or until the onions are very soft. Increase the heat to medium and cook 15 to 20 more minutes, stirring often, until golden brown. Add the vinegar, tamari, thyme, and garlic and stir. Sprinkle the flour on the onions, stir, and cook for 2 minutes. Stir in the wine and cook 2 minutes, or until evaporated. Add the broth and simmer over medium heat for 30 minutes.\n" +
                        "\n"+
                        "2. Preheat the oven to 450°F and line a baking sheet with parchment paper. Place the baguette slices, topped with cheese, on the baking sheet and bake until the slices are toasted and the cheese is melted, 8 to 10 minutes.\n" +
                        "\n"+
                        "3. Ladle the soup into ramekins or bowls and top each with a toasted baguette piece, fresh thyme, and a pinch of red pepper flakes, if desired\n.",
                1));
        //The Best Parmesan Chicken Bake
        courseList.add(new Course(5, "parmesanchicken", "Parmesan Chicken\nBake", "~ 30\nminutes        ","a bit\ndifficult","#DEAD00",
                "Ingredients\n" +
                        "2 tablespoons olive oil\n" +
                        "\n" +
                        "2 cloves garlic, crushed and finely chopped\n" +
                        "\n" +
                        "¼ teaspoon crushed red pepper flakes, or to taste\n" +
                        "\n" +
                        "6 skinless, boneless chicken breast halves\n" +
                        "\n" +
                        "2 cups prepared marinara sauce\n" +
                        "\n" +
                        "¼ cup chopped fresh basil\n" +
                        "\n" +
                        "1 (8 ounce) package shredded mozzarella cheese, divided\n" +
                        "\n" +
                        "½ cup grated Parmesan cheese, divided\n" +
                        "\n" +
                        "1 (5 ounce) package garlic croutons\n" +
                        "\n" +
                        "Directions\n" +
                        "\n" +
                        "Step 1. Preheat the oven to 350 degrees F (175 degrees C).\n" +
                        "\n" +
                        "Step 2. Coat the bottom of a 9x13-inch casserole dish with olive oil, and sprinkle with garlic and red pepper flakes.\n" +
                        "\n" +
                        "Step 3. Arrange chicken breasts in the bottom of the dish, and pour marinara sauce over chicken. Sprinkle basil over marinara sauce, and top with 1/2 of the mozzarella cheese, followed by 1/2 of the Parmesan cheese. Sprinkle on croutons, then top with remaining mozzarella cheese and remaining Parmesan cheese.\n" +
                        "\n" +
                        "Step 4. Bake in the preheated oven until cheese and croutons are golden brown and the chicken is no longer pink inside, about 35 minutes to an hour, depending on the shape and thickness of your chicken breasts. An instant-read thermometer inserted into the thickest part of a chicken breast should read at least 160 degrees F (70 degrees C)."

                ,2));
        //Fast food 2 burger
        courseList.add(new Course(6, "burger", "Olly's 'thank you'\nFinest burgers", "~ 50\nminutes        ","Average\ndifficulty","#EEA83E",
                "IngredientsIngredient Checklist\n" +
                        "\n" +
                        "1 pound ground lean (7% fat) beef\n" +
                        "\n" +
                        "1 large egg\n" +
                        "\n" +
                        "½ cup minced onion\n" +
                        "\n" +
                        "¼ cup fine dried bread crumbs\n" +
                        "\n" +
                        "1 tablespoon Worcestershire\n" +
                        "\n" +
                        "1 or 2 cloves garlic, peeled and minced\n" +
                        "\n" +
                        "About 1/2 teaspoon salt\n" +
                        "\n" +
                        "About 1/4 teaspoon pepper\n" +
                        "\n" +
                        "4 hamburger buns (4 in. wide), split\n" +
                        "\n" +
                        "About 1/4 cup mayonnaise\n" +
                        "\n" +
                        "About 1/4 cup ketchup\n" +
                        "\n" +
                        "4 iceberg lettuce leaves, rinsed and crisped\n" +
                        "\n" +
                        "1 firm-ripe tomato, cored and thinly sliced\n" +
                        "\n" +
                        "4 thin slices red onion\n" +
                        "\n" +
                        "DirectionsInstructions Checklist\n" +
                        "Step 1\n" +
                        "In a bowl, mix ground beef, egg, onion, bread crumbs, Worcestershire, garlic, 1/2 teaspoon salt, and 1/4 teaspoon pepper until well blended. Divide mixture into four equal portions and shape each into a patty about 4 inches wide.\n" +
                        "\n" +
                        "Step 2\n" +
                        "Lay burgers on an oiled barbecue grill over a solid bed of hot coals or high heat on a gas grill (you can hold your hand at grill level only 2 to 3 seconds); close lid on gas grill. Cook burgers, turning once, until browned on both sides and no longer pink inside (cut to test), 7 to 8 minutes total. Remove from grill.\n" +
                        "\n" +
                        "Step 3\n" +
                        "Lay buns, cut side down, on grill and cook until lightly toasted, 30 seconds to 1 minute.\n" +
                        "\n" +
                        "Step 4\n" +
                        "Spread mayonnaise and ketchup on bun bottoms. Add lettuce, tomato, burger, onion, and salt and pepper to taste. Set bun tops in place.\n"

                ,3));
        //4. Pasty
        courseList.add(new Course(7, "cornishpasty", "Cornish\npasty", "~ 1 h\n20 min        ","Average\ndifficulty","#FF7070",
                "Ingredients\n" +
                        "For the pastry\n" +
                        "125g chilled and diced butter\n" +
                        "125g lard\n" +
                        "500g plain flour, plus extra\n" +
                        "1 egg, beaten\n" +
                        "For the filling\n" +
                        "350g beef skirt or chuck steak, finely chopped\n" +
                        "1 large onion, finely chopped\n" +
                        "2 medium potatoes, peeled, thinly sliced\n" +
                        "175g swede, peeled, finely diced\n" +
                        "1 tbsp freshly ground black pepper\n"+
                        "\n"+
                        "Method\n" +
                        "STEP 1\n" +
                        "Rub the butter and lard into the flour with a pinch of salt using your fingertips or a food processor, then blend in 6 tbsp cold water to make a firm dough. Cut equally into 4, then chill for 20 mins.\n" +
                        "\n" +
                        "STEP 2\n" +
                        "Heat oven to 220C/fan 200C/gas 7. Mix together the filling ingredients with 1 tsp salt. Roll out each piece of dough on a lightly floured surface until large enough to make a round about 23cm across – use a plate to trim it to shape. Firmly pack a quarter of the filling along the centre of each round, leaving a margin at each end. Brush the pastry all the way round the edge with beaten egg, carefully draw up both sides so that they meet at the top, then pinch them together to seal. Lift onto a non-stick baking tray and brush with the remaining egg to glaze.\n" +
                        "\n" +
                        "STEP 3\n" +
                        "Bake for 10 mins, then lower oven to 180C/fan 160C/gas 4 and cook for 45 mins more until golden. Great served warm.\n"

                ,4));

        //5. Biscuits
        courseList.add(new Course(8, "purpose", "All-Purpose\nBiscuits", "~ 1\nhour              ","Average\ndifficulty","#945B38",
                "Ingredients\n" +
                        "2 cups all-purpose flour\n" +
                        "\n" +
                        "1 tablespoon baking powder\n" +
                        "\n" +
                        "½ teaspoon salt\n" +
                        "\n" +
                        "½ cup shortening\n" +
                        "\n" +
                        "¾ cup cold milk\n" +
                        "\n" +
                        "Directions\n" +
                        "Preheat oven to 450 degrees F (230 degrees C).\n" +
                        "\n" +
                        "In a large mixing bowl sift together flour, baking powder and salt. Cut in shortening with fork or pastry blender until mixture resembles coarse crumbs.\n" +
                        "\n" +
                        "Pour milk into flour mixture while stirring with a fork. Mix in milk until dough is soft, moist and pulls away from the side of the bowl.\n" +
                        "\n" +
                        "Turn dough out onto a lightly floured surface and knead dough briefly, 5 to 7 times. Roll dough out into a 1/2 inch thick sheet and cut out biscuits with a floured cookie cutter. Press together unused dough and repeat rolling and cutting procedure.\n" +
                        "\n" +
                        "Place biscuits on ungreased baking sheets and bake in preheated oven until golden brown, about 10 minutes.\n"
                ,5));

        //6. Cakes
        courseList.add(new Course(9, "vanillacake", "The Best Vanilla\nCake", "~ 4\nhour              ","a bit\ndifficult","#690004",
                "Ingredients\n" +
                        "3 and 2/3 cups (433g) cake flour (spoon & leveled)\n" +
                        "1 teaspoon salt\n" +
                        "2 teaspoons baking powder\n" +
                        "3/4 teaspoon baking soda\n" +
                        "1 and 1/2 cups (345g) unsalted butter, softened to room temperature\n" +
                        "2 cups (400g) granulated sugar\n" +
                        "3 large eggs + 2 additional egg whites, at room temperature*\n" +
                        "1 Tablespoon pure vanilla extract (yes, Tbsp!)\n" +
                        "1 and 1/2 cups (360ml) buttermilk, at room temperature*\n" +
                        "Vanilla Buttercream\n" +
                        "1 and 1/2 cups (345g) unsalted butter, softened to room temperature\n" +
                        "5 and 1/2 cups (650g) confectioners’ sugar\n" +
                        "1/3 cup (80ml) whole milk or heavy cream\n" +
                        "1 and 1/2 teaspoons pure vanilla extract\n" +
                        "1/8 teaspoon salt\n" +
                        "Instructions\n" +
                        "Preheat oven to 350°F (177°C). Grease three 9-inch cake pans, line with parchment paper rounds, then grease the parchment paper. Parchment paper helps the cakes seamlessly release from the pans. (If it’s helpful, see this parchment paper rounds for cakes video & post.)\n" +
                        "Make the cake: Whisk the cake flour, salt, baking powder, and baking soda together. Set aside.\n" +
                        "Using a handheld or stand mixer fitted with a paddle or whisk attachment, beat the butter and sugar together on high speed until smooth and creamy, about 3 minutes. Scrape down the sides and up the bottom of the bowl with a rubber spatula as needed. Beat in the 3 eggs, 2 egg whites, and vanilla extract on high speed until combined, about 2 minutes. (Mixture will look curdled as a result of the egg liquid and solid butter combining.) Scrape down the sides and up the bottom of the bowl as needed. With the mixer on low speed, add the dry ingredients just until combined. With the mixer still running on low, pour in the buttermilk and mix just until combined. You may need to whisk it all by hand to make sure there are no lumps at the bottom of the bowl. The batter will be slightly thick.\n" +
                        "Pour batter evenly into cake pans. Weigh them to ensure accuracy, if desired. Bake for around 23-26 minutes or until the cakes are baked through. To test for doneness, insert a toothpick into the center of the cake. If it comes out clean, it’s done. Allow cakes to cool completely in the pans set on a wire rack. The cakes must be completely cool before frosting and assembling.\n" +
                        "Make the frosting: In a large bowl using a hand-held mixer or stand mixer fitted with a whisk or paddle attachment, beat the butter on medium speed until creamy, about 2 minutes. Add confectioners’ sugar, milk, vanilla extract, and salt with the mixer running on low. Increase to high speed and beat for 2 minutes. Add more confectioners’ sugar if frosting is too thin, more milk if frosting is too thick, or an extra pinch of salt if frosting is too sweet.\n" +
                        "Assemble and decorate: Using a large serrated knife, slice a thin layer off the tops of the cakes to create a flat surface. Discard (or crumble over ice cream!). Place 1 cake layer on your cake stand, cake turntable, or serving plate. Evenly cover the top with about 1 and 1/2 cups of frosting. Top with 2nd cake layer and evenly cover the top with about 1 and 1/2 cups of frosting. Top with the third cake layer. Spread the remaining frosting all over the top and sides. I use and recommend an icing spatula to apply the frosting.\n" +
                        "Refrigerate cake for at least 1 hour before slicing. This helps the cake hold its shape when cutting.\n" +
                        "Cover leftover cake tightly and store in the refrigerator for up to 5 days.\n"
                ,6));

        //7. Pizza
        courseList.add(new Course(10, "margarita", "Pizza\nMargherita", "~ 35\nminutes        ","Average\ndifficulty","#FC9211",
                "Ingredients\n" +
                        "For the base\n" +
                        "300g strong bread flour\n" +
                        "1 tsp instant yeast (from a sachet or a tub)\n" +
                        "1 tsp salt\n" +
                        "1 tbsp olive oil, plus extra for drizzling\n" +
                        "For the tomato sauce\n" +
                        "100ml passata\n" +
                        "handful fresh basil or 1 tsp dried\n" +
                        "1 garlic clove, crushed\n" +
                        "For the topping\n" +
                        "125g ball mozzarella, sliced\n" +
                        "handful grated or shaved parmesan (or vegetarian alternative)\n" +
                        "handful of cherry tomatoes, halved\n" +
                        "To finish\n" +
                        "handful of basil leaves (optional)\n"+
                        "\n"+
                        "Method\n" +
                        "STEP 1\n" +
                        "Make the base: Put the flour into a large bowl, then stir in the yeast and salt. Make a well, pour in 200ml warm water and the olive oil and bring together with a wooden spoon until you have a soft, fairly wet dough. Turn onto a lightly floured surface and knead for 5 mins until smooth. Cover with a tea towel and set aside. You can leave the dough to rise if you like, but it’s not essential for a thin crust.\n" +
                        "\n" +
                        "STEP 2\n" +
                        "Make the sauce: Mix the passata, basil and crushed garlic together, then season to taste. Leave to stand at room temperature while you get on with shaping the base.\n" +
                        "\n" +
                        "STEP 3\n" +
                        "Roll out the dough: if you’ve let the dough rise, give it a quick knead, then split into two balls. On a floured surface, roll out the dough into large rounds, about 25cm across, using a rolling pin. The dough needs to be very thin as it will rise in the oven. Lift the rounds onto two floured baking sheets.\n" +
                        "\n" +
                        "STEP 4\n" +
                        "Top and bake: heat the oven to 240C/220C fan/gas 8. Put another baking sheet or an upturned baking tray in the oven on the top shelf. Smooth sauce over bases with the back of a spoon. Scatter with cheese and tomatoes, drizzle with olive oil and season. Put one pizza, still on its baking sheet, on top of the preheated sheet or tray. Bake for 8-10 mins until crisp. Serve with a little more olive oil, and basil leaves if using. Repeat step for remaining pizza.\n"



                ,7));

        //8. Other
        courseList.add(new Course(11, "irish", "Irish Mashed\nPotatoes", "~ 35\nminutes        ","Average\ndifficulty","#717C08",
                "Ingredients\n" +
                        "4 russet potatoes (2 to 2 1/2 pounds), peeled and cut into large chunks\n" +
                        "Salt\n" +
                        "5 to 6 tablespoons unsalted butter, plus more for serving\n" +
                        "3 lightly packed cups chopped kale, cabbage, chard, or other leafy green\n" +
                        "3 green onions, minced (about 1/2 cup)\n" +
                        "1 cup milk or cream\n" +
                        "\n" +
                        "Method\n" +
                        "Boil the potatoes:\n" +
                        "Put the potatoes in a medium pot and cover with cold water by at least an inch. Add 2 tablespoons of salt, and bring to a boil.\n" +
                        "\n" +
                        "Boil until the potatoes are fork tender, 15 to 20 minutes. Drain in a colander.\n" +
                        "\n" +
                        "Cook the greens and the green onions with butter:\n" +
                        "Return the pot to the stove and set over medium-high heat. Melt the butter in the pot and once it's hot, add the greens.\n" +
                        "\n" +
                        "Cook the greens for 3-4 minutes, or until they are wilted and have given off some of their water.\n" +
                        "\n" +
                        "Add the green onions and cook 1 minute more.\n" +
                        "\n" +
                        "Mash the potatoes with milk or cream and greens:\n" +
                        "Pour in the milk or cream, mix well, and add the potatoes. Reduce the heat to medium.\n" +
                        "\n" +
                        "Use a fork or potato masher and mash the potatoes, mixing them up with the greens.\n" +
                        "\n" +
                        "Add salt to taste and serve hot, with a knob of butter in the center.\n"
                ,8));

        //1. Soups
        courseList.add(new Course(12, "chicken", "Chicken\nsoup", "~ 50\nminutes        ","Average\ndifficulty","#D1AD19",
                "Ingredients\n" +
                        "1 tablespoon avocado oil or olive oil\n" +
                        "6 cloves of garlic, minced\n" +
                        "1 yellow onion, diced\n" +
                        "2 large carrots, thinly sliced\n" +
                        "2 celery stalks, roughly chopped\n" +
                        "1 tablespoon fresh grated ginger\n" +
                        "1 tablespoon fresh grated turmeric (or 1 teaspoon ground turmeric)\n" +
                        "6 cups low sodium chicken broth\n" +
                        "1 pound boneless skinless chicken breast or thighs\n" +
                        "1 teaspoon freshly chopped rosemary\n" +
                        "1 teaspoon freshly chopped thyme, stems removed\n" +
                        "½ teaspoon salt\n" +
                        "Freshly ground black pepper\n" +
                        "1 cup pearl or Israeli couscous\n" +
                        "2/3 cup frozen peas (optional, but recommended)\n" +
                        "\n"+
                        "Instructions\n" +
                        "Place a large dutch oven or pot over medium high heat and add in oil. Once oil is hot, add in garlic, onion, carrots and celery; cook for a few minutes until onion becomes translucent.\n" +
                        "Next add in grated ginger and grated turmeric. Saute for 30 seconds to let the spices cook a bit, then add in chicken broth, chicken breast, rosemary, thyme, salt and pepper.\n" +
                        "Bring soup to a boil, then stir in couscous. You’ll want the chicken to be covered by the broth so make sure you stir them down to the bottom. \n" +
                        "Reduce heat to medium low and simmer uncovered for 20-25 minutes or until chicken is fully cooked.\n" +
                        "\n" +
                        "Once chicken is cooked, remove with a slotted spoon and transfer to a cutting board to shred with two forks. Add chicken back to pot then stir in frozen peas. If you find that you don't have enough broth, feel free to add in another cup. Everyone likes their soup differently. Taste and adjust seasonings, if necessary. Enjoy.\n"
                ,1));

        //2. Main Dish
        courseList.add(new Course(13, "turkey", "Turkey\nà la King", "~ 25\nminutes        ","Average\ndifficulty","#0785AC",
                "Ingredients\n" +
                        "2 tablespoons butter\n" +
                        "\n" +
                        "3 fresh mushrooms, sliced\n" +
                        "\n" +
                        "1 tablespoon all-purpose flour\n" +
                        "\n" +
                        "1 cup chicken broth\n" +
                        "\n" +
                        "1 cup chopped cooked turkey\n" +
                        "\n" +
                        "½ cup heavy cream\n" +
                        "\n" +
                        "⅓ cup frozen peas, thawed\n" +
                        "\n" +
                        "salt and pepper to taste\n" +
                        "\n" +
                        "Directions\n" +
                        "Cook and stir butter in a large skillet over medium-low heat until golden brown.\n" +
                        "\n" +
                        "Add mushrooms to the skillet and cook in browned butter, stirring occasionally, until tender. Stir in flour until smooth. Slowly whisk in chicken broth; cook until slightly thickened.\n" +
                        "\n" +
                        "Stir in turkey, cream, and peas. Reduce heat to low; cook until thickened. Season with salt and pepper.\n"
                ,2));

        //3. Fast
        courseList.add(new Course(14, "taco", "The Best\nHomemade Tacos", "~ 20\nminutes        ","Average\ndifficulty","#EFB269",
                "Ingredients\n" +
                        " \n" +
                        "1 lb. 90% to 93% lean ground beef\n" +
                        "1 Tablespoon chili powder\n" +
                        "1 teaspoon ground cumin\n" +
                        "3/4 teaspoon salt\n" +
                        "1/2 teaspoon dried oregano\n" +
                        "1/2 teaspoon garlic powder\n" +
                        "1/4 teaspoon ground black pepper\n" +
                        "1/2 cup tomato sauce\n" +
                        "1/4 cup water\n" +
                        "12 taco shells - either hard shells or small 6-inch soft flour tortillas will work\n" +
                        "Optional Taco Toppings: shredded cheese shredded lettuce, chopped tomatoes, diced red onion, taco sauce, sour cream, guacamole, etc.\n" +
                        "\n" +
                        "Instructions\n" +
                        "Add the beef to a large skillet over medium-high heat. Break the meat apart with a wooden spoon. Add the chili powder, cumin, salt, oregano, garlic powder, and pepper to the meat. Stir well. Cook until the meat is cooked through, about 6-8 minutes, stirring occasionally.\n" +
                        "Reduce the heat to medium. Add the tomato sauce and water. Stir to combine. Cook, stirring occasionally, for 7-8 minutes, until some of the liquid evaporates but the meat mixture is still a little saucy. Remove from the heat.\n" +
                        "Warm the taco shells according to their package directions.\n" +
                        "Fill the taco shells with 2 heaping tablespoons of taco meat. Top with desired taco toppings: shredded cheese, shredded lettuce, chopped tomatoes, diced red onion, taco sauce, sour cream, guacamole, etc.\n"
                ,3));

        //4. Pasty
        courseList.add(new Course(15, "bakewell", "Mini bakewell\ntarts", "~ 40\nminutes        ","Average\ndifficulty","#BE3B3D",
                "Ingredients\n" +
                        "2 x 320g sheets of all butter shortcrust pastry\n" +
                        "For the frangipane\n" +
                        "120g butter, softened\n" +
                        "120g golden caster sugar\n" +
                        "1 egg\n" +
                        "1 tbsp plain flour\n" +
                        "110g ground almonds\n" +
                        "90g cherry jam\n" +
                        "For the icing\n" +
                        "200g icing sugar\n" +
                        "12 glacé cherries\n"+
                        "\n"+
                        "Method\n" +
                        "STEP 1\n" +
                        "Heat the oven to 180C/160C fan/gas 4. Lightly butter a 12 hole muffin tin. Unroll the sheet of pastry and use a 10cm circular pastry cutter to cut 12 circles out of the pastry sheet. Press the cut circles into the holes of the tin, making sure they come right up and slightly over the top – pushing out any creases. Chill the pastry in the fridge for 20mins. Scrunch up 10cm x 10cm squares of baking paper and then un-scrunch and use to line each of the pastry tarts, then fill with baking beans, rice or dried pulses. Bake for 10 mins, then remove the paper and beans and bake for 10 mins longer, until golden brown. Set aside to cool a little.\n" +
                        "\n" +
                        "STEP 2\n" +
                        "Make the filling by beating together the butter and sugar until light and fluffy, then whisk in the egg, followed by the flour (the flour will prevent the mixture from splitting). Fold in the ground almonds. Spoon a level tsp of cherry jam into each of the pastry shells, followed by a tablespoon of the frangipane mixture. Bake for 20 mins, until the frangipane is golden and springy. Set aside to cool completely. Neaten the edges of the pastry with a small knife or scissors if you like.\n" +
                        "\n" +
                        "STEP 3\n" +
                        "Mix the icing sugar with 2 tbsp water. Spread the icing over each of the tarts, top each with a glacé cherry, leave to set for 20 mins, then serve with tea.\n"
                ,4));

        //5. Biscuits
        courseList.add(new Course(16, "cookie", "Easy\nbiscuits", "~ 20\nminutes        ","Average\ndifficulty","#875411",
                "Ingredients\n" +
                        "250g butter, softened\n" +
                        "140g caster sugar\n" +
                        "1 egg yolk\n" +
                        "2 tsp vanilla extract\n" +
                        "300g plain flour\n"+
                        "\n"+
                        "Method\n" +
                        "STEP 1\n" +
                        "Mix the butter and sugar in a large bowl with a wooden spoon, then add the egg yolk and vanilla extract and briefly beat to combine.\n" +
                        "\n" +
                        "STEP 2\n" +
                        "Sift over the flour and stir until the mixture is well combined – you might need to get your hands in at the end to give everything a really good mix and press the dough together.\n" +
                        "\n" +
                        "STEP 3\n" +
                        "For basic vanilla biscuits: Pre-heat the oven to 180C/160C fan/gas 4. Chill the dough for 20 - 30minutes, roll out and cut out shapes as above. Bake on a non-stick baking tray for 10-12 minutes until pale golden. Carefully transfer to a wire rack to cool and crisp up.\n"

                ,5));

        //6. Cakes
        courseList.add(new Course(17, "napoleon", "Best Napoleon\nCake Ever", "~ 40\nminutes        ","Average\ndifficulty","#F3A56B",
                "Ingredients\n" +
                        "Quick Puff Pastry Ingredients (see the footnotes for using store-bought puff pastry instead)\n" +
                        "⅔ cup water cold or iced (⅔ cup = 5.5 oz)\n" +
                        "⅛ tsp salt\n" +
                        "1 tbsp white vinegar\n" +
                        "3 tbsp vodka /cognac (omit if not using alcohol)\n" +
                        "2 eggs\n" +
                        "5 cups all-purpose flour (5 cups = 23 oz)\n" +
                        "3 ½ sticks cold or frozen butter cold (14 oz = 3.5 sticks)\n" +
                        "Egg Yolk Custard Ingredients\n" +
                        "7 egg yolks\n" +
                        "1½ - 2¼ cup granulated sugar (1.5 - 2.25 cups = 12 to 18 oz )\n" +
                        "⅔ cup all-purpose flour 2/3 cup = 3.5 oz by weight\n" +
                        "6 cups milk, boiling hot divided into 5 ½ cups + ½ cup\n" +
                        "1 tbsp vanilla extract\n" +
                        "1 ¾ sticks unsalted butter (1 3/4 sticks = 7 oz)\n" +
                        "Optional (to top the cake)\n" +
                        "2-3 cups berries (blueberries, raspberries or any other kind of berries)\n"+
                        "\n"+
                        "Instructions\n" +
                        "\n"+
                        "Make Puff Pastry or use store-bought puff pastry (see bottom of the recipe card for details)\n" +
                        "Measure out all of the ingredients for the puff pastry and get your tools and utensils ready.\n" +
                        "\n" +
                        "Wet Ingredients:\n" +
                        "\n" +
                        "Mix 2/3 cup cold water, 1 Tbsp vinegar & 3 Tbsp vodka (replace with water if not using) in a cup.\n" +
                        "\n" +
                        "In a separate cup whisk together 2 eggs and a 1/8 tsp salt. Combine mixtures of two cups and stir to combine.\n" +
                        "\n" +
                        "Dry Ingredients:\n" +
                        "\n" +
                        "By food processor: Add 5 cups flour to the cup of your food processor. Now add 3 ½ sticks cold, cubed butter, and pulse or process until the crumbs are pea-size.\n" +
                        "\n" +
                        "By hand: Alternatively, pour the flour onto the cutting board, then add cold, cubed butter, and using a long, sharp knife keep cutting and mixing the mixture until the pieces are pea-size.\n" +
                        "\n" +
                        "Add wet to dry: Add the liquid ingredients and continue pulsing or mixing until the dough starts sticking to itself a bit, but is not formed yet.\n" +
                        "\n" +
                        "Form into a dough: Pour the content of the food processor bowl onto a work surface and start gathering and pressing the dough together with your hands, trying to work it as little as possible. Form a ball and knead it for a couple of seconds until a dough forms.\n" +
                        "\n" +
                        "Shape & Divide: Shape the dough into a log and then cut it into 12 equal pieces. Roll each piece into a ball, cover, and refrigerate for about an hour to allow the liquid to hydrate the flour. This will also make it easier to roll the dough out later.\n"

                ,6));

        //7. Pizza
        courseList.add(new Course(18, "pepperoni", "Pepperoni\npizza", "~ 40\nminutes        ","Average\ndifficulty","#E26804",
                "Ingredients\n" +
                        "Contadina Quick Pizza Sauce:\n" +
                        "\n" +
                        "½ cup water\n" +
                        "\n" +
                        "½ (12 ounce) can CONTADINA® Tomato Paste\n" +
                        "\n" +
                        "1 teaspoon dried oregano, crushed\n" +
                        "\n" +
                        "1 teaspoon dried basil, crushed\n" +
                        "\n" +
                        "½ teaspoon garlic powder\n" +
                        "\n" +
                        "½ teaspoon onion powder\n" +
                        "\n" +
                        "½ teaspoon sugar\n" +
                        "\n" +
                        "½ teaspoon salt\n" +
                        "\n" +
                        "¼ teaspoon black pepper\n" +
                        "\n" +
                        "Fleischmann's Easy Pizza Crust:\n" +
                        "\n" +
                        "3 ¼ cups all-purpose flour, or more as needed\n" +
                        "\n" +
                        "2 (.25 ounce) envelopes FLEISCHMANN'S® Pizza Crust Yeast or RapidRise® Yeast\n" +
                        "\n" +
                        "1 tablespoon sugar\n" +
                        "\n" +
                        "1 ½ teaspoons salt\n" +
                        "\n" +
                        "1 ⅓ cups very warm water (120 degrees F to 130 degrees F)\n" +
                        "\n" +
                        "⅓ cup oil\n" +
                        "\n" +
                        "Toppings:\n" +
                        "\n" +
                        "1 cup shredded mozzarella cheese, or more to taste\n" +
                        "\n" +
                        "1 (6 ounce) package HORMEL® Pepperoni\n" +
                        "\n" +
                        "Directions\n" +
                        "Preheat the oven to 425 degrees F (220 degrees C). Grease two 12-inch pizza pans.\n" +
                        "\n" +
                        "Make sauce: Whisk together water, tomato paste, oregano, basil, garlic powder, onion powder, sugar, salt, and pepper in a medium bowl until smooth. Set aside.\n" +
                        "\n" +
                        "Make crust: Combine 2 cups flour, yeast, sugar, and salt in a large bowl. Add warm water and oil; mix until well blended, about 1 minute. Gradually add remaining flour, a little at a time, until a soft, sticky dough forms.\n" +
                        "\n" +
                        "Transfer dough to a floured surface; knead until dough is smooth and elastic, about 4 minutes. Add more flour as needed. (If using RapidRise yeast, let dough rest, covered, for 10 minutes.)\n" +
                        "\n" +
                        "Divide dough in half. Lightly flour your hands, then pat each piece of dough onto the prepared pizza pans.\n" +
                        "\n" +
                        "Top dough with sauce, cheese, and pepperoni.\n" +
                        "\n" +
                        "Bake in the preheated oven until crusts are browned and cheese is bubbly, 18 to 20 minutes. Rotate pizza pans between the top and bottom oven racks halfway through baking.\n"

                ,7));

        //8. Other
        courseList.add(new Course(19, "ragu", "Wild boar ragù\nwith fresh pasta", "~ 2\nhours             ","Average\ndifficulty","#DB5205",
                "Ingredients\n" +
                        "For the ragú\n" +
                        "olive oil, for frying\n" +
                        "1 onion, peeled and finely chopped\n" +
                        "2 carrots, peeled and finely diced\n" +
                        "2 sticks celery, finely diced\n" +
                        "2 garlic cloves, peeled and finely sliced\n" +
                        "flour, for dusting\n" +
                        "salt and freshly ground black pepper\n" +
                        "750g/1lb 10oz wild boar neck or shoulder, chopped into 3cm/1in cubes\n" +
                        "100g/3½oz pancetta\n" +
                        "1 bay leaf\n" +
                        "5cm/2in strip of orange rind\n" +
                        "375ml/13fl oz red wine, preferably Italian\n" +
                        "2 tbsp tomato purée\n" +
                        "4 sprigs oregano, leaves picked and roughly chopped\n" +
                        "For the pasta\n" +
                        "300g/10oz tipo 00 flour\n" +
                        "½ tsp salt\n" +
                        "3 free-range eggs\n" +
                        "semolina, for dusting\n" +
                        "To serve\n" +
                        "250g/9oz fresh porcini mushrooms, halved lengthways\n" +
                        "olive oil, for frying\n" +
                        "fresh parmesan, to serve\n"+
                        "\n"+
                        "Method\n" +
                        "Preheat the oven to 150C/300F/Gas 2.\n" +
                        "\n" +
                        "Heat the oil in an ovenproof, heavy-based pan or casserole set over a low-medium heat. Add the onion, carrot, celery, garlic and bay leaf.\n" +
                        "\n" +
                        "Season the flour with salt and pepper. Lightly coat the wild boar in the seasoned flour. Add some olive oil to a separate pan set over a high heat and add the wild boar pieces. Fry until the meat is golden-brown on all over - this may have to be done in batches to avoid crowding the pan.\n" +
                        "\n" +
                        "When the vegetables have softened, add the pancetta, bay leaf and orange rind to the pan. Cook for about five minutes until much of the pancetta fat has rendered and the vegetables have browned a little around the edges.\n" +
                        "\n" +
                        "Add the browned boar meat to the vegetables. Pour the red wine into the frying pan used to brown the meat. Cook over a medium heat, scraping the bottom of the pan to loosen any charred bits of meat.\n" +
                        "\n" +
                        "Add the tomato purée to the ragú and stir it through. Cook for two minutes stirring regularly to avoid burning.\n" +
                        "\n" +
                        "Pour the warm wine into the ragú, add 200ml/7fl oz water and bring to a simmer. Add the oregano leaves and stir through.\n" +
                        "\n" +
                        "Put the lid on the pan and place in the preheated oven for 1½ hours, or until the meat is meltingly tender and the liquid reduced. Check once or twice in this time and stir to prevent the meat on the surface drying out.\n" +
                        "\n" +
                        "In the meantime make the pasta. Tip out the flour on to a clean surface and create a small well in the middle. Sprinkle over the salt.\n" +
                        "\n" +
                        "Crack the eggs into the well and, using a fork, begin whisking the eggs, slowly working in the flour. Once most of the flour has been incorporated, use your hands to knead the dough for about five minutes. The dough should be smooth and pliable. If not keep kneading until it is.\n" +
                        "\n" +
                        "Wrap the pasta in cling film and set aside to rest for 5-10 minutes.\n" +
                        "\n" +
                        "Halve the dough and pass one half through each stage of a pasta machine twice, starting at the widest setting and working down until you have passed it through the thinnest setting. Coat the pasta with a little semolina flour to stop it sticking and set aside for a few minutes to dry slightly. Repeat with the remaining pasta.\n" +
                        "\n" +
                        "Cut the pasta sheets using the tagliatelle cutter or, if cutting by hand, take one of the short ends of the pasta and fold over a 5cm/2in strip. Keep folding until you have a parcel of pasta, then slice the parcel into 1cm/½in wide strips – cutting from the short end to produce long strips of pasta. Coat the strips in a little more semolina flour to prevent them sticking together.\n" +
                        "\n" +
                        "When ready to cook, bring a large pot of water to the boil and add a generous amount of salt. Drop your pasta in and cook for about three minutes before draining. Dress with a little olive oil if not eating immediately.\n" +
                        "\n" +
                        "Before serving, add a little olive oil to a pan over a medium-high heat. Once smoking, add the halved mushrooms and sauté for 2-3 minutes.\n" +
                        "\n" +
                        "To serve, tip the pasta into the finished ragù and serve in portions topped with freshly grated parmesan and fried mushrooms.\n"
                ,8));


        //2. Main Dish
        courseList.add(new Course(20, "potato", "Braised fingerling\npotatoes", "~ 40\nminutes        ","Average\ndifficulty","#CA6E01",
                "Ingredients\n" +
                        "1½ lbs small to medium fingerling potatoes I used a combination of red and yellow\n" +
                        "1 large shallot sliced into ½-inch slices\n" +
                        "4-5 garlic cloves\n" +
                        "1 large sprig of fresh rosemary broken in half, plus more for garnishing\n" +
                        "4-5 sprigs of fresh thyme plus more for garnishing\n" +
                        "2 dried bay leaves broken in half\n" +
                        "3 tablespoons (45 mL) extra virgin olive oil\n" +
                        "1 cup (240 mL) low-sodium chicken stock or vegetable stock\n" +
                        "kosher salt\n" +
                        "freshly ground black pepper\n" +
                        "Instructions \n" +
                        "Rinse and scrub the potatoes lightly in a colander under running water. If the potatoes are on the smaller side–less than 1-inch wide and not very long–leave them intact. Slice any larger fingerling potatoes in half crosswise.\n" +
                        "Place the fingerling potatoes in a straight-sided sauté pan (at least 3 quarts in size) so that the potatoes can be accommodated in a single layer. Add the sliced shallot, garlic cloves, fresh rosemary, thyme, and dried bay leaves to the pan. Add the olive oil and toss to coat evenly. Pour in the chicken stock and season lightly with salt and pepper (the salt will concentrate as the potatoes cook, so avoid over-seasoning, especially if you are not using low-sodium chicken stock).\n" +
                        "Cover the pan and bring to a simmer over medium heat. Reduce the heat to a very low simmer and cook the potatoes, covered, for 10 minutes. Use a spoon to flip the potatoes, cover, and simmer for an additional 10 to 12 minutes, or until they are can be easily pierced with a sharp knife or skewer. There should still be a relatively substantial amount of braising liquid left in the pan.\n" +
                        "Remove the lid and bring over high heat ntil the braising liquid has come to a boil. Continue to cook over high heat, shaking the pan back and forth gently, until all of the braising liquid has evaporated and the potatoes begin to sizzle in any remaining oil in the pan. At this point, the shallots and garlic will have reduced to a buttery glaze, which should coat the potatoes evenly. Remove from the heat, discard the bay leaves and any tough remaining rosemary and thyme stems. Taste and season with salt and pepper, if necessary.\n" +
                        "Place the potatoes in a serving platter and garnish with chopped fresh thyme leaves. Serve immediately.\n"
                ,2));


        //3. Fast
        courseList.add(new Course(21, "twisties", "Crunchy Chicken\nTwisties drumsticks", "~ 45\nminutes        ","Average\ndifficulty","#EFB724",
                "Ingredients\n" +
                        "100g chicken Twisties\n" +
                        "3/4 cup panko breadcrumbs\n" +
                        "1 tsp garlic powder\n" +
                        "1/2 tsp smoked paprika\n" +
                        "1/2 cup plain flour\n" +
                        "1 egg\n" +
                        "1/2 cup milk\n" +
                        "8 chicken drumsticks\n" +
                        "1 can olive oil spray\n" +
                        "1 tbs fresh thyme leaves chopped\n" +
                        "1 pinch salt and pepper *to taste\n"+
                        "\n"+
                        "Method\n" +
                        "Place Twisties in a food processor. Process until chopped finely, resembling coarse breadcrumbs. Place panko breadcrumbs on a plate, then add crushed Twisties, garlic powder and paprika and mix to combine.\n" +
                        "Place flour on a plate. Season with salt and pepper. Whisk egg and milk in a shallow bowl.\n" +
                        "Toss 1 piece of chicken in flour to coat. Dip in the egg mixture, then toss in breadcrumbs, pressing to secure. Place onto a plate. Repeat with remaining chicken. Refrigerate for 10 minutes.\n" +
                        "Preheat the oven to 200C/180C fan-forced. Line an oven tray with baking paper.\n" +
                        "Arrange chicken in a single layer on prepared tray. Spray all over with oil spray. Bake, turning once, for 45 minutes or until golden and chicken is cooked through. Serve chicken sprinkled with thyme leaves.\n"

                ,3));

        //4. Pasty
        courseList.add(new Course(22, "chocolatechip", "Chocolate Chip\nBlondies", "~ 20\nminutes        ","Average\ndifficulty","#3D1D13",
                "Ingredients\n" +
                        "▢1/2 cup unsalted butter, melted\n" +
                        "▢1 cup packed light brown sugar\n" +
                        "▢1 egg\n" +
                        "▢2 teaspoons pure vanilla extract\n" +
                        "▢1 cup all-purpose flour\n" +
                        "▢1/4 teaspoon kosher salt\n" +
                        "▢1 cup semisweet or dark chocolate chips\n" +
                        "\n"+
                        "Instructions\n" +
                        "Preheat oven to 350°F. Line an 8-inch square pan with parchment paper and spray lightly with nonstick cooking spray.\n" +
                        "In a large bowl, stir together butter and brown sugar until smooth. Add egg and vanilla and stir to combine. Stir in flour and salt, just until combined.\n" +
                        "Stir in chocolate chips, reserving a couple of tablespoons to sprinkle on top if desired.\n" +
                        "Spread batter into prepared pan. Bake for 25 to 28 minutes or until a toothpick inserted in the middle comes out with moist crumbs. The blondies will be slightly browned around the edges. Cool for at least 20 minutes in the pan before lifting the blondies out by the parchment paper. Set on a wire rack to finish cooling before slicing and storing in an airtight container.\n"
                ,4));

        //5. Biscuits
        courseList.add(new Course(23, "basicbis", "Basic butter\nbiscuit dough", "~ 40\nminutes        ","Average\ndifficulty","#D1A3A8",
                "7 Ingredients\n" +
                        "\n" +
                        "125g Devondale Unsalted Butter, softened\n" +
                        "\n" +
                        "1/2 cup caster sugar\n" +
                        "\n" +
                        "1/2 tsp vanilla extract\n" +
                        "\n" +
                        "1 egg, at room temperature\n" +
                        "\n" +
                        "2 cups plain flour\n" +
                        "\n" +
                        "1 tsp baking powder\n" +
                        "\n" +
                        "1 tbsp milk\n" +
                        "\n" +
                        "Select all ingredients\n"+
                        "\n"+
                        "4 Method Steps\n"+
                        "Step 1\n" +
                        "Preheat oven to 180°C. Line 2 baking trays with baking paper.\n" +
                        "Step 2\n" +
                        "Using an electric mixer, beat butter , sugar and vanilla in a small bowl until pale and creamy. Add egg and mix until well combined. Sift flour and baking powder over butter mixture. Add milk and stir until just combined.\n" +
                        "Step 3\n" +
                        "Using 1 heaped tablespoon of mixture at a time, roll mixture into balls. Place on baking trays lined with baking paper. Using the heel of your hand, flatten biscuits slightly (allow room for spreading).\n" +
                        "Step 4\n" +
                        "Bake for 15 to 18 minutes, swapping trays over in oven after 10 minutes, or until light golden. Allow biscuits to cool on trays for 5 minutes. Transfer to wire racks to cool completely. Serve.\n"
                ,5));

        //6. Cakes
        courseList.add(new Course(24, "sponge", "Sponge\ncake", "~ 30\nminutes        ","Average\ndifficulty","#AA5B2A",
                "Ingredients\n" +
                        "225g softened butter\n" +
                        "225g golden caster sugar\n" +
                        "4 large eggs\n" +
                        "½ lemon, zested\n" +
                        "1 tsp vanilla extract\n" +
                        "225g self-raising flour\n" +
                        "splash of milk\n" +
                        "Optional fillings of lemon curd, jam, lightly whipped cream\n" +
                        "icing sugar for dusting\n"+
                        "\n"+
                        "Method\n" +
                        "STEP 1\n" +
                        "Heat oven to 180C/160C fan/gas 4, butter and line the base of two 20cm spring-form cake tins with baking parchment.\n" +
                        "\n" +
                        "STEP 2\n" +
                        "Using an electric whisk beat the butter and sugar together until pale and fluffy. Crack the eggs in one at a time and whisk well, scraping down the sides of the bowl after each addition. Add the lemon zest, vanilla, flour, milk and a pinch of salt. Whisk until just combined then divide the mixture between the two tins.\n" +
                        "\n" +
                        "STEP 3\n" +
                        "Bake in the centre of the oven for 25-30 mins until a skewer inserted into the middle of each cake comes out clean. After 10 mins remove the cakes from their tins and leave to cool completely on a wire rack. Fill how you like. My personal favourite is a good dollop of lemon curd and some fresh cream, then dust the top with icing sugar. Will keep for 3 days.\n"

                ,6));

        //7. Pizza
        courseList.add(new Course(25, "rpizza", "Pizza\nDough", "~ 2 hrs 30\nminutes        ","Average\ndifficulty","#E1734C",
                "Ingredients\n" +
                        "2-2 ⅓ cups all-purpose flour OR bread flour¹ divided (250-295g)\n" +
                        "1 packet instant yeast² (2 ¼ teaspoon)\n" +
                        "1 ½ teaspoons sugar\n" +
                        "¾ teaspoon salt\n" +
                        "⅛-¼ teaspoon garlic powder and/or dried basil leaves optional\n" +
                        "2 Tablespoons olive oil + additional\n" +
                        "¾ cup warm water³ (175ml)\n" +
                        "\n" +
                        "Instructions\n" +
                        "Combine 1 cup (125g) of flour, instant yeast, sugar, and salt in a large bowl. If desired, add garlic powder and dried basil at this point as well.\n" +
                        "Add olive oil and warm water and use a wooden spoon to stir well very well.\n" +
                        "Gradually add another 1 cup (125g) of flour. Add any additional flour as needed (I've found that sometimes I need as much as an additional ⅓ cup), stirring until the dough is forming into a cohesive, elastic ball and is beginning to pull away from the sides of the bowl (see video above recipe for visual cue). The dough will still be slightly sticky but still should be manageable with your hands.\n" +
                        "Drizzle a separate, large, clean bowl generously with olive oil and use a pastry brush to brush up the sides of the bowl.\n" +
                        "Lightly dust your hands with flour and form your pizza dough into a round ball and transfer to your olive oil-brushed bowl. Use your hands to roll the pizza dough along the inside of the bowl until it is coated in olive oil, then cover the bowl tightly with plastic wrap and place it in a warm place.\n" +
                        "Allow dough to rise for 30 minutes or until doubled in size. If you intend to bake this dough into a pizza, I also recommend preheating your oven to 425F (215C) at this point so that it will have reached temperature once your pizza is ready to bake.\n" +
                        "Once the dough has risen, use your hands to gently deflate it and transfer to a lightly floured surface and knead briefly until smooth (about 3-5 times). \n" +
                        "Use either your hands or a rolling pin to work the dough into 12\" circle.\n" +
                        "Transfer dough to a parchment paper lined pizza pan and either pinch the edges or fold them over to form a crust.\n" +
                        "Drizzle additional olive oil (about a Tablespoon) over the top of the pizza and use your pastry brush to brush the entire surface of the pizza (including the crust) with olive oil. \n" +
                        "Use a fork to poke holes all over the center of the pizza to keep the dough from bubbling up in the oven.\n" +
                        "Add desired toppings (see the notes for a link to my favorite, 5-minute pizza sauce recipe!) and bake in a 425F (215C) preheated oven for 13-15 minutes or until toppings are golden brown. Slice and serve."
                ,7));

        //8. Other
        courseList.add(new Course(26, "irishend", "Irish Beef\nStew", "~ 2 hrs 15\nminutes        ","Average\ndifficulty","#9F610A",
                "Ingredients\n" +
                        "1 1/4 pounds well-marbled chuck beef stew meat, cut into 1 1/2-inch chunks\n" +
                        "3 teaspoons salt, or more to taste\n" +
                        "1/4 cup extra virgin olive oil\n" +
                        "6 garlic cloves, minced\n" +
                        "4 cups  beef stock \n" +
                        "2 cups water\n" +
                        "1 cup Guinness extra stout\n" +
                        "1 cup hearty red wine\n" +
                        "2 tablespoons tomato paste\n" +
                        "1 tablespoon sugar\n" +
                        "1 tablespoon dried thyme\n" +
                        "1 tablespoon Worcestershire sauce\n" +
                        "2 bay leaves\n" +
                        "2 tablespoons butter\n" +
                        "3 pounds russet potatoes, peeled, cut into 1/2-inch pieces (about 7 cups)\n" +
                        "1 large onion, chopped (1 1/2 to 2 cups)\n" +
                        "3 to 4 carrots or parsnips, cut into 1/2-inch pieces (2 cups)\n" +
                        "1/2 teaspoon freshly ground black pepper\n" +
                        "2 tablespoons chopped fresh parsley\n"+
                        "\n"+
                        "Method\n" +
                        "Brown the beef:\n" +
                        "Sprinkle about a teaspoon of salt over the beef pieces. Heat the olive oil in a large (6 to 8 quart), thick-bottomed pot over medium-high heat.\n" +
                        "\n" +
                        "Pat dry the beef with paper towels and working in batches, add the beef (do not crowd the pan, or the meat will steam and not brown) and cook, without stirring, until well browned on one side, then use tongs to turn the pieces over and brown on another side.\n"+
                        "\n" +
                        "Add garlic and sauté, then add stock, water, Guinness, wine, tomato paste, sugar, thyme Worcestershire, bay leaves, simmer:\n" +
                        "Add garlic to the pot with the beef and sauté 30 seconds or until fragrant. Add the beef stock, water, Guinness, red wine, tomato paste, sugar, thyme, Worcestershire sauce, and bay leaves. Stir to combine.\n" +
                        "\n" +
                        "Bring mixture to a simmer. Reduce heat to the lowest setting, then cover and cook at a bare simmer for 1 hour, stirring occasionally.\n"+
                        "\n" +
                        "Sauté onions, carrots in separate pan:\n" +
                        "While the pot of meat and stock is simmering, melt the butter in another pot over medium heat. Add the onions and carrots. Sauté the onions and carrots until the onions are golden, about 15 minutes. Set aside until the beef stew in step 2 has simmered for one hour.\n"+
                        "\n"+
                        "Add onions, carrots, potatoes to beef stew, simmer:\n" +
                        "Add the onions, carrots, and the potatoes to the beef stew. Add black pepper and two teaspoons of salt. Simmer uncovered until vegetables and beef are very tender, about 40 minutes. Discard the bay leaves. Tilt pan and spoon off any excess fat.\n" +
                        "\n" +
                        "Transfer stew to serving bowls. Add more salt and pepper to taste. Sprinkle with parsley and serve.\n"
                ,8));


        fullcoursesList.addAll(courseList);

        setCourseRecycler(courseList);
    }


    public void fromMaintoLikepage(View view){
        Intent intent = new Intent(this, OrderPage.class);
        //courseList.clear();
        //courseAdapter.notifyDataSetChanged();
        startActivity(intent);
    }
    public void fromMaintoRec(View view){
        Intent intent = new Intent(this, recpage.class);
        //  courseList.clear();
        //  courseAdapter.notifyDataSetChanged();
        startActivity(intent);
    }




    private void setCourseRecycler(List<Course> courseList) {

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false);

        courseRecycler = findViewById(R.id.courseRecycler);
        courseRecycler.setLayoutManager(layoutManager);

        courseAdapter = new CourseAdapter(this, courseList);
        courseRecycler.setAdapter(courseAdapter);

    }


    private void setCategoryRecycler(List<Category> categoryList) {

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false);

        categoryRecycler = findViewById(R.id.categoryRecycler);
        categoryRecycler.setLayoutManager(layoutManager);

        categoryAdapter = new CategoryAdapter(this, categoryList);
        categoryRecycler.setAdapter(categoryAdapter);
    }

    public static void showCoursesByCategory(int category){

        courseList.clear();
        courseList.addAll(fullcoursesList);

        List<Course> filterCourses = new ArrayList<>();

        for(Course c : courseList){
            if(c.getCategory() == category)
                filterCourses.add(c);
        }

        courseList.clear();
        courseList.addAll(filterCourses);

        courseAdapter.notifyDataSetChanged();

    }

}