package thebrao.fr.cadavreexquis.models

import java.util.*

/**
 * Defines a story in the application
 */
class Story {

    /**
     * Date of creation
     */
    var timestampCreated: Long = Date().time

    /**
     * Date of last update
     */
    var timestampUpdated: Long = Date().time

    /**
     * If true, the each user will be able to read the previous story fragment before writing a new one
     */
    var continuity: Boolean = false

    /**
     * Title of the story
     */
    var title : String? = null

    /**
     * Hero of the story
     */
    var hero: String? = null

    /**
     * Introduction of the story
     */
    var introduction: String? = null

    /**
     * ID of the user that submitted the introduction
     */
    var introductionUserId: String? = null


    var trigger: String? = null

    /**
     * ID of the user that submitted the trigger element
     */
    var triggerUserId: String? = null

    /**
     * Resolution of the story
     */
    var resolution: String? = null

    /**
     * ID of the user that submitted the resolution element
     */
    var resolutionUserId: String? = null

    /**
     * Conclusion of the story
     */
    var conclusion: String? = null

    /**
     * ID of the user that submitted the conclusion
     */
    var conclusionUserId: String? = null
    /**
     * List of users who favorited this story
     */
    var favoritedBy: List<String> = emptyList()
}
