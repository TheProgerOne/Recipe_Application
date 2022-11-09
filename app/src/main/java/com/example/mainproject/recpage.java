package com.example.mainproject;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

public class recpage extends AppCompatActivity {

    private TextView newText;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recpage);

        newText = findViewById(R.id.RecPageText);
        newText.setText("We’ve all been there.\n" +
                "\n" +
                "“I think I caught what’s going around the office,” \n or “I just have a tickle in my throat.”\n" +
                "\n" +
                "As the leaves fall and temperatures drop, people tend \n to spend more time indoors with others, which potentially increases the exposure to cold-causing viruses. At some point this season, most people will catch the common cold, a viral infection in the upper respiratory system characterized by coughing, sneezing, sore throat, and other symptoms.\n" +
                "\n" +
                "While medicine and getting a good night’s sleep can help \n , it’s no wives tale that the simple remedy of a bowl of soup can also help. The prescription predates even the oldest secret family recipe for chicken noodle soup; in the 12th century, Egyptian Jewish physician Moshe ben Maimonides prescribed chicken soup as a treatment for respiratory tract issues.\n" +
                "\n" +
                "Research by Ken Albala, a food historian at the University of the Pacific in California, published research in the journal Studies in History and Philosophy of Science Part C: Studies in History and Philosophy of Biological and Biomedical Sciences suggests that eating soup while you are ill comes from “common knowledge and an informal intuition.”\n" +
                "\n" +
                "Albala says soup is often the go-to food because it can be “nourishing, restorative, easy to digest, and interestingly ‘light’ in both consistency and color so as not to tax the system excessively.”\n" +
                "\n" +
                "The same recommendation is advised by Melissa Bailey, RD, a clinical dietician at the Hospital of the University of Pennsylvania. Bailey believes there is no “one size fits all” approach to diet, but says there is real scientific evidence backing the merits of soup – especially for those with a cold.\n" +
                "\n" +
                "Professionally, Bailey meets with patients in individual and group settings to discuss their nutrition history, what they’re eating, and what changes are needed. She sees 12-15 patients daily – most of whom are waiting for a transplant or recently received one – to ensure they’re receiving the appropriate nutrition for their condition during their time in the hospital.\n" +
                "\n" +
                "Personally, Bailey’s passion for nutrition and experimenting with recipes in the kitchen now manifests itself as editor of The Nourished Fork, a blog of healthier versions of recipes, including a pumpkin farrato I’m excited to try.\n" +
                "\n" +
                "Bailey sees her blog as a way to offer preventative measures outside of her daily career caring for sick patients.\n" +
                "\n" +
                "“I’ll give recipes to patients that will say, ‘OK, instead of eating a cheesesteak, how about we try a healthier recipe with similar flavors?’.”\n" +
                "\n" +
                "As we enter cold and flu season, Bailey says healthy soup recipes can help stave off symptoms many will face in the months ahead.\n" +
                "\n" +
                "“A stuffed pepper soup, for example, embodies all the flavors of a stuffed pepper, but uses low-sodium products, which are great for patients who need to follow a heart healthy diet.”\n" +
                "\n" +
                "Though vegetables often lose some of their nutritional value during boiling, steaming and the subsequent draining they undergo after cooking, including them in a soup is a great way to help them maintain healthful attributes, Bailey explains. The sodium in the recipe helps relieve sore throat pain (the same principle behind gargling warm salt water), the heat helps clear nasal congestion, and can relieve pain and sinus pressure.\n" +
                "\n" +
                "The vitamins and minerals in nutrient-dense soups can also speed recovery, Bailey adds. In fact, a University of Florida study in the journal Clinical Nutrition found that consuming garlic extract may reduce the severity of cold and flu symptoms.\n" +
                "\n" +
                "“I truly believe we are what we eat. When we eat nourishing foods, such as nutrient-dense fruits and vegetables, we tend to feel good. Small changes in our diet can lead to long lasting effects on our health.” " +
                "\n");
    }
}