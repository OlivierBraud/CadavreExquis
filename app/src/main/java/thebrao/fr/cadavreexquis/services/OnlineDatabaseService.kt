package thebrao.fr.cadavreexquis.services

import com.google.android.gms.tasks.Task
import com.google.firebase.database.FirebaseDatabase
import thebrao.fr.cadavreexquis.models.Story

/**
 * Service handling queries to the online Firebase database
 */
object OnlineDatabaseService {

    private const val STORIES_NODE: String = "stories"

    /**
     * The online database reference
     */
    private val database = FirebaseDatabase.getInstance().reference

    /**
     * The stories node in the database
     */
    private val storiesNode = database.child(STORIES_NODE)

    /**
     * Adds a new story to the database
     * @param story the story to add
     * @return the id of the story that has been added
     */
    fun pushNewStory(story: Story): Task<String?> {
        return AuthenticationService.authenticate().continueWithTask {
            val storyId = storiesNode.push().key
            storiesNode.child(storyId).setValue(story).continueWith {
                storyId
            }
        }
    }

}
