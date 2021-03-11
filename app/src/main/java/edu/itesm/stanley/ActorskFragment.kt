package edu.itesm.stanley

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.fragment_actorsk.*
import kotlinx.android.synthetic.main.fragment_movies.*

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER


/**
 * A simple [Fragment] subclass.
 * Use the [ActorskFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class ActorskFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_actorsk, container, false)
    }

    override fun onViewCreated(itemView: View, savedInstanceState: Bundle?) {
        super.onViewCreated(itemView, savedInstanceState)
        actors_recycler.apply {
            // set a LinearLayoutManager to handle Android
            // RecyclerView behavior
            layoutManager = LinearLayoutManager(activity)
            // set the custom adapter to the RecyclerView
            adapter = ActorsAdapter(createData())
        }
    }

    fun createData(): ArrayList<Actor>{
        val actors = ArrayList<Actor>()
        actors.add(Actor(R.drawable.desire,"Frank Silvera", "1914","Fue un actor de carácter y director teatral estadounidense de origen jamaicano. Fue conocido como \"el hombre con mil caras\" debido a su habilidad para interpretar a un amplio abanico de personajes."))
        actors.add(Actor(R.drawable.kiss, "Chris Chase", "1924", "Fue una modelo, actriz de cine, escritora y periodista estadounidense. Su papel más conocido fue en Killer's Kiss. Más tarde escribió libros de consejos y fue coautora de varias autobiografías de celebridades. "))
        actors.add(Actor(R.drawable.killing, "Joel Kinnaman", "1979", "Es un actor sueco de cine y televisión."))
        actors.add(Actor(R.drawable.paths, "Kirk Douglas", "1916", "Fue un actor y productor de cine estadounidense. Entre sus papeles, destacaron su interpretación del pintor Vincent van Gogh, en El loco del pelo rojo, y su papel protagonista en Espartaco, película de Stanley Kubrick."))
        actors.add(Actor(R.drawable.lolita, "Dominique Swain", "1980", "Es una actriz estadounidense. Saltó a la fama al protagonizar en 1997 una nueva versión de la película Lolita, basada en la novela homónima de Vladimir Nabokov. En el año 2002 fue considerada como una de las 102 mujeres más sexis del mundo con el puesto nº 79 según la Revista Stuff."))
        actors.add(Actor(R.drawable.strangelove, "Peter Sellers", "1925", "Fue un actor y comediante británico. Fue investido miembro de la Orden del Imperio Británico."))
        actors.add(Actor(R.drawable.odyssey, "Keir Dullea", "1936", "Es un actor estadounidense de cine y teatro ganador de un Globo de Oro en 1964, muy reconocido por su papel como el astronauta David Bowman en los filmes clásicos de ciencia ficción 2001: Odisea del espacio, de 1968, y 2010: Odisea Dos, de 1984."))
        actors.add(Actor(R.drawable.orange, "Malcolm McDowell", "1943", "Es un actor de televisión y cine británico. A lo largo de una trayectoria de más de cincuenta años, ha interpretado toda clase de papeles como actor de carácter."))
        actors.add(Actor(R.drawable.barry, "Ryan O'Neal", "1941", "Es un actor estadounidense nominado a un premio Óscar al mejor actor."))
        actors.add(Actor(R.drawable.shinnin, "Jack Nicholson", "1937", " Es un actor, productor, guionista y director de cine estadounidense retirado, cuya carrera se desarrolló durante más de sesenta años."))
        actors.add(Actor(R.drawable.metal, "R. Lee Ermey", "1944", "Fue un militar y actor estadounidense. Estudió arte dramático en la Universidad de Manila, Filipinas, tras la guerra de Vietnam. Casi todos los personajes que interpretó eran militares o figuras autoritarias."))
        actors.add(Actor(R.drawable.eyes, "Tom Cruise", "1999", "Es un actor y productor de cine estadounidense ganador de tres premios Globo de Oro."))
        return actors
    }

}