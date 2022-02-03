package uz.murodhonov.barbershopui2.model

import java.io.Serializable

class User:Serializable{
    var img:Int? = null
    var text:String? = null

    constructor(img: Int?, text: String?) {
        this.img = img
        this.text = text
    }

    constructor()
}