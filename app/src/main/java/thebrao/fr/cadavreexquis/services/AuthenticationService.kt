package thebrao.fr.cadavreexquis.services

import com.google.android.gms.tasks.Task
import com.google.android.gms.tasks.Tasks
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser

/**
 * Service wrapping up authentication for the application
 */
object AuthenticationService {
    /**
     * Authentication handler for Firebase
     */
    private val mAuth: FirebaseAuth? = FirebaseAuth.getInstance()

    /**
     * Anonymously authenticates the user if needed
     */
    fun authenticate(): Task<FirebaseUser> {
        if (!isAuthenticated()) {
            mAuth!!.signInAnonymously().continueWith({
                mAuth.currentUser
            })
        }
        return Tasks.forResult(mAuth!!.currentUser)
    }

    /**
     * Indicates whether the user is authenticated in Firebase
     */
    private fun isAuthenticated(): Boolean {
        return mAuth!!.currentUser != null
    }
}
