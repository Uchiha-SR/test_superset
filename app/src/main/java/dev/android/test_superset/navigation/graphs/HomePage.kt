package dev.android.test_superset.navigation.graphs

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.Card

import androidx.compose.material3.Icon
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.room.Entity
import androidx.room.PrimaryKey
import dev.android.test_superset.R
import dev.android.test_superset.ui.theme.colorPrimary
import dev.android.test_superset.ui.theme.gray


@Composable
fun HomePage() {

    Surface( ) {


        val textState = remember { mutableStateOf(TextFieldValue("")) }
        //   Surface(color = MaterialTheme.colors.background) {
        LazyColumn(modifier = Modifier.fillMaxHeight()) {
            item {
         //       TopBar()
         //       SearchBar(textState)
          //      SliderBanner(modifier = Modifier)
            }
            item {
                Row(
                    modifier = Modifier.padding(start = 20.dp, end = 20.dp, bottom = 20.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        text = "Exlcusive Offer",
                        style = TextStyle(
                            fontSize = 18.sp,
                            //     fontFamily = FontFamily(Font(R.font.helvetica_neue_bold))
                        ),
                        modifier = Modifier.weight(1f)
                    )

                }
            }
            item {
                ExclusiveOfferList()
            }
            item {
                Row(
                    modifier = Modifier.padding(20.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        text = "Best Selling",
                        style = TextStyle(
                            fontSize = 18.sp,
                            //     fontFamily = FontFamily(Font(R.font.helvetica_neue_bold))
                        ),
                        modifier = Modifier.weight(1f)
                    )


                }
            }
            item {
                BestSellingList()
            }

        }
    }
}

@Composable
private fun BestSellingList(){

    LazyRow(modifier = Modifier.fillMaxWidth()){
        items(ProductItemData.list.size){
            productCard(ProductItemData.list[it])
        }
    }
}

@Composable
private fun ExclusiveOfferList() {
    LazyRow(
        modifier = Modifier.fillMaxWidth()
    ) {
        items(ProductItemData.list.size) {
            productCard(ProductItemData.list[it])
        }
    }
}

@Composable
private fun productCard(product: ProductItem) {
    Card(
        shape = RoundedCornerShape(14.dp),
       // backgroundColor = Color.White,
        modifier = Modifier
            .padding(10.dp)
            .width(180.dp)
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp),
        ) {

            Image(
                modifier = Modifier.size(140.dp),
                bitmap = ImageBitmap.imageResource(id = product.image),
                contentDescription = "flower_card"
            )
            Row(modifier = Modifier.padding(top = 20.dp)) {
                Column(modifier = Modifier.weight(1f)) {
                    Text(
                        text = product.title,
                        style = TextStyle(
                            color = gray,
                            fontSize = 16.sp,
                            //   fontFamily = FontFamily(Font(R.font.helvetica_neue_medium))
                        )
                    )
                    Text(
                        text = "$${product.price}",
                        style = TextStyle(
                            color = gray,
                            fontSize = 16.sp,
                            //   fontFamily = FontFamily(Font(R.font.helvetica_neue_medium))
                        )
                    )
                }
                Box(
                    modifier = Modifier
                        .background(
                            color = colorPrimary,
                            shape = RoundedCornerShape(10.dp)
                        )
                ) {
                    Icon(
                        Icons.Default.Add,
                        tint = Color.White,
                        modifier = Modifier.padding(10.dp),
                        contentDescription = "flower_card_icon"
                    )
                }
            }
        }
    }
}


@Preview("Menu Item Card • Dark")
@Composable
private fun MenuItemCardDarkPreview() {

    productCard(
        product = ProductItem(

            id = 6,
            title = "Organic Bananas",
            description = "Apples are nutritious. Apples may be good for weight loss. apples may be good for your heart. As part of a healtful and varied diet.",
            image = R.drawable.product7,
            unit = "7pcs, Priceg",
            price = 4.99,
            nutritions = "100gr",
            review = 4.0
        )
    )
}

@Entity(tableName =  "product_table")
data class ProductItem(
    @PrimaryKey(autoGenerate = false)
    val id: Int,
    val title: String,
    val description: String,
    val image: Int,
    val unit: String,
    val price: Double,
    val nutritions: String,
    val review: Double,
    var isCart: Boolean = false
)


object ProductItemData {
    val list = listOf(
        ProductItem(
            id = 1,
            title = "Macaroni",
            description = "Macaroni is dry pasta shaped like narrow tubes.[2] Made with durum wheat, macaroni is commonly cut in short lengths; curved macaroni may be referred to as elbow macaroni. ",
            image = R.drawable.product1,
            unit = "1pcs, Price",
            price = 6.52,
            nutritions = "50gr",
            review = 3.5,
        ),
        ProductItem(
            id = 2,
            title = "Egg",
            description = "Eggs have a hard shell of calcium carbonate enclosing a liquid white, a single yolk (or an occasional double yolk)and an air cell.",
            image = R.drawable.product2,
            unit = "10pcs, Price",
            price = 2.50,
            nutritions = "150gr",
            review = 5.0
        ),
        ProductItem(
            id = 3,
            title = "Mayonnaise",
            description = "Mayonnaise is the creamy white condiment you use to make tuna salad or spread on your BLT sandwich. Most mayonnaise is made from egg yolks, oil, and lemon juice. Mayonnaise is common in many foods around the world, from fancy French sauces like rémoulade to Japanese okonomiyaki.",
            image = R.drawable.product3,
            unit = "1pcs, Price",
            price = 7.5,
            nutritions = "100gr",
            review = 4.0
        ),
        ProductItem(
            id = 4,
            title = "Egg Noodles",
            description = "A type of flat pasta that differs from regular flour and water pasta in that eggs are added to enrich the dough. Several different widths are produced commercially and the noodles are available fresh or dried.",
            image = R.drawable.product4,
            unit = "1pcs, Price",
            price = 9.5,
            nutritions = "90gr",
            review = 4.7
        ),
        ProductItem(
            id = 5,
            title = "Ginger",
            description = "Ginger is one of the most popular spices in the world and comes from the underground stem of the ginger plant. The aromatic and fiery spice has been a signature ingredient in Asian cuisine since ancient times.",
            image = R.drawable.product5,
            unit = "20pcs, Price",
            price = 2.0,
            nutritions = "50gr",
            review = 4.2
        ),
        ProductItem(
            id = 6,
            title = "Diet Coke",
            description = "Diet coke® is the perfect balance of crisp and refreshing, with no sugar and no calories. enjoy the great diet cola flavour that's fizzing delicious! CARBONATED WATER, CARAMEL COLOUR, PHOSPHORIC AND CITRIC ACID, ASPARTAME (CONTAINS PHENYLALANINE), FLAVOUR, SODIUM BENZOATE, CAFFEINE, ACESULFAME-POTASSIUM.",
            image = R.drawable.product6,
            unit = "1pcs, Price",
            price = 1.5,
            nutritions = "10gr",
            review = 3.8
        ),
        ProductItem(
            id = 7,
            title = "Broilers",
            description = "A broiler is any chicken (Gallus gallus domesticus) that is bred and raised specifically for meat production. Most commercial broilers reach slaughter weight between four and six weeks of age, although slower growing breeds reach slaughter weight at approximately 14 weeks of age.",
            image = R.drawable.product7,
            unit = "1pcs, Price",
            price = 5.0,
            nutritions = "70gr",
            review = 3.0
        ),
        ProductItem(
            id = 8,
            title = "Juice Apple",
            description = "It is a very clear liquid from which the pulp has been removed. This juice is often used to flavor meats, or as an ingredient in dressings and sauces, adding a sweet apple flavor.",
            image = R.drawable.product8,
            unit = "1pcs, Price",
            price = 6.5,
            nutritions = "100gr",
            review = 4.2
        ),
        ProductItem(
            id = 9,
            title = "Juice Orange",
            description = "Orange juice is a fruit juice obtained by squeezing, pressing or otherwise crushing the interior of an orange. Orange juice is a nutrition powerhouse with naturally occurring vitamins and minerals and many antioxidants.",
            image = R.drawable.product9,
            unit = "1pcs, Price",
            price = 5.54,
            nutritions = "100gr",
            review = 4.7
        ),
        ProductItem(
            id = 10,
            title = "Banana",
            description = "A banana is an elongated, edible fruit – botanically a berry – produced by several kinds of large herbaceous flowering plants in the genus Musa. In some countries, bananas used for cooking may be called \"plantains\", distinguishing them from dessert bananas.",
            image = R.drawable.product10,
            unit = "8pcs, Price",
            price = 9.10,
            nutritions = "100gr",
            review = 4.5
        ),
    )
}