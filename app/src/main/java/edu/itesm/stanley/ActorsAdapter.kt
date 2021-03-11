package edu.itesm.stanley

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView

class ActorsAdapter(private val actors : List<Actor>)
    : RecyclerView.Adapter<ActorsAdapter.ActorViewHolder>(){

    inner class ActorViewHolder(renglon: View) : RecyclerView.ViewHolder(renglon){
        var nombre = renglon.findViewById<TextView>(R.id.nombre)
        var anio = renglon.findViewById<TextView>(R.id.anio)
        var biografia = renglon.findViewById<TextView>(R.id.biografia)
        var foto = renglon.findViewById<ImageView>(R.id.foto)
    }

    //Crea el renglón
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ActorViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val renglon_vista = inflater.inflate(R.layout.actors_renglon,parent, false)
        return ActorViewHolder(renglon_vista)
    }

    //Asocia datos con los elementos del renglón
    override fun onBindViewHolder(holder: ActorViewHolder, position: Int) {
        val actor = actors[position]
        holder.foto.setImageResource(actor.picture)
        holder.nombre.text = actor.nombre
        holder.anio.text = actor.anio
        holder.biografia.text = actor.biografia
        holder.itemView.setOnClickListener {
            val action = ActorskFragmentDirections.actionActorskFragmentToActorFragment(actor)
            holder.itemView.findNavController().navigate(action)
        }
    }

    // Cuantos elementos tiene la lista
    override fun getItemCount(): Int {
        return actors.size
    }
}