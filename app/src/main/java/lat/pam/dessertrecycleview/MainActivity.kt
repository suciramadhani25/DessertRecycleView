package lat.pam.dessertrecycleview
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView =
            findViewById<RecyclerView>(R.id.recyclerView)

        val desserts = listOf(
            Dessert(
                description = "Donuts are glazed and sprinkled with candy.",
                imageRes = R.drawable.donut_circle,
                colorHex = "#C1E8C5"
            ),
            Dessert(
                description = "Ice cream sandwiches have chocolate wafers and vanilla filling.",
                imageRes = R.drawable.icecream_circle,
                colorHex = "#BBE0F8"
            ),
            Dessert(
                description = "Froyo is premium self-serve frozen yogurt.",
                imageRes = R.drawable.froyo_circle,
                colorHex = "#E4BCDF"
            )
        )

        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = DessertAdapter(desserts)
    }
}
