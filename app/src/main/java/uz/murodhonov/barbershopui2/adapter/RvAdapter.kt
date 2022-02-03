package uz.murodhonov.barbershopui2.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import uz.murodhonov.barbershopui2.databinding.ItemRvBinding
import uz.murodhonov.barbershopui2.model.User

class RvAdapter(private val list: List<User>, val rvClick: rv_click) :
    RecyclerView.Adapter<RvAdapter.Vh>() {
    inner class Vh(var itemRv: ItemRvBinding) : RecyclerView.ViewHolder(itemRv.root) {
        fun onBind(user: User, position: Int) {
            itemRv.image.setImageResource(user.img!!)
            itemRv.text.text = user.text

            itemRv.root.setOnClickListener {
                rvClick.click3(user,position)
            }
        }
    }

    interface rv_click {
        fun click3(user: User, position: Int)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Vh {
        return Vh(ItemRvBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun onBindViewHolder(holder: Vh, position: Int) {
        holder.onBind(list[position], position)
    }

    override fun getItemCount(): Int = list.size
}