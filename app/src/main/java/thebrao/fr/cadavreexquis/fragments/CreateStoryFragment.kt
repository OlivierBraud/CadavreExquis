package thebrao.fr.cadavreexquis.fragments

import android.app.Fragment
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import thebrao.fr.cadavreexquis.R

/**
 * Panel allowing creation of a new story
 */
class CreateStoryFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View {
        return inflater!!.inflate(R.layout.add_story_fragment,container)
    }

}
