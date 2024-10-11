package com.example.assignment2

import android.os.Bundle
import android.widget.LinearLayout
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
       val recyclerView: RecyclerView =findViewById(R.id.recyclerView)
        val adaptar= ArticlesAdaptar(getArticles())
        recyclerView.adapter=adaptar
        recyclerView.layoutManager= LinearLayoutManager(this)

    }

    fun getArticles(): List<Article>{
        return listOf(
            Article(R.drawable.img1, "Morning Rings", "Summer is coming to an end that means fall! But temperatures are still warm and summer will be sticking around for a few more weeks. This makes getting dressed a little difficult; do you still purchase summer clothing? Is it…","So now here comes the mesh shoe trend. The first pair of mesh flats I remember were from Alaia. Yeah you know the ones (and I found an excellent dupe). Then, Khaite did an incredible pair (again, found an amazing dupe). And then we starting seeing more specialty retailers come up with their own versions — some embellished, some solid, some mesh, some netted. And now we’re seeing a lot of mesh shoes coming to mass market — Mango, COS, Sam Edelman, etc.\n" +
                    "\n" +
                    "I personally have always loved the mesh shoe trend. I didn’t think it was weird (because yah, your toes do show), I thought they were pretty cool right off the bat. I couldn’t justify spending the money on a designer pair (although I do love my Gucci, Chanel, and Hermes shoes – check out those posts for more).\n" +
                    "\n" +
                    "I’ve rounded up mesh flats that I’ve found from so many different retailers – just proving that they’re EVERYWHERE. A quick Google search of mesh flats brings you to an entire world of shoes. Now that the weather is warming up, you’re going to see just how many girls are into the mesh shoe trend."),


            Article(R.drawable.img2, "San Francisco Evicts the Dead", "I first heard of U Beauty when it started getting some hyper on social media last year. I was a little hesitant to try it because of the price but when the brand reached out to see if I’d like…","So now here comes the mesh shoe trend. The first pair of mesh flats I remember were from Alaia. Yeah you know the ones (and I found an excellent dupe). Then, Khaite did an incredible pair (again, found an amazing dupe). And then we starting seeing more specialty retailers come up with their own versions — some embellished, some solid, some mesh, some netted. And now we’re seeing a lot of mesh shoes coming to mass market — Mango, COS, Sam Edelman, etc.\n" +
                    "\n" +
                    "I personally have always loved the mesh shoe trend. I didn’t think it was weird (because yah, your toes do show), I thought they were pretty cool right off the bat. I couldn’t justify spending the money on a designer pair (although I do love my Gucci, Chanel, and Hermes shoes – check out those posts for more).\n" +
                    "\n" +
                    "I’ve rounded up mesh flats that I’ve found from so many different retailers – just proving that they’re EVERYWHERE. A quick Google search of mesh flats brings you to an entire world of shoes. Now that the weather is warming up, you’re going to see just how many girls are into the mesh shoe trend."),


            Article(R.drawable.img3, "20 Astonishing Stories of Things Found in Walls", "Whether you’re from NYC or planning a visit, comfortable footwear is a no-brainer. New Yorkers walk a lot and while a pair of pretty pumps are the perfect finishing touch to your outfit, but they’re not practical for the amount…","So now here comes the mesh shoe trend. The first pair of mesh flats I remember were from Alaia. Yeah you know the ones (and I found an excellent dupe). Then, Khaite did an incredible pair (again, found an amazing dupe). And then we starting seeing more specialty retailers come up with their own versions — some embellished, some solid, some mesh, some netted. And now we’re seeing a lot of mesh shoes coming to mass market — Mango, COS, Sam Edelman, etc.\n" +
                    "\n" +
                    "I personally have always loved the mesh shoe trend. I didn’t think it was weird (because yah, your toes do show), I thought they were pretty cool right off the bat. I couldn’t justify spending the money on a designer pair (although I do love my Gucci, Chanel, and Hermes shoes – check out those posts for more).\n" +
                    "\n" +
                    "I’ve rounded up mesh flats that I’ve found from so many different retailers – just proving that they’re EVERYWHERE. A quick Google search of mesh flats brings you to an entire world of shoes. Now that the weather is warming up, you’re going to see just how many girls are into the mesh shoe trend."),


            Article(R.drawable.img4, "Mail Order Homes? Buying a Sears Modern Home in the Early 1900s", "*originally posted may 2023, with updates in may 2024* As much as I dislike dressing for summer most of the time, there are a couple of pieces that I do get excited about. The Hermes Orans are definitely one of…","So now here comes the mesh shoe trend. The first pair of mesh flats I remember were from Alaia. Yeah you know the ones (and I found an excellent dupe). Then, Khaite did an incredible pair (again, found an amazing dupe). And then we starting seeing more specialty retailers come up with their own versions — some embellished, some solid, some mesh, some netted. And now we’re seeing a lot of mesh shoes coming to mass market — Mango, COS, Sam Edelman, etc.\n" +
                    "\n" +
                    "I personally have always loved the mesh shoe trend. I didn’t think it was weird (because yah, your toes do show), I thought they were pretty cool right off the bat. I couldn’t justify spending the money on a designer pair (although I do love my Gucci, Chanel, and Hermes shoes – check out those posts for more).\n" +
                    "\n" +
                    "I’ve rounded up mesh flats that I’ve found from so many different retailers – just proving that they’re EVERYWHERE. A quick Google search of mesh flats brings you to an entire world of shoes. Now that the weather is warming up, you’re going to see just how many girls are into the mesh shoe trend."),
        )
    }
}