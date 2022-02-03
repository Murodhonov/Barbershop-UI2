package uz.murodhonov.barbershopui2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import uz.murodhonov.barbershopui2.adapter.RvAdapter
import uz.murodhonov.barbershopui2.model.User

class ListActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list)

        findViewById<RecyclerView>(R.id.rv).adapter = RvAdapter(arrayListOf(User(R.drawable.icon1,"Reservation"), User(R.drawable.icon2,"Menu"),User(R.drawable.icon3,"Products"),User(R.drawable.icon4,"Top Cut"),User(R.drawable.icon5,"Gallery"),User(R.drawable.icon6,"Maps")),object :RvAdapter.rv_click{ override fun click3(user: User, position: Int) { startActivity(Intent(this@ListActivity,InfoActivity::class.java).putExtra("user",user)) }})

    }
}