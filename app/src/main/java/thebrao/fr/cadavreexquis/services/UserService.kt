package thebrao.fr.cadavreexquis.services

import java.util.*

/**
 * Service handling the current user and his context
 */
object UserService {

    /**
     * Returns the current user ID
     */
    fun getCurrentUserId(): String {
        return UUID.randomUUID().toString()
    }
}
